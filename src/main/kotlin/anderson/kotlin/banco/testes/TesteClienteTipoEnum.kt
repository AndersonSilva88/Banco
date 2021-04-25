package anderson.kotlin.banco.testes

import anderson.kotlin.banco.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} ${elemento.descricao}")
    }
    ClienteTipo.values().forEach {
    println("${it.name} ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println(">> ${pf.name} ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} ${pj.descricao}")

}