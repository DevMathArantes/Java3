package Exemplos;

import Exemplos.Classes.Gato;
import Exemplos.Classes.Cachorro;
import Exemplos.Outros.Tutor;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Gato tom = new Gato();
        tom.setIdade(2);
        tom.setCorPelos("cinza");
        tom.setNome("Tom");
        tom.setPeso(5.0);
        tom.setCastrado(false);
        tom.miar();
        tom.contraCachorro();
        tom.setBrinquedo("Jerry");
        System.out.println(tom.getBrinquedo());

        Cachorro scooby = new Cachorro();
        scooby.setIdade(7);
        scooby.setCorPelos("marrom");
        scooby.setPeso(27.5);
        scooby.setNome("Scooby Do");
        scooby.setAdestrado(true);
        scooby.setPorte("grande");
        scooby.latir();
        scooby.contraCachorro();
        scooby.setBrinquedo("Biscoito");
        System.out.println(scooby.getBrinquedo());

        Cachorro caramelo = new Cachorro();
        caramelo.setNome("Chefe Caramelo");
        caramelo.setPeso(1.2);
        caramelo.setCorPelos("Dourado");
        caramelo.setPorte("Peso pena leve");
        caramelo.setAdestrado(false);
        caramelo.setIdade(18);
        caramelo.latir();
        caramelo.contraCachorro();
        caramelo.setBrinquedo("Bola");
        System.out.println(caramelo.getBrinquedo());

        Tutor salsicha = new Tutor();
        salsicha.setNome("\nSalsicha Soares Sadia");
        salsicha.contarPet(scooby.getNome());
        salsicha.contarPet(tom.getNome());
        salsicha.mostrarMeusPets();

        ArrayList<Cachorro> meusCachorros = new ArrayList<>();
        meusCachorros.add(caramelo);
        meusCachorros.add(scooby);
        System.out.println("\nListagem dos cachorros: ");
        for(int i = 0;i < meusCachorros.size();i++){
            System.out.println(meusCachorros.get(i).getNome()+", toString= "+meusCachorros.get(i).toString());
        }

    }
}
