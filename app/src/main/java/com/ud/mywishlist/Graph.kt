package com.ud.mywishlist

import android.content.Context
import androidx.room.Room
import com.ud.mywishlist.data.WishDatabase
import com.ud.mywishlist.data.WishRepository

object Graph {
    lateinit var database:WishDatabase

    val wishRepository by lazy{
        WishRepository(wishDao = database.wishDao())
    }

    fun provide (context: Context){
        database=Room.databaseBuilder(context,WishDatabase::class.java,"wishlist.db").build()
    }

}