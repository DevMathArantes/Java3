/*
 Todos os atributos e métodos de uma classe pai, são herdados pelas classes filhas
*/
package PacoteClasses;
public class ClassePai {

    private int intHerdado;
    private String stringHerdado;
    protected String stringProtegida = "Sou livre";

    public void setIntHerdado(int intHerdado) {
        this.intHerdado = intHerdado;
    }
    public void setStringHerdado(String stringHerdado) {
        this.stringHerdado = stringHerdado;
    }
    public void metodoReescrito(){
        System.out.println("\nOriginal aqui\n");
    }

    public String descobrirClasse(PrimeiraClasse x){
        return "Primeira classe";
    }
    public String descobrirClasse(SegundaClasse x){
        return "Segunda classe";
    }
}
