package classes;

/**
 * Classe usada para definir o item do jogo.
 */

public class Item {
    private String nome;

    /**
     * Construtor que apenas recebe o nome do item.
     * @param nome
     */
    public Item(String nome){
        this.nome = nome;
    }

    /*
     * Retorna o nome do item.
     */
    public String getNome(){
        return nome;
    }

    /**
     * Se o item for encontrado, esse método tem a funçao de renomear o atributo nome do item para "nenhum Item encontrado"
     */
    public void ItemEncontrado (){
        nome = "nenhum Item encontrado";
    }
}
