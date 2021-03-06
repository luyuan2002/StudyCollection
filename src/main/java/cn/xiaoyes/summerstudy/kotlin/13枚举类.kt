package cn.xiaoyes.summerstudy.kotlin

// 枚举类的最基本的用法是实现类型安全的枚举：
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}
// 每一个枚举常量都是一个对象，枚举常量用逗号分隔。

// 初始化
// 因为每一个枚举都是枚举类得实例，所以他们可以是这样初始化得
enum class Color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

// 匿名类
// 枚举常量还可以声明其带有相应方法以及覆盖了基类方法的匿名类。
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}
// 如果枚举类定义任何成员，那么使用分号将成员定义中的枚举常量定义分隔开。
// 枚举条目不能包含内部类以外的嵌套类型（已在 Kotlin 1.2 中弃用）。

// 在枚举类中实现接口
// 一个枚举类可以实现接口（但不能从类继承），可以为所有条目提供统一的接口成员实现，也可以在相应匿名类中为每个条目提供各自的实现。只需将接口添加到枚举类声明中即可，如下所示：
/*enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };
    override fun applyAsInt(t: Int, u: Int) = apply(t, u)
}*/


// 枚举常量
//EnumClass.valueOf(value: String): EnumClass
//EnumClass.values(): Array<EnumClass>

// 如果指定的名称与类中定义的任何枚举常量均不匹配，valueOf() 方法将抛出 IllegalArgumentException 异常
// 自 Kotlin 1.1 起，可以使用 enumValues<T>() 与 enumValueOf<T>() 函数以泛型的方式访问枚举类中的常量 ：
enum class RGB { RED, GREEN, BLUE }

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}

fun main(){
    printAllValues<RGB>() // 输出 RED, GREEN, BLUE
}

// 每个枚举常量都具有在枚举类声明中获取其名称与位置的属性：
/*
* val name: String
* val ordinal: Int
* */
