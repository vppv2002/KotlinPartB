package com.sourceit


fun printInfo(smartphone: Smartphone?, storeIndex: Int) {

    val store = getStore()

    println("Производитель: ${smartphone?.manufacturer}; Модель: ${smartphone?.model}; Цена: ${smartphone?.price} грн; Адрес: ${store[storeIndex].address};")

}
