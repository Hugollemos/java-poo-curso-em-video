public class Caneta {
  private String modelo;
  private float ponta;
  private boolean tampada;
  private String cor;

  //Utilizando o modo Construtor
  /*public Caneta(String m, String c, float p) {
    this.modelo = m;
    this.cor = c;
    this.tampar();

    this.tampar();
    this.cor = "Azul";
  }*/

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String m) {
    this.modelo = m;
  }

  public float getPonta() {
    return this.ponta;
  }

  public void setPonta(float p) {
    this.ponta = p;
  }

  public void tampar() {
    this.tampada = true;
  }

  public void destampar() {
    this.tampada = false;
  }

  //Utilizando método set
  
  public void status() {
    System.out.println("Sobre A CANETA:");
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Cor: " + this.cor);
    System.out.println("tampada: " + this.tampada);

    //Utilizando usando método get

    /*public void status() {
    System.out.println("Sobre A CANETA:");
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Ponta: " + this.getPonta());*/
  }
}
