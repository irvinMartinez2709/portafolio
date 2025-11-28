package com.mycompany.partedos;

import java.awt.Graphics;
import java.awt.Color;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void dibujarBarras(int rojo, int verde, int azul) {
        Graphics g = GraficodeBarras.getGraphics();

        g.clearRect(0, 0, GraficodeBarras.getWidth(), GraficodeBarras.getHeight());

        int valorMayor = Math.max(rojo, Math.max(verde, azul));

        int largoRojo = rojo * 400 / valorMayor;
        int largoVerde = verde * 400 / valorMayor;
        int largoAzul = azul * 400 / valorMayor;

        g.setColor(Color.RED);
        g.fillRect(50, 30, largoRojo, 40);
        g.setColor(Color.BLACK);
        g.drawString("Cola", 10, 55);

        g.setColor(Color.GREEN);
        g.fillRect(50, 80, largoVerde, 40);
        g.setColor(Color.BLACK);
        g.drawString("Naranja", 10, 105);

        g.setColor(Color.BLUE);
        g.fillRect(50, 130, largoAzul, 40);
        g.setColor(Color.BLACK);
        g.drawString("Limón", 10, 155);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        InformeCuadro = new javax.swing.JPanel();
        InformeTitulo = new javax.swing.JLabel();
        Cola = new javax.swing.JLabel();
        txtCantCola = new javax.swing.JTextField();
        txtPrecioCola = new javax.swing.JTextField();
        txtCantNaranja = new javax.swing.JTextField();
        txtPrecioNaranja = new javax.swing.JTextField();
        txtCantLimon = new javax.swing.JTextField();
        txtPrecioLimon = new javax.swing.JTextField();
        Naranja = new javax.swing.JLabel();
        Limón = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        totalGeneral = new javax.swing.JLabel();
        txtTotalGeneral = new javax.swing.JTextField();
        ImagenoGraficoPastel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        GraficodeBarras = new javax.swing.JPanel();
        BarraSuperior = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        minimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(202, 203, 243));
        Fondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InformeCuadro.setBackground(new java.awt.Color(255, 255, 255));
        InformeCuadro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        InformeTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        InformeTitulo.setForeground(new java.awt.Color(74, 151, 83));
        InformeTitulo.setText("Informe de Ventas");

        Cola.setForeground(new java.awt.Color(0, 0, 0));
        Cola.setText("Cola");

        txtCantCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantColaActionPerformed(evt);
            }
        });

        Naranja.setForeground(new java.awt.Color(0, 0, 0));
        Naranja.setText("Naranja");

        Limón.setForeground(new java.awt.Color(0, 0, 0));
        Limón.setText("Limón");

        btnCalcular.setBackground(new java.awt.Color(77, 153, 85));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular Ventas");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        totalGeneral.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalGeneral.setForeground(new java.awt.Color(0, 0, 0));
        totalGeneral.setText("TOTAL GENERAL");

        txtTotalGeneral.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout InformeCuadroLayout = new javax.swing.GroupLayout(InformeCuadro);
        InformeCuadro.setLayout(InformeCuadroLayout);
        InformeCuadroLayout.setHorizontalGroup(
            InformeCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformeCuadroLayout.createSequentialGroup()
                .addGroup(InformeCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InformeCuadroLayout.createSequentialGroup()
                        .addGroup(InformeCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InformeCuadroLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(Naranja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformeCuadroLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(Limón, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformeCuadroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Cola, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(InformeCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantLimon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantCola, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InformeCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecioLimon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioCola, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformeCuadroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(88, 88, 88))
            .addGroup(InformeCuadroLayout.createSequentialGroup()
                .addGroup(InformeCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InformeCuadroLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(InformeTitulo))
                    .addGroup(InformeCuadroLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(InformeCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(txtTotalGeneral))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InformeCuadroLayout.setVerticalGroup(
            InformeCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformeCuadroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(InformeTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(InformeCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cola)
                    .addComponent(txtCantCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(InformeCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Naranja, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtCantNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InformeCuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantLimon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioLimon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limón))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(totalGeneral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        Fondo.add(InformeCuadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, 310));

        ImagenoGraficoPastel.setBackground(new java.awt.Color(105, 99, 234));
        ImagenoGraficoPastel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setBackground(new java.awt.Color(202, 203, 243));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 102), new java.awt.Color(0, 102, 51)));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 102, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(105, 99, 234));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout ImagenoGraficoPastelLayout = new javax.swing.GroupLayout(ImagenoGraficoPastel);
        ImagenoGraficoPastel.setLayout(ImagenoGraficoPastelLayout);
        ImagenoGraficoPastelLayout.setHorizontalGroup(
            ImagenoGraficoPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagenoGraficoPastelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        ImagenoGraficoPastelLayout.setVerticalGroup(
            ImagenoGraficoPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagenoGraficoPastelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );

        Fondo.add(ImagenoGraficoPastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 300, 310));

        GraficodeBarras.setBackground(new java.awt.Color(255, 255, 255));
        GraficodeBarras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout GraficodeBarrasLayout = new javax.swing.GroupLayout(GraficodeBarras);
        GraficodeBarras.setLayout(GraficodeBarrasLayout);
        GraficodeBarrasLayout.setHorizontalGroup(
            GraficodeBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        GraficodeBarrasLayout.setVerticalGroup(
            GraficodeBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        Fondo.add(GraficodeBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 590, 250));

        BarraSuperior.setBackground(new java.awt.Color(88, 157, 87));

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("x");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        minimizar.setBackground(new java.awt.Color(204, 204, 204));
        minimizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        minimizar.setForeground(new java.awt.Color(0, 0, 0));
        minimizar.setText("-");
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addContainerGap(511, Short.MAX_VALUE)
                .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BarraSuperiorLayout.setVerticalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraSuperiorLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Fondo.add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 590, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        try {
            int enteroRojo = Integer.parseInt(txtCantCola.getText());
            int enteroVerde = Integer.parseInt(txtCantNaranja.getText());
            int enteroAzul = Integer.parseInt(txtCantLimon.getText());

            dibujarBarras(enteroRojo, enteroVerde, enteroAzul);

            double precioCola = Double.parseDouble(txtPrecioCola.getText());
            double precioNaranja = Double.parseDouble(txtPrecioNaranja.getText());
            double precioLimon = Double.parseDouble(txtPrecioLimon.getText());

            int maxCantidad = 5000000;
            if (enteroRojo > maxCantidad || enteroVerde > maxCantidad || enteroAzul > maxCantidad) {
                javax.swing.JOptionPane.showMessageDialog(this, "Cantidad máxima permitida: 5,000,000");
                return;
            }

            double maxPrecio = 1000.0;
            if (precioCola > maxPrecio || precioNaranja > maxPrecio || precioLimon > maxPrecio) {
                javax.swing.JOptionPane.showMessageDialog(this, "Precio máximo permitido por producto: B/.1000.00");
                return;
            }

            double totalCola = enteroRojo * precioCola;
            double totalNaranja = enteroVerde * precioNaranja;
            double totalLimon = enteroAzul * precioLimon;
            double totalGeneral = totalCola + totalNaranja + totalLimon;

            txtTotalGeneral.setText(String.format("%.2f", totalGeneral));

            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);
            modelo.addRow(new Object[]{"Cola", enteroRojo, String.format("%.2f", precioCola), String.format("%.2f", totalCola)});
            modelo.addRow(new Object[]{"Naranja", enteroVerde, String.format("%.2f", precioNaranja), String.format("%.2f", totalNaranja)});
            modelo.addRow(new Object[]{"Limón", enteroAzul, String.format("%.2f", precioLimon), String.format("%.2f", totalLimon)});

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingresa valores válidos en cantidades y precios");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtCantColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantColaActionPerformed

    }//GEN-LAST:event_txtCantColaActionPerformed

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed

    }//GEN-LAST:event_minimizarActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);

    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel Cola;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel GraficodeBarras;
    private javax.swing.JPanel ImagenoGraficoPastel;
    private javax.swing.JPanel InformeCuadro;
    private javax.swing.JLabel InformeTitulo;
    private javax.swing.JLabel Limón;
    private javax.swing.JLabel Naranja;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton exit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton minimizar;
    private javax.swing.JLabel totalGeneral;
    private javax.swing.JTextField txtCantCola;
    private javax.swing.JTextField txtCantLimon;
    private javax.swing.JTextField txtCantNaranja;
    private javax.swing.JTextField txtPrecioCola;
    private javax.swing.JTextField txtPrecioLimon;
    private javax.swing.JTextField txtPrecioNaranja;
    private javax.swing.JTextField txtTotalGeneral;
    // End of variables declaration//GEN-END:variables
}
