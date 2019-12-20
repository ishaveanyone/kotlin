package com.dist
//sequence 也是kt中的 一个 容器
fun seqtest0(){

    var seq= sequenceOf("a","b");
    seq.forEach {
        print(it)
    }

    //list 和 sequence 互相转换
    seq.toList().asSequence();
}

fun main() {

}