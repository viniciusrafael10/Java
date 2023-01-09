package classes;

/**
 *  Essa eh a classe principal da aplicacao "Sherek Bros no reino dos bruxos".
 *  "Sherek Bros no reino dos bruxos" eh um jogo de aventura muito simples, baseado em texto.
 *  Usuarios podem caminhar em um cenario. E eh tudo! Ele realmente
 *  precisa ser estendido para fazer algo interessante!
 * 
 *  Para jogar esse jogo, crie uma instancia dessa classe e chame o metodo
 *  "jogar".
 * 
 *  Essa classe principal cria e inicializa todas as outras: ela cria os
 *  ambientes, cria o analisador e comeca o jogo. Ela tambeme avalia e 
 *  executa os comandos que o analisador retorna.
 * 
 * @author  Michael Kölling and David J. Barnes (traduzido por Julio Cesar Alves)
 * @version 2011.07.31 (2016.02.01)
 * 
 */

public class Jogo 
{
    private Analisador analisador;
    private Ambiente ambienteAtual;
    private Arma armaAtual;
    private Dragao dragao;
        
    /**
     * Cria o jogo e incializa seu mapa interno.
     */
    public Jogo() 
    {
        criarAmbientes();
        analisador = new Analisador();
        dragao = new Dragao();
    }

    /**
     * Cria todos os ambientes e liga as saidas deles
     */
    private void criarAmbientes()
    {
        Ambiente ferreiro,coviododragao,redania,novigrad,skellige,vizima,kaemorhan,kaedwen,thepontar,temeria,aedern,nilfgaard,castelo;
      
        // cria os ambientes
        redania = new Ambiente("na Cidade de Redania",new Item("nenhum Item encontrado"));
        novigrad = new Ambiente("na Cidade de Novigrad",new Item("nenhum Item encontrado"));
        skellige = new Ambiente("na Cidade de Skellige",new Item("nenhum Item encontrado"));
        vizima= new Ambiente("na Cidade de Vizima",new Item ("metal encontrado"));
        kaemorhan = new Ambiente("na Cidade de Kae Morhan", new Item("couro encontrado"));
        kaedwen = new Ambiente("na Cidade de Kaedwen",new Item("nenhum Item encontrado"));
        thepontar = new Ambiente("na Cidade de The Pontar",new Item("nenhum Item encontrado"));
        temeria = new Ambiente("na Cidade de Temeria",new Item("nenhum Item encontrado"));
        nilfgaard = new Ambiente("na Cidade de Nilfgaard",new Item("nenhum Item encontrado"));
        aedern= new Ambiente("na Cidade de Aedern",new Item("corda encontrado"));
        coviododragao= new Ambiente("no Covio do Dragao. Aqui nao tem volta, eh vida ou morte!",new Item("Derrote o Dragao e salvara a Princesa!"));
        ferreiro = new Ambiente("no Ferreiro, aqui voce usa seus Itens para forjar sua arma",new Item("nenhum Item encontrado"));

        // inicializa as saidas dos ambientes
        redania.ajustarSaidas("leste",kaemorhan);
        redania.ajustarSaidas("sul",novigrad);
        redania.ajustarSaidas("norte",ferreiro);
        ferreiro.ajustarSaidas("sul",redania);
        novigrad.ajustarSaidas("norte",redania);
        novigrad.ajustarSaidas("sul",skellige);
        novigrad.ajustarSaidas("leste",kaedwen);
        skellige.ajustarSaidas("norte", novigrad);
        skellige.ajustarSaidas("sul", vizima);
        skellige.ajustarSaidas("leste", thepontar);
        vizima.ajustarSaidas("norte", skellige);
        vizima.ajustarSaidas("leste", temeria);
        kaemorhan.ajustarSaidas("oeste", redania);
        kaemorhan.ajustarSaidas("sul", kaedwen);
        kaedwen.ajustarSaidas("norte", kaemorhan);
        kaedwen.ajustarSaidas("oeste", novigrad);
        kaedwen.ajustarSaidas("sul", thepontar);
        thepontar.ajustarSaidas("norte", kaedwen);
        thepontar.ajustarSaidas("oeste", skellige);
        thepontar.ajustarSaidas("leste", aedern);
        thepontar.ajustarSaidas("sul", temeria);
        temeria.ajustarSaidas("norte", thepontar);
        temeria.ajustarSaidas("oeste", vizima);
        temeria.ajustarSaidas("leste", nilfgaard);
        aedern.ajustarSaidas("oeste", thepontar);
        aedern.ajustarSaidas("sul", nilfgaard);
        nilfgaard.ajustarSaidas("oeste", temeria);
        nilfgaard.ajustarSaidas("norte", aedern);
        nilfgaard.ajustarSaidas("sul", coviododragao);

        ambienteAtual = redania;  // o jogo comeca em redania
    }
    
    /**
     *  Rotina principal do jogo. Fica em loop ate terminar o jogo.
     */
    public void jogar() 
    {            
        imprimirBoasVindas();

        // Entra no loop de comando principal. Aqui nos repetidamente lemos
        // comandos e os executamos ate o jogo terminar.
                
        boolean terminado = false;
        while (! terminado) {
            Comando comando = analisador.pegarComando();
            terminado = processarComando(comando);
        }
        System.out.println("Obrigado por jogar. Ate mais!");
    }

    /**
     * Imprime a mensagem de abertura para o jogador.
     */
    public void imprimirBoasVindas()
    {
        System.out.println();
        System.out.println("Bem-vindo ao Shrek Bros no Reino dos Bruxos");
        System.out.println("Shrek Bros no Reino dos Bruxos e um novo jogo de aventura, onde seu objetivo eh derrotar o Dragao e salvar a Princesa. \n.");
        System.out.println("Para isso voce devera andar pelo mapa do reino de The Wintcher e encontrar Itens para contruir uma arma capaz de derrotar o Dragao. \n.");
        System.out.println("Lembre-se, voce so pode construir sua arma no ferreiro. \n");
        System.out.println("O ferreiro te falara quais itens deve encontrar para construir as armas disponiveis. \n");
        System.out.println("Talvez essa informacao seja util antes da busca.\n");
        System.out.println("Digite 'ajuda' se voce precisar de ajuda. \n");
        System.out.println("Boa sorte em sua jornada!");
        System.out.println();
        imprimirLocalizacaoAtual();
        
    }

    /**
     * imprimi a localizaçao atual do jogador no mapa do jogo.
     */
    public void imprimirLocalizacaoAtual(){
        System.out.println("Voce esta " + ambienteAtual.getDescricao());
    
        System.out.print("Saidas: ");
        if(ambienteAtual.getAmbiente("norte") != null) {
            System.out.print("norte ");
        }
        if(ambienteAtual.getAmbiente("leste") != null) {
            System.out.print("leste ");
        }
        if(ambienteAtual.getAmbiente("sul") != null) {
            System.out.print("sul  ");
        }
        if(ambienteAtual.getAmbiente("oeste") != null) {
            System.out.print("oeste ");
        }
        if(ambienteAtual.getAmbiente("ferreiro") != null) {
            System.out.print("ferreiro ");
        }
        
        System.out.println("\n");
    }

    /**
     * Dado um comando, processa-o (ou seja, executa-o)
     * @param comando O Comando a ser processado.
     * @return true se o comando finaliza o jogo.
     */
    private boolean processarComando(Comando comando) 
    {
        boolean querSair = false;

        if(comando.ehDesconhecido()) {
            System.out.println("Eu nao entendi o que voce disse...");
            return false;
        }

        String palavraDeComando = comando.getPalavraDeComando();
        if (palavraDeComando.equals("ajuda")) {
            imprimirAjuda();
        }
        else if (palavraDeComando.equals("ir")) {
            irParaAmbiente(comando);
        }
        else if (palavraDeComando.equals("sair")) {
            querSair = sair(comando);
        }
        else if (palavraDeComando.equals("observar")){
            observar();
        }
        else if (palavraDeComando.equals("pegar")){
            pegar();
        }
        else if (palavraDeComando.equals("construir")){
            construir();
        }
        else if (palavraDeComando.equals("atacar")){
            atacar();
        }

        return querSair;
    }

   /**
    * Esse comando é utilizado para o jogador lutar com o dragao.
    */
   
    public void atacar(){
        System.out.println("\n");
        if (ambienteAtual.getCidade().equals("no Covio do Dragao. Aqui nao tem volta, eh vida ou morte!")){
             if (armaAtual == null){
                System.out.println("Voce nao foi capaz de derrotar o Dragao sem utilizar uma arma. \n GAME OVER!");
                System.out.println("\n Muito obrigado por jogar, digite (sair) ou feche o jogo.");
            }
            
             else if (armaAtual.getNome().equals("Arco")){
                armaAtual.atacarDragao();
                dragao.situacaoDragao();
            }
            else if (armaAtual.getNome().equals("Espada")){
                armaAtual.atacarDragao();
                dragao.situacaoDragao();
            }
            else if (armaAtual.getNome().equals("Chicote")){
                System.out.println("Voce nao foi capaz de derrotar o Dragao utilizando um Chicote. \n GAME OVER!");
                System.out.println("\n Muito obrigado por jogar, digite (sair) ou feche o jogo.");
            }
                        
        }
        else{
            System.out.println("Voce so pode atacar no Covio do Dragao!");
        }
    }
        
        
   

    /**
     * metodo construir da classe Ambiente.
     */
    public void construir(){
       ambienteAtual.construir();
       armaAtual = ambienteAtual.getArmaAtual();
    }

    /**
     * Metódo pegar da classe Ambiente
     */
    public void pegar(){
         System.out.println("\n");
        ambienteAtual.pegar();
    }  

    /**
     * Esse método serve para o jogador se situar no jogo, ele mostra onde o jogador esta
     * o que tem no inventario, e se tem uma arma equipada.
     */
    public void observar(){
        System.out.println("\n");
        imprimirLocalizacaoAtual();
        System.out.println(" ");
        ambienteAtual.imprimirInventario();
        if (armaAtual == null){
            System.out.println("Voce nao possui armamento");
        }
        else{
            System.out.println("arma atual: "+ armaAtual.getNome()+"\n");
        }
    }
   

    /**
     * Mostra as informacoes de ajuda.
     * Aqui nos imprimimos algo bobo e enigmatico e a lista de 
     * palavras de comando
     */
    public void imprimirAjuda() 
    {
        System.out.println("\n");
        System.out.println("Voce esta perdido. Voce esta sozinho. Voce caminha");
        System.out.println("pelo Reino de The Witcher.");
        System.out.println();
        System.out.println("Suas palavras de comando sao:");
        System.out.println(analisador.getComandos());
    }

    

    /** 
     * Tenta ir em uma direcao. Se existe uma saida entra no 
     * novo ambiente, caso contrario imprime mensagem de erro.
     */
    public void irParaAmbiente(Comando comando) 
    {
        if(!comando.temSegundaPalavra()) {
            // se nao ha segunda palavra, nao sabemos pra onde ir...
            System.out.println("Ir pra onde?");
            return;
        }

        String direcao = comando.getSegundaPalavra();

        // Tenta sair do ambiente atual
        Ambiente proximoAmbiente = null;
        if(direcao.equals("norte")) {
            proximoAmbiente = ambienteAtual.getAmbiente("norte");
        }
        if(direcao.equals("leste")) {
            proximoAmbiente = ambienteAtual.getAmbiente("leste");
        }
        if(direcao.equals("sul")) {
            proximoAmbiente = ambienteAtual.getAmbiente("sul");
        }
        if(direcao.equals("oeste")) {
            proximoAmbiente = ambienteAtual.getAmbiente("oeste");
        }
        if(direcao.equals("ferreiro")) {
            proximoAmbiente = ambienteAtual.getAmbiente("ferreiro");
        }

        if (proximoAmbiente == null) {
            System.out.println("Nao ha passagem!");
        }
        else {
            ambienteAtual = proximoAmbiente;
            imprimirLocalizacaoAtual();
            ambienteAtual.boasVindasFerreiro();;
            
            
        }
        
    }

    /** 
     * "Sair" foi digitado. Verifica o resto do comando pra ver
     * se nos queremos realmente sair do jogo.
     * @return true, se este comando sai do jogo, false, caso contrario
     */
    public boolean sair(Comando comando) 
    {
        if(comando.temSegundaPalavra()) {
            System.out.println("Sair o que?");
            return false;
        }
        else {
            return true;  // sinaliza que nos queremos sair
        }
    }
}
