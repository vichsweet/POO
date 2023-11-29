public class Principal {
    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.abrir();
        System.out.println("A porta está aberta? " + porta.estaAberta());

        porta.fechar();
        System.out.println("A porta está aberta? " + porta.estaAberta());

        porta.pintar("azul");
        System.out.println("A cor da porta é: " + porta.getCor());

        porta.setAltura(2.5);
        porta.setComprimento(1.5);
        System.out.println("A altura da porta é: " + porta.getAltura());
        System.out.println("O comprimento da porta é: " + porta.getComprimento());
    }
}
