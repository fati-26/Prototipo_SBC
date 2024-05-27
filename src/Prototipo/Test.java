package Prototipo;
public class Test extends javax.swing.JPanel {
      public Test() {
        initComponents();
        ImgTest.setSize(270, 370);
        rsscalelabel.RSScaleLabel.setScaleLabel(ImgTest, 
                "src/img/img2.jpg");       
        textoTest.setText(StrToHtml("Esta es una pequeña prueba que te "
                + "ayudará a determinar si sufres algún trastorno mental,"
                + "como Ansiedad, Depresión, Esquizofrenia, bipolaridad o TDAH."
                + "\nEsta prueba no proporciona un diagnóstico "
                + "definitivo, solo te brinda un resultado preliminar que "
                + "indica el porcentaje en que podrias presentar los "
                + "trastornos mencionados.\n Este test cuenta con 30 preguntas "
                + "que puden ser respondidas mediante las opciones "
                + "'Frecuentemente', 'Mucho', 'Poco', 'Leve' y 'Nada' y las "
                + "cuales te pedimos que respondas de manera honesta. "
                + "<p>Al finalizar el test, se mostrará una gráfica con los "
                + "resultados, si no se visualiza con color alguno de "
                + "los trastornos, es porque el porcentaje de que aparezca uno"
                + "o más trastornos es cero. </p> <p>Solo puedes "
                + "responder cada "
                + "pregunta una vez.</p>"));
    } 
public String StrToHtml(String texto){
        return "<html><p>" + texto + "</p></html>";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImgTest = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoTest = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(163, 177, 138));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(ImgTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 270, 370));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TEST");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        textoTest.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        textoTest.setForeground(new java.awt.Color(0, 0, 0));
        add(textoTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 740, 360));

        jPanel1.setBackground(new java.awt.Color(192, 189, 44));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 10));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgTest;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoTest;
    // End of variables declaration//GEN-END:variables
}
