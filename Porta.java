public class Porta {
    private boolean aberta;
    private String cor;
    private double altura;
    private double comprimento;

    public Porta() {
        this.aberta = false;
        this.cor = "vermelho";
        this.altura = 2.0;
        this.comprimento = 1.0;
    }

    public void abrir() {
        this.aberta = true;
    }

    public void fechar() {
        this.aberta = false;
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public boolean estaAberta() {
        return this.aberta;
    }

    public String getCor() {
        return this.cor;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getComprimento() {
        return this.comprimento;
    }
}