/*
Classes costumam guardar atributos em comum entre objetos

Tipos de métodos
métodos construtores: são responsáveis por inicializar os objetos
métodos de acesso: permitem acessar e modificar os atributos de um objeto


Quando os métodos não retornam um valor, utiliza-se o void, quando retornam, utiliza-se o tipo do retorno
TIPO NOME_MÉTODO(){...INSTRUÇÕES...}

    Utilizando parâmetro
    TIPO NOME(X PARÂMETRO){...intruções (chame pelo nome do parâmetro para utiliza-lo)...}
    X= tipo do parâmetro

    Retornar valor
    return X;
    O return deve ser dado dentro do método e retornará X;

Modificadores de acesso/visibilidade

VISIBILIDADE TIPO NOME;

private: não pode ser vista nem utilizada em outras classes
Podemos criar uma função get para utilizar essa variável, por exemplo: int getX(){ return x;}
use ALT + INSERT, vá em "generate" para ver opções getters e setters

    getter
    public int getY(){
        return y;
    }
    Utiliza-se esta função para retornar um valor y privado pela função getY()

    setter
    public void setY(X Y) {
        this.Y = Y;
    }
    Obs: Y= atributo, X= tipo
    Assim, ao criar o objeto, ela poderá ser chamada por N.setY(Z), onde N = objeto, Y = atributo e Z = valor


public: é visível e utilizavel em qualquer pacote do projeto

default: não específica nenhuma visibilidade, portanto pode ser acessado pelas classes de mesmo pacote

protected: permite utilizar a declaração nas subclasses

Recebendo herança
X class Y extends Z{...}
X= visibilade da classe filha
Y= classe filha
Z= classe pai (quantas desejar, separadas por ",")

Reescrevendo métodos
Basta criar o método com o mesmo nome e alterar suas instruções

Boas práticas para indicar métodos

    @Override indica que um método está sobreescrevendo outro
    @Deprecated indica que um método ou classe está obsoleto e não deve ser mais utilizado
    @NotNull é usada para validar que um atributo não seja nulo

Tipos de polimorfismo

    Sobrecarga
    Basta chamar as funções com o mesmo nome, porém modificando seus parâmetros de acordo com a classe
    exemplo (X= classe1, Y= classe2 e  x/y = variáveis de parâmetro:
    public String fazerAlgo(X x){...}
    public String fazerAlgo(Y y){...}

    Sobreposição
    Basta reescrever o método com novas instruções na subclasse

*/
package PacoteClasses;
public class PrimeiraClasse extends ClassePai {

    private String exemploString;
    private int exemploInt;

    public PrimeiraClasse(int valorExigido) {
        super(valorExigido);
    }

    public void setExemploString(String exemploString) {
        this.exemploString = exemploString;
    }
    public void setExemploInt(int exemploInt) {
        this.exemploInt = exemploInt;
    }
    public void receberParametro( String parametro){
        exemploString += parametro;
        System.out.println(exemploString);
    }
    public String getExemploString() {
        return exemploString;
    }

    @Override
    public void metodoReescrito(){
        System.out.println("\nReescrito aqui.\n");
    }

    public void mostrarProtegida(){
        System.out.println(stringProtegida);
    }

}
