package classes;

import java.util.HashMap;
import java.util.ArrayList;
/**
 * Classe Ambiente - um ambiente em um jogo adventure.
 *
 * Esta classe eh parte da aplicacao "Sherek Bros no reino dos bruxos".
 * "Sherek Bros no reino dos bruxos" eh um jogo de aventura muito simples, onde
 * seu objetivo é achar os itens perdidos no mapa, construir uma arma e derrotar o dragão
 * para salvar a princesa.
 *
 * Um "Ambiente" representa uma localizacao no cenario do jogo. Ele eh
 * conectado aos outros ambientes atraves de saidas. As saidas sao
 * nomeadas como norte, sul, leste e oeste. Para cada direcao, o ambiente
 * guarda uma referencia para o ambiente vizinho, ou null se nao ha
 * saida naquela direcao.
 * 
 * @author  Michael Kölling and David J. Barnes (traduzido por Julio Cesar Alves)
 * @version 2011.07.31 (2016.02.01)
 */
public class Ambiente 
{
    private String descricao;
    private HashMap<String, Ambiente> saidas;
    private Item item;
    private Inventario inventario;
    private Arma armaAtual;
    

    /**
     * Cria um ambiente com a "descricao" passada. Inicialmente, ele
     * nao tem saidas. "descricao" eh algo como "uma cozinha" ou
     * 
     * @param descricao A descricao do ambiente.
     */
    public Ambiente(String descricao,Item item) 
    {
        this.descricao = descricao;
        saidas = new HashMap<String,Ambiente>();
        this.item = item;
        inventario = new Inventario();
    }

    /**
     * retorna um objeto da classe item.
     * @return
     */
    public Item getItem(){
        return item;
    }
    
    /** 
     * retorna em qual cidade o jogador esta.
     */
    public String getCidade(){
        return descricao;
    }

    /**
     * retorna ao jogador a arma equipada no momento.
     * @return
     */
    public Arma getArmaAtual(){
        return armaAtual;
    }

    /**
     * Define as saidas do ambiente. Cada direcao ou leva a um
     * outro ambiente ou eh null (nenhuma saida para la).
     * @param norte A saida norte.
     * @param leste A saida leste.
     * @param sul A saida sul.
     * @param oeste A saida oeste.
     * @param ferreiro A saida para o ferreiro em Redania.
     */
    public void ajustarSaidas(String direcao, Ambiente ambiente) 
    {
        saidas.put(direcao,ambiente);
    }

    /**
     * @return A descricao do ambiente.
     */
    public String getDescricao()
    {
        if (item.getNome().equals("nenhum Item encontrado"))
            return descricao ;
        
        else if (item.getNome().equals("Derrote o Dragao e salvara a Princesa!")){
            return descricao + " " + "Derrote o Dragao e salvara a Princesa!";
        }
        
         else{
            return descricao + " Item " + item.getNome();
        }

    }
    
    /**
     * Esse método e para dar as boas vindas quando o jogador estiver no ferreiro.
     */
    public  void boasVindasFerreiro(){
        if (estaNoFerreiro()){
            System.out.printf("Bem-vindo ao Ferreiro da cidade.Aqui voce construirá sua arma. \n");
            System.out.printf("Item(s) encontrado:\n");         
            inventario.imprimirInventario();
            System.out.println("Para fazer o chicote voce precisa de: couro.\n");
            System.out.println("Para fazer a espada voce precisa de: couro e metal.\n");
            System.out.println("Para fazer o arco voce precisa de: couro, metal e corda.\n");
            System.out.println("Note que a arma eh feita de acordo com os itens de seu inventario. \n ");
            
        }
    }

    /**
     * esse método apenas retorna se o jogador está ou nao no ferreiro, será util para o método
     * boasVindasFerreiro() e contruir().
     * @return
     */
    public boolean estaNoFerreiro(){
        if (descricao.equals("no Ferreiro, aqui voce usa seus Itens para forjar sua arma")){
            return true;
        }
        return false;
    }

    /**
     * Esse método consiste em criar a arma, baseando nos itens que o usuário possui em seu inventario.
     * Vale ressaltar que o item que vai para o inventario e apenas um clone, e nao o item real,
     * pois o item real terá seu valor de item mudado para "nenhum Item encontrado".
     */
    public void construir(){
        if (estaNoFerreiro()){
            if (inventario == null){
                System.out.println("Voce nao tem itens para construir uma arma");
            }
            else{
                if ((inventario.temCorda())&&(inventario.temMetal())&&(inventario.temCouro())){
                    armaAtual = new Arco("Arco", "Ataque a distancia", "Corda egipcia");
                    System.out.println("Voce construiu o Arco.");
                    inventario = new Inventario();
                }
                else if ((inventario.temMetal())&&(inventario.temCouro())){
                    armaAtual = new Espada("Espada","Ataque corpo-a-corpo","metal raro");
                    System.out.println("Voce construiu a Espada.");
                    inventario = new Inventario();
                }
                else if (inventario.temCouro()){
                    armaAtual = new Chicote("Chicote", "chicote de couro", 1);
                    System.out.println("voce construiu o Chicote.");
                    inventario = new Inventario();
                }
                else{
                    System.out.println("Nao ha combinacoes possiveis de armas pra voce \n procure mais itens e volte aqui");
                }
            }

        }
        else{
            System.out.println("Voce so pode construir sua arma no ferreiro");
        }
    }

    /**
     * Esse método o usuário ao acioná-lo pegará o item dado pelo ambiente, e  amarzenará o mesmo em um ArrayList.
     */
    public void pegar(){
        if (item.getNome().equals("nenhum Item encontrado")){
            System.out.println ("Nao ha itens para pegar aqui");
        }
        else {

            Item clone = new Item(item.getNome());

            Inventario.adicionarItem(clone);
            System.out.println(" voce pegou o item!");
            item.ItemEncontrado();
        }
    }  

    /** 
     * esse metodo apenas imprimi os itens encontrados pelo jogador.
     */
    public void imprimirInventario(){
        inventario.imprimirInventario();
    }

/**
 * Esse método retorna o ambiente.
 * @param direcao
 * @return 
 */
    public Ambiente getAmbiente(String direcao){
        return saidas.get(direcao);
    }
    
   
    public String getSaidas(){
        String textoSaidas = "";
        for (String direcao: saidas.keySet()){
            textoSaidas = textoSaidas + direcao + " ";
        }
        return textoSaidas;
    }

    

}
