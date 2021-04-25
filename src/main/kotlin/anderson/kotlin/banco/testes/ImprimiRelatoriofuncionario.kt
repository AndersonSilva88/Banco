package anderson.kotlin.banco.testes

import anderson.kotlin.banco.Funcionario

class ImprimiRelatoriofuncionario {

    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}