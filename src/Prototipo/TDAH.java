
package Prototipo;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class TDAH extends javax.swing.JPanel {

    /**
     * Creates new form Test
     */
    public TDAH() {
        initComponents();
        
        jTdah.setSize(280, 420);
        rsscalelabel.RSScaleLabel.setScaleLabel(jTdah, "src/img/TDAH.jpeg");
        jLabelTdah.setText(StrToHtml("<p class=\"Info\">El déficit de atención es un trastorno neuroconductual que provoca desórdenes en el comportamiento  derivados de una falta de atención apropiada y/o\n" +
"                             hiperactividad e impulsividad, es un desorden psicológico que abarca una amalgama de dificultades persistentes, tales como problemas para concentrarse, exceso de \n" +
"                             actividad y comportamiento precipitado. El TIEA en la edad adulta puede desencadenar relaciones inestables, bajo rendimiento laboral o académico, falta de confianza\n" +
"                              en uno mismo y otros dilemas. A pesar de denominarse TIEA en adultos, los indicios se manifiestan desde la niñez temprana y se prolongan hasta la edad adulta.\n" +
"                               En ciertos casos, el TIEA no se identifica ni se diagnostica hasta la edad adulta. Los signos del TIEA en adultos pueden no ser tan evidentes como los síntomas en\n" +
"                                los niños. En los adultos, la hiperactividad puede disminuir, aunque persisten los inconvenientes con la impulsividad, la intranquilidad y la incapacidad para\n" +
"                                 concentrarse.</p>\n" +
"                        \n" +
"                        <br>\n" +
"                        <p class=\"Causas\"><b>Causas</b></p>\n" +
"                        <p class=\"Causas\">La causa precisa del trastorno de atención e hiperactividad no está totalmente esclarecida, las investigaciones prosiguen.\n" +
"                             Estos son algunos de los aspectos que podrían estar implicados en el desarrollo del trastorno de atención e hiperactividad:</p>\n" +
"                        <ul>\n" +
"                            <li><u>La genética:</u> Se sugiere que el trastorno de atención e hiperactividad podría tener una base hereditaria, y los análisis señalan que los genes podrían\n" +
"                                 desempeñar un papel. </li>\n" +
"                            \n" +
"                            <li><u>El Ambiente:</u> Algunos elementos ambientales también podrían incrementar el riesgo, como la exposición al plomo durante la niñez. </li>\n" +
"\n" +
"                            <li><u>Desafios durante el crecimiento:</u> Dificultades en el sistema nervioso central en etapas críticas del desarrollo podrían influir en el trastorno.</li>\n" +
"                        </ul>\n" +
"\n" +
"                        <br>\n" +
"                        <p class=\"Sintomas\"><b>Sintomas</b></p>\n" +
"                        \n" +
"                        <ul>\n" +
"                            <li>Dificultades en el aprendizaje</li>\n" +
"                            <li>Falta de atención.  Falta de atención persistente o distracción frecuente, lo que dificulta la concentración en tareas específicas o mantener el enfoque en actividades durante períodos prolongados. </li>\n" +
"                            <li>Dificultad para concentrarse.</li>\n" +
"                            <li>Olvidar cosas: Olvidar cosas fácilmente, ya sean tareas pendientes, compromisos o detalles importantes, puede ser otro síntoma común del trastorno por déficit de atención/hiperactividad.</li>\n" +
"                            <li>Escazas habilidades para organizar el tiempo</li>\n" +
"                           <li>Cambios repentinos de humor </li>\n" +
"                        </ul>\n" +
"                        \n" +
"                        <br>\n" +
"                        <p class=\"Tratamiento\"><b>Tratamiento</b></p>\n" +
"                        <ul>\n" +
"                            <li><u>Medicamentos:</u> El tipo de medicamentos que se usa con más frecuencia para el trastorno de déficit de atención con hiperactividad son los estimulantes.</li>\n" +
"\n" +
"                            <li><u>Psicoterapia e intervenciones psicosociales:</u> Existen varias intervenciones psicosociales que han mostrado que ayudan a los niños y sus familias a controlar los síntomas y mejorar el \n" +
"                                funcionamiento diario.</li>\n" +
"\n" +
"                            <li><u>Educación y apoyo para padres de familia:</u> Los profesionales de la salud mental pueden educar a los padres de un niño con trastorno de déficit de atención \n" +
"                                con hiperactividad sobre el mismo y cómo afecta a la familia. </li>\n" +
"\n" +
"                            <li><u>Programas escolares:</u> Por lo general, los niños y los adolescentes con trastorno de déficit de atención con hiperactividad se benefician de las\n" +
"                                 intervenciones conductuales en el aula de o adaptaciones académicas </li>\n" +
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
        jTdah = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLinea = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelTdah = new javax.swing.JLabel();

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

        jTdah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/TDAH.jpeg"))); // NOI18N
        jFondo.add(jTdah, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 300, 420));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TDAH");
        jFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLinea.setBackground(new java.awt.Color(192, 189, 44));
        jFondo.add(jLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 10));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTdah.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTdah.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(jLabelTdah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 990));

        jScrollPane1.setViewportView(jPanel1);

        jFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 820, 440));

        add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 545));
    }// </editor-fold>//GEN-END:initComponents
 private void ShowPanel(JPanel p){
        p.setSize(1170, 410);
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel jFondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTdah;
    private javax.swing.JPanel jLinea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTdah;
    // End of variables declaration//GEN-END:variables
}
