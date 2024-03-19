object NewOne {
  def main(args:Array[String]): Unit = {
    var a = 20
    var b = 0
    try {
      print(a / b)

    }
    catch {
      case e:ArithmeticException=>println(e)

    }

    finally{
      println("It will execute all time")
    }
    println("Now the things are done")
  }
}
