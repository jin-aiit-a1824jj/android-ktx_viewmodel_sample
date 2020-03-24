package a1824jj.jp.ac.aiit.viewmodel_ktx

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var count = 0

    fun getCurrentCount() : Int {
        return count
    }

    fun getUpdatedCount() : Int{
        return ++count
    }

}