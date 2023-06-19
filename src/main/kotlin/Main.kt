fun main() {
//   val tesla=car("tesla","model y","KDE426G",0)
//    println(tesla.make)
//    println(tesla.model)
//    println(tesla.registration)
//    println(tesla.speed)
//    tesla.accelerate(acceleration = 0)
//    tesla.accelerate(acceleration = 20)
//    println(tesla.decellerate(30))
//    println(tesla.Hoot())
//    println(tesla.speed)
//
//    val toyota=car("Toyota","Land cruiser","KDK465J",0)
    class book(var title:String,var author:String,var pages:Int,var director:String)
 var mybook=book("Born A Crime","Trevor Noah",282,"John Murei")
    println(mybook.title)
    println(mybook.author)
}


class car(var make:String ,var model: String,var registration:String,var speed:Int){
    fun start(){
        println("vroom vroom")
    }
    fun accelerate(acceleration:Int) {
        speed += acceleration
    }
    fun decellerate(decelleration:Int){
        speed+=decelleration
    }
    fun Hoot(){
        println("piiip")
    }
    fun stop(){
       speed=0
    }

}
//data class book(var title:String, var author:String,var pages:Int,var publisher:String)
data class agestarts(var minage:Int,var maxage:Int,var average:Double){

//fun calculateaes(ages: Array:Int):agestarts{

}
