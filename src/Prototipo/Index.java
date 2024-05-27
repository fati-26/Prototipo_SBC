package Prototipo;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Index extends javax.swing.JFrame {
boolean f = false;

    public Index() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        btnIniciaTest.setVisible(false);
        btnRegresar.setVisible(false);
        btnRegresar1.setVisible(false);
        Inicio inicio= new Inicio();
        inicio.setSize(1170, 600);
        Panel_Index.removeAll();
        Panel_Index.add(inicio, BorderLayout.CENTER);
        Panel_Index.revalidate();
        Panel_Index.repaint();
        jPanelLinea2.setVisible(false);
        
        
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPFondo = new javax.swing.JPanel();
        Panel_Index = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btnTest = new javax.swing.JButton();
        btnIniciaTest = new javax.swing.JButton();
        jPanelLinea2 = new javax.swing.JPanel();
        jPanelLinea1 = new javax.swing.JPanel();
        btnInfo = new javax.swing.JButton();
        btnEsp = new javax.swing.JButton();
        btnRegresar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setLocation(new java.awt.Point(0, 10));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setName("FInicio"); // NOI18N
        setSize(new java.awt.Dimension(1200, 650));

        jPFondo.setBackground(new java.awt.Color(163, 177, 138));
        jPFondo.setPreferredSize(new java.awt.Dimension(1200, 650));
        jPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Index.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel_IndexLayout = new javax.swing.GroupLayout(Panel_Index);
        Panel_Index.setLayout(Panel_IndexLayout);
        Panel_IndexLayout.setHorizontalGroup(
            Panel_IndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        Panel_IndexLayout.setVerticalGroup(
            Panel_IndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPFondo.add(Panel_Index, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1170, 530));

        btnRegresar.setBackground(new java.awt.Color(192, 189, 44));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.setFocusPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 170, 40));

        btnTest.setBackground(new java.awt.Color(192, 189, 44));
        btnTest.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTest.setForeground(new java.awt.Color(0, 0, 0));
        btnTest.setText("TEST");
        btnTest.setFocusPainted(false);
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });
        jPFondo.add(btnTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 170, 40));

        btnIniciaTest.setBackground(new java.awt.Color(192, 189, 44));
        btnIniciaTest.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIniciaTest.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciaTest.setText("INICIAR");
        btnIniciaTest.setFocusPainted(false);
        btnIniciaTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciaTestActionPerformed(evt);
            }
        });
        jPFondo.add(btnIniciaTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 170, 40));

        jPanelLinea2.setBackground(new java.awt.Color(192, 189, 44));

        javax.swing.GroupLayout jPanelLinea2Layout = new javax.swing.GroupLayout(jPanelLinea2);
        jPanelLinea2.setLayout(jPanelLinea2Layout);
        jPanelLinea2Layout.setHorizontalGroup(
            jPanelLinea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanelLinea2Layout.setVerticalGroup(
            jPanelLinea2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPFondo.add(jPanelLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 10));

        jPanelLinea1.setBackground(new java.awt.Color(192, 189, 44));

        javax.swing.GroupLayout jPanelLinea1Layout = new javax.swing.GroupLayout(jPanelLinea1);
        jPanelLinea1.setLayout(jPanelLinea1Layout);
        jPanelLinea1Layout.setHorizontalGroup(
            jPanelLinea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanelLinea1Layout.setVerticalGroup(
            jPanelLinea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPFondo.add(jPanelLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, -1, 10));

        btnInfo.setBackground(new java.awt.Color(192, 189, 44));
        btnInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(0, 0, 0));
        btnInfo.setText("INFORMACIÓN");
        btnInfo.setFocusPainted(false);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        jPFondo.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 170, 40));

        btnEsp.setBackground(new java.awt.Color(192, 189, 44));
        btnEsp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEsp.setForeground(new java.awt.Color(0, 0, 0));
        btnEsp.setText("ESPECIALISTAS");
        btnEsp.setFocusPainted(false);
        btnEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspActionPerformed(evt);
            }
        });
        jPFondo.add(btnEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 170, 40));

        btnRegresar1.setBackground(new java.awt.Color(192, 189, 44));
        btnRegresar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegresar1.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar1.setText("REGRESAR");
        btnRegresar1.setFocusPainted(false);
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });
        jPFondo.add(btnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 170, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Ver más");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPFondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 220, 25));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("Ver más");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPFondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 220, 25));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setText("Ver más");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPFondo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 220, 25));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 255));
        jButton4.setText("Ver más");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPFondo.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, 220, 25));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 255));
        jButton5.setText("Ver más");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPFondo.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, 220, 25));

        getContentPane().add(jPFondo, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        f = false;
        Inicio inicio = new Inicio();
        ShowPanel(inicio);
        btnTest.setVisible(true);
        btnRegresar.setVisible(false);
        btnEsp.setVisible(true);
        btnInfo.setVisible(true);
        btnIniciaTest.setVisible(false);  
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        Test test = new Test();
        ShowPanel(test);
        btnRegresar.setVisible(true);
        btnRegresar1.setVisible(true);
        btnIniciaTest.setVisible(true);
        btnEsp.setVisible(false);
        jPanelLinea1.setVisible(false);
        jPanelLinea2.setVisible(true);
    }//GEN-LAST:event_btnTestActionPerformed

    private void btnIniciaTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciaTestActionPerformed
        Question q = new Question();
        q.setVisible(true);
        btnRegresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIniciaTestActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        Informacion info = new Informacion();
        ShowPanel(info);
        
        f = true;
        
        btnRegresar.setVisible(true);
        //btnRegresar1.setVisible(true);
        btnTest.setVisible(false);
        btnEsp.setVisible(false);
        btnInfo.setVisible(false);
        jPanelLinea1.setVisible(false);
        jPanelLinea2.setVisible(false);
        
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspActionPerformed
        Especialistas esp = new Especialistas();
        ShowPanel(esp);
        btnRegresar.setVisible(true);
        btnTest.setVisible(false);
        btnEsp.setVisible(false);
        btnInfo.setVisible(false);
        jPanelLinea1.setVisible(false);
        jPanelLinea2.setVisible(false);
        
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
    }//GEN-LAST:event_btnEspActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
       if (f == true) {
            Informacion info = new Informacion();
        ShowPanel(info);
        } else {
            Especialistas i= new Especialistas();
        ShowPanel(i);
        }   
        
        btnRegresar.setVisible(true);
        btnRegresar1.setVisible(false);
        btnTest.setVisible(false);
        btnEsp.setVisible(false);
        btnInfo.setVisible(false);
        jPanelLinea1.setVisible(false);
        jPanelLinea2.setVisible(false);
        
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
    }//GEN-LAST:event_btnRegresar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (f == true) {
            Ansiedad i= new Ansiedad();
        ShowPanel(i);
        } else {
            Especialista1 i= new Especialista1();
        ShowPanel(i);
        }        
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        btnRegresar.setVisible(false);
        btnRegresar1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (f == true) {
            Depresion i= new Depresion();
        ShowPanel(i);
        } else {
            Especialista2 i= new Especialista2();
            ShowPanel(i);
        }    
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        btnRegresar.setVisible(false);
        btnRegresar1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (f == true) {
            Bipolar i= new Bipolar();
        ShowPanel(i);
        } else {
            Especialista3 i= new Especialista3();
            ShowPanel(i);
        } 
        
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        btnRegresar.setVisible(false);
        btnRegresar1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (f == true) {
           Esquizofrenia i= new Esquizofrenia();
        ShowPanel(i);
        } else {
            Especialista4 i= new Especialista4();
            ShowPanel(i);
        } 
       
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        btnRegresar.setVisible(false);
        btnRegresar1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (f == true) {
            TDAH i= new TDAH();
        ShowPanel(i);
        } else {
            Especialista5 i= new Especialista5();
            ShowPanel(i);
        } 
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        btnRegresar.setVisible(false);
        btnRegresar1.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void ShowPanel(JPanel p){
        p.setSize(1170, 570);
        Panel_Index.removeAll();
        Panel_Index.add(p, BorderLayout.CENTER);
        Panel_Index.revalidate();
        Panel_Index.repaint();
        
        
    }
    
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Panel_Index;
    public javax.swing.JButton btnEsp;
    public javax.swing.JButton btnInfo;
    public javax.swing.JButton btnIniciaTest;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnRegresar1;
    public javax.swing.JButton btnTest;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPFondo;
    public javax.swing.JPanel jPanelLinea1;
    public javax.swing.JPanel jPanelLinea2;
    // End of variables declaration//GEN-END:variables
}
