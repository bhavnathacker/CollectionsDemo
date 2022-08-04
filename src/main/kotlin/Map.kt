fun main(args: Array<String>) {
    //DEMO - MAP BASICS
/*    val priorities = mapOf("low" to 1, "medium" to 2, "high" to 3)
    println(priorities)
    println("priorities keys: ${priorities.keys}")
    println("priorities values: ${priorities.values}")*/

    //DEMO - Contains
/*    val priorities = mapOf("low" to 1, "medium" to 2, "high" to 3)
    if (priorities.containsValue(2)) println("Value 2 is in the map")
    if (priorities.containsKey("low")) println("Key low is in the map")*/

    //DEMO - Iteration
/*    val priorities = mapOf("low" to 1, "medium" to 2, "high" to 3)
    for (priority in priorities) {
        println("key: ${priority.key} and value: ${priority.value}")
    }*/


    //DEMO - null or Exception
/*    val priorities = mapOf("low" to 1, "medium" to 2, "high" to 3)
    println(priorities["highest"])               // null
    println(priorities.getValue("highest"))    // exception!*/

    //DEMO - Avoid null or Exception
/*    val priorities = mapOf("low" to 1, "medium" to 2, "high" to 3)
    println(priorities.getOrDefault("highest", -1))
    println(priorities.getOrElse("highest", { -2 }))*/

    //DEMO - FILTER
/*    val priorities = mapOf("low" to 1, "medium" to 2, "high" to 3)
    val filteredPriorities = priorities.filter { (key, value) -> key.length > 3 && value > 2}
    println(filteredPriorities)*/

    //DEMO - FILTER KEYS & VALUES
/*    val priorities = mapOf("low" to 1, "medium" to 2, "high" to 3)
    val filteredKeysMap = priorities.filterKeys { it.length > 3 }
    val filteredValuesMap = priorities.filterValues { it > 2 }

    println("filteredKeysMap: $filteredKeysMap")
    println("filteredValuesMap: $filteredValuesMap")*/

    //DEMO - Plus operator
/*    val priorities = mapOf("low" to 1, "medium" to 2, "high" to 3)
    println(priorities + Pair("highest", 4))  //Addition
    println(priorities + Pair("low", 10))     //Replacement
    println(priorities + mapOf("highest" to 5, "low" to 11)) //Addition & Replacement*/

    //DEMO - minus operator
/*    val priorities = mapOf("low" to 1, "medium" to 2, "high" to 3)
    println(priorities - "low")
    println(priorities - listOf("low", "high"))*/

    //DEMO - Add multiple entries
/*    val prioritiesMap = mutableMapOf("low" to 1, "medium" to 2, "high" to 3)
    prioritiesMap.putAll(setOf("highest" to 4, "none" to -1))
    println(prioritiesMap)*/

    //DEMO - Update entries
/*    val prioritiesMap = mutableMapOf("low" to 1, "medium" to 2, "high" to 3)
    val previousValue = prioritiesMap.put("low", 11)
    println("value associated with 'low', before: $previousValue, after: ${prioritiesMap["low"]}")
    println(prioritiesMap)*/


    //DEMO - plusAssign (+=) operator.
/*    val prioritiesMap = mutableMapOf("low" to 1, "medium" to 2, "high" to 3)
    prioritiesMap += mapOf("highest" to 4, "low" to -1)
    println(prioritiesMap)*/


    //DEMO -Remove entries
/*    val prioritiesMap = mutableMapOf("low" to 1, "medium" to 2, "high" to 3)
    prioritiesMap.remove("low")
    println(prioritiesMap)
    prioritiesMap.remove("high", 3)            //doesn't remove anything
    println(prioritiesMap)*/

    //DEMO - Remove entries by key or value
    val prioritiesMap = mutableMapOf("low" to 1, "medium" to 2, "high" to 3, "highest" to 3)
    prioritiesMap.keys.remove("low")
    println(prioritiesMap)
    prioritiesMap.values.remove(3)
    println(prioritiesMap)

    //DEMO - minusAssign (-=) operator.
/*    val prioritiesMap = mutableMapOf("low" to 1, "medium" to 2, "high" to 3, "highest" to 3)
    prioritiesMap -= "low"
    println(prioritiesMap)
    prioritiesMap -= "none"             //doesn't remove anything
    println(prioritiesMap)*/

    //DEMO - MAP EQUALITY
/*    val priorities1 = mapOf("low" to -1, "medium" to 2, "high" to 3)
    val priorities2 = mapOf("high" to 3, "low" to 1, "medium" to 2)

    println("Are priorities1 and priorities2 equal: ${priorities1 == priorities2}")*/

    //DEMO - MAP MUTABILITY
/*    val priorities3 = mutableMapOf("low" to 1, "medium" to 2, "high" to 3)
    priorities3.put("default", 0)
    priorities3["none"] = -1
    priorities3["high"] = 4
    println(priorities3)*/


    //DEMO -  How to create an Empty Map?
/*    val prioritiesMap = mutableMapOf<String, Int>()
    prioritiesMap["none"] = -1*/


    //Use builder function for creating Map
/*    val myMap = buildMap {
        put("low", 1)
        put("medium", 2)
        put("high", 3)
    }
    println("myMap is $myMap")*/

}
