package main;

public class ProcessadorIntel extends ComputadorDecorator{
    public String nome = "Intel";

    public ProcessadorIntel(Computador computador) {
        super(computador);
    }

    public String getEspecificacao(){
        return "Processador: " + this.nome;
    }

    public String getNomeEstrutura(){
        return "Processador";
    }
}
