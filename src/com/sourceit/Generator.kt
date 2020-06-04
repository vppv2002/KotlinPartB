package com.sourceit

fun getStore() = ArrayList<Stores>().apply {
    add(
            Stores(
                    "Allo",
                    "ул.Науки 25",
                    listOf(Smartphone("Apple", "iPhone 11 Pro Max", 29_000),
                            Smartphone("", "", 28000),
                            Smartphone("", "", 28000))
            )
    )
    add(
            Stores(
                    "Citrus",
                    "ул.Сумская 17",
                    listOf(Smartphone("Samsung", "S20", 25000, 10),
                            Smartphone("Apple", "iPhone 11 Pro", 29500),
                            Smartphone("Apple", "iPhone 11 Pro", 28500),
                            Smartphone("Xiaomi", "Redmi Note 8", 10000))
            )
    )
    add(
            Stores(
                    "Avic",
                    "ул.Мироносицкая 57",
                    listOf(Smartphone("Xiaomi", "Redmi 6", 9000, 25),
                            Smartphone("", "", 28000),
                            Smartphone("", "", 28000))
            )
    )

}

