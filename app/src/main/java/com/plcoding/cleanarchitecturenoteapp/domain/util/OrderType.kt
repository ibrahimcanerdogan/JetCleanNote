package com.plcoding.cleanarchitecturenoteapp.domain.util

sealed class OrderType {
    data object Ascending: OrderType()
    data object Descending: OrderType()
}
