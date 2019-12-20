package com.dist

import java.lang.reflect.Field

/**
 * kt中的泛型
 * https://zhuanlan.zhihu.com/p/26965437
 */
//提供者 用于生产
interface Provider<out T>{
    fun getT():T
}
class StrProvider:Provider<String>{
    override fun getT(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



}

/**
 *
 *
 * Out (协变)

如果你的类是将泛型作为内部方法的返回，那么可以用 out：

interface Production<out T> {
fun produce(): T
}
可以称其为 production class/interface，因为其主要是产生（produce）指定泛型对象。因此，可以这样来记：produce = output = out。

In(逆变)

如果你的类是将泛型对象作为函数的参数，那么可以用 in：

interface Consumer<in T> {
fun consume(item: T)
}
可以称其为 consumer class/interface，因为其主要是消费指定泛型对象。因此，可以这样来记：consume = input = in。

Invariant(不变)

如果既将泛型作为函数参数，又将泛型作为函数的输出，那就既不用 in 或 out。

interface ProductionConsumer<T> {
fun produce(): T
fun consume(item: T)
}

作者：极小光
链接：https://www.jianshu.com/p/c5ef8b30d768
来源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 */

class Everybody : Consumer<Food> {
    override fun consume(item: Food) {
        println("Eat food")
    }
}

open class Food{

}

class ModernPeople : Consumer<FastFood> {
    override fun consume(item: FastFood) {
        println("Eat fast food")
    }
}

open class FastFood:Food() {

}

class American : Consumer<Burger> {
    override fun consume(item: Burger) {
        println("Eat burger")
    }

}

interface face{
    fun <T: Number> sum():T    // : Number 表示上界
}

class Burger:FastFood(){

}

interface Consumer<in T> {
    fun consume(item: T)
}
interface Production<out T> {
    fun produce(): T
}
class FoodStore : Production<Food> {
    override fun produce(): Food {
        println("Produce food")
        return Food()
    }
}

class FastFoodStore : Production<FastFood> {
    override fun produce(): FastFood {
        println("Produce food")
        return FastFood()
    }
}

class InOutBurger : Production<Burger> {
    override fun produce(): Burger {
        println("Produce burger")
        return Burger()
    }
}
fun main(){
    //子类泛型对象可以赋值给父类泛型对象，用 out。FastFood Burger 都是 food的子类 相当于java中的上届
//    val production1 : Production<Food> = FoodStore()
//    val production2 : Production<Food> = FastFoodStore()
//    val production3 : Production<Food> = InOutBurger()

    //父类泛型对象可以赋值给子类泛型对象，用 in；相当于 java中的下界
    val consumer1 : Consumer<Burger> = Everybody()
    val consumer2 : Consumer<Burger> = ModernPeople()
    val consumer3 : Consumer<Burger> = American()

    var t= T()
    var inf1=Inf<Any>();
    var inf2=Inf<Int>();

    t.copy(inf2,inf1);
    t.copy2(inf2,inf1);
}


class Inf<T>{

}
//类型投影
class T{
    fun copy(from:Inf<out Any>,to:Inf<Any>){

    };

    fun copy2(from:Inf<in Int>,to:Inf<Any>){

    };
}
