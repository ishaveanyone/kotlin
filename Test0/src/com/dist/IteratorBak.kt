package com.dist

fun foreachTest(){
    var lists= listOf<String>("1","2");
    lists.forEach {
        if(it.equals(1)){
            print(it)
        }
    }
}


fun  listIteratorTest(){
    var lists= listOf<String>("1","2");
    var listItor= lists.listIterator();
    while(listItor.hasPrevious()){
        println(listItor.previous())
    }
    while(listItor.hasNext()){
        println(listItor.next())
        print(listItor.previous())
    }
}

//可变迭代器

fun mutableIteratorTest(){
    var lists= mutableListOf("one", "two", "three", "four")
    var listItor= lists.listIterator();
    while (listItor.hasNext()){
        if(listItor.next().equals("two")){
            listItor.remove();
        }
    }
    lists.forEach { it ->
        print(it)
    }
}
fun main() {
    mutableIteratorTest();
}