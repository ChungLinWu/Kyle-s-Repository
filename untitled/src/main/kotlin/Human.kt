open class Human{
    var name: String? = null
    var hasMana: Boolean = true

    constructor(_name: String, _hasMana: Boolean){
        this.name = _name
        this.hasMana = _hasMana
    }

    open fun attack(){
        if(!hasMana) {
            println("$name has no mana QQ")
        }else{
            println("$name use Fist attack!")
        }
    }
}
fun main(){
    var child = Human("Kyle")
    child.attack()
}