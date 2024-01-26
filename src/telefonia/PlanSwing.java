
package herencia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import telefonia.Tigo;


public class PlanSwing extends javax.swing.JFrame {
    Tigo tigo = new Tigo();
    
    public PlanSwing() {
        initComponents();
        Menu.setVisible(true);
        AgregarPlan.setVisible(false);
        PagarPlan.setVisible(false);
        AgregarAmigo.setVisible(false);
        Listado.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Listado = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaListado = new javax.swing.JTextArea();
        btnRegresarMenu4 = new javax.swing.JButton();
        AgregarAmigo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnRegresarMenu3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPin = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        btnAgregarAmigoFrame = new javax.swing.JButton();
        PagarPlan = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMensajes = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtMinutos = new javax.swing.JTextField();
        btnRegresarMenu2 = new javax.swing.JButton();
        btnPagarPlanFrame = new javax.swing.JButton();
        AgregarPlan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtExtra = new javax.swing.JTextField();
        txtNumTelefono = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        TipoBox = new javax.swing.JComboBox<>();
        btnRegresarMenu1 = new javax.swing.JButton();
        btnAgregarPlanFrame = new javax.swing.JButton();
        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarPlan = new javax.swing.JButton();
        btnPagarPlan = new javax.swing.JButton();
        btnAgregarAmigo = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        Salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(520, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Listado.setBackground(new java.awt.Color(255, 153, 255));
        Listado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("LISTADO");
        Listado.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        txtAreaListado.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaListado.setColumns(20);
        txtAreaListado.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtAreaListado.setForeground(new java.awt.Color(0, 0, 0));
        txtAreaListado.setRows(5);
        jScrollPane1.setViewportView(txtAreaListado);

        Listado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 500, 330));

        btnRegresarMenu4.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresarMenu4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnRegresarMenu4.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarMenu4.setText("REGRESAR");
        btnRegresarMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenu4ActionPerformed(evt);
            }
        });
        Listado.add(btnRegresarMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        jPanel1.add(Listado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 450));

        AgregarAmigo.setBackground(new java.awt.Color(255, 153, 255));
        AgregarAmigo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("AGREGAR AMIGO");
        AgregarAmigo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnRegresarMenu3.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresarMenu3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnRegresarMenu3.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarMenu3.setText("REGRESAR");
        btnRegresarMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenu3ActionPerformed(evt);
            }
        });
        AgregarAmigo.add(btnRegresarMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Pin:");
        AgregarAmigo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Número de Telefono:");
        AgregarAmigo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtPin.setBackground(new java.awt.Color(255, 255, 255));
        txtPin.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        txtPin.setForeground(new java.awt.Color(0, 0, 0));
        AgregarAmigo.add(txtPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 220, -1));

        txtNum.setBackground(new java.awt.Color(255, 255, 255));
        txtNum.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        txtNum.setForeground(new java.awt.Color(0, 0, 0));
        AgregarAmigo.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 220, -1));

        btnAgregarAmigoFrame.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarAmigoFrame.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnAgregarAmigoFrame.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAmigoFrame.setText("Agregar");
        btnAgregarAmigoFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAmigoFrameActionPerformed(evt);
            }
        });
        AgregarAmigo.add(btnAgregarAmigoFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jPanel1.add(AgregarAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 450));

        PagarPlan.setBackground(new java.awt.Color(255, 153, 255));
        PagarPlan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PAGAR PLAN");
        PagarPlan.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Mensajitos:");
        PagarPlan.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Número de Telefono:");
        PagarPlan.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Minutos Consumidos:");
        PagarPlan.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtMensajes.setBackground(new java.awt.Color(255, 255, 255));
        txtMensajes.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        txtMensajes.setForeground(new java.awt.Color(0, 0, 0));
        PagarPlan.add(txtMensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 230, -1));

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtNumero.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        PagarPlan.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 230, -1));

        txtMinutos.setBackground(new java.awt.Color(255, 255, 255));
        txtMinutos.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        txtMinutos.setForeground(new java.awt.Color(0, 0, 0));
        PagarPlan.add(txtMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 230, -1));

        btnRegresarMenu2.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresarMenu2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnRegresarMenu2.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarMenu2.setText("REGRESAR");
        btnRegresarMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenu2ActionPerformed(evt);
            }
        });
        PagarPlan.add(btnRegresarMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 130, -1));

        btnPagarPlanFrame.setBackground(new java.awt.Color(0, 0, 0));
        btnPagarPlanFrame.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnPagarPlanFrame.setForeground(new java.awt.Color(255, 255, 255));
        btnPagarPlanFrame.setText("PAGAR");
        btnPagarPlanFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarPlanFrameActionPerformed(evt);
            }
        });
        PagarPlan.add(btnPagarPlanFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 240, 130, -1));

        jPanel1.add(PagarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 450));

        AgregarPlan.setBackground(new java.awt.Color(255, 153, 255));
        AgregarPlan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("AGREGAR PLAN");
        AgregarPlan.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Si es Tipo iPhone ingresar el email de iTunes, ");
        AgregarPlan.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 280, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Si es Tipo Samsung ingresar el pin telefonico.");
        AgregarPlan.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 270, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo:");
        AgregarPlan.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Número de Telefono:");
        AgregarPlan.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre del Cliente:");
        AgregarPlan.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Email o Pin:");
        AgregarPlan.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtExtra.setBackground(new java.awt.Color(255, 255, 255));
        txtExtra.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        txtExtra.setForeground(new java.awt.Color(0, 0, 0));
        AgregarPlan.add(txtExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 220, -1));

        txtNumTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtNumTelefono.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        txtNumTelefono.setForeground(new java.awt.Color(0, 0, 0));
        AgregarPlan.add(txtNumTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 250, -1));

        txtCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCliente.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(0, 0, 0));
        AgregarPlan.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 250, -1));

        TipoBox.setBackground(new java.awt.Color(255, 255, 255));
        TipoBox.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        TipoBox.setForeground(new java.awt.Color(0, 0, 0));
        TipoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IPHONE", "SAMSUNG" }));
        AgregarPlan.add(TipoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, -1));

        btnRegresarMenu1.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresarMenu1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnRegresarMenu1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarMenu1.setText("Regresar");
        btnRegresarMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenu1ActionPerformed(evt);
            }
        });
        AgregarPlan.add(btnRegresarMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 110, -1));

        btnAgregarPlanFrame.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarPlanFrame.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnAgregarPlanFrame.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarPlanFrame.setText("Agregar");
        btnAgregarPlanFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPlanFrameActionPerformed(evt);
            }
        });
        AgregarPlan.add(btnAgregarPlanFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 230, 110, -1));

        jPanel1.add(AgregarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 450));

        Menu.setBackground(new java.awt.Color(255, 153, 255));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MENU");
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        btnAgregarPlan.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarPlan.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnAgregarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarPlan.setText("Agregar Plan");
        btnAgregarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPlanActionPerformed(evt);
            }
        });
        Menu.add(btnAgregarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 221, 41));

        btnPagarPlan.setBackground(new java.awt.Color(0, 0, 0));
        btnPagarPlan.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnPagarPlan.setForeground(new java.awt.Color(255, 255, 255));
        btnPagarPlan.setText("Pagar Plan");
        btnPagarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarPlanActionPerformed(evt);
            }
        });
        Menu.add(btnPagarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 221, 41));

        btnAgregarAmigo.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarAmigo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnAgregarAmigo.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAmigo.setText("Agregar Amigo");
        btnAgregarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAmigoActionPerformed(evt);
            }
        });
        Menu.add(btnAgregarAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 221, 41));

        btnListar.setBackground(new java.awt.Color(0, 0, 0));
        btnListar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        Menu.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 221, 41));

        Salir.setBackground(new java.awt.Color(0, 0, 0));
        Salir.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("SALIR");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        Menu.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 37, -1));

        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPlanActionPerformed
        Menu.setVisible(false);
        AgregarPlan.setVisible(true);
    }//GEN-LAST:event_btnAgregarPlanActionPerformed

    private void btnPagarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarPlanActionPerformed
        Menu.setVisible(false);
        PagarPlan.setVisible(true);
    }//GEN-LAST:event_btnPagarPlanActionPerformed

    private void btnAgregarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAmigoActionPerformed
        Menu.setVisible(false);
        AgregarAmigo.setVisible(true);
    }//GEN-LAST:event_btnAgregarAmigoActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        Menu.setVisible(false);
        Listado.setVisible(true);
        txtAreaListado.setText(tigo.lista());
    }//GEN-LAST:event_btnListarActionPerformed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void btnRegresarMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenu1ActionPerformed
        AgregarPlan.setVisible(false);
        txtExtra.setText("");
        txtNumTelefono.setText("");
        txtCliente.setText("");
        TipoBox.setSelectedIndex(0);
        Menu.setVisible(true);
    }//GEN-LAST:event_btnRegresarMenu1ActionPerformed

    private void btnAgregarPlanFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPlanFrameActionPerformed
        int numero=Integer.parseInt(txtNumTelefono.getText());
        String nombre=txtCliente.getText();
        String extra=txtExtra.getText();
        String tipo=TipoBox.getSelectedItem().toString();
        tigo.agregarPlan(numero, nombre, extra, tipo);
        //tigo.lista();
        
        txtExtra.setText("");
        txtNumTelefono.setText("");
        txtCliente.setText("");
        TipoBox.setSelectedIndex(0);
    }//GEN-LAST:event_btnAgregarPlanFrameActionPerformed

    private void btnRegresarMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenu2ActionPerformed
        PagarPlan.setVisible(false);
        txtNumero.setText("");
        txtMinutos.setText("");
        txtMensajes.setText("");
        Menu.setVisible(true);
    }//GEN-LAST:event_btnRegresarMenu2ActionPerformed

    private void btnPagarPlanFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarPlanFrameActionPerformed
        int numero=Integer.parseInt(txtNumero.getText());
        int minutos=Integer.parseInt(txtMinutos.getText());
        int mensajes=Integer.parseInt(txtMensajes.getText());
        double pago;
        pago=tigo.pagoPlan(numero, minutos, mensajes);
        JOptionPane.showMessageDialog(null, "Pago mensual del Plan: $"+pago, "PAGAR PLAN", JOptionPane.INFORMATION_MESSAGE);
        txtNumero.setText("");
        txtMinutos.setText("");
        txtMensajes.setText("");  
        //tigo.lista();
    }//GEN-LAST:event_btnPagarPlanFrameActionPerformed

    private void btnRegresarMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenu3ActionPerformed
        AgregarAmigo.setVisible(false);
        txtNum.setText("");
        txtPin.setText("");
        Menu.setVisible(true);
    }//GEN-LAST:event_btnRegresarMenu3ActionPerformed

    private void btnAgregarAmigoFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAmigoFrameActionPerformed
        int numero=Integer.parseInt(txtNum.getText());
        String pin=txtPin.getText();
        tigo.agregarAmigo(numero, pin);
        txtNum.setText("");
        txtPin.setText("");
    }//GEN-LAST:event_btnAgregarAmigoFrameActionPerformed

    private void btnRegresarMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenu4ActionPerformed
        Listado.setVisible(false);
        Menu.setVisible(true);
    }//GEN-LAST:event_btnRegresarMenu4ActionPerformed

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
            java.util.logging.Logger.getLogger(PlanSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarAmigo;
    private javax.swing.JPanel AgregarPlan;
    private javax.swing.JPanel Listado;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel PagarPlan;
    private javax.swing.JLabel Salir;
    private javax.swing.JComboBox<String> TipoBox;
    private javax.swing.JButton btnAgregarAmigo;
    private javax.swing.JButton btnAgregarAmigoFrame;
    private javax.swing.JButton btnAgregarPlan;
    private javax.swing.JButton btnAgregarPlanFrame;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnPagarPlan;
    private javax.swing.JButton btnPagarPlanFrame;
    private javax.swing.JButton btnRegresarMenu1;
    private javax.swing.JButton btnRegresarMenu2;
    private javax.swing.JButton btnRegresarMenu3;
    private javax.swing.JButton btnRegresarMenu4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaListado;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtExtra;
    private javax.swing.JTextField txtMensajes;
    private javax.swing.JTextField txtMinutos;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtNumTelefono;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPin;
    // End of variables declaration//GEN-END:variables
}
