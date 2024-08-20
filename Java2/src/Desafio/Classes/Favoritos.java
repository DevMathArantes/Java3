package Desafio.Classes;

public class Favoritos {

    private String favoritos = "";

    public void favoritar(Audio audio){
        favoritos+=("|"+audio.getTitulo()+" (classe "+audio.getClassificacao()+")|");
    }
    public void exibirFavoritos(){
        System.out.println(favoritos);
    }
}
