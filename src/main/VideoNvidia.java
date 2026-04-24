package main;

public class VideoNvidia extends ComputadorDecorator{
    public String nome = "Nvidia";

    public VideoNvidia(Computador computador) {
        super(computador);
    }

    public String getEspecificacao(){
        return "Vídeo: " + this.nome;
    }

    public String getNomeEstrutura(){
        return "Vídeo";
    }
}
