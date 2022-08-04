fun main(args: Array<String>) {

    //DEMO - SET BASICS
/*    val fruits = setOf("Apple", "Banana", "Orange", "Banana")
    println(fruits)
    println("Number of fruits: ${fruits.size}")
    if (fruits.contains("Apple")) {
        println("Apple is present in the set")
    }

    if ("Apple" in fruits) {
        println("Apple is present in the set")
    }*/

    //DEMO - SET EQUALITY
/*    val fruits1 = setOf("Orange", "Banana", "Apple")
    val fruits2 = setOf("Apple", "Banana", "Orange")
    println("are two sets equal: ${fruits1 == fruits2}")*/

    //DEMO - MUTABILITY
/*    val fruits = mutableSetOf("Apple", "Banana", "Orange")
    fruits.add("Mango")
    println(fruits)
    fruits.remove("Banana")
    println(fruits)*/

    //DEMO - How to create an Empty Set?
/*    val fruitsSet = mutableSetOf<String>()
    fruitsSet.add("Apple")*/

    //DEMO - Use builder function for creating Set
/*
    val mySet = buildSet {
        add("Apple")
        add("Banana")
        add("Orange")
    }
    println("mySet is $mySet")
*/


    //DEMO -  Copy a Set
/*    val sourceSet = mutableSetOf("Apple", "Banana")
    val copySet = sourceSet.toSet()
    val copyMutableSet = sourceSet.toMutableSet()*/

    //Convert a List to Set
/*    val sourceList = mutableListOf("Apple", "Banana")
    val copySet = sourceList.toMutableSet()
    copySet.add("Orange")
    println("sourceList is $sourceList")
    println("copySet is $copySet")*/



    //DEMO - DEFAULT - LinkedHashSet
/*    val scores = setOf(10, 20, 30, 40)
    val scoresReversed = setOf(40, 30, 20, 10)

    println("Compare scores first with first ${scores.first() == scoresReversed.first()}")
    println("Compare scores first with last ${scores.first() == scoresReversed.last()}")*/

    //DEMO - HashSet
/*    val myHashSet = HashSet<Int>(setOf(10, 20, 30, 40))
    println("myHashSet $myHashSet")*/
}

