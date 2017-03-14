def gcd (x: Int, y: Int ) : Int ={
    var a = x
    var b = y
    while (a != 0)
 {
  val temp = a
     a= b % a
    b = temp
 }
b
}
println (gcd (9,36))
