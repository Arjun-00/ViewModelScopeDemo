package com.posibolt.viewmodelscopedemo
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.posibolt.viewmodelscopedemo.model.User
import com.posibolt.viewmodelscopedemo.model.UserRepository
import kotlinx.coroutines.*

class MainActivityViewModel : ViewModel() {
    private var userRepository = UserRepository()
    public var userss : MutableLiveData<List<User>> = MutableLiveData()
//    private val myScope = CoroutineScope(Dispatchers.IO)
//    private val job = Job()

    fun getUserData(){
//        myScope.launch {
//
//        }
//
        viewModelScope.launch {

        }
    }

    fun getUserDatas(){
        viewModelScope.launch {
            var userList : List<User>? = null
            withContext(Dispatchers.IO){
                userList = userRepository.getUsers()
            }
            userss.value = userList
        }
    }



//    override fun onCleared() {
//        super.onCleared()
//        job.cancel()
//    }
}