package com.ud.mywishlist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id:Long =0L,
    @ColumnInfo(name = "wish-title")
    val title:String="",
    @ColumnInfo(name = "wish-desc")
    val description:String=""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "google watch ",
            description = "rewsrdjncwkjencnwcnwjkcnkn"),
        Wish(title = "huhuhuh watch ",
            description = "yYatyncwkjencnwcnwjkcnkn"),
        Wish(title = "gojjjn watch ",
            description = "aghbjncwkjencnwcnwjkcnkn"),
        Wish(title = "olopaoogle watch ",
            description = "pknjncwkjencnwcnwjkcnkn")
    )
}

