package GUI;

import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
    }
    
    private Double numero1;
    private Double numero2;
    private Double resultado;
    private String operador;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoCalculo = new javax.swing.JTextField();
        btZero = new javax.swing.JButton();
        btUm = new javax.swing.JButton();
        btDois = new javax.swing.JButton();
        btTres = new javax.swing.JButton();
        btQuatro = new javax.swing.JButton();
        btCinco = new javax.swing.JButton();
        btSeis = new javax.swing.JButton();
        btSete = new javax.swing.JButton();
        btOito = new javax.swing.JButton();
        btNove = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSoma = new javax.swing.JButton();
        btMultiplicar = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        btResultado = new javax.swing.JButton();
        btSubtrair = new javax.swing.JButton();
        btVirgula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btZero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btZero.setText("0");
        btZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btZeroActionPerformed(evt);
            }
        });

        btUm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btUm.setText("1");
        btUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUmActionPerformed(evt);
            }
        });

        btDois.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btDois.setText("2");
        btDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoisActionPerformed(evt);
            }
        });

        btTres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btTres.setText("3");
        btTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTresActionPerformed(evt);
            }
        });

        btQuatro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btQuatro.setText("4");
        btQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuatroActionPerformed(evt);
            }
        });

        btCinco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCinco.setText("5");
        btCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCincoActionPerformed(evt);
            }
        });

        btSeis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSeis.setText("6");
        btSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeisActionPerformed(evt);
            }
        });

        btSete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSete.setText("7");
        btSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeteActionPerformed(evt);
            }
        });

        btOito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btOito.setText("8");
        btOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOitoActionPerformed(evt);
            }
        });

        btNove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btNove.setText("9");
        btNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNoveActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icone/clearIcon.png"))); // NOI18N
        btLimpar.setToolTipText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSoma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSoma.setText("+");
        btSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomaActionPerformed(evt);
            }
        });

        btMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btMultiplicar.setText("X");
        btMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicarActionPerformed(evt);
            }
        });

        btDividir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btDividir.setText("÷");
        btDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirActionPerformed(evt);
            }
        });

        btResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btResultado.setText("=");
        btResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResultadoActionPerformed(evt);
            }
        });

        btSubtrair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSubtrair.setText("-");
        btSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtrairActionPerformed(evt);
            }
        });

        btVirgula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btVirgula.setText(",");
        btVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVirgulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoCalculo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btOito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(campoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(339, 341));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUmActionPerformed
        
        campoCalculo.setText(campoCalculo.getText() + "1");
    }//GEN-LAST:event_btUmActionPerformed

    private void btDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoisActionPerformed
        campoCalculo.setText(campoCalculo.getText() + "2");
    }//GEN-LAST:event_btDoisActionPerformed

    private void btZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btZeroActionPerformed
        campoCalculo.setText(campoCalculo.getText() + "0");
    }//GEN-LAST:event_btZeroActionPerformed

    private void btTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTresActionPerformed
        campoCalculo.setText(campoCalculo.getText() + "3");
    }//GEN-LAST:event_btTresActionPerformed

    private void btQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuatroActionPerformed
        campoCalculo.setText(campoCalculo.getText() + "4");
    }//GEN-LAST:event_btQuatroActionPerformed

    private void btCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCincoActionPerformed
        campoCalculo.setText(campoCalculo.getText() + "5");
    }//GEN-LAST:event_btCincoActionPerformed

    private void btSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeisActionPerformed
        campoCalculo.setText(campoCalculo.getText() + "6");
    }//GEN-LAST:event_btSeisActionPerformed

    private void btSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeteActionPerformed
        campoCalculo.setText(campoCalculo.getText() + "7");
    }//GEN-LAST:event_btSeteActionPerformed

    private void btOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOitoActionPerformed
        campoCalculo.setText(campoCalculo.getText() + "8");
    }//GEN-LAST:event_btOitoActionPerformed

    private void btNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNoveActionPerformed
        campoCalculo.setText(campoCalculo.getText() + "9");
    }//GEN-LAST:event_btNoveActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
         limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomaActionPerformed
        
        numero1 = Double.parseDouble(campoCalculo.getText());
        operador = "soma";
        limpar();
    }//GEN-LAST:event_btSomaActionPerformed

    private void btMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicarActionPerformed
        numero1 = Double.parseDouble(campoCalculo.getText());
        operador = "multiplicar";
        limpar();
    }//GEN-LAST:event_btMultiplicarActionPerformed

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
        numero1 = Double.parseDouble(campoCalculo.getText());
        operador = "dividir";
        limpar();
    }//GEN-LAST:event_btDividirActionPerformed

    private void btResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResultadoActionPerformed
        numero2 = Double.parseDouble(campoCalculo.getText());
        if (operador.equals("soma")) {
            resultado = numero1 + numero2;
            JOptionPane.showMessageDialog(null, numero1 + " + " + numero2 + " = " + resultado);
        }
        if (operador.equals("dividir")) {
            resultado = numero1 / numero2;
            JOptionPane.showMessageDialog(null, numero1 + " ÷ " + numero2 + " = " + resultado);
        }
        if (operador.equals("multiplicar")) {
            resultado = numero1 * numero2;
            JOptionPane.showMessageDialog(null, numero1 + " X " + numero2 + " = " + resultado);
        }
        if (operador.equals("subtrair")) {
            resultado = numero1 - numero2;
            JOptionPane.showMessageDialog(null, numero1 + " - " + numero2 + " = " + resultado);
        }
        numero1 = 0.0;
        numero2 = 0.0;
        limpar();
    }//GEN-LAST:event_btResultadoActionPerformed

    private void btSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtrairActionPerformed
        numero1 = Double.parseDouble(campoCalculo.getText());
        operador = "subtrair";
        limpar();
    }//GEN-LAST:event_btSubtrairActionPerformed

    private void btVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVirgulaActionPerformed
        campoCalculo.setText(campoCalculo.getText() + ".");
    }//GEN-LAST:event_btVirgulaActionPerformed

    private void limpar(){
        campoCalculo.setText("");
    }
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Interface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCinco;
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btDois;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btMultiplicar;
    private javax.swing.JButton btNove;
    private javax.swing.JButton btOito;
    private javax.swing.JButton btQuatro;
    private javax.swing.JButton btResultado;
    private javax.swing.JButton btSeis;
    private javax.swing.JButton btSete;
    private javax.swing.JButton btSoma;
    private javax.swing.JButton btSubtrair;
    private javax.swing.JButton btTres;
    private javax.swing.JButton btUm;
    private javax.swing.JButton btVirgula;
    private javax.swing.JButton btZero;
    private javax.swing.JTextField campoCalculo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
