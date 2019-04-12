package dev.kafumi.myapplication.data

import dev.kafumi.myapplication.model.User
import timber.log.Timber
import java.util.*

object UserRepository {
    fun getLoginUser(): User {
        Timber.d("getLoginUser")
        return User(
            loginId = "kafumi",
            displayName = "Takafumi Kanda",
            mailAddress = "kafumi@kafumi.dev",
            creationDate = Date(946684800000L)
        )
    }
}