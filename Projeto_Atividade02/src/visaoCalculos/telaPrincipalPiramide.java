/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visaoCalculos;

/**
 *
 * @author puc
 */
public class telaPrincipalPiramide extends javax.swing.JFrame {



    /**
     * Creates new form telaPrincipalPiramide
     */
    public telaPrincipalPiramide() {
        initComponents();
   this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MenuPiramide = new javax.swing.JMenuItem();
        MenuEsfera = new javax.swing.JMenuItem();
        MenuRetangulo = new javax.swing.JMenuItem();
        MenuParalelepipedo = new javax.swing.JMenuItem();
        MenuCilindro = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entidades/Tarefas POO_resized_resized_resized.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Cálculos para Formas Geometricas");

        Painel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Painel.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel2)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jMenu2.setText("Cálculos");

        MenuPiramide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entidades/grafico-de-piramide.png"))); // NOI18N
        MenuPiramide.setText("Volume Pirâmide");
        MenuPiramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPiramideActionPerformed(evt);
            }
        });
        jMenu2.add(MenuPiramide);

        MenuEsfera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entidades/icons8-esfera-16.png"))); // NOI18N
        MenuEsfera.setText("Área e Volume Esfera");
        MenuEsfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEsferaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuEsfera);

        MenuRetangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entidades/icons8-retângulo-16.png"))); // NOI18N
        MenuRetangulo.setText("Área e Perímetro Retângulo");
        MenuRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRetanguloActionPerformed(evt);
            }
        });
        jMenu2.add(MenuRetangulo);

        MenuParalelepipedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entidades/paralelepipedoIcon.png"))); // NOI18N
        MenuParalelepipedo.setText("Volume e Área Paralelepípedo");
        MenuParalelepipedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuParalelepipedoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuParalelepipedo);

        MenuCilindro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entidades/cilindroIcon.png"))); // NOI18N
        MenuCilindro.setText("Áreas e Volume Cilindro");
        MenuCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCilindroActionPerformed(evt);
            }
        });
        jMenu2.add(MenuCilindro);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entidades/coneIcon.png"))); // NOI18N
        jMenuItem3.setText("Áreas e Volume Cone");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Painel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuPiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPiramideActionPerformed
        calcularPiramide obj = new calcularPiramide();
        Painel.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_MenuPiramideActionPerformed

    private void MenuEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEsferaActionPerformed
        calcularEsfera obj = new calcularEsfera();
        Painel.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_MenuEsferaActionPerformed

    private void MenuRetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRetanguloActionPerformed
        calcularRetangulo obj = new calcularRetangulo();
        Painel.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_MenuRetanguloActionPerformed

    private void MenuParalelepipedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuParalelepipedoActionPerformed
        calcularParalelepipedo obj = new calcularParalelepipedo();
        Painel.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_MenuParalelepipedoActionPerformed

    private void MenuCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCilindroActionPerformed
       calcularCilindro obj = new calcularCilindro();
       Painel.add(obj);
       obj.setVisible(true);
    }//GEN-LAST:event_MenuCilindroActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       calcularCone obj = new calcularCone();
       Painel.add(obj);
       obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipalPiramide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new telaPrincipalPiramide().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCilindro;
    private javax.swing.JMenuItem MenuEsfera;
    private javax.swing.JMenuItem MenuParalelepipedo;
    private javax.swing.JMenuItem MenuPiramide;
    private javax.swing.JMenuItem MenuRetangulo;
    private javax.swing.JDesktopPane Painel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
