fun main() {
    println("Робота з класами Рядки \n")

    val baseString = Strings("kotlin")
    val ascString = UpperCaseStrings("program")
    val descString = LowerCaseStrings("java")

    println("Довжина базового рядка: ${baseString.length}")
    println("Довжина першого похідного: ${ascString.length}")
    println("Довжина другого похідного: ${descString.length}")
    println()


    baseString.sort()
    ascString.sort()
    descString.sort()
}