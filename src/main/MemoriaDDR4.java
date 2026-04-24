package main;

public class MemoriaDDR4 extends ComputadorDecorator{
    public String nome = "DDR4";

    public MemoriaDDR4(Computador computador) {
        super(computador);
    }

    public String getEspecificacao(){
        return "Memória: " + this.nome;
    }

    public String getNomeEstrutura(){
        return "Memória";
    }
}
