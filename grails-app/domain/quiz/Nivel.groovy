package quiz

class Nivel {

  String nome

  static hasMany = [questoes:Questao]

  String toString(){
    this.nome
  }
    static constraints = {
      nome nullable:false, blank:false, unique:true, maxSize:20

    }
}
