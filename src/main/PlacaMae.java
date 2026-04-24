package main;

public class PlacaMae implements Computador{

    public String nome;

    public PlacaMae(String nome){
        this.nome = nome;
    }

    public String getEspecificacoes(){
        return "Placa Mãe: " + this.nome;
    }

    public String getEstrutura(){
        return "PlacaMae";
    }

}
