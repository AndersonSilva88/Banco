package anderson.kotlin.banco.testes

import anderson.kotlin.banco.Login

class TesteAutenticacao {
    fun autentica(logavel: Login) = println(logavel.login())
}