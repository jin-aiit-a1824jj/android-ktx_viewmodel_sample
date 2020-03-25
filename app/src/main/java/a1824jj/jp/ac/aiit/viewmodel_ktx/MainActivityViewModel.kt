package a1824jj.jp.ac.aiit.viewmodel_ktx

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {


    private var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun getLiveData() : LiveData<Int> = count

    fun getCurrentCount() : Int {
        return count.value!!
    }

    fun getUpdatedCount() {
        (count.value) = (count.value)!!.plus(1)
    }

}