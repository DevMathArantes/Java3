package Exemplos.Classes;

import Exemplos.Outros.Pertences;

public class Cachorro extends Animal implements Pertences{

    private String porte;
    private boolean adestrado;
    private String brinquedo;

    public void setBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    public void setAdestrado(boolean adestrado) {
        this.adestrado = adestrado;
    }
    public String getPorte() {
        return porte;
    }
    public boolean isAdestrado() {
        return adestrado;
    }

    public void latir(){
        if(acesso()){
            System.out.println(getNome()+": au au aua !!!\n");
        }
        else{
            System.out.println("...");
        }
    }

    @Override
    public void contraCachorro(){
        System.out.println("Eu sou um cachorro");
    }

    @Override
    public String getBrinquedo() {
        return "EU TENHO: "+brinquedo;
    }
}
