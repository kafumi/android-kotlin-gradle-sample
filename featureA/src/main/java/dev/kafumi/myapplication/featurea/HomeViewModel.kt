package dev.kafumi.myapplication.featurea

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import dev.kafumi.myapplication.data.UserRepository
import dev.kafumi.myapplication.model.User
import timber.log.Timber

class HomeViewModel : ViewModel() {
    private val user = MutableLiveData<User>()

    val loginId = user.map { it.loginId }
    val displayName = user.map { it.displayName }
    val mailAddress = user.map { it.mailAddress }

    fun onButtonClicked() {
        Timber.d("onButtonClicked")
        user.value = UserRepository.getLoginUser()
    }

    private fun <X, Y> LiveData<X>.map(body: (X) -> Y): LiveData<Y> {
        return Transformations.map(this, body)
    }
}