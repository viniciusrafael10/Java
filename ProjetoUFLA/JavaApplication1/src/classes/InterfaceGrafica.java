/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 *
 * @author Vinicius
 */
public class InterfaceGrafica extends javax.swing.JFrame {

    /**
     * Construtor da interface, iniciliza os métodos e objetos necessários.
     */
    private Jogo jogo;
    private boolean rodando;
    public InterfaceGrafica() {
        initComponents();
        getContentPane().setBackground(Color.black);
        rodando = false;
        jogo = new Jogo();
        System.setOut(outputPrintStream);
        TextoJogo.setEditable(false);
    }
    
    /**
     * Método que recebe o que sai no console e passa para um textField.
     */
    private PrintStream outputPrintStream = new PrintStream(new OutputStream() {
        @Override
        public void write(int b) throws IOException {
            TextoJogo.append(String.valueOf((char) b));            
        }        
    });

    /**
     * Nesse método está tudo que aparece na interface gráfica, todo botão,campo de texto, imagens, cores de cada coisa etc. Ele é chamado no construtor de modo que seja tudo inicializado.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomeDoJogo = new javax.swing.JLabel();
        BotaoIrOeste = new java.awt.Button();
        BotaoIrSul = new java.awt.Button();
        BotaoAtacar = new java.awt.Button();
        BotaoPegar = new java.awt.Button();
        BotaoConstruir = new java.awt.Button();
        BotaoObservar = new java.awt.Button();
        BotaoSair = new java.awt.Button();
        BotaoAjuda = new java.awt.Button();
        BotaoIrNorte = new java.awt.Button();
        BotaoJogar = new java.awt.Button();
        BotaoIrLeste1 = new java.awt.Button();
        MapaJogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoJogo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NomeDoJogo.setFont(new java.awt.Font("Lucida Calligraphy", 3, 60)); // NOI18N
        NomeDoJogo.setForeground(new java.awt.Color(255, 255, 255));
        NomeDoJogo.setText("Shrek Bros no Reino dos Bruxos");

        BotaoIrOeste.setBackground(new java.awt.Color(255, 255, 255));
        BotaoIrOeste.setFont(new java.awt.Font("Broadway", 0, 30)); // NOI18N
        BotaoIrOeste.setLabel("Ir Oeste");
        BotaoIrOeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIrOesteActionPerformed(evt);
            }
        });

        BotaoIrSul.setBackground(new java.awt.Color(255, 255, 255));
        BotaoIrSul.setFont(new java.awt.Font("Broadway", 0, 30)); // NOI18N
        BotaoIrSul.setLabel("Ir Sul");
        BotaoIrSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIrSulActionPerformed(evt);
            }
        });

        BotaoAtacar.setBackground(new java.awt.Color(255, 255, 255));
        BotaoAtacar.setFont(new java.awt.Font("Broadway", 0, 30)); // NOI18N
        BotaoAtacar.setLabel("Atacar");
        BotaoAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAtacarActionPerformed(evt);
            }
        });

        BotaoPegar.setBackground(new java.awt.Color(255, 255, 255));
        BotaoPegar.setFont(new java.awt.Font("Broadway", 0, 30)); // NOI18N
        BotaoPegar.setLabel("Pegar");
        BotaoPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPegarActionPerformed(evt);
            }
        });

        BotaoConstruir.setBackground(new java.awt.Color(255, 255, 255));
        BotaoConstruir.setFont(new java.awt.Font("Broadway", 0, 25)); // NOI18N
        BotaoConstruir.setLabel("Construir");
        BotaoConstruir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConstruirActionPerformed(evt);
            }
        });

        BotaoObservar.setBackground(new java.awt.Color(255, 255, 255));
        BotaoObservar.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        BotaoObservar.setLabel("Observar");
        BotaoObservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoObservarActionPerformed(evt);
            }
        });

        BotaoSair.setBackground(new java.awt.Color(255, 255, 255));
        BotaoSair.setFont(new java.awt.Font("Broadway", 0, 30)); // NOI18N
        BotaoSair.setLabel("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        BotaoAjuda.setBackground(new java.awt.Color(255, 255, 255));
        BotaoAjuda.setFont(new java.awt.Font("Broadway", 0, 30)); // NOI18N
        BotaoAjuda.setLabel("Ajuda");
        BotaoAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAjudaActionPerformed(evt);
            }
        });

        BotaoIrNorte.setBackground(new java.awt.Color(255, 255, 255));
        BotaoIrNorte.setFont(new java.awt.Font("Broadway", 0, 28)); // NOI18N
        BotaoIrNorte.setLabel("Ir Norte");
        BotaoIrNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIrNorteActionPerformed(evt);
            }
        });

        BotaoJogar.setBackground(new java.awt.Color(255, 255, 255));
        BotaoJogar.setFont(new java.awt.Font("Broadway", 0, 30)); // NOI18N
        BotaoJogar.setLabel("Jogar");
        BotaoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJogarActionPerformed(evt);
            }
        });

        BotaoIrLeste1.setBackground(new java.awt.Color(255, 255, 255));
        BotaoIrLeste1.setFont(new java.awt.Font("Broadway", 0, 30)); // NOI18N
        BotaoIrLeste1.setLabel("Ir Leste");
        BotaoIrLeste1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIrLeste1ActionPerformed(evt);
            }
        });

        MapaJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classes/MapaJogo.jpeg"))); // NOI18N
        MapaJogo.setText("jLabel1");

        TextoJogo.setBackground(new java.awt.Color(0, 0, 0));
        TextoJogo.setColumns(20);
        TextoJogo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoJogo.setForeground(new java.awt.Color(255, 255, 255));
        TextoJogo.setRows(5);
        jScrollPane1.setViewportView(TextoJogo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotaoIrOeste, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoIrNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoIrSul, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(BotaoIrLeste1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotaoPegar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoAtacar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoConstruir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotaoObservar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomeDoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(MapaJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NomeDoJogo)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(MapaJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(BotaoIrNorte, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoIrOeste, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoIrLeste1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoIrSul, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoAtacar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoObservar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoPegar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoConstruir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Esse método faz com que ao apertar o botão Ajuda, será impresso na tela o metodo imprimir ajuda.
     * @param evt 
     */
    private void BotaoAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAjudaActionPerformed
        if (rodando){
            jogo.imprimirAjuda();
        }
        else{        
        }
    }//GEN-LAST:event_BotaoAjudaActionPerformed

       /**
        * Esse método faz com que ao apertar o botão jogar, o jogo inicia.
        * @param evt 
        */
    private void BotaoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJogarActionPerformed
        if(rodando){
        }
        else{
            jogo.imprimirBoasVindas();
            rodando = true;
        }
    }//GEN-LAST:event_BotaoJogarActionPerformed

    /**
     * Esse método faz com que ao apertar o botão sair, o jogo é fechado.
     * @param evt 
     */
    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        if (rodando){
            System.exit(0);
        }
        else{        
        }
    }//GEN-LAST:event_BotaoSairActionPerformed

    /**
     * Esse método faz com que ao apertar o botão Observar, será impresso na tela o metodo observar.
     * @param evt 
     */
    private void BotaoObservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoObservarActionPerformed
        if (rodando){
            jogo.observar();
         }
        else{
        }
    }//GEN-LAST:event_BotaoObservarActionPerformed

    /**
     * Esse método faz com que ao apertar o botão Construir, o jogo execute o método Construir.
     * @param evt 
     */
    private void BotaoConstruirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConstruirActionPerformed
         if (rodando){
            jogo.construir();
        }
        else{        
        }
    }//GEN-LAST:event_BotaoConstruirActionPerformed
    
    /**
     * Esse método faz com que ao apertar o botão Pegar, o jogo execute o método Pegar.
     * @param evt 
     */
    private void BotaoPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPegarActionPerformed
        if (rodando){
            jogo.pegar();
        }
        else{       
        }
    }//GEN-LAST:event_BotaoPegarActionPerformed
    
    /**
     * Esse método faz com que ao apertar o botão Atacar, o jogo execute o método Atacar.
     * @param evt 
     */
    private void BotaoAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAtacarActionPerformed
        if (rodando){
            jogo.atacar();
        }
        else{        
        }
    }//GEN-LAST:event_BotaoAtacarActionPerformed

    /**
     * Esse método faz com que ao apertar o botão Ir Norte, o jogo execute o método Ir Norte.
     * @param evt 
     */
    private void BotaoIrNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIrNorteActionPerformed
         if (rodando){
            jogo.irParaAmbiente(new Comando("ir","norte"));
        }
        else{        
        }
    }//GEN-LAST:event_BotaoIrNorteActionPerformed
    
    /**
     * Esse método faz com que ao apertar o botão Ir Sul, o jogo execute o método Ir Sul.
     * @param evt 
     */
    private void BotaoIrSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIrSulActionPerformed
        if (rodando){
            jogo.irParaAmbiente(new Comando("ir","sul"));
        }
        else{        
        }
    }//GEN-LAST:event_BotaoIrSulActionPerformed

    /**
     * Esse método faz com que ao apertar o botão Ir Oeste, o jogo execute o método Ir Oeste.
     * @param evt 
     */
    private void BotaoIrOesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIrOesteActionPerformed
        if (rodando){
            jogo.irParaAmbiente(new Comando("ir","oeste"));
        }
        else{        
        }
    }//GEN-LAST:event_BotaoIrOesteActionPerformed
    
    /**
     * Esse método faz com que ao apertar o botão Ir Leste, o jogo execute o método Ir Leste.
     * @param evt 
     */
    private void BotaoIrLeste1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIrLeste1ActionPerformed
        if (rodando){
            jogo.irParaAmbiente(new Comando("ir","leste"));
        }
        else{
        }
    }//GEN-LAST:event_BotaoIrLeste1ActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafica().setVisible(true);
            }
        });
    }

/**
 * Declaração das variáveis.
 */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BotaoAjuda;
    private java.awt.Button BotaoAtacar;
    private java.awt.Button BotaoConstruir;
    private java.awt.Button BotaoIrLeste1;
    private java.awt.Button BotaoIrNorte;
    private java.awt.Button BotaoIrOeste;
    private java.awt.Button BotaoIrSul;
    private java.awt.Button BotaoJogar;
    private java.awt.Button BotaoObservar;
    private java.awt.Button BotaoPegar;
    private java.awt.Button BotaoSair;
    private javax.swing.JLabel MapaJogo;
    private javax.swing.JLabel NomeDoJogo;
    private javax.swing.JTextArea TextoJogo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
