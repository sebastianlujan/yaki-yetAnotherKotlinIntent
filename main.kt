// fun is declared in the top level
// first approach to kotlin

fun max(a: Int, b: Int): Int {
    return if ( a > b) a else b

    //if is an expression not a statement
    //expression have values, a class is an statement.
}

// one liner, this is possible because kotlin have 
// higher order functions.
fun maxF(a: Int, b:Int):Int = if (a > b) a else b

fun inmutableReference(a: Int): Int {
    val VALUE = 42 //value, inmutable variable
    /* uncoment 
        ///a = 42 // this fails, an inmutable variable can't change
    */
    return VALUE
}

fun mutableReference(a: Int): Int {
    var a = 50 //variable, mutable variable
    a++
    return a
}

fun mutableArray(str: String): ArrayList<String> {
    val LANG = arrayListOf("Array")
    LANG.add("Kotlin")
    LANG.add("FP")
    return LANG
    /// ArrayyList<T>
}

fun mutableName(str: Array<String>): String {
    val NAME = if (str.size > 0) str[0] else "Kosovo"
    return NAME
}


fun mutableNameF(str: Array<String>): String 
    = if (str.size > 0) str[0] else "Kosovo" 

/*
    public class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
*/

// person class converted to Kotlin
// In kotlin a property is a first class feature
// public is the default visibility for classes in Kotlin.

// a val (value object) generate a getter accesspr function
// a var (variable) generate a getter and setter accessor function
class Person(val name: String)

// We call the constructor without the new keyword 
fun inmutableProperty(p: Person): String = p.name

//fun inmutableJSONList()

fun main(args: Array<String>) {
    
    println(max(1 ,2))
    println(maxF(1, 2))
    
    println(inmutableReference(42))
    println(mutableReference(42))
    println(mutableArray("foo"))
    println(mutableName(arrayOf("mategirl", "matechick", "matebabe", "matewife")))
    println(mutableNameF(arrayOf("Banana", "manzana", "maracuya")))
    
    println(inmutableProperty(Person("Sebas")))
    
    println("Hello, world!")
}


