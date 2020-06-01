package com.sourceit

fun main(args: Array<String>) {
    val manufacturerOfPhone: String = "Apple"
    val list = getSmartphone()
    val minPrice = 10000
    val maxPrice = 30000

    val minPricePhone = list.minBy { it.price }
    if (minPricePhone != null) {
        print("Самый дешевый телефон: ")
        printInfo(minPricePhone)
    }

    val maxPricePhone = list.maxBy { it.price }
    if (maxPricePhone != null) {
        print("Самый дорогой телефон: ")
        printInfo(maxPricePhone)
    }


    val phoneForManufacturer = list.find { it.manufacturer == manufacturerOfPhone }
    if (phoneForManufacturer != null) {
        print("Телефон по названию производителя: ")
        printInfo(phoneForManufacturer)
    }


    for (smartphone in getSmartphone()) {
        if (smartphone.price < maxPrice && smartphone.price > minPrice) {
            print("Телефон с ценой в интервале: ")
            printInfo(smartphone)
        }
    }
}

