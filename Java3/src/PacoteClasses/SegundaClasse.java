package PacoteClasses;
import java.util.Scanner;
public class SegundaClasse extends ClassePai implements PrimeiraInterface {

    Scanner ler = new Scanner(System.in);
    private boolean exemploBoolean;
    private double exemploDouble;
    private int valorSecreto = 6457;

    public void setExemploBoolean(boolean exemploBoolean) {
        this.exemploBoolean = exemploBoolean;
    }
    public void setExemploDouble(double exemploDouble) {
        this.exemploDouble = exemploDouble;
    }
    public void verificaAcesso(){
        System.out.print("Digite algo secreto: ");
        int verificar = ler.nextInt();
        if(verificar == valorSecreto){
            System.out.println("\n\nAcesso permitido\n\n");
        }
        else{
            System.out.println("\n\nAcesso negado\n\n");
        }
    }

    @Override
    public int getVariavel() {
        return 0;
    }
}
