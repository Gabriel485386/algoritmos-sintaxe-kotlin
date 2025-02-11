fun main(args: Array<String>) {

 println("quanto você ganha por hora: ")
 var numero = readLine()!!.toDouble()
 println("número de horas trabalhadas no mês: ")
 var num = readLine()!!.toDouble()
 
 println("o total do seu salário:${numero * num} ")

}