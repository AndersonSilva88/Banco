package anderson.kotlin.banco.testes

import anderson.kotlin.banco.Gerente

fun main() {

    val maria = Gerente(nome = "Maria", cpf = "123456789-85", 8000.0,"senha125")
    ImprimiRelatoriofuncionario.imprime(maria)
    TesteAutenticacao().autentica(maria)
}

