package com.aldi.catatanpenjualan.activity.login

import com.aldi.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}