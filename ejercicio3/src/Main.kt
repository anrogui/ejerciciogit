fun main() {
    println("Adjunta la medida del radio del círculo en cm")
    var radio: Int = readln().toInt()
    print("El área del círculo es ")
    print(Math.PI * radio * radio)
    println("La circunferencia del círculo es ")
    print(2 * Math.PI * radio)


    println("introduce un numero")
      val a: Int = readln().toInt()
      val b: Int = readln().toInt()
      println("este es el perimetro")
      var numero0 = 2*(a+b)
      println(numero0)
      println("este es el area")
      var numero1 = a * b
      println(numero1)
}
