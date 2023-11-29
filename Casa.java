public class Casa {

    String cor;
    Porta porta1;
    Porta porta2;

    void pintar(String c) {
        cor = c;
    }

    int quantPortasAbertas() {
        int qtd = 0;
        if (porta1.estaAberta()) {
            qtd++;
        }
        if (porta2.estaAberta()) {
            qtd++;
        }
        return qtd;
    }
}