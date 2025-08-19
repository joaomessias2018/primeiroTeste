public class Garagem {
    public static void main(String[] args) {
        Carro carro = new Carro(1990,"fusca","vermelho");

        System.out.println(carro.modelo);
        System.out.println(carro.cor);
        System.out.println(carro.ano);

        carro.ligar();

        int velocidadeA = carro.acelerar();

        carro.multar(velocidadeA);
    }
}