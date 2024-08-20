package Desafio;

import Desafio.Classes.Musica;
import Desafio.Classes.PodCast;
import Desafio.Classes.Favoritos;

public class Principal {
    public static void main(String[] args) {

        Musica numb = new Musica();
        numb.setAlbum("Melhores Link Park");
        numb.setArtista("Link Park");
        numb.setGenero("Rock Metal");
        numb.setTitulo("Link Park: Numb");
        for (int i = 0; i < 200; i++) {
            numb.reproduzir();
            if(i%2==0){
                numb.curtir();
            }
        }
        numb.revelar();


        PodCast eiNerd = new PodCast();
        eiNerd.setApresentador("Peter aqui");
        eiNerd.setDescricao("Melhor conteudo da cultura nerd");
        eiNerd.setTitulo("Como ler gibis");
        for (int i = 0; i < 500; i++) {
            eiNerd.curtir();
            eiNerd.reproduzir();
        }
        eiNerd.revelar();

        Favoritos meusFavoritos = new Favoritos();
        meusFavoritos.favoritar(eiNerd);
        meusFavoritos.favoritar(numb);
        meusFavoritos.exibirFavoritos();

    }
}
