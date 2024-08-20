package Exemplos.Classes;
import java.util.Scanner;
public class Animal {

    private double peso;
    private String nome;
    private String corPelos;
    private int idade;
    private int senha = 123;
    Scanner ler = new Scanner(System.in);

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setCorPelos(String corPelos) {
        this.corPelos = corPelos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
    public String getNome() {
        return nome;
    }
    public String getCorPelos() {
        return corPelos;
    }
    public int getIdade() {
        return idade;
    }
    public int getSenha() {
        return senha;
    }

    public boolean acesso(){
        System.out.print("\nDigite a senha de tutor: ");
        int entrada = ler.nextInt();
        if(entrada == senha){
            return true;
        }
        else {
            return false;
        }
    }

    public void contraCachorro(){
        System.out.println("Nenhum cachorro aqui");
    }


}
