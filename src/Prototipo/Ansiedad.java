package Prototipo;

import javax.swing.JPanel;

public class Ansiedad extends javax.swing.JPanel {

    /**
     * Creates new form Test
     */
    public Ansiedad() {
        initComponents();
        jLabelAnsiedad.setText(StrToHtml("<p class=\"Info\">Esta emoción desencadena una activación intensa tanto del sistema" +
"                                 nervioso central como del cuerpo en su conjunto, manifestándose cuando enfrentamos situaciones que exigen un gran \n" +
"                                 esfuerzo o persistencia. Su propósito es ponernos en estado de alerta y prepararnos para responder a amenazas o \n" +
"                                 peligros actuales o potenciales. Así, la ansiedad estimula varios sistemas corporales, preparándonos para actuar de\n" +
"                                 manera eficaz y rápida ante los desafíos.</p>\n" +
"                            \n" +
"                            <br>\n" +
"                            <p class=\"Causas\"><b>Causas</b></p>\n" +
"                            <ul>\n" +
"                                <li><u>Personalidad:</u> Una persona que es tímida o tiene un temperamento negativo o evita cualquier situación peligrosa \n" +
"                                    puede ser más propensa a padecer un trastorno de ansiedad generalizada que otras.</li>\n" +
"                                  \n" +
"                                <li><u>Genetica:</u> Este trastorno puede ser hereditario.  </li>\n" +
"                              \n" +
"                                <li><u>Experiencias:</u> Es posible que las personas con trastorno de ansiedad tengan antecedentes significativos de cambios\n" +
"                                    de vida, experiencias negativas o traumáticas durante la infancia, o un suceso negativo o traumático reciente. </li>\n" +
"                               \n" +
"                                <li><u>Uso de medicamentos:</u> Hay medicamentos que pueden causar o aumentar la ansiedad, sobre todo, aquellos utilizados para tratar\n" +
"                                    enfermedades mentales o infecciones bacterianas    </li>\n" +
"                                                       \n" +
"                                <li><u>Consumo de alcohol y drogas:</u> Las sustancias adictivas cambian la percepción y el pensamiento, lo que puede producir miedos que conlleven \n" +
"                                    a la ansiedad o depresión.</li>\n" +
"\n" +
"                                <li><u>Estilo de Crianza:</u> También hay factores relacionados con el estilo de crianza que pueden generar una \n" +
"                                    predisposición a desarrollar un trastorno de ansiedad.</li>      \n" +
"                            </ul>\n" +
"\n" +
"                            <br>\n" +
"                            <p class=\"Sintomas\"><b>Sintomas</b></p>\n" +
"                            <ul>\n" +
"                                <li>Sensación de nerviosismo, agitación o tensión</li>\n" +
"                                <li>Aumento del ritmo cardíaco</li>\n" +
"                                <li>Sensación de debilidad o cansancio</li>\n" +
"                                <li>Tener problemas para conciliar el sueño</li>\n" +
"                                <li>Sudoración y Temblores</li>\n" +
"                            </ul>\n" +
"                            \n" +
"                            <br>\n" +
"                            <p class=\"Tratamiento\"><b>Tratamiento</b></p>\n" +
"                            <ul>\n" +
"                                <li><u>Pide ayuda enseguida:</u> La ansiedad, al igual que muchos otros trastornos mentales, puede ser más difícil de\n" +
"                                     tratar si no buscas ayuda de inmediato.</li>\n" +
"\n" +
"                                <li><u>Evita el consumo de sustancias no saludables:</u> El consumo de alcohol y drogas, e incluso de nicotina o cafeína, puede provocar ansiedad \n" +
"                                    o empeorarla. Si tienes una adicción a estas sustancias, dejarlas puede provocarte ansiedad.</li>\n" +
"\n" +
"                                <li><u>Realizarte un examen psicológico: </u> Esto implica hablar sobre tus pensamientos, sentimientos y \n" +
"                                    comportamientos para ayudar a identificar un diagnóstico y detectar las complicaciones relacionadas.</li>\n" +
"\n" +
"                                <li><u>Psicoterapia:</u> También conocida como terapia del habla o asesoramiento psicológico, la psicoterapia incluye el \n" +
"                                    trabajo con un terapeuta para reducir los síntomas de ansiedad</li>\n" +
"                                \n" +
"                                <li><u>Usa técnicas de control del estrés y de relajación: </u>Las técnicas de visualización, la meditación y el yoga son\n" +
"                                     ejemplos de técnicas de relajación que pueden aliviar la ansiedad</li>\n" +
"\n" +
"                               <li><u>Permanece activo físicamente</u> Desarrolla una rutina para estar activo físicamente la mayoría de los días de la semana.\n" +
"                                 El ejercicio es una herramienta muy potente para reducir el estrés. Puede mejorar tu estado de ánimo y ayudarte a estar saludable.</li>\n" +
"                            </ul>"
        
        
        
        ));
    
        
    }
    
public static String StrToHtml(String texto){
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
        jAnsiedad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLinea = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelAnsiedad = new javax.swing.JLabel();

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

        jAnsiedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ansiedad.jpg"))); // NOI18N
        jFondo.add(jAnsiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 300, 420));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ANSIEDAD");
        jFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLinea.setBackground(new java.awt.Color(192, 189, 44));
        jFondo.add(jLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 10));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAnsiedad.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAnsiedad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jLabelAnsiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 990));

        jScrollPane1.setViewportView(jPanel1);

        jFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 820, 440));

        add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 545));
    }// </editor-fold>//GEN-END:initComponents
 private void ShowPanel(JPanel p){
        p.setSize(1170, 410);
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAnsiedad;
    public javax.swing.JPanel jFondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAnsiedad;
    private javax.swing.JPanel jLinea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
