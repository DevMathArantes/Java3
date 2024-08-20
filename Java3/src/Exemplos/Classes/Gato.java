package Exemplos.Classes;

import Exemplos.Outros.Pertences;

public class Gato extends Animal implements Pertences{

    private boolean castrado;
    private String brinquedo;

    public void setBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
    public boolean isCastrado() {
        return castrado;
    }

    public void miar(){
        if(acesso()){
            System.out.println(getNome()+": MIAAAAAAUUUUUUUUU!!!!\n");
        }
        else{
            System.out.println("...");
        }
    }

    @Override
    public String getBrinquedo() {
        return "Eu tenho: "+brinquedo;
    }
}
