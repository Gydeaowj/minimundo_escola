public class Sala{
  private int numero;
  private int capacidade;
  private String tipo;

//construtores
  
  public Sala(){
    
  } 

  public Sala(int numero, int capacidade, String tipo){
  
    setNumero(numero);
    setCapacidade(capacidade);
    setTipo(tipo);
  }

  //sets e gets

  public int getNumero(){
    return numero;
  }

  public void setNumero(int numero){
    if(validarNumeroDaSala(numero));
  }

  public int getCapacidade(){
    return capacidade;
  }
  public void setCapacidade(int capacidade) {    
    validarCapacidadeDaSala(capacidade);
  }

  public String getTipo(){
    return tipo;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }
  

//validar

  private boolean validarNumeroDaSala(int numero) {
    if(numero > 0 && numero < 40 ){
      this.numero = numero;
      System.out.println("O numero da sala é:" + numero);
      return true;
    }else{
      System.out.println("Sala inválida");
      return false;
    }
  }  

  private boolean validarCapacidadeDaSala(int capacidade) {

    if (capacidade > 0 && capacidade < 46) {
      this.capacidade = capacidade;
      System.out.println("Capacidade Permitida");
    } else {
      System.out.println("Extrapolou a Capacidade");
    }

    return false;
    
  }


  
}

