/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Logo.java
 *
 * Created on 30/09/2011, 00:55:19
 */
package br.univali.ps.ui.imagens;

/**
 *
 * @author fillipipelz
 */
public class Logo extends javax.swing.JPanel {

    /** Creates new form Logo */
    public Logo() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        portugoStudio = new javax.swing.JLabel();
        lampada = new javax.swing.JLabel();
        versao = new javax.swing.JLabel();

        setOpaque(false);

        portugoStudio.setFont(new java.awt.Font("Lucida Grande", 1, 24));
        portugoStudio.setForeground(new java.awt.Color(255, 255, 255));
        portugoStudio.setText("{PortugolStudio} ");

        lampada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univali/ps/ui/icones/grande/light.png"))); // NOI18N

        versao.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        versao.setForeground(new java.awt.Color(255, 255, 153));
        versao.setText("1.01");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(190, 190, 190)
                .add(lampada, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(versao))
            .add(portugoStudio, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(lampada, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(versao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(30, 30, 30)
                .add(portugoStudio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lampada;
    private javax.swing.JLabel portugoStudio;
    private javax.swing.JLabel versao;
    // End of variables declaration//GEN-END:variables
}