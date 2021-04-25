package anderson.kotlin.banco.testes

import anderson.kotlin.banco.Analista

fun main() {

    val joao = Analista(nome = "Joao", cpf = "123456789-85", 2000.0)
    ImprimiRelatoriofuncionario.imprime(joao)
}

