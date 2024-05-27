
package Prototipo;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Depresion extends javax.swing.JPanel {

    /**
     * Creates new form Test
     */
    public Depresion() {
        initComponents();
        
        jDepresion.setSize(300, 420);
        rsscalelabel.RSScaleLabel.setScaleLabel(jDepresion, "src/img/Depresion.jpg");
        jLabelDepresion.setText(StrToHtml("<p class=\"Info\">La causa precisa es desconocida, pero posiblemente está relacionada con la genética, modificaciones en los niveles de neurotransmisores, \n" +
"                                una perturbación en la actividad neuroendocrina y aspectos psicosociales. El diagnóstico se fundamenta en la historia clínica. En la terapia se emplean \n" +
"                                medicamentos, psicoterapia o ambos y ocasionalmente terapia electroconvulsiva o estimulación magnética transcraneal rápida (rEMT).</p>\n" +
"                            \n" +
"                            <br>\n" +
"                            <p class=\"Causas\"><b>Causas</b></p>\n" +
"                            <ul>\n" +
"                                <li><u>Discrepancias biológicas:</u> Individuos con depresión experimentan alteraciones físicas en el cerebro. La relevancia de tales cambios \n" +
"                                    aún permanece ambigua, pero con el transcurso del tiempo podrían contribuir a discernir las causas.</li>\n" +
"                                  \n" +
"                                <li><u>Quimica Cerebral:</u> Los neurotransmisores constituyen compuestos químicos endógenos en el cerebro y presumiblemente ejercen un papel \n" +
"                                    en la depresión.  </li>\n" +
"                              \n" +
"                                <li><u>Hormonal:</u> Los desajustes en el equilibrio hormonal corporal podrían estar relacionados con el origen o desencadenamiento de la depresión.\n" +
"                                     Las fluctuaciones hormonales pueden surgir durante el embarazo y en las semanas o meses posteriores al parto (posparto), así como por trastornos de \n" +
"                                     la tiroides, menopausia u otros trastornos. </li>\n" +
"                               \n" +
"                                <li><u>Caracteristicas Geneticas:</u> La depresión es más prevalente en individuos cuyos familiares directos también padecen este trastorno. \n" +
"                                    Los investigadores están investigando los genes que podrían influir en el desarrollo de la depresión. </li>\n" +
"                            </ul>\n" +
"\n" +
"                            <br>\n" +
"                            <p class=\"Sintomas\"><b>Sintomas</b></p>\n" +
"                            <ul>\n" +
"                                <li>Pérdida de interés o placer por la mayoría de las actividades habituales o todas, como las relaciones sexuales, los pasatiempos o los deportes</li>\n" +
"                                <li>Sentimientos de culpa o importencia</li>\n" +
"                                <li>Irritabilidad</li>\n" +
"                                <li>Tendencias Suicidad</li>\n" +
"                                <li>Malos habitos de sueño</li>\n" +
"                            </ul>\n" +
"                            \n" +
"                            <br>\n" +
"                            <p class=\"Tratamiento\"><b>Tratamiento</b></p>\n" +
"                            <ul>\n" +
"                                <li><u>Tratamiento farmacologico con antidepresivos:</u> Los antidepresivos se utilizan para corregir desequilibrios en los niveles de las sustancias químicas\n" +
"                                     del cerebro, especialmente la serotonina, un químico cerebral que transmite mensajes en el área del cerebro que controla las emociones, la temperatura \n" +
"                                     corporal, el apetito, los niveles hormonales el sueño y la presión sanguínea.</li>\n" +
"\n" +
"                                <li><u>Psicoterapia:</u> Ofrece seguridad, confianza, comprensión y apoyo emocional; se intentan corregir los pensamientos distorsionados; \n" +
"                                    se explica el carácter temporal y se desdramatiza la situación; se consigue la participación del paciente en el proceso curativo y, por último,\n" +
"                                     se enseña a prever las posibles recaídas. Los tratamientos psicológicos eficaces contra la depresión incluyen:</li>\n" +
"                                     <ol>\n" +
"                                        <li>La activación conductual</li>\n" +
"                                        <li>La terapia cognitiva conductual</li>\n" +
"                                        <li>La psicoterapia personal</li>\n" +
"                                        <li>Terapia de resolucion de problemas</li>\n" +
"                                     </ol>\n" +
"                                    </ul>"
        
        
        
        ));
    
        
    }
    
public String StrToHtml(String texto){
        return "<html><p>" + texto + "</p></html>";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFondo = new javax.swing.JPanel();
        jDepresion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLinea = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelDepresion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(163, 177, 138));
        setMaximumSize(new java.awt.Dimension(1170, 570));
        setMinimumSize(new java.awt.Dimension(1170, 570));
        setPreferredSize(new java.awt.Dimension(1170, 5745));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jFondo.setBackground(new java.awt.Color(163, 177, 138));
        jFondo.setMinimumSize(new java.awt.Dimension(1170, 545));
        jFondo.setOpaque(false);
        jFondo.setPreferredSize(new java.awt.Dimension(1170, 545));
        jFondo.setVerifyInputWhenFocusTarget(false);
        jFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDepresion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Depresion.jpg"))); // NOI18N
        jFondo.add(jDepresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 300, 420));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DEPRESIÓN");
        jFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLinea.setBackground(new java.awt.Color(192, 189, 44));
        jFondo.add(jLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 10));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDepresion.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDepresion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jLabelDepresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 990));

        jScrollPane1.setViewportView(jPanel1);

        jFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 820, 440));

        add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 545));
    }// </editor-fold>//GEN-END:initComponents
 private void ShowPanel(JPanel p){
        p.setSize(1170, 410);
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jDepresion;
    public javax.swing.JPanel jFondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDepresion;
    private javax.swing.JPanel jLinea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
