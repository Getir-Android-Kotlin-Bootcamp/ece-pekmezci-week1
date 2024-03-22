fun standard_çıktı(){
    print("Sayfa 9= Hello, this is week1. ")
    println("Sayfa 9= First week!!!")
}
fun fonksiyonlar(a:Int, b:Int):Int{
    return a*b
}
fun fonksiyonlar2(a:Int, b:Int) = a*b
fun fonksiyonlar3(a:Int, b:Int):Unit{
    println("Sayfa 10= multiplication of $a and $b is ${a*b}")
}
var z=12
fun değişkenler(){
    z-=2
    println("Sayfa 11= $z")
}
open class Volume
class Cube(val edge:Double):Volume(){
    val conclusion=edge*edge*edge
}

fun shape(edge1:Int,edge2:Int):Unit{
    if(edge1==edge2){
        return println("Sayfa 15= This shape is a square")
    }else{
        return println("Sayfa 15= This shape is a rectangle")
    }
}
val wonders = listOf("The Colosseum, Petra ,Chichén Itzá , Taj Mahal")
fun find_obj(obj:Any):String=
    when (obj){
        "Hi" ->"Greeting"
        is Int ->"Integer"
        !is String ->"Not a string"
        else->"Unknown"
    }
val range=20
val colors = listOf("black","white","green")
fun type_check(a:String):Unit{
    if(a is String){
        return println("Sayfa 21= It's a string")
    }else{
        return println("Sayfa 21= It's not a string")
    }
}
fun test (){
    try {
        val num = "123a".toInt()
    } catch (e: NumberFormatException) {
        println("Sayfa 56= Bir hata oluştu: ${e.message}")
    }
}
object MyObject {
    val myProperty = "Sayfa 61= Hi!"

    fun greet() {
        println(myProperty)
    }
}
data class Person(var name: String, var age: Int)
fun greet(name: String = "Welcome") {
    println("Sayfa67= Welcome, $name!")
}
class Numb(val deger: Int) {
    infix fun toplam(number: Numb): Numb {
        return Numb(this.deger + number.deger)
    }
}
data class Add(val conclusion: Int) {
    operator fun plus(numbr: Add): Add {
        return Add(this.conclusion + numbr.conclusion)
    }
}
fun toplam(vararg nums: Int): Int {
    var toplam = 0
    for (num in nums) {
        toplam += num
    }
    return toplam
}
fun print_it(x: String?) {
    val p = x ?: "null"
    println(p)
}
class Math {
    fun minus(a: Int, b: Int): Int {
        return a - b
    }

    fun division(a: Int, b: Int): Float {
        if (b == 0) {
            throw IllegalArgumentException("You can't divide this with 0!")
        }
        return a.toFloat() / b.toFloat()
    }
}
class Box<T>(t: T) {
    var y = t
}
fun <T> ex(a: T) {
    println(a)
}
open class Animal {
    open fun sound() {
        println("Sayfa 77= aa")
    }
}

class Cow : Animal() {
    override fun sound() {
        println("Sayfa 77= Mö!")
    }
}
fun toZero() {
    var a = 5

    while (a > 0) {
        println("Sayfa 83: $a")
        a--
    }
}
fun increase() {
    var b = 2

    do {
        println("Sayfa 84: $b")
        b += 2
    } while (b > 8)
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(standard_çıktı())
    println("Sayfa 10= ${fonksiyonlar(2,4)}")
    println("Sayfa 10= ${fonksiyonlar2(2,6)}")
    println(fonksiyonlar3(2,8))
    println(değişkenler())
    val cube=Cube(6.0)
    println("Sayfa 13= ${cube.conclusion}")
    println(shape(3,3))
    wonders.forEach{item->
        println("Sayfa 16= $item")
    }
    println("Sayfa 18= ${find_obj(3)}")
    for(range in 20 downTo 0 step 5){
        println("Sayfa 19= $range")
    }
    val mapList = colors.map{it.uppercase()}
    println("Sayfa 20 = $mapList")

    println(type_check("x"))
    println(MyObject.greet())

    val person = Person("John", 25).also {
        it.age = 30
    }

    println("Sayfa 65= $person")
    println(greet("Ece"))
    // Infix fonksiyonu kullanma
    val sayi1 = Numb(5)
    val sayi2 = Numb(3)

    val sonuc = sayi1 toplam sayi2

    println("Sayfa 68= Sonuç: ${sonuc.deger}")

    val numb1 = Add(9)
    val numb2 = Add(3)
    val concls = numb1 + numb2

    println("Sayfa 69 = Değer: ${concls.conclusion}")

    val concls2 = toplam(1, 2, 3, 4, 5)
    println("Sayfa 70 = Toplam: $concls2")

    val q: String? = "Null Safety"
    val v: String? = null

    print_it("Sayfa 73= $q")
    print_it("Sayfa 73= $v")

    val math = Math()

    val minus = math.minus(10, 5)
    println("Sayfa 74 = $minus")

    val division = math.division(10, 5)
    println("Sayfa 74 = $division")

    val number_box = Box<Int>(10)
    val string_box = Box<String>("Generic classes")

    println("Sayfa 75= Sayı Kutusu Değeri: ${number_box.y}")
    println("Sayfa 75= Metin Kutusu Değeri: ${string_box.y}")
    ex<String>("Sayfa 76")
    val animal = Animal()
    animal.sound()

    val cow = Cow()
    cow.sound()
    println("Sayfa 80= ${find_obj(9.0)}")
    toZero()
    increase()

    val g:Int=2
    val ü:Int=2
    println("Sayfa 88= ${g==ü}")

}