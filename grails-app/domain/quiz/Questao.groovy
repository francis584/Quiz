package quiz

class Questao {

  static belongsTo = [nivel:Nivel]

  String pergunta
  String opcao1
  String opcao2
  String opcao3
  String resposta

  String toString(){
    this.pergunta
  }

    static constraints = {
      pergunta nullable:false, blank:false, maxSize: 128, unique:true
      opcao1 nullable:false, blank:false, maxSize: 128
      opcao2 nullable:false, blank:false, maxSize: 128
      opcao3 nullable:false, blank:false, maxSize: 128
      resposta nullable:false, blank:false, maxSize: 128
    }
}
