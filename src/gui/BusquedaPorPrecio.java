package gui;

import domain.Producto;
import static gui.MenuGeneral.productos;
import javax.swing.table.DefaultTableModel;

public class BusquedaPorPrecio extends javax.swing.JInternalFrame {

    //Atributos
    private DefaultTableModel modelo = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int f, int c){
            return false;
        }
    };
    
    //Constructor
    public BusquedaPorPrecio() {
        initComponents();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTitulo1 = new javax.swing.JLabel();
        jlEntre = new javax.swing.JLabel();
        jtPrecio1 = new javax.swing.JTextField();
        jlY = new javax.swing.JLabel();
        jtPrecio2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();

        setClosable(true);

        jlTitulo1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jlTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo1.setText("Lista de Productos por Precio");

        jlEntre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlEntre.setText("y");

        jtPrecio1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtPrecio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecio1ActionPerformed(evt);
            }
        });
        jtPrecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecio1KeyReleased(evt);
            }
        });

        jlY.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlY.setText("Entre $:");

        jtPrecio2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtPrecio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecio2ActionPerformed(evt);
            }
        });
        jtPrecio2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecio2KeyReleased(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jlY)
                .addGap(13, 13, 13)
                .addComponent(jtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlEntre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlTitulo1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlY)
                    .addComponent(jlEntre)
                    .addComponent(jtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPrecio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecio1ActionPerformed

    }//GEN-LAST:event_jtPrecio1ActionPerformed

    private void jtPrecio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecio2ActionPerformed
        
    }//GEN-LAST:event_jtPrecio2ActionPerformed

    private void jtPrecio1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecio1KeyReleased
        
        try{
            double precio1 = Double.parseDouble(jtPrecio1.getText());
            double precio2 = Double.parseDouble(jtPrecio2.getText());

            modelo.setRowCount(0);

            for (Producto prod : productos) {

                if(prod.getPrecio() >= precio1 && prod.getPrecio() <= precio2){
                    modelo.addRow(new Object[]{ prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getStock()});
                }
            }
        }catch(NumberFormatException nfe){
            
        }
    }//GEN-LAST:event_jtPrecio1KeyReleased

    private void jtPrecio2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecio2KeyReleased
        
        try{
            double precio1 = Double.parseDouble(jtPrecio1.getText());
            double precio2 = Double.parseDouble(jtPrecio2.getText());

            modelo.setRowCount(0);

            for (Producto prod : productos) {

                if(prod.getPrecio() >= precio1 && prod.getPrecio() <= precio2){
                    modelo.addRow(new Object[]{ prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getStock()});
                }
            }
        }catch(NumberFormatException nfe){
            
        }
    }//GEN-LAST:event_jtPrecio2KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlEntre;
    private javax.swing.JLabel jlTitulo1;
    private javax.swing.JLabel jlY;
    private javax.swing.JTextField jtPrecio1;
    private javax.swing.JTextField jtPrecio2;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        
        jtProductos.setModel(modelo);
    }
}