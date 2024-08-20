/*
Esta classe será mais utilizada para calculos
*/

package Exemplos.Outros;

public class Tutor {

    private String nome;
    private int totalPets;
    private String nomesPets = "Nomes dos pets: ";


    public int getTotalPets() {
        return totalPets;
    }
    public String getNome() {
        return nome;
    }
    public String getNomesPets() {
        return nomesPets;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String contarPet(String nome){
        nomesPets+=("|"+nome+"|");
        totalPets +=1;
        return nomesPets;
    }
    public void mostrarMeusPets(){
        System.out.println(nome+" possui "+totalPets+" pets"+"\n"+nomesPets);
    }

}
