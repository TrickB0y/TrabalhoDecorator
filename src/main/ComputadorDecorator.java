package main;

public abstract class ComputadorDecorator implements Computador {
    private Computador computador;
    public String estrutura;

    public ComputadorDecorator(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public abstract String getEspecificacao();

    public String getEspecificacoes() {
        return this.computador.getEspecificacoes() + ", " + this.getEspecificacao();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.computador.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
