public class Aluno {
  private String nome;
  private int idade;
  private String serie;

  public Aluno(){

  } 

  public Aluno(String nome, int idade, String serie){

    setNome(nome);
    setIdade(idade);
    setSerie(serie);
  }

  //sets e gets

  public int getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public int getIdade(){
    return idade;
  }
  public void setIdade(int idade) {    
    validarIdade(idade);
  }

  public String getSerie(){
    return serie;
  }

  public void setSerie(String serie){
    this.serie = serie;
  }

  private boolean validarIdade(int idade) {

  if (idade > 11 && idade < 18) {
    this.idade = idade;
    System.out.println("Idade Permitida");
  } else {
    System.out.println("Extrapolou a Idade");
  }

  return false;

  }
}


