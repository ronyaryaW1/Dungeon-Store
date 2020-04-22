package com.rony

fun main() {
//    var itu bisa berubah
    var halo = "hello world"
    println(halo)
    var plus = 2+1
    println(plus)
    var a = 2
    var b = 10
    println(a+b)
    var float = 25.8888
    var double = 25.88888
    var integer = 25
    println(float)
    println(double)
    println(integer)
//    val tetap
    var uang = 1000
    if (uang < 5000){
        println("Cilok")}
        else{
            println("ayam")
        }
    var duit = 10000
    var harga = 2000
    if(duit < 2000 || harga > 2000 ){
        println("kamu harus nabung")
    } else if (duit > harga && harga < duit){
        println("beli")
    } else{
        println("balik")
    }
//    loop
    for(x in 0..2){
        println("hai" + x)
    }
    var i = 5
    while (i < 7){
        println("hai while" + i)
        i++
    }
    var z = 5
    do {
        println("hai dowhile " + z)
        z++
    } while (z < 9)
//    collection
    var mutable = mutableListOf("Go-jek", "Grab", "Uber")
    mutable.add("Traveloka")
    mutable.remove("Grab")
    mutable.removeAt(0  )
    mutable.forEach{
        println(it)
    }
//    function

}