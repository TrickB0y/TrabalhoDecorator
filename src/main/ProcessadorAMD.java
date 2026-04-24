package main;

public class ProcessadorAMD extends ComputadorDecorator{
    public String nome = "AMD";

    public ProcessadorAMD(Computador computador) {
        super(computador);
    }

    public String getEspecificacao(){
        return "Processador: " + this.nome;
    }

    public String getNomeEstrutura(){
        return "Processador";
    }
}
