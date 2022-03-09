package com.ubaya.advweek4.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ubaya.advweek4.model.Student

class DetailViewModel : ViewModel() {
    val studentLiveData = MutableLiveData<Student>()

    private val TAG = "nonie"
    private var queue: ListViewModel?= null

    fun fetch() {
        Student("16055","Nonie","1998/03/28","5718444778","http://dummyimage.com/75x100" +
                ".jpg/cc0000/ffffff")



        val stringRequest = (ListViewModel.Method.GET, url,
            { response ->

                studentLiveData.value

//                    loadingLiveData.value = false
                Log.d("nonie", response.toString())

            },
            {
//                    loadingErrorLiveData.value = true
//                    loadingLiveData.value = false
                Log.d("nonie", it.toString())
            })
        stringRequest.tag = TAG
        queue?.add(stringRequest)
        return studentLiveData.value.toString()
    }
    }
}