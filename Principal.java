public class Principal {
    public static void main(String[] args) {
        // Criação da pessoa
        Pessoa pessoa = new Pessoa("Maria", 25);

        // Aniversários
        for (int i = 0; i < 5; i++) {
            pessoa.fazAniversario();
        }

        // Impressão do nome e idade
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
