import java.util.Random;

public class Carro{
  int ano;
  String modelo;
  String cor;

  public Carro(int ano, String modelo, String cor){
      this.cor = cor;
      this.ano = ano;
      this.modelo = modelo;

  }

  public void ligar(){
      System.out.println("O carro esta ligando"+modelo+"...");

  }
  public int acelerar() {
      Random random = new Random();
      int velocidadeA = random.nextInt(100);
      System.out.println(velocidadeA);
      return velocidadeA;
  }

  public void multar(int velocidadeA){
      if(velocidadeA > 60){
          System.out.println("Voce ultrapassou o limite de velocidade");
      }else{
          System.out.println("Voce esta dentro do limite de velocidade");
      }

  }
}