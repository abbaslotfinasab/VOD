package com.example.oppa.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.domain.model.DataModel
import com.example.domain.usecase.DataUseCaseImpl
import com.example.oppa.rx.SchedulersProvider
import io.reactivex.rxjava3.disposables.CompositeDisposable
import javax.inject.Inject

class MainViewModel @Inject constructor(

    private val dataUseCaseImpl: DataUseCaseImpl,
    private val schedulers: SchedulersProvider
) : ViewModel() {

    private val shareLiveData = MutableLiveData<DataModel>()
    private val compositeDisposable = CompositeDisposable()

    fun get() {
        dataUseCaseImpl.execute()
            .subscribeOn(schedulers.io())
            .subscribe({
                it?.let {
                    shareLiveData.postValue(it)
                }
            },{

            }).let {
                compositeDisposable.add(it)
            }
    }

    override fun onCleared() {
        compositeDisposable.clear()
    }

}