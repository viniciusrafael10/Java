package classes;

/**
 * Classe que da as caracteristicas da Arma Chicote, nessa classe está implementado o metodo atacar dragao da interface atacar.
 */

public class Chicote extends Arma{
    private int comprimento;

     /**
      * Construtor da classe Chicote.
      * @param nome
      * @param tipo
      * @param comprimento 
      */
    public Chicote (String nome,String tipo,int comprimento){
        super(nome,tipo);
        this.comprimento = comprimento;
    }
    
}
