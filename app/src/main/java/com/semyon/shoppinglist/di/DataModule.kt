package com.semyon.shoppinglist.di

import android.app.Application
import com.semyon.shoppinglist.data.AppDatabase
import com.semyon.shoppinglist.data.ShopListDao
import com.semyon.shoppinglist.data.ShopListRepositoryImpl
import com.semyon.shoppinglist.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideShopListDao(
            application: Application
        ): ShopListDao {
            return AppDatabase.getInstance(application).shopListDao()
        }
    }
}