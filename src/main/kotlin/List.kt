fun main(args: Array<String>) {
    //DEMO - LIST BASICS
    //val countries = listOf("Japan", "India", "Singapore", "Australia")
/*    println("No. of elements: ${countries.size}")
    println("Third element: ${countries.get(2)}")
    println("Fourth element: ${countries[3]}")
    println("Index of \"India\" is ${countries.indexOf("India")}")
    println("Fifth element: ${countries[4]}")*/

    //Retrieve elements by index - Avoid Exception
/*    println("Fifth element by getOrNull: ${countries.getOrNull(4)}")
    println("Fifth element by getOrElse: ${countries.getOrElse(4, {-1})}")*/


    //DEMO - EQAULITY IN LIST
/*    val john = Employee("John", 25)
    val employees1 = listOf(Employee("Martin", 27), john, john)
    val employees2 = listOf(Employee("Martin", 27), Employee("John", 25), john)
    println("Before employees1 == employees2 is ${employees1 == employees2}")
    john.name = "Jon"
    println("After employees1 == employees2 is ${employees1 == employees2}")*/

    //DEMO - IMMUTABLE LIST
/*    val john = Employee("John", 25)
    val martin = Employee("Martin", 30)
    val robert = Employee("Robert", 35)
    val employees1 = listOf(martin, john)
    employees1.add(robert)*/

    //DEMO - MUTABLE LIST
/*    val john = Employee("John", 25)
    val martin = Employee("Martin", 30)
    val robert = Employee("Robert", 35)
    val employees3 = mutableListOf(martin, john)
    println("employees3 initially: $employees3")
    employees3.add(robert)
    println("employees3 after adding robert: $employees3")
    employees3.removeAt(0)
    println("employees3 after removing 1st element: $employees3")
    employees3.fill(john)
    println("employees3 after filling John: $employees3")*/

    //DEMO - Basic Operations
/*    val john = Employee("John", 25)
    val martin = Employee("Martin", 30)
    val robert = Employee("Robert", 35)
    val employees3 = mutableListOf(martin, john, robert, john)
    println("employees3 isEmpty(): ${employees3.isEmpty()}")
    println("employees3 first(): ${employees3.first()}")
    println("employees3 last(): ${employees3.last()}")*/

    //Linear Search Basic
/*    println("employees3 indexOf() john: ${employees3.indexOf(john)}")
    println("employees3 lastIndexOf() john: ${employees3.lastIndexOf(john)}")*/

    //Linear Search Advanced
/*    println("employees3 indexOfFirst() john: ${employees3.indexOfFirst { it.age <= 25 }}")
    println("employees3 indexOfLast() john: ${employees3.indexOfLast { it.age <= 25 }}")*/

    //DEMO - SORT
/*    val countries = mutableListOf("Switzerland", "United Kingdom", "Germany", "India")
    countries.sort()
    println("Ascending Sort: $countries")
    countries.sortDescending()
    println("Descending Sort: $countries")*/

    //DEMO - sorted
/*
    val countries = mutableListOf("Switzerland", "United Kingdom", "Germany", "India")
    val sortedCountries = countries.sorted()
    val sortedDescendingCountries = countries.sortedDescending()
    println("countries: $countries")
    println("sortedCountries: $sortedCountries")
    println("sortedDescendingCountries: $sortedDescendingCountries")
*/

    //DEMO - SORT BY
/*    val countries = mutableListOf("Switzerland", "United Kingdom", "Germany", "India")
    countries.sortBy { it.length }
    println("Sort ascending by length: $countries")*/

    //DEMO - SORT BY Descending
/*    val countries = mutableListOf("Switzerland", "United Kingdom", "Germany", "India")
    countries.sortByDescending { it.last() }
    println("Sort descending by the last letter: $countries")*/

    //DEMO - SORT WITH
/*    val john1 = Employee("John", 35)
    val john2 = Employee("John", 30)
    val robert = Employee("Robert", 25)
    val employees = mutableListOf(john1, john2, robert)
    employees.sortWith(compareBy<Employee> { it.age }.thenBy { it.name })
    println("Sort by Comparator: $employees")*/

    //DEMO - SHUFFLE
/*    val countries = mutableListOf("Switzerland", "United Kingdom", "Germany", "India")
    println("Original: $countries")
    countries.shuffle()
    println("Shuffle: $countries")*/

    //DEMO - REVERSE
/*    val countries = mutableListOf("Switzerland", "United Kingdom", "Germany", "India")
    println("Original: $countries")
    countries.reverse()
    println("Reverse: $countries")*/

    //DEMO - remove and Clear
/*    val john = Employee("John", 25)
    val robert = Employee("Robert", 35)
    val employees4 = mutableListOf(robert, john)
    println("employees4 contains john before: ${employees4.contains(john)}")
    employees4.remove(john)
    println("employees4 contains john after: ${employees4.contains(john)}")
    println("employees4 isEmpty before clear: ${employees4.isEmpty()}")
    employees4.clear()
    println("employees4 isEmpty after clear: ${employees4.isEmpty()}")*/

    //DEMO - Add, Remove collection
 /*   val john = Employee("John", 25)
    val robert = Employee("Robert", 35)
    val employees4 = mutableListOf(robert, john)

    val jean = Employee("Jean", 47)
    val peter = Employee("Peter", 56)
    val employees5 = mutableListOf(jean, peter)

    employees4.addAll(employees5)
    println("employees4 after adding employees5: $employees4")

    println("does employees4 contain employees5 before: ${employees4.containsAll(employees5)}")
    employees4.removeAll(employees5)
    println("does employees4 contain employees5 after: ${employees4.containsAll(employees5)}")
*/
    //What does mutableList with val mean?
    //employees4 = employees5

    //DEMO - How to create an Empty List?
/*    val numbersList = mutableListOf<Int>()
    numbersList.add(0,1)
    numbersList.add(1,2)
    println(numbersList)*/

    //DEMO - Use builder function for creating List
/*    val myList = buildList {
        add("Japan")
        add("India")
        add("Singapore")
    }
    println("myList is $myList")
    val myMutableList = myList.toMutableList()
    myMutableList.add("Australia")
    println("myMutableList is $myMutableList")*/

    //DEMO - Copy a list
/*    val jean = Employee("Jean", 47)
    val peter = Employee("Peter", 56)
    val robert = Employee("Robert", 35)
    val sourceList = mutableListOf(jean, peter)
    val copyList = sourceList.toList()
    val copyMutableList = sourceList.toMutableList()*/

    //create new references to the same collection instance.
/*    val referenceList = sourceList
    referenceList.add(robert)
    println("Reference List: $referenceList")
    println("Source List: $sourceList")*/

    //Use Collection initialization to restrict mutability
/*    val sourceList1 = mutableListOf(jean, peter)
    val referenceList1: List<Employee> = sourceList1
    //referenceList1.add(robert)            //compilation error
    sourceList1.add(robert)
    println("referenceList1 : $referenceList1") //shows the current state of sourceList1*/
}

data class Employee(var name: String, val age: Int)