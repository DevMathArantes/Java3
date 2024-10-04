/*
 Todos os atributos e métodos de uma classe pai, são herdados pelas classes filhas

 Método construtor

     public NOME_DA_CLASSE(TIPO NOME_VARIAVEL) {
            this.ATRIBUTO = NOME_VARIAVEL;
     }
     Variáveis que não podem faltar em um objeto, são colocadas em um método construtor. Este método não pode ser
     herdado, para declarar em uma classe pai, faça:

        Na classe pai:
            public NOME_DA_CLASSE_PAI(TIPO NOME_VARIAVEL) {
                this.ATRIBUTO = NOME_VARIAVEL;
            }

        Na classe filha:
            public NOME_DA_CLASSE_FILHA(TIPO NOME_VARIAVEL) {
                super(NOME_VARIAVEL);
            }

Ordenar objetos

    - Utilize uma implementação na classe de objetos desejada e faça:
    NOME_CLASSE implements Comparable<NOME_CLASSE>{...INSTRUÇÕES...}

    - Após isso, a interface irá exigir um método, utilize:

        - Para comparar inteiros:
            @Override
            public int compareTo(NOME_CLASSE Y) {
                return this.METODO_GET_X - Y.METODO_GET_X();
            }

            - Nomeie Y traga o método get na variável que servirá de parâmetro

        - Para comparar Strings:
            @Override
             public int compareTo(NOME_CLASSE Y) {
                return this.getOrdem().compareTo(Y.getOrdem());
            }

        -OBS: A função compareTo, funciona da seguinte forma:
        Se this.X < Y, ela retorna -1
        Se this.X > Y, ela retorna 1
        Se forem iguais, ela retorna 0


*/
package PacoteClasses;
public class ClassePai implements Comparable<ClassePai>{

    private int intHerdado;
    private String stringHerdado;
    protected String stringProtegida = "Sou livre";
    private int valorExigido;
    private String ordem;

    public ClassePai(int valorExigido) {
        this.valorExigido = valorExigido;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getStringHerdado() {
        return stringHerdado;
    }

    public void setIntHerdado(int intHerdado) {
        this.intHerdado = intHerdado;
    }
    public int getIntHerdado() {
        return intHerdado;
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


    @Override
    public int compareTo(ClassePai comparar) {
        return this.getOrdem().compareTo(comparar.getOrdem());
    }

    @Override
    public String toString() {
        return "Ordem: "+this.getOrdem()+", Int herdado: "+this.getIntHerdado();
    }
}
