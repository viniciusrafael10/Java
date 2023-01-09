package classes;

import java.util.ArrayList;

/**
 * Nessa classe temos o inventario do jogador, que é onde ele armazena todos seus itens.
 */
public class Inventario {
    private static ArrayList<Item> inventario;

    /**
     * Apenas cria um array list vazio.
     */
    public Inventario(){
        inventario = new ArrayList<Item>();
    }


    /**
     * Ao encontrar itens pelo mapa, esse método proporciona o usuario salvar esses itens.
     * @param item
     */
    public static  void adicionarItem(Item item){
        inventario.add(item);
    }
    
    /**
     * Imprime todos os itens encontrados pelo usuario
     */
    public void imprimirInventario(){
        for (Item a: inventario){
            System.out.println(a.getNome() + " ");
        }
        System.out.println("\n");
        
    }

    /**
     * Verifica se há o item couro no inventario
     * @return
     */

    public boolean temCouro(){
        for (Item a: inventario){
            if (a.getNome().equals("couro encontrado")){
                return true;
            }
        }
        return false;
    }


    /**
     * Verifica se há o item Metal no inventario
     * @return
     */
    public boolean temMetal(){
        for (Item a: inventario){
            if (a.getNome().equals("metal encontrado")){
                return true;
            }
        }
        return false;
    }


    /**
     * Verifica se há o item Corda no inventario
     * @return
     */
    public boolean temCorda(){
        for (Item a: inventario){
            if (a.getNome().equals("corda encontrado")){
                return true;
            }
        }
        return false;
    }

    
}
