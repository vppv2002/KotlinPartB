package com.sourceit


    fun printInfo(smartphone: Smartphone?) {
        println("Производитель: ${smartphone?.manufacturer}; Модель: ${smartphone?.model}; Цена: ${smartphone?.price}грн")
    }
