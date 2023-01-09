package classes;

/**
 * Classe que da as caracteristicas da Arma arco, nessa classe está implementado o metodo atacar dragao da interface atacar.
 */

public class Arco extends Arma implements Atacar {
    private String tipoCorda;

    /**
     * Constutor da calsse Arco.
     * @param nome
     * @param tipo
     * @param tipoCorda 
     */
    public Arco(String nome,String tipo,String tipoCorda){
        super(nome, tipo);
        this.tipoCorda = tipoCorda;
    }
    
    /**
     * Esse método será usado para quando o usuário quiser atacar o dragão utilizando o arco.
     */
    public void atacarDragao(){
        Dragao.setVida(2);
    }
}
