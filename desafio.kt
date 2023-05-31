enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(var id: Int, var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val usuario1 = Usuario(1, "Roberta")
    val usuario2 = Usuario(2, "Jose")
    
    val curso1 = ConteudoEducacional("Spring Boot")
    val curso2 = ConteudoEducacional("Kotlin")
    
    val formacao = Formacao("Bootcamp 1", mutableListOf(curso1, curso2), Nivel.INTERMEDIARIO)
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    
    println("--- ${formacao.nome} ---")
    println("Conteudo Programático:")
    for (c in formacao.conteudos)
    	println(c)
    
    println("\n---> Alunos Inscritos:")
    for (aluno in formacao.inscritos)
    	println(aluno.nome)

}