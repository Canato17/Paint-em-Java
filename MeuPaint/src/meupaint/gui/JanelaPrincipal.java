/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meupaint.gui;

import javax.swing.JColorChooser;
import java.awt.Color;
import java.awt.event.MouseEvent;

/**
 *
 * @author Carlos
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    private int xPress;
    private int yPress;

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        btnGroupDesenho = new javax.swing.ButtonGroup();
        jPanel = new javax.swing.JPanel();
        btnLinha = new javax.swing.JToggleButton();
        btnRetangulo = new javax.swing.JToggleButton();
        btnElipse = new javax.swing.JToggleButton();
        btnCorContorno = new javax.swing.JButton();
        checkSemCorContorno = new javax.swing.JCheckBox();
        btnCorPreenchimento = new javax.swing.JButton();
        checkSemCorPreenchimento = new javax.swing.JCheckBox();
        painelDesenho = new meupaint.gui.PainelDesenho();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meu Paint");

        btnGroupDesenho.add(btnLinha);
        btnLinha.setSelected(true);
        btnLinha.setText("Linha");

        btnGroupDesenho.add(btnRetangulo);
        btnRetangulo.setText("Retangulo");

        btnGroupDesenho.add(btnElipse);
        btnElipse.setText("Elipses");

        btnCorContorno.setText("\u25A0");
        btnCorContorno.setToolTipText("Cor Contorno");
        btnCorContorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorContornoActionPerformed(evt);
            }
        });

        checkSemCorContorno.setText("sem Cor");
        checkSemCorContorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSemCorContornoActionPerformed(evt);
            }
        });

        btnCorPreenchimento.setForeground(new java.awt.Color(204, 204, 255));
        btnCorPreenchimento.setText("\u25A0");
        btnCorPreenchimento.setToolTipText("Cor Preenchimento");
        btnCorPreenchimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorPreenchimentoActionPerformed(evt);
            }
        });

        checkSemCorPreenchimento.setText("sem Cor");

        painelDesenho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                painelDesenhoMouseDragged(evt);
            }
        });
        painelDesenho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painelDesenhoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                painelDesenhoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout painelDesenhoLayout = new javax.swing.GroupLayout(painelDesenho);
        painelDesenho.setLayout(painelDesenhoLayout);
        painelDesenhoLayout.setHorizontalGroup(
            painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelDesenhoLayout.setVerticalGroup(
            painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(btnLinha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRetangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnElipse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCorContorno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkSemCorContorno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCorPreenchimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkSemCorPreenchimento)
                        .addGap(0, 85, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLinha)
                    .addComponent(btnRetangulo)
                    .addComponent(btnElipse)
                    .addComponent(btnCorContorno)
                    .addComponent(checkSemCorContorno)
                    .addComponent(btnCorPreenchimento)
                    .addComponent(checkSemCorPreenchimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDesenho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void painelDesenhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMousePressed
        xPress = evt.getX();
        yPress = evt.getY();
    }//GEN-LAST:event_painelDesenhoMousePressed

    private void painelDesenhoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMouseReleased

        FormaGeometrica novaForma = criarNovaForma(evt);

        painelDesenho.setFormaTemporaria(null);
        painelDesenho.adicionarForma(novaForma);
        painelDesenho.repaint();

    }//GEN-LAST:event_painelDesenhoMouseReleased

   
    private void painelDesenhoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDesenhoMouseDragged

        FormaGeometrica formaTemp = criarNovaForma(evt);
        
        painelDesenho.setFormaTemporaria(formaTemp);

        painelDesenho.repaint();
    }//GEN-LAST:event_painelDesenhoMouseDragged

    private void btnCorPreenchimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorPreenchimentoActionPerformed
        Color c = JColorChooser.showDialog(
                this,
                "Cor Preenchimento",
                btnCorPreenchimento.getForeground());
        if (c != null) {
            btnCorPreenchimento.setForeground(c);
        }
    }//GEN-LAST:event_btnCorPreenchimentoActionPerformed

    private void checkSemCorContornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSemCorContornoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSemCorContornoActionPerformed

    private void btnCorContornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorContornoActionPerformed
        Color c = JColorChooser.showDialog(
                this,
                "Cor Contorno",
                btnCorContorno.getForeground());
        if (c != null) {
            btnCorContorno.setForeground(c);
        }
    }//GEN-LAST:event_btnCorContornoActionPerformed
 
    private FormaGeometrica criarNovaForma(MouseEvent evt) {
        FormaGeometrica novaForma = null;
        if (btnLinha.isSelected()) {
            novaForma = new Linha();
            
        } else if (btnRetangulo.isSelected()) {
            novaForma = new Retangulo();
            
        } else if (btnElipse.isSelected()) {
            novaForma = new Elipse();
            
        }
        novaForma.setXini(xPress);
        novaForma.setYini(yPress);
        novaForma.setXfim(evt.getX());
        novaForma.setYfim(evt.getY());
        if(checkSemCorContorno.isSelected()){
            novaForma.setCorContorno(null);
        }else{
            novaForma.setCorContorno(btnCorContorno.getForeground());
        }
        if(checkSemCorPreenchimento.isSelected()){
            novaForma.setCorPreenchimento(null);
        }else{
            novaForma.setCorPreenchimento(btnCorPreenchimento.getForeground());
        }
        return novaForma;
    }

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCorContorno;
    private javax.swing.JButton btnCorPreenchimento;
    private javax.swing.JToggleButton btnElipse;
    private javax.swing.ButtonGroup btnGroupDesenho;
    private javax.swing.JToggleButton btnLinha;
    private javax.swing.JToggleButton btnRetangulo;
    private javax.swing.JCheckBox checkSemCorContorno;
    private javax.swing.JCheckBox checkSemCorPreenchimento;
    private javax.swing.JPanel jPanel;
    private javax.swing.JToggleButton jToggleButton1;
    private meupaint.gui.PainelDesenho painelDesenho;
    // End of variables declaration//GEN-END:variables
}
