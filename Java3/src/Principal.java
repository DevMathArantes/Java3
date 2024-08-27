/*

Link documentação arrays
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html

Link Java Doc
https://www.oracle.com/java/technologies/javase/javadoc-tool.html

Criando um objeto
requisitos: tenha uma classe criada
X NOME_OBJETO = new X();
X= nome da classe, sendo o primeiro X para criar a variável e o segundo para referência-lo

    Atribuindo
    requisitos: tenha os atributos ou métodos da classe já criados nela

    para atributos
    X.Y = Z;

    para métodos
    X.N();

    X= nome do objeto
    Y= nome do atributo
    Z = valor
    N = nome de um método

O comando CTRL + ALT + I identa o código

Em java, String não é um tipo primitivo e sim uma classe, com atributos e métodos

Documentação Java
https://docs.oracle.com/en/java/
https://docs.oracle.com/en/java/javase/19/docs/api/index.html
https://docs.oracle.com/en/java/javase/17/docs/api/index.html

ArrayList

    importe a classe ArrayList

    - Declarando a lista:
    ArrayList<CLASSE> NOME_LISTA = new ArrayList<>();

    - Adicionando objetos
    NOME_LISTA.add(NOME_OBJETO);

    - Número de elementos dentro de uma lista
    NOME_LISTA.size();

    - Encontrando elementos
    NOME_LISTA.get(x).y;
    x= posição do item, a partir de 0
    y= atributo ou getter do objeto;
    utilize a função (...).toString para retornar local text

Atribuição VAR

    Durante a declaração de uma variável, pode ser atribuída com VAR NOME = X, aonde
    a variável será do tipo do valor X

    É obrigatório declarar um valor a váriavel junto a sua declaração

Declarar Array

    Sintaxe: TIPO[] NOME = new TIPO[X]
    X= tamanho do array

    TIPO = tipo de dados do array

    obs: arrays possuem tamanho fixo e não possuem funções

Método toString

    Ele retorna o local text de um objeto, todos os objetos possuem essa função, ela pode ser sobreescrita e portanto,
    criando uma função nova disponivel a todos os objetos

*/
import PacoteClasses.PrimeiraClasse;
import PacoteClasses.SegundaClasse;
import PacoteClasses.TerceiraClasse;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        int[] meuArray = new int[5];

        PrimeiraClasse meuObjeto = new PrimeiraClasse();
        meuObjeto.setExemploString("Primeiro objeto");
        meuObjeto.setExemploInt(100);
        meuObjeto.setIntHerdado(20);
        meuObjeto.setStringHerdado("Herança aqui");
        meuObjeto.receberParametro("\n-----Nova frase aqui-----\n");
        meuObjeto.metodoReescrito();
        System.out.println(meuObjeto.descobrirClasse(meuObjeto));
        meuObjeto.mostrarProtegida();

        SegundaClasse outroObjeto = new SegundaClasse();
        outroObjeto.setExemploBoolean(true);
        outroObjeto.setExemploDouble(1.3);
        outroObjeto.setIntHerdado(15);
        outroObjeto.setStringHerdado("Segundo objeto");
        outroObjeto.verificaAcesso();
        outroObjeto.metodoReescrito();
        System.out.println(outroObjeto.descobrirClasse(outroObjeto));

        ArrayList<PrimeiraClasse> minhaLista = new ArrayList<>();
        minhaLista.add(meuObjeto);
        System.out.println("Elementos dentro do ArrayList: "+minhaLista.size());

        for (int i = 0; i < 5; i++) {
            meuArray[i]=i*5;
            System.out.println("Elemento "+i+" do array prenchido com: "+meuArray[i]);
        }

        System.out.println(minhaLista);

        TerceiraClasse construirObjeto = new TerceiraClasse("Contruindo objeto", 01);

    }
}
