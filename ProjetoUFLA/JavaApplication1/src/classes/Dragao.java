package classes;

/**
 * Essa classe é feita para criar o dragão que o jogador enfrente para ganhar o jogo.
 */

public class  Dragao {
    private static int vida;

    /** constroe o dragao sempre com a vida em 2 */
    public Dragao(){
        vida = 2;
    }

    /**
     * retorna a vida do dragao.
     * @return
     */
    public int getVida(){
        return vida;
    }
    
    /**
     * Nesse metodo a vida do dragao sera reajustada dependendo da arma utilizada pelo jogador.
     * @param num
     */
    public static void setVida(int num){
    vida = vida - num;
   }

   /**
    * Retorna qual a situaçao do dragao, se ainda possui vida ou se ja esta morto.
    */
   public void situacaoDragao(){
        if (vida > 0 ){
            System.out.println("O dragao ainda esta vivo, tente ataca-lo novamente!");
        }
        else {
            System.out.println("Parabens, voce derrotou o dragao e salvou a Princesa!!! \n Obrigado por jogar! \n Digite (sair) ou feche o jogo.");
        }
   }
}
