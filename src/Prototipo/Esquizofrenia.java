
package Prototipo;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Esquizofrenia extends javax.swing.JPanel {

    /**
     * Creates new form Test
     */
    public Esquizofrenia() {
        initComponents();
        
        jEsquizofrenia.setSize(280, 420);
        rsscalelabel.RSScaleLabel.setScaleLabel(jEsquizofrenia, "src/img/Esquizofrenia.jpeg");
        jLabelEsquizofrenia.setText(StrToHtml("<p class=\"Info\">Este trastorno se manifiesta a través de una serie de síntomas perturbadores, como son las alucinaciones auditivas o visuales, creencias \n" +
"                            delirantes firmemente arraigadas y alteraciones significativas en el flujo del pensamiento y la conducta. Estas manifestaciones pueden interferir de\n" +
"                             manera profunda con la capacidad de la persona para llevar a cabo sus actividades cotidianas, llegando incluso a ser discapacitantes.\n" +
"                            Para aquellos diagnosticados con esquizofrenia, es fundamental iniciar un régimen de tratamiento lo antes posible. Un abordaje terapéutico precoz puede ser \n" +
"                            crucial para manejar los síntomas de manera efectiva, previniendo el empeoramiento de la condición y posibles complicaciones que puedan surgir a largo plazo.\n" +
"                             Al adherirse a un plan de tratamiento continuo, diseñado a medida por profesionales de la salud, los pacientes pueden experimentar una mejora significativa en\n" +
"                              su calidad de vida, lo que a su vez, puede influir positivamente en su pronóstico futuro.</p>\n" +
"                        \n" +
"                        <br>\n" +
"                        <p class=\"Causas\"><b>Causas</b></p>\n" +
"                        <ul>\n" +
"                            <li><u>Genética:</u> Esto quiere decir que la esquizofrenia se puede trasmitir a veces por la familia pero hay otros factores que sugieren que por varios genes \n" +
"                                pueden aumentar la probabilidad que un individuo desarrolle esquizofrenia. </li>\n" +
"                            \n" +
"                            <li><u>Ambiente:</u> La investigación indica que los aspectos de los entornos pueden ser muy decisivos al momento de que se desarrolle esquizofrenia, si el ambiente es muy hostil. </li>\n" +
"\n" +
"                            <li><u>Estructura y funciones del cerebro: </u> En la investigación indica que hay más probabilidad que las personas tengan diferencias en algunas áreas del cerebro y \n" +
"                                sus conexiones, esto genera un desarrollo temprano de la esquizofrenia. </li>\n" +
"                        </ul>\n" +
"\n" +
"                        <br>\n" +
"                        <p class=\"Sintomas\"><b>Sintomas</b></p>\n" +
"                        <ul>\n" +
"                            <li>Delirios: ideas erróneas de las que el paciente está convencido. Por ejemplo, «creer que todo el mundo está contra él o que tratan de perjudicarle».</li>\n" +
"                            <li>Alucinaciones: percibir algo que no existe. Por ejemplo, oír voces o ver objetos o caras que no están.</li>\n" +
"                            <li>Trastornos del pensamiento: el lenguaje del paciente se hace incomprensible y se altera la fluidez.</li>\n" +
"                            <li>Alteración de la sensación sobre sí mismo: la persona siente que su cuerpo está cambiando, se ve a sí mismo como raro.</li>\n" +
"                            <li>Deterioro de las emociones: la afectividad se va empobreciendo. Puede llegar a la ausencia de sentimientos. Los pacientes se muestran inexpresivos y se comportan con frialdad hacia los demás.</li>\n" +
"                           <li>Aislamiento: los pacientes se encierran en su mundo interior.</li>\n" +
"                        </ul>\n" +
"                        \n" +
"                        <br>\n" +
"                        <p class=\"Tratamiento\"><b>Tratamiento</b></p>\n" +
"                        <ul>\n" +
"                            <li><u>Medicamentos antipsicóticos:</u> Este tratamiento farmacológico es a base de medicamento que ayuda a controlar estos síntomas psicóticos\n" +
"                                 y que restaura la función de los neurotransmisores atacando especialmente el exceso de la dopamina.</li>\n" +
"\n" +
"                            <li><u>Psicoterapia:</u> Se busca la terapia psicológica para beneficiar al individuo que padece para comprender y manejar los síntomas, esto\n" +
"                                 mejorará el afrontamiento de la enfermedad, fortalecerá sus relaciones sociales y controlar el desbordamiento de emociones adyacentes.</li>\n" +
"\n" +
"                            <li><u>Cuidado médico continuo:</u> En este caso se deberá mantener el tratamiento del individuo de forma permanente, es de suma importancia que \n" +
"                                se lleve un control de su medicación y la intervención psicosocial aunque este controlada la enfermedad para el desarrollo de la vida del individuo. </li>\n" +
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
        jEsquizofrenia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLinea = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelEsquizofrenia = new javax.swing.JLabel();

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

        jEsquizofrenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Esquizofrenia.jpeg"))); // NOI18N
        jFondo.add(jEsquizofrenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 300, 420));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ESQUIZOFRENIA");
        jFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLinea.setBackground(new java.awt.Color(192, 189, 44));
        jFondo.add(jLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 10));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEsquizofrenia.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEsquizofrenia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jLabelEsquizofrenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 990));

        jScrollPane1.setViewportView(jPanel1);

        jFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 820, 440));

        add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 545));
    }// </editor-fold>//GEN-END:initComponents
 private void ShowPanel(JPanel p){
        p.setSize(1170, 410);
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jEsquizofrenia;
    public javax.swing.JPanel jFondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEsquizofrenia;
    private javax.swing.JPanel jLinea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
