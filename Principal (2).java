public class Principal {

    public static void main(String[] args) {

        // Criação de casa e portas
        Casa casa = new Casa();
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();

        // Pintura da casa
        casa.pintar("Azul");

        // Colocação das portas na casa
        casa.porta1 = porta1;
        casa.porta2 = porta2;

        // Abrir e fechar portas
        porta1.abrir();
        porta2.fechar();

        // Imprimir número de portas abertas
        System.out.println("Número de portas abertas: " + casa.quantPortasAbertas());
    }
}