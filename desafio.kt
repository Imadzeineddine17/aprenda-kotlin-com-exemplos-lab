// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val Nivel: Nivel) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val usuario1 = Usuario("Falvo")
    val usuario2 = Usuario("Daniela")
    val usuario3 = Usuario("Caio")

    val conteudo1 = ConteudoEducacional("Programacao")
    val conteudo2 = ConteudoEducacional("AWS")
    val conteudo3 = ConteudoEducacional("Seguranca de Redes")

    val formacao = Formacao("Analise de Sistemas", listOf(conteudo1, conteudo2, conteudo3), Nivel.AVANCADO)
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)

    println("Usuarios:")
    for (usuario in formacao.inscritos) {
        when (usuario) {
            usuario1 -> println("${usuario.nome} é o(A)usuario1 e esta estudando ${conteudo1.nome} no nivel ${formacao.Nivel}.")
            usuario2 -> println("${usuario.nome} é o(A) usuario2 e esta estudando ${conteudo2.nome} no nivel ${Nivel.INTERMEDIARIO}.")
            usuario3 -> println("${usuario.nome} é o(A) usuario3 e esta estudando ${conteudo3.nome} no nivel ${Nivel.BASICO} .")
        }
    }
}
//TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
//TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
