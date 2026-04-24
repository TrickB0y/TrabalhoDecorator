package main;

public class MemoriaDDR5 extends ComputadorDecorator{
    public String nome = "DDR5";

    public MemoriaDDR5(Computador computador) {
        super(computador);
    }

    public String getEspecificacao(){
        return "Memória: " + this.nome;
    }

    public String getNomeEstrutura(){
        return "Memória";
    }
}
