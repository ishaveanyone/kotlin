package com.dist

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}
enum class Color(dis:String){

    RED("红色"),
    BLACK("黑色")
}
//匿名内部类
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };
    abstract fun signal(): ProtocolState


}


fun main(args: Array<String>) {
//    print(ConsoleColor.RED.name);
//    print(ConsoleColor.RED.ordinal);

//    println(enumValues<ConsoleColor>().joinToString { it.name })
//    println(enumValueOf<ConsoleColor>("RED"))
    println(ConsoleColor.valueOf("RED").name)
    println(ConsoleColor.values()[0])
    println(ConsoleColor.values()[1])
    println(ConsoleColor.values()[2])
    println(ConsoleColor.values()[3])

//    ConsoleColor.BLACK.print()
}

enum class ConsoleColor(var argb : Int){
    RED(0xFF0000){
        override fun print() {
            println("我是枚举常量 RED ")
        }
    },
    WHITE(0xFFFFFF){
        override fun print() {
            println("我是枚举常量 WHITE ")
        }
    },
    BLACK(0x000000){
        override fun print() {
            println("我是枚举常量 BLACK ")
        }
    },
    GREEN(0x00FF00){
        override fun print() {
            println("我是枚举常量 GREEN ")
        }
    };

    abstract fun print()
}
