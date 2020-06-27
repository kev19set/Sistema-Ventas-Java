/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;




public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
   
void centrarventana(JInternalFrame frame){
  VentanaPrincipal.add(frame);
    Dimension dimension=VentanaPrincipal.getSize();
    Dimension Dframe=frame.getSize();
  //  frame.setLocation((dimension.width - Dframe.height)/2, (dimension.height -Dframe.width)/2);
    frame.show();
  frame.setSize(VentanaPrincipal.getWidth(),VentanaPrincipal.getHeight());

}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        aproducto = new javax.swing.JMenuItem();
        vendedor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        VentanaPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu.png"))); // NOI18N
        jMenu2.setText("Menu");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Ayuda");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/vender.jpg"))); // NOI18N
        jMenu1.setText("Ventas");

        jMenuItem3.setText("Generar Venta");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantener.jpg"))); // NOI18N
        jMenu3.setText("Mantenimiento");

        jMenuItem4.setText("Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        aproducto.setText("Producto");
        aproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aproductoActionPerformed(evt);
            }
        });
        jMenu3.add(aproducto);

        vendedor.setText("Vendedor");
        vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedorActionPerformed(evt);
            }
        });
        jMenu3.add(vendedor);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logreporte.jpg"))); // NOI18N
        jMenu4.setText("Reportes");

        jMenuItem7.setText("Reporte de Ventaas");
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     VentasForm vf=new VentasForm();
     
     centrarventana(vf);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
     ClienteForm vf=new ClienteForm();
        centrarventana(vf);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void aproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aproductoActionPerformed
   ProductoForm vf= new ProductoForm();
        centrarventana(vf);
    }//GEN-LAST:event_aproductoActionPerformed

    private void vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedorActionPerformed
      VendedorForm vf =new VendedorForm();
        centrarventana(vf);
    }//GEN-LAST:event_vendedorActionPerformed

 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenuItem aproducto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem vendedor;
    // End of variables declaration//GEN-END:variables
}
