package project;

import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91966
 */
public class tictactoe extends javax.swing.JFrame {
    
    private String startGame="X";
    private int Xcount=0;
    private int Ocount=0;

    /** 
     * Creates new form tictactoe
     */
    public tictactoe() {
        initComponents();
    }
    private void gameScore()
    {
        jLabel3.setText(String.valueOf(Xcount));
        jLabel4.setText(String.valueOf(Ocount));
    }
    private void choosePlayer()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame="O";
        }
        else
        {
            startGame="X";
        }
    }
    private void winningGame()
    {
        String b1=jButton1.getText();
        String b2=jButton2.getText();
        String b3=jButton3.getText();
        String b4=jButton4.getText();
        String b5=jButton5.getText();
        String b6=jButton6.getText();
        String b7=jButton7.getText();
        String b8=jButton8.getText();
        String b9=jButton9.getText();
        if(b1=="X" && b2=="X" && b3=="X")
        {
          JOptionPane.showConfirmDialog(this,"Player X win the game");
          jButton1.setEnabled(true);
          jButton2.setEnabled(true);
          jButton3.setEnabled(true);
          jButton1.setBackground(Color.GREEN);
          jButton2.setBackground(Color.GREEN);
          jButton3.setBackground(Color.GREEN);
          Xcount=Xcount+1;
          gameScore();
        }
        if(b4=="X" && b5=="X" && b6=="X")
        {
          JOptionPane.showConfirmDialog(this,"Player X win the game");
          jButton4.setEnabled(true);
          jButton5.setEnabled(true);
          jButton6.setEnabled(true);
          jButton4.setBackground(Color.GREEN);
          jButton5.setBackground(Color.GREEN);
          jButton6.setBackground(Color.GREEN);
          Xcount=Xcount+1;
          gameScore();
        }
        if(b7=="X" && b8=="X" && b9=="X")
        {
          JOptionPane.showConfirmDialog(this,"Player X win the game");
          jButton7.setEnabled(true);
          jButton8.setEnabled(true);
          jButton9.setEnabled(true);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          Xcount=Xcount+1;
          gameScore();
        }
        if(b1=="X" && b4=="X" && b7=="X")
        {
          JOptionPane.showConfirmDialog(this,"Player X win the game");
          jButton7.setEnabled(true);
          jButton8.setEnabled(true);
          jButton9.setEnabled(true);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          Xcount=Xcount+1;
          gameScore();
        }
        if(b2=="X" && b5=="X" && b8=="X")
        {
          JOptionPane.showConfirmDialog(this,"Player X win the game");
          jButton7.setEnabled(true);
          jButton8.setEnabled(true);
          jButton9.setEnabled(true);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          Xcount=Xcount+1;
          gameScore();
        }
        if(b3=="X" && b6=="X" && b9=="X")
        {
          JOptionPane.showConfirmDialog(this,"Player X win the game");
          jButton7.setEnabled(true);
          jButton8.setEnabled(true);
          jButton9.setEnabled(true);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          Xcount=Xcount+1;
          gameScore();
        }
        if(b1=="X" && b5=="X" && b9 =="X")
        {
          JOptionPane.showConfirmDialog(this,"Player X win the game");
          jButton7.setEnabled(true);
          jButton8.setEnabled(true);
          jButton9.setEnabled(true);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          Xcount=Xcount+1;
          gameScore();
        }
        if(b7=="X" && b5=="X" && b3=="X")
        {
          JOptionPane.showConfirmDialog(this,"Player X win the game");
          jButton7.setEnabled(true);
          jButton8.setEnabled(true);
          jButton9.setEnabled(true);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          Xcount=Xcount+1;
          gameScore();
        }
        if(b7=="O" && b5=="O" && b3=="O")
        {
          JOptionPane.showConfirmDialog(this,"Player O win the game");
          jButton7.setEnabled(true);
          jButton8.setEnabled(true);
          jButton9.setEnabled(true);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
           Ocount=Ocount+1;
          gameScore();
        }
        if(b1=="O" && b5=="O" && b9 =="O")
        {
          JOptionPane.showConfirmDialog(this,"Player O win the game");
          jButton7.setEnabled(true);
          jButton8.setEnabled(true);
          jButton9.setEnabled(true);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          Ocount=Ocount+1;
          gameScore();
        }
        if(b3=="O" && b6=="O" && b9=="O")
        {
          JOptionPane.showConfirmDialog(this,"Player O win the game");
          jButton7.setEnabled(true);
          jButton8.setEnabled(true);
          jButton9.setEnabled(true);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          Ocount=Ocount+1;
          gameScore();
        }
        if(b2=="O" && b5=="O" && b8=="O")
        {
          JOptionPane.showConfirmDialog(this,"Player O win the game");
          jButton7.setEnabled(true);
          jButton8.setEnabled(true);
          jButton9.setEnabled(true);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
           Ocount=Ocount+1;
          gameScore();
        }
        if(b1=="O" && b4=="O" && b7=="O")
        {
          JOptionPane.showConfirmDialog(this,"Player O win the game");
          jButton7.setEnabled(true);
          jButton8.setEnabled(true);
          jButton9.setEnabled(true);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
           Ocount=Ocount+1;
          gameScore();
        }
         if(b7=="O" && b8=="O" && b9=="O")
        {
          JOptionPane.showConfirmDialog(this,"Player O win the game");
          jButton7.setEnabled(true);
          jButton8.setEnabled(true);
          jButton9.setEnabled(true);
          jButton7.setBackground(Color.GREEN);
          jButton8.setBackground(Color.GREEN);
          jButton9.setBackground(Color.GREEN);
          Ocount=Ocount+1;
          gameScore();
        }
        if(b4=="O" && b5=="O" && b6=="O")
        {
          JOptionPane.showConfirmDialog(this,"Player O win the game");
          jButton4.setEnabled(true);
          jButton5.setEnabled(true);
          jButton6.setEnabled(true);
          jButton4.setBackground(Color.GREEN);
          jButton5.setBackground(Color.GREEN);
          jButton6.setBackground(Color.GREEN);
           Ocount=Ocount+1;
          gameScore();
        }
        if(b1=="O" && b2=="O" && b3=="O")
        {
          JOptionPane.showConfirmDialog(this,"Player O win the game");
          jButton1.setEnabled(true);
          jButton2.setEnabled(true);
          jButton3.setEnabled(true);
          jButton1.setBackground(Color.GREEN);
          jButton2.setBackground(Color.GREEN);
          jButton3.setBackground(Color.GREEN);
          Ocount=Ocount+1;
          gameScore();
        }
              
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText(" ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(" ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(" ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(" ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText(" ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(" ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText(" ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText(" ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText(" ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("NEW GAME");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("EXIT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setText("RESET");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("player X score");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("player O score");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");    
        
        jButton1.setBackground(Color.gray);
        jButton2.setBackground(Color.gray);
        jButton3.setBackground(Color.gray);
        jButton4.setBackground(Color.gray);
        jButton5.setBackground(Color.gray);
        jButton6.setBackground(Color.gray);
        jButton7.setBackground(Color.gray);
        jButton8.setBackground(Color.gray);
        jButton9.setBackground(Color.gray);
        
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jLabel3.setText("0");
        jLabel4.setText("0");
        
        jButton1.setBackground(Color.gray);
        jButton2.setBackground(Color.gray);
        jButton3.setBackground(Color.gray);
        jButton4.setBackground(Color.gray);
        jButton5.setBackground(Color.gray);
        jButton6.setBackground(Color.gray);
        jButton7.setBackground(Color.gray);
        jButton8.setBackground(Color.gray);
        jButton9.setBackground(Color.gray);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          jButton2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.red);
            jButton2.setEnabled(false);
            
        }
        else
        {
            jButton2.setForeground(Color.GREEN);
            jButton2.setEnabled(false);
        }
        choosePlayer();
        winningGame();
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          jButton1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.red);
            jButton1.setEnabled(false);
            
        }
        else
        {
            jButton1.setForeground(Color.GREEN);
            jButton1.setEnabled(false);
        }
        choosePlayer();
        winningGame();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:\
          jButton4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton4.setForeground(Color.red);
            jButton4.setEnabled(false);
            
        }
        else
        {
            jButton4.setForeground(Color.GREEN);
            jButton4.setEnabled(false);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          jButton3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.red);
            jButton3.setEnabled(false);
            
        }
        else
        {
            jButton3.setForeground(Color.GREEN);
            jButton3.setEnabled(false);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          jButton5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton5.setForeground(Color.red);
            jButton5.setEnabled(false);
            
        }
        else
        {
            jButton5.setForeground(Color.GREEN);
            jButton5.setEnabled(false);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          jButton6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton6.setForeground(Color.red);
            jButton6.setEnabled(false);
            
        }
        else
        {
            jButton6.setForeground(Color.GREEN);
            jButton6.setEnabled(false);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:  
        jButton7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(Color.red);
            jButton7.setEnabled(false);
            
        }
        else
        {
            jButton7.setForeground(Color.GREEN);
            jButton7.setEnabled(false);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here: 
        jButton8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.red);
            jButton8.setEnabled(false);
            
        }
        else
        {
            jButton8.setForeground(Color.GREEN);
            jButton8.setEnabled(false);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
          jButton9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(Color.red);
            jButton9.setEnabled(false);
            
        }
        else
        {
            jButton9.setForeground(Color.GREEN);
            jButton9.setEnabled(false);
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
