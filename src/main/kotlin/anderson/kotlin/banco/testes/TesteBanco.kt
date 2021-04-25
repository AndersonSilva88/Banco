package anderson.kotlin.banco.testes

import anderson.kotlin.banco.Bank

fun main(){
    val digitoneBank = Bank(nome = "DigiOne", numero = 12)
    println(digitoneBank.nome)
    println(digitoneBank.numero)

}