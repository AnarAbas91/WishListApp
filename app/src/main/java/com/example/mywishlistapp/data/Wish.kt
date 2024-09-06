package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish{
    val wishlist = listOf(
        Wish(title = "Google watch 2", description = "Android watch"),
        Wish(title = "BMW M5 Competition", description = "Vehicle"),
        Wish(title = "Visit Europe", description = "Travel")
    )
}
