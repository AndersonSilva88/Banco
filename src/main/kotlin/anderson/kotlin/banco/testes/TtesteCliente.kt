package anderson.kotlin.banco.testes

import anderson.kotlin.banco.Cliente
import anderson.kotlin.banco.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "jose da silva",
        cpf = "123456795-89",
        clienteTipo = ClienteTipo.PF,
         senha = "123456"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)

}