package com.dist

fun test0(){
    var i=1;
    if (i in 1..4) {  // 等同于 1 <= i && i <= 4
        print(i)
    }

    for(i in 1..4) {
        print(i)
    }


    for (i in 4 downTo 1) {
        print(i);
    }

    for (i in 1..8 step 2) print(i)

    for (i in 1 until 10) {       // i in [1, 10), 10被排除
        print(i)
    }
}

class Version(val major: Int, val minor: Int): Comparable<Version> {
    override fun compareTo(other: Version): Int {
        if (this.major != other.major) {
            return this.major - other.major
        }
        return this.minor - other.minor
    }
}

fun range(){

    val versionRange = Version(1, 11)..Version(1, 30)
    println(Version(0, 9) in versionRange)
    println(Version(1, 20) in versionRange)
}
fun main() {
    range()
}