
package PRESENTAR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class VentanaPresentar extends javax.swing.JFrame {

   
    public VentanaPresentar() {
        initComponents();
        this.setLocationRelativeTo(null);
        abrirBaseDatos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnconsulta1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnConsulta2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnConsulta3 = new javax.swing.JButton();
        btnConsulta4 = new javax.swing.JButton();
        btnConsulta5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombres y precios de los productos de la tienda");

        btnconsulta1.setText("OBTENER");
        btnconsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsulta1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Datos de las Memoria RAM y memorias USB");

        btnConsulta2.setText("OBTENER");
        btnConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Datos de los productos cuyo precio fluctue entre $100 y $350");

        jLabel4.setText("Descuento de $ 10 a todos los productos cuyo precio sea mayor o igual a $ 450");

        jLabel5.setText("Lista de los productos, incluyendo por cada articulo los datos del articulo y del fabricante ");

        btnConsulta3.setText("OBTENER");
        btnConsulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta3ActionPerformed(evt);
            }
        });

        btnConsulta4.setText("OBTENER");
        btnConsulta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta4ActionPerformed(evt);
            }
        });

        btnConsulta5.setText("OBTENER");
        btnConsulta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta5ActionPerformed(evt);
            }
        });

        mostrarTexto.setColumns(20);
        mostrarTexto.setRows(5);
        jScrollPane1.setViewportView(mostrarTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnconsulta1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnConsulta2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btnConsulta3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnConsulta4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnConsulta5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnconsulta1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsulta2)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsulta3)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsulta4)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsulta5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsulta1ActionPerformed
      
        abrirBaseDatos();
        String cadena="";
        try {
             Statement sentencia=conexion.createStatement();
             ResultSet registros=sentencia.executeQuery("select NOMBRE, PRECIO from ARTICULOS");
         
             while (registros.next()) {
                 String nombre = registros.getString("NOMBRE");
                 int precio = registros.getInt("PRECIO");
                cadena=cadena+nombre+"  $"+precio+"\n";
           }
             registros.close();
             conexion.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al enviar consulta "+ex);
        }
        mostrarTexto.setText(cadena);
        
    }//GEN-LAST:event_btnconsulta1ActionPerformed

    private void btnConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta2ActionPerformed
        String cadena="";
        abrirBaseDatos();
        try {
             Statement sentencia=conexion.createStatement();
             ResultSet registros=sentencia.executeQuery("select * from ARTICULOS WHERE NOMBRE ='Memoria USB' OR NOMBRE='Memoria RAM' ");
         
             while (registros.next()) {
                 int claveArticulo = registros.getInt("CLAVE_ARTICULO");
                 String nombre = registros.getString("NOMBRE");
                 int precio = registros.getInt("PRECIO");
                 int claveFabricante = registros.getInt("CLAVE_FABRICANTE");    
                cadena=cadena+claveArticulo+", "+nombre+",  $"+precio+", "+claveFabricante+"\n";
           }
             registros.close();
             conexion.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al enviar consulta "+ex);
        }
        mostrarTexto.setText(cadena);
        
        
    }//GEN-LAST:event_btnConsulta2ActionPerformed

    private void btnConsulta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta4ActionPerformed
        String cadena="";
        abrirBaseDatos();
        try {
             Statement sentencia=conexion.createStatement();
             ResultSet registros=sentencia.executeQuery("select * from ARTICULOS where PRECIO>=450");
           String sqlInsert="";
             while (registros.next()) {
                 int claveArticulo = registros.getInt("CLAVE_ARTICULO");
                 String nombre = registros.getString("NOMBRE");
                 int precio = registros.getInt("PRECIO");
                 int claveFabricante = registros.getInt("CLAVE_FABRICANTE");
                
                 int desc=precio-10;
                cadena=cadena+claveArticulo+", "+nombre+",  $"+precio+", Con descuento: "+desc+",     "+claveFabricante+"\n";
                
                sqlInsert= String.format("UPDATE ARTICULOS SET PRECIO=%d where CLAVE_ARTICULO=%d",desc, claveArticulo);
           
               
             
             }
             int r= sentencia.executeUpdate(sqlInsert);
              System.out.println("Se han modificado "+r+"registros");
             
             registros.close();
             conexion.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al enviar consulta "+ex);
        }
        mostrarTexto.setText(cadena);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnConsulta4ActionPerformed

    private void btnConsulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta3ActionPerformed
        String cadena="";
        abrirBaseDatos();
        try {
             Statement sentencia=conexion.createStatement();
             ResultSet registros=sentencia.executeQuery("select * from ARTICULOS where PRECIO>100 AND PRECIO<350");
         
             while (registros.next()) {
                 int claveArticulo = registros.getInt("CLAVE_ARTICULO");
                 String nombre = registros.getString("NOMBRE");
                 int precio = registros.getInt("PRECIO");
                 int claveFabricante = registros.getInt("CLAVE_FABRICANTE");
      
                 Double des=precio*0.1;
                 int des2=des.intValue();
                 int desc=precio-(int)des2;
                cadena=cadena+claveArticulo+", "+nombre+",  $"+precio+", "+claveFabricante+"\n";

           }
             registros.close();
             conexion.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al enviar consulta "+ex);
        }
        mostrarTexto.setText("");
        mostrarTexto.setText(cadena);                    
    }//GEN-LAST:event_btnConsulta3ActionPerformed

    private void btnConsulta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta5ActionPerformed
        
        String cadena="";
        abrirBaseDatos();
        try {
             Statement sentencia=conexion.createStatement();
             ResultSet registros=sentencia.executeQuery("select * from ARTICULOS LEFT JOIN FABRICANTES ON ARTICULOS.CLAVE_FABRICANTE=FABRICANTES.CLAVE_FABRICANTE");
             while (registros.next()) {
                 int claveArticulo = registros.getInt(1);
                 String nombre = registros.getString(2);
                 int precio = registros.getInt(3);
                 int claveFabricante = registros.getInt(4);
                 String nombreFabricante=registros.getString(6);
                cadena=cadena+claveArticulo+", "+nombre+", "+precio+", "+claveFabricante+", "+nombreFabricante+"\n";
           }
             registros.close();
             conexion.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al enviar consulta "+ex);
        }
        mostrarTexto.setText(cadena);   
   
        
    }//GEN-LAST:event_btnConsulta5ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPresentar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPresentar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPresentar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPresentar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPresentar().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta2;
    private javax.swing.JButton btnConsulta3;
    private javax.swing.JButton btnConsulta4;
    private javax.swing.JButton btnConsulta5;
    private javax.swing.JButton btnconsulta1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mostrarTexto;
    // End of variables declaration//GEN-END:variables
 
   Connection conexion=null;
 
   public void abrirBaseDatos(){
   try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        System.out.println("Driver cargado !!!");
    } catch (ClassNotFoundException cnfe) {
        System.out.println("Error al cargar Driver "+cnfe);   
    }

    try {
        String urlbd="jdbc:derby://localhost:1527/Tienda";
        conexion = DriverManager.getConnection(urlbd, "examen","examen");
         System.out.println("Conexion satisfactoria !!!");
    } catch (SQLException sqlex) {
        System.out.println("Error al establecer conexion a la BD: "+sqlex);
    }
   }

}
