package gui;

import domain.Producto;
import java.util.Set;
import java.util.TreeSet;

public class MenuGeneral extends javax.swing.JFrame {

    //Atributos
    public static Set<Producto> productos = new TreeSet<>();
    
    //Constructor
    public MenuGeneral() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuPorRubro = new javax.swing.JMenuItem();
        jMenuPorNombre = new javax.swing.JMenuItem();
        jMenuPorPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supermercado “DeTodo SA”");
        setPreferredSize(new java.awt.Dimension(700, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuProductos.setText("Productos");
        jMenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jMenuPorRubro.setText("Por Rubro");
        jMenuPorRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPorRubroActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuPorRubro);

        jMenuPorNombre.setText("Por Nombre");
        jMenuPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPorNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuPorNombre);

        jMenuPorPrecio.setText("Por Precio");
        jMenuPorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPorPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuPorPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProductosActionPerformed
        escritorio.removeAll(); //Remueve todas las ventanas visibles en el escritorio.
        escritorio.repaint(); //Se redibuja el escritorio.
        GestionDeProductos gdp = new GestionDeProductos();
        gdp.setVisible(true);
        escritorio.add(gdp);
        escritorio.moveToFront(gdp);
    }//GEN-LAST:event_jMenuProductosActionPerformed

    private void jMenuPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPorNombreActionPerformed
        escritorio.removeAll(); //Remueve todas las ventanas visibles en el escritorio.
        escritorio.repaint(); //Se redibuja el escritorio.
        BusquedaPorNombreView bpn = new BusquedaPorNombreView();
        bpn.setVisible(true);
        escritorio.add(bpn);
        escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jMenuPorNombreActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuPorRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPorRubroActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorRubroView bpr = new BusquedaPorRubroView();
        bpr.setVisible(true);
        escritorio.add(bpr);
        escritorio.moveToFront(bpr);
    }//GEN-LAST:event_jMenuPorRubroActionPerformed

    private void jMenuPorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPorPrecioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorPrecio bpp = new BusquedaPorPrecio();
        bpp.setVisible(true);
        escritorio.add(bpp);
        escritorio.moveToFront(bpp);
    }//GEN-LAST:event_jMenuPorPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuPorNombre;
    private javax.swing.JMenuItem jMenuPorPrecio;
    private javax.swing.JMenuItem jMenuPorRubro;
    private javax.swing.JMenuItem jMenuProductos;
    // End of variables declaration//GEN-END:variables
}