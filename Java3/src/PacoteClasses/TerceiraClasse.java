/*
Método construtor
    VISIBILIDADE NOME(TIPO X,...TIPO XY){
        this.METODO_SET(X);
        ...
    }
    X= valor dado através do método set a um atributo
*/

package PacoteClasses;

public class TerceiraClasse {
    private String construirNome;
    private int construirId;

    public TerceiraClasse(String contruindoObjeto, int construirId) {
        this.setConstruirNome(contruindoObjeto);
        this.setConstruirId(construirId);
    }

    public int getConstruirId() {
        return construirId;
    }
    private void setConstruirId(int construirId) {
        this.construirId = construirId;
    }

    public String getConstruirNome() {
        return construirNome;
    }
    private void setConstruirNome(String construirNome) {
        this.construirNome = construirNome;
    }

}
