package quiz

class Usuario {

  String nome
  String matricula
  String senha
  String email

    static constraints = {
      nome nullable:false, blank:false, maxSize: 128
      matricula nullable:false, blank:false, maxSize: 15, unique:true
      senha nullable:false, blank:false, maxSize: 15
      email nullable:false, blank:false, maxSize: 45, email:true

    }
}
