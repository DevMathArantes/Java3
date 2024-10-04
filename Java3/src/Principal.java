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
    ArrayList<TIPO> NOME_LISTA = new ArrayList<>();

    - Declarando a lista para objetos:
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

Percorrendo itens de uma lista

    for(CLASSE X : LISTA){
        ...INSTRUÇÕES...
    }

    - X deve ser nomeado, ele é um parâmetro de exemplo do elemento da classe

    - Este for irá percorrer os elementos de uma classe dentro da lista, caso seja uma classe pai e deseje usar um método
    da classe filha, precisa tranformar X em um elemento da classe filha através de:

        CLASSE_FILHA Y = (CLASSE_FILHA) X;

    - A verificação de uma classe pode ser feita da seguinte forma:

        if(X instanceof CLASSE Y){
                ...INTRUÇÕES...
        }

        Obs: repare que a mudança do tipo de X e consequentemente a criação de Y, já é feita dentro dos parâmetros do
        for

    - O mesmo processo pode ser feito por:

        LISTA.forEach(X -> ...INSTRUÇÕES...);

Importante lembrar:

    Um objeto só é criado através de um new, fora disso estamos apenas referenciando um objeto, veja o exemplo:

        ...CRIAÇÃO DE UM OBJETO CHAMADO "Ob1" DA CLASSE "Cl1"...
        Ob2 = Ob1;

        Neste exemplo estamos criando outra referência do mesmo objeto, ou seja, tudo que alterar-mos em Ob2 será
        alterado em Ob1, poís são referências de um mesmo objeto

Ordenando listas

    - importe a classe Collections

    - Utilize:
    Collections.sort(LISTA);

    - Após este comando, LISTA estará ordenada

    -Para ordenar objetos por um parâmetro int:

         LISTA.sort(Comparator.comparing(CLASSE::ATRIBUTO));

         LISTA será ordenada por ATRIBUTO de objetos da CLASSE
*/

import PacoteClasses.ClassePai;
import PacoteClasses.PrimeiraClasse;
import PacoteClasses.SegundaClasse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {

        int[] meuArray = new int[5];

        PrimeiraClasse meuObjeto = new PrimeiraClasse(1);
        meuObjeto.setExemploString("Primeiro objeto");
        meuObjeto.setExemploInt(100);
        meuObjeto.setIntHerdado(20);
        meuObjeto.setStringHerdado("Herança aqui");
        meuObjeto.receberParametro("\n-----Nova frase aqui-----\n");
        meuObjeto.metodoReescrito();
        meuObjeto.setOrdem("abc");
        System.out.println(meuObjeto.descobrirClasse(meuObjeto));
        meuObjeto.mostrarProtegida();

        SegundaClasse outroObjeto = new SegundaClasse(2);
        outroObjeto.setExemploBoolean(true);
        outroObjeto.setExemploDouble(1.3);
        outroObjeto.setIntHerdado(25);
        outroObjeto.setStringHerdado("Segundo objeto");
        outroObjeto.verificaAcesso();
        outroObjeto.metodoReescrito();
        outroObjeto.setOrdem("aab");
        System.out.println(outroObjeto.descobrirClasse(outroObjeto));

        ArrayList<PrimeiraClasse> minhaLista = new ArrayList<>();
        minhaLista.add(meuObjeto);
        System.out.println("Elementos dentro do ArrayList: "+minhaLista.size());

        for (int i = 0; i < 5; i++) {
            meuArray[i]=i*5;
            System.out.println("Elemento "+i+" do array prenchido com: "+meuArray[i]);
        }

        System.out.println(minhaLista);

        ArrayList<ClassePai> listaUniversal = new ArrayList<>();
        listaUniversal.add(meuObjeto);
        listaUniversal.add(outroObjeto);

        listaUniversal.forEach(item-> System.out.println("----\n"+item.getStringHerdado()+"\n----")
        );

        for(ClassePai item : listaUniversal){
            System.out.println("----");
            if(item instanceof PrimeiraClasse itemPrimeiraClasse){
                System.out.println("Primeira classe: "+itemPrimeiraClasse.getExemploString());
            }
            else{
                System.out.println("Segunda classe, nada a dizer...");
            }
            System.out.println("----");
        }

        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Matheus");
        listaStrings.add("Mikael");
        listaStrings.add("Carlos");
        System.out.println("Lista pronta: "+listaStrings);

        Collections.sort(listaStrings);
        System.out.println("Lista ordenada: "+listaStrings);

        System.out.println(listaUniversal.toString());
        Collections.sort(listaUniversal);
        System.out.println("\n--- ORDENADO POR STRING---");
        System.out.println(listaUniversal.toString());

        System.out.println("\n---ORDENADO POR INT---");
        listaUniversal.sort(Comparator.comparing(ClassePai::getIntHerdado));
        System.out.println(listaUniversal.toString());

    }
}
