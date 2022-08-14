//fun otherFuntion(greeting:String, languages:Array<String>){
//    languages.forEach {
//        println("$greeting, this is language-$it")
//    }
//}
//fun main() {
//    val programLanguages = arrayOf("KOTLIN","JAVA","PYTHON","C++")
//    otherFuntion("HiHi", programLanguages)
//}

//The case as shown above is the same with below one

//fun otherFuntion(greeting:String, vararg languages:String){
//    languages.forEach {
//        println("$greeting, this is language-$it")
//    }
//}
//fun main() {
//    val customer = Customer()
//    customer.custId = 100
//    customer.custName = "KKK"
//    println("name = ${customer.custName}")
//}

fun main() {
   //prob 1
//   var id = 9527
//   var number: Int = 5.6
//   var title = "Hello Kotlin"
//   var content: String? = null
//   var num: Double? = 556.6
//   var list: List<String>? = listOf(null, null)
//     var list2: List<String?>? = listOf("www","xxxx")
//   list?.size

   //prob 2
//    var message = "Hello and welcome to AppWorks School :)"
//    when (message.length){
//        0 -> println("Aye!")
//        in 1..39 -> println("Your grace.")
//        in 40..56 -> println("My lord")
//        else -> println("You know nothing...")
//    }

    //prob 3
//    val array = Array(5){ 1000.0.pow(it) }// Question
//    val units = arrayOf("byte", "KB", "MB", "GB", "TB", "PB")
//    for ((i, value) in array.withIndex()){
//        println("1 ${units[i]} = ${value.toLong()} bytes\n")
//    }

    //Expect output
    /*
    *   1 byte = 1bytes
    *   1 KB = 1000 bytes
    *   1 MB = 1000000 bytes
    *   1 GB = 1000000000 bytes
    *   1 TB = 1000000000000 bytes
    *   1 PB = 1000000000000000 bytes
    * */

    //在for迴圈中，定義了i跟value的範圍為array的index順序(及範圍)，故整個迴圈次數為array的size(6)，而index會從0~5依序執行，
    //所以print i的結果為units的每個elements;print value的結果為1000^(index)

    //Given options below
    /*
    *   a. val array = new Array(6)
    *   b. val array = {100}
    *   c. val array = Array(6){ 1000.0.pow(10) }
    *   d. val array = Array(6){ 1000.0.pow(it) }
    * */

    //prob 4
    /*  Create a new class, Human, includes:
    *   a. Pass in a mandatory String argument for the name
    *   b. Add a method, attack(), that prints"<the name pass in> use Fist attack!"
    *   c. In the main() function, create an instance of Human, and call attack() method to print
    * */

//    val man = Human()
//    man.attack()

    //prob 5

    /*  Create a subclass of Human, name it Mage, includes:
    *   a. Pass in a mandatory String argument for name, also for the constructor of Human
    *   b. Override the attack() method to print "<the name passed in> use Fireball!"
    *   c. In the main() function, create an instance of Mage, and call the attack() method to print
    * */

//    val son = Mage("Kyle's son")
//    son.attack()

    //prob 6

    /*  Add a flag to confirm if the Human has mana or not, try to implement and print it in the main() function
    *
    * */

//    val son = Mage("son", false)
//    son.attack()

}