package com.sourceit

fun main(args: Array<String>) {
    val manufacturerOfPhone: String = "Apple"
    val list = getStore()
    val minPrice = 10000
    val maxPrice = 30000
    val storeNameByUser = "citrus"

    val storeName=list.indexOf(list.find { it.name.toLowerCase()==storeNameByUser.toLowerCase() })

    val minPricePhone = list.find { it.name.toLowerCase() == storeNameByUser.toLowerCase() }?.phones?.minBy { it.price }
    if (minPricePhone != null) {
        print("Самый дешевый телефон в магазине ${list[storeName].name}: ")
        printInfo(minPricePhone, storeName)
    }

    val maxPricePhone = list.find { it.name.toLowerCase() == storeNameByUser.toLowerCase() }?.phones?.maxBy { it.price }
    if (maxPricePhone != null) {
        print("Самый дорогой телефон в магазине ${list[storeName].name}: ")
        printInfo(maxPricePhone, storeName)
    }

    val phoneForManufacturer = list.find { it.name.toLowerCase() == storeNameByUser.toLowerCase() }?.phones!!
    for (smartphone in phoneForManufacturer) {
        if (smartphone.manufacturer == manufacturerOfPhone) {
            print("Телефон по названию производителя в магазине ${list[storeName].name}: ")
            printInfo(smartphone, storeName)
        }

    }


//
//    for (store in getStore()) {
//        if (list.flatMap { it.phones }.find {it.price} < maxPrice && store.phones.find { it.price } > minPrice) {
//            print("Телефон с ценой в интервале: ")
//            printInfo(smartphone)
//        }
//    }
}


