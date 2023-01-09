package classes;

/**
 * Classe que da as caracteristicas da Arma Espada, nessa classe está implementado o metodo atacar dragao da interface atacar.
 */

public class Espada extends Arma implements Atacar {
        private String tipoMetal;
    
        /**
         * Construtor da classe Espada.
         * @param nome
         * @param tipo
         * @param tipoMetal 
         */
    public Espada(String nome,String tipo,String tipoMetal){
        super(nome,tipo);
        this.tipoMetal = tipoMetal;
    }
    
    /**
     * Esse é método é utilizado quando o usuário for atacar o dragão utilizando a espada.
     */
    public void atacarDragao(){
        Dragao.setVida(1);
    }
}
