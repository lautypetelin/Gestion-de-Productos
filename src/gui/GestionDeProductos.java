package gui;

import domain.Categoria;
import domain.Producto;
import static gui.MenuGeneral.productos;
import javax.swing.JOptionPane;

public class GestionDeProductos extends javax.swing.JInternalFrame {

    //Atributos
    private Producto prodEncontrado = null;
    
    //Constructor
    public GestionDeProductos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlTitulo1 = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlDescripcion = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jlRubro = new javax.swing.JLabel();
        jlStock = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtStock = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbNuevo1 = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcCategoria = new javax.swing.JComboBox<>();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTitulo1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jlTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo1.setText("Gestión de Productos");
        jPanel2.add(jlTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 388, -1));

        jlCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlCodigo.setText("Código:");
        jPanel2.add(jlCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jlDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlDescripcion.setText("Descripción:");
        jPanel2.add(jlDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jlPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlPrecio.setText("Precio:");
        jPanel2.add(jlPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jlRubro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlRubro.setText("Rubro:");
        jPanel2.add(jlRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jlStock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlStock.setText("Stock:");
        jPanel2.add(jlStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel2.add(jtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 76, -1));
        jPanel2.add(jtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 257, -1));
        jPanel2.add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 76, -1));
        jPanel2.add(jtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 76, -1));

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 40, 30));

        jbNuevo1.setText("Nuevo");
        jbNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevo1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbNuevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel2.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jcCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new Categoria[] {Categoria.COMESTIBLE, Categoria.LIMPIEZA, Categoria.PERFUMERIA}));
        jcCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(jcCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevo1ActionPerformed
        borrarCampos();
        prodEncontrado = null;
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jbNuevo1ActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        try{
            
            if(jtCodigo.getText().isEmpty() || jtDescripcion.getText().isEmpty() || jtPrecio.getText().isEmpty() || jtStock.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No puede haber campos vacíos");
                return;
            }
            
            int codigo = Integer.parseInt(jtCodigo.getText());
            String descripcion = jtDescripcion.getText();
            Double precio = Double.parseDouble(jtPrecio.getText());
            int stock = Integer.parseInt(jtStock.getText());
            Categoria rubro = (Categoria)jcCategoria.getSelectedItem(); //Casteo

            Producto prodNuevo = new Producto(codigo, descripcion, precio, stock, rubro);

            boolean sePuedeAgregar = productos.add(prodNuevo);

            if(sePuedeAgregar){
                JOptionPane.showMessageDialog(this, "Producto agregado con éxito.");
            }else{
                JOptionPane.showMessageDialog(this, "Ya existe un producto con código "+ codigo +".");
            }
 
            borrarCampos();
            
        }catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(this, "Debe ingresar valores numéricos en los campos Código, Precio y Stock.");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCategoriaActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       
        try{
            
            prodEncontrado = null;
            if(jtCodigo.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No puede buscar con el campo en blanco.");
                return;
            }
            
            int codigo = Integer.parseInt(jtCodigo.getText());
            
            for (Producto prod : productos) {

                if(prod.getCodigo() == codigo){
                    prodEncontrado = prod;
                    break;
                }
            }
            
            if(prodEncontrado != null){
//                JOptionPane.showMessageDialog(this, "Producto con código " + codigo + " encontrado.");
                
                jtCodigo.setText(String.valueOf(prodEncontrado.getCodigo()));
                jtDescripcion.setText(prodEncontrado.getDescripcion());
                jtPrecio.setText(String.valueOf(prodEncontrado.getPrecio()));
                jtStock.setText(String.valueOf(prodEncontrado.getStock()));
                jcCategoria.setSelectedItem(prodEncontrado.getRubro());
                jbEliminar.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(this, "No existe ningún producto con código " + codigo + ".");
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe digitar un código entero.");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        productos.remove(prodEncontrado);
        JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.");
        borrarCampos();
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Categoria> jcCategoria;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlRubro;
    private javax.swing.JLabel jlStock;
    private javax.swing.JLabel jlTitulo1;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables

    private void borrarCampos(){
        
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
    } 
}