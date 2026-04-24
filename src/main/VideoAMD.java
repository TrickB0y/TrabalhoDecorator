package main;

public class VideoAMD extends ComputadorDecorator{
    public String nome = "AMD";

    public VideoAMD(Computador computador) {
        super(computador);
    }

    public String getEspecificacao(){
        return "Vídeo: " + this.nome;
    }

    public String getNomeEstrutura(){
        return "Vídeo";
    }
}
