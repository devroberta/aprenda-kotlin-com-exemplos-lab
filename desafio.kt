enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(var id: Int, var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

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
    
    val formacao = Formacao("Bootcamp 1", mutableListOf(curso1, curso2))
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    
    println(formacao)
    println(formacao.inscritos)

}