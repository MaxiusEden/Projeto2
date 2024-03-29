/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package visaoCalculos;

import entidades.Cilindro;
import javax.swing.JOptionPane;

/**
 *
 * @author filip
 */
public class calcularCilindro extends javax.swing.JInternalFrame {

    /**
     * Creates new form calcularCilindro
     */
    public calcularCilindro() {
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

        JLabel_Titulo = new javax.swing.JLabel();
        JLabel_Raio = new javax.swing.JLabel();
        JLabel_Altura = new javax.swing.JLabel();
        JTextField_Raio = new javax.swing.JTextField();
        JTextField_Altura = new javax.swing.JTextField();
        JButtom_Executar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea_Saida = new javax.swing.JTextArea();

        setClosable(true);
        setMaximizable(true);

        JLabel_Titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JLabel_Titulo.setText("Cálculo para Cilindro");

        JLabel_Raio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_Raio.setText("Raio: ");

        JLabel_Altura.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabel_Altura.setText("Altura: ");

        JTextField_Raio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        JTextField_Altura.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        JButtom_Executar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JButtom_Executar.setText("Executar");
        JButtom_Executar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtom_ExecutarActionPerformed(evt);
            }
        });

        JTextArea_Saida.setColumns(20);
        JTextArea_Saida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JTextArea_Saida.setRows(5);
        jScrollPane1.setViewportView(JTextArea_Saida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(JLabel_Raio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextField_Raio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(JLabel_Altura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextField_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(JButtom_Executar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(JLabel_Titulo)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JLabel_Titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_Raio)
                    .addComponent(JTextField_Raio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_Altura)
                    .addComponent(JTextField_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(JButtom_Executar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtom_ExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtom_ExecutarActionPerformed
     try{
           Cilindro p1 = new Cilindro();
     
     p1.setRaio(Float.parseFloat(JTextField_Raio.getText()));
     p1.setAltura(Integer.parseInt(JTextField_Altura.getText()));
     
     JTextArea_Saida.setText("Área Lateral: " + p1.calcularAreaL() + "\nÁrea Total: " 
             + p1.calcularAreaT() + "\nVolume: " + p1.calcularVolume());
     }
     catch(Exception erro){
        JOptionPane.showMessageDialog(this, erro.getMessage());
    }
      
    }//GEN-LAST:event_JButtom_ExecutarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtom_Executar;
    private javax.swing.JLabel JLabel_Altura;
    private javax.swing.JLabel JLabel_Raio;
    private javax.swing.JLabel JLabel_Titulo;
    private javax.swing.JTextArea JTextArea_Saida;
    private javax.swing.JTextField JTextField_Altura;
    private javax.swing.JTextField JTextField_Raio;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
