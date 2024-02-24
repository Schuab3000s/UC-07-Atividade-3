package exercicio2Pack;

public class UIExercicio2 extends javax.swing.JFrame {

    public UIExercicio2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OutPanel = new javax.swing.JPanel();
        LbResp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        InputPanel1 = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        LbWeight = new javax.swing.JLabel();
        LbHeight = new javax.swing.JLabel();
        TxWeight = new javax.swing.JTextField();
        TxHeight = new javax.swing.JTextField();
        BtCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OutPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Seu IMC é:");

        javax.swing.GroupLayout OutPanelLayout = new javax.swing.GroupLayout(OutPanel);
        OutPanel.setLayout(OutPanelLayout);
        OutPanelLayout.setHorizontalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbResp, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OutPanelLayout.setVerticalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LbResp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InputPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Welcome.setText("Bem vindo, informe os dados abaixo para conhecer sua dieta ideal.");

        LbWeight.setText("Altura:");

        LbHeight.setText("Peso:");

        TxWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxWeightActionPerformed(evt);
            }
        });

        BtCalc.setText("Calcular");
        BtCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InputPanel1Layout = new javax.swing.GroupLayout(InputPanel1);
        InputPanel1.setLayout(InputPanel1Layout);
        InputPanel1Layout.setHorizontalGroup(
            InputPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InputPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Welcome)
                    .addGroup(InputPanel1Layout.createSequentialGroup()
                        .addGroup(InputPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LbHeight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LbWeight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(InputPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxHeight)
                            .addComponent(TxWeight)))
                    .addGroup(InputPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(BtCalc)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        InputPanel1Layout.setVerticalGroup(
            InputPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Welcome)
                .addGap(18, 18, 18)
                .addGroup(InputPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbHeight)
                    .addComponent(TxHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InputPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbWeight)
                    .addComponent(TxWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtCalc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InputPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InputPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCalcActionPerformed
        calc();
    }//GEN-LAST:event_BtCalcActionPerformed

    private void TxWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxWeightActionPerformed

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
            java.util.logging.Logger.getLogger(UIExercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIExercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIExercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIExercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIExercicio2().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCalc;
    private javax.swing.JPanel InputPanel1;
    private javax.swing.JLabel LbHeight;
    private javax.swing.JLabel LbResp;
    private javax.swing.JLabel LbWeight;
    private javax.swing.JPanel OutPanel;
    private javax.swing.JTextField TxHeight;
    private javax.swing.JTextField TxWeight;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public void calc() {
        Double altura, peso, imc;
        String mensagem;

        altura = Double.parseDouble(TxWeight.getText());
        peso = Double.parseDouble(TxHeight.getText());

        imc = peso / (altura * altura);

        if (imc < 18.5) {
            mensagem = " Você está muito magro.\nPrecisa de uma dieta para engordar";
        } else if (imc < 24.9) {
            mensagem = " Você está com peso ideal.\nNão precisa de dieta";
        } else if (imc < 29.9) {
            mensagem = " Você está com sobrepeso.\nPrecisa de uma dieta para emagrecer";
        } else if (imc < 30) {
            mensagem = " Você está com obesidade.\nPrecisa de uma dieta, exercicios e uma mudança de vida";
        } else {
            mensagem = " Você está com obesidade grave.\nPrecisa procurar um médico";
        }

        LbResp.setText(mensagem);
    }

}
