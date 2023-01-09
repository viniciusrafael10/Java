package classes;

/**
 * Essa classe é a classe pai das armas que serao disponiveis no jogo.
 */

public class Arma extends Item {
    private String tipo;

    /**
     * Construtor da classe arma
     * @param nome
     * @param dano 
     */
    public Arma(String nome,String dano){
        super(nome);
        this.tipo = tipo;
    }
    
    /**
     * esse método retorna o tipo da arma.
     * @return 
     */
    public String getTipo(){
        return tipo;
    }
    
    
    public void atacarDragao(){
    }
    
}
