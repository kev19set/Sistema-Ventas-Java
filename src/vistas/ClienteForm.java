

package vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;

import javax.swing.JOptionPane;

public class ClienteForm extends javax.swing.JInternalFrame {
    ClienteDAO dao=new ClienteDAO();
    Cliente cl=new Cliente();
    int id;
    DefaultTableModel modelo=new DefaultTableModel();
 
 
    public ClienteForm() {
    initComponents();
    listar();
   }

void listar(){
    List<Cliente> lista=dao.listar();
    modelo=(DefaultTableModel)tabla.getModel();
    Object[]ob=new Object[5];
    for(int i=0;i<lista.size();i++){
     ob[0]=lista.get(i).getId();
     ob[1]=lista.get(i).getDni();
     ob[2]=lista.get(i).getNom();
     ob[3]=lista.get(i).getDir();
     ob[4]=lista.get(i).getEstado();
     modelo.addRow(ob);
     
    }
tabla.setModel(modelo);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfield = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        btnagregar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txts = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setTitle("CLIENTE");

        txtfield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Estado");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "1", "0" }));

        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        txts.setColumns(20);
        txts.setRows(5);
        jScrollPane2.setViewportView(txts);

        javax.swing.GroupLayout txtfieldLayout = new javax.swing.GroupLayout(txtfield);
        txtfield.setLayout(txtfieldLayout);
        txtfieldLayout.setHorizontalGroup(
            txtfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtfieldLayout.createSequentialGroup()
                .addGroup(txtfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txtfieldLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txtfieldLayout.createSequentialGroup()
                        .addGroup(txtfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(txtfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(txtfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        txtfieldLayout.setVerticalGroup(
            txtfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtfieldLayout.createSequentialGroup()
                .addGroup(txtfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txtfieldLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txtfieldLayout.createSequentialGroup()
                        .addGroup(txtfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnagregar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(txtfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(txtfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(txtfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(txtfieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 0), null, null));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRE", "DIRECCION", "ESTADO"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
      agregar();
      limpiar();
      listar();
        nuevo();
      
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
     actualizar();
      limpiar();
       listar();
        nuevo();
       
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
    eliminar();
     limpiar();
   
       listar();
          nuevo();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
      nuevo();
     
     
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
     int fila=tabla.getSelectedRow();
     if(fila==-1){
         JOptionPane.showMessageDialog(this, "Debe Seleccion una fila para que pueda funcionar");
         
     }else {
     id=Integer.parseInt(tabla.getValueAt(fila, 0).toString());
                 
    String dni=tabla.getValueAt(fila, 1).toString();
    String nom=tabla.getValueAt(fila, 2).toString();
    String dir=tabla.getValueAt(fila, 3).toString();
    String es=tabla.getValueAt(fila, 4).toString();
    txtdni.setText(dni);
      txtnom.setText(nom);
      txtdireccion.setText(dir);
      cmbEstado.setSelectedItem(es);
     }
    }//GEN-LAST:event_tablaMouseClicked
void agregar(){
    String dni=txtdni.getText();
    String nom=txtnom.getText();
    String dir=txtdireccion.getText();
    String es=cmbEstado.getSelectedItem().toString();
    Object[] ob=new Object[4];
    ob[0]=dni;
    ob[1]=nom;
    ob[2]=dir;
    ob[3]=es;
    dao.add(ob);
    
            }           
void actualizar(){
    int fila=tabla.getSelectedRow();
    if(fila==-1){
      JOptionPane.showMessageDialog(this, "Debe Seleccionar una fila para actualizar");
    }else{
  String dni=txtdni.getText();
  String nom=txtnom.getText();
  String dir=txtdireccion.getText();
  String es=cmbEstado.getSelectedItem().toString();
 
  Object[] obj=new Object[5];
  obj[0]=dni;
  obj[1]=nom;
  obj[2]=dir;
  obj[3]=es;
  obj[4]=id;
  dao.actualizar(obj);
    }
}
void eliminar(){
    int fila=tabla.getSelectedRow();
    int ids=Integer.parseInt(tabla.getValueAt(fila, 0).toString());
    if(fila==-1){
     JOptionPane.showMessageDialog(this, "Debe Seleccionar Una fila para Eliminar");
    }else{
        dao.eliminar(ids);
    }
}
void nuevo(){
    txtdni.setText("");
    txtnom.setText("");
    txtdireccion.setText("");
    cmbEstado.setSelectedItem("SELECCIONAR");
    txtdni.requestFocus();
    
}
void limpiar(){
    for(int i=0;i<modelo.getRowCount();i++){
        modelo.removeRow(i);
        i=i-1;
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JPanel txtfield;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextArea txts;
    // End of variables declaration//GEN-END:variables

}
