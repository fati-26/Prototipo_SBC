
package Prototipo;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Bipolar extends javax.swing.JPanel {

    /**
     * Creates new form Test
     */
    public Bipolar() {
        initComponents();
        
        jBipolar.setSize(320, 420);
        rsscalelabel.RSScaleLabel.setScaleLabel(jBipolar, "src/img/Bipolar.jpg");
        jLabelBipolar.setText(StrToHtml("<p class=\"Info\">Esta condición se manifiesta a través de ciclos de manía o hipomanía y depresión, entremezclados con períodos de estabilidad emocional, aunque \n" +
"                            su intensidad y duración pueden diferir notablemente entre individuos.  Los episodios maníacos implican un aumento excesivo en el nivel de energía, euforia o \n" +
"                            \\irritabilidad extrema, mientras que los episodios depresivos se caracterizan por una profunda tristeza, falta de energía o interés, y en casos severos, \n" +
"                            pensamientos de autolesión o suicidio. La alternancia entre estos estados extremos afecta significativamente la capacidad del individuo para funcionar en su vida\n" +
"                             diaria, deteriorando sus relaciones personales, rendimiento laboral y su bienestar general.</p>\n" +
"                        \n" +
"                        <br>\n" +
"                        <p class=\"Causas\"><b>Causas</b></p>\n" +
"                        <ul>\n" +
"                            <li>Hoy en día, aún no se comprenden completamente las causas precisas detrás del desarrollo de un trastorno bipolar. Podría estar relacionado con \n" +
"                                alteraciones en el sistema nervioso o desequilibrios químicos cerebrales, aunque se piensa que múltiples factores están involucrados. \n" +
"                                Existen varios elementos que pueden elevar el riesgo de experimentar un trastorno bipolar: </li>\n" +
"                              <ol>\n" +
"                                <li>Tener un familiar cercano con trastorno afectivo bipolar puede aumentar el riesgo. </li>\n" +
"                                <li>Los acontecimientos estresantes, tales como la ruptura de una relación o una enfermedad física, pueden ocasionar un trastorno afectivo bipolar.</li>\n" +
"                                <li>Un desequilibrio quimico en el cerebro</li>\n" +
"                                <li>El consumo de alcohol y otros tóxicos como: cannabis, cocaína, drogas de diseño y el abuso de café </li>\n" +
"                                <li>Dormir menos de siete u ocho horas, lo que puede ser un indicador de que se está iniciando una fase de euforia y puede desencadenar un episodio.</li>\n" +
"                              </ol>\n" +
"                        </ul>\n" +
"\n" +
"                        <br>\n" +
"                        <p class=\"Sintomas\"><b>Sintomas</b></p>\n" +
"                        <ul>\n" +
"                            <li>Confusión de emociones</li>\n" +
"                            <li>Alucinaciones: ver o escuchar cosas que no estan presentes</li>\n" +
"                            <li>Delirios</li>\n" +
"                            <li>Animo mixto: Estás personas experimentan síntomas maníacos y depresión al mismo tiempo. Por ejemplo, pueden sentirse tristes, pero también tener mucha energía.</li>\n" +
"                            <li>Animo hipomaníaco: Los episodios maníacos pueden durar períodos largos, por ejemplo, unos meses. Esto puede dar lugar a agotamiento físico, gastos excesivos y\n" +
"                                 relaciones poco sensatas o inadecuada</li>\n" +
"                           <li>Fatiga</li>\n" +
"                        </ul>\n" +
"                        \n" +
"                        <p class=\"Tratamiento\"><b>Tratamiento</b></p>\n" +
"                        <ul>\n" +
"                            <li><u>Autoayuda:</u> Tomar nota de tus estados de ánimo en un diario para ese fin puede ayudarte a determinar la gravedad de los síntomas,\n" +
"                                 así como a reconocer el momento en que empiezan a volverse incontrolables. </li>\n" +
"\n" +
"                            <li><u>Antipsicóticos:</u> Si tienes un episodio maníaco, el médico pudiera recetarte un medicamento antipsicótico, por ejemplo, olanzapina o \n" +
"                                quetiapina, para tratar los síntomas a corto plazo, o antes de que se te administre un medicamento para estabilizar tu estado de ánimo. \n" +
"                                Los efectos secundarios de estos medicamentos incluyen aumento de peso y mareos. </li>\n" +
"\n" +
"                            <li><u>Terapias de conversación:</u> La terapia cognitivo-conductual es un tratamiento de conversación que ayuda a modificar la forma en que piensas,\n" +
"                                 sientes y te comportas. Esto puede ayudar a tratar los síntomas depresivos del trastorno afectivo bipolar. Hablar y reflexionar acerca del trastorno\n" +
"                                  afectivo bipolar con un consejero o un psicólogo puede evitar las recaídas. </li>\n" +
"                                </ul>"
        
        
        
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
        jBipolar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLinea = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelBipolar = new javax.swing.JLabel();

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

        jBipolar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Bipolar.jpg"))); // NOI18N
        jFondo.add(jBipolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 300, 420));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BIPOLARIDAD");
        jFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLinea.setBackground(new java.awt.Color(192, 189, 44));
        jFondo.add(jLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 10));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBipolar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBipolar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jLabelBipolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 990));

        jScrollPane1.setViewportView(jPanel1);

        jFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 820, 440));

        add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 545));
    }// </editor-fold>//GEN-END:initComponents
 private void ShowPanel(JPanel p){
        p.setSize(1170, 410);
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBipolar;
    public javax.swing.JPanel jFondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBipolar;
    private javax.swing.JPanel jLinea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
