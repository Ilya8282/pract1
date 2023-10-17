import java.util.function.ToDoubleFunction

fun main(args: Array<String>)
{
    //#1
    val user: Int = 17;
    println(user)
    //#2
    val people: Double = 17.0;
    val man: Double = 30.0
    println((user + man) / 2)
    //#3
    val testNumber: Int = 10;
    val evenOdd = testNumber / 2;
    println(evenOdd)
    //#4
    val answer: Int = 0;
    val total = (answer + 1 + 10) * 10;
    println(total shl 3);
    //#5
    var age = 16
    print(age)
    age = 30
    print(age)
    //#6
    val a: Int = 46;
    val b: Int = 10;
    //1
    val answer1: Int = (a * 100) + b
    println(answer1)
    //2
    val answer2: Int = (a * 100) + (b * 100)
    println(answer2)
    //3
    val answer3: Int = (a * 100) + (b / 100)
    println(answer3)
    //#7
    println(5 + 3 - (4 / (2 * 2)))
    //#8
    val a1: Double = 5.0
    val b1: Double = 10.0
    val average = ((a1 + b1) / 2)
    println(average)
    //#9
    println("Введите температуру в F")
    val name = readln()
    val fahrenheit: Double = name.toDouble();
    val celcius = ((fahrenheit - 32) / 1.8)
    println(celcius)
    //10
    val a2: int = 32
    val  fahrenheit: double = ( (fahrenheit * 1.8) + a2)
    //11
    counst val position 0..63
    val row = position / 8
    val column = position % 8

    println("Строка: $row")
    println("Столбец: $column")
    //12
    val degrees: Double = 360.0
    val radians: Double = degrees * (Math.PI/180)
    println(radians)
    //13
    const val x1: Double = 1.0
    const val y1: Double = 2.0
    const val x2: Double = 3.0
    val y2: Double = 4.0

    val distance: Double = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0))

    println("Расстояние между точками: $distance")
}