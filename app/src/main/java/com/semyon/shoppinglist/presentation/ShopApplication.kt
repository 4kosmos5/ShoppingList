package com.semyon.shoppinglist.presentation

import android.app.Application
import com.semyon.shoppinglist.di.DaggerApplicationComponent

class ShopApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}