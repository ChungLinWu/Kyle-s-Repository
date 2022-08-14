class Mage: Human {
    constructor(name: String,hasMana: Boolean): super(name,hasMana)
    override fun attack(){
        if(!hasMana) {
            println("$name has no mana QQ")
        }else {
            println("$name use Fireball!")
        }
    }
}