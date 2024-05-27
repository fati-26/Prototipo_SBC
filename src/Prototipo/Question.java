package Prototipo;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Question extends javax.swing.JFrame {
float Bipolaridad = 0 ;float Esquizofrenia=0 ; float Depresion = 0 ; float TDH =0 ; float Ansiedad = 0;
float PBipolaridad = 0 ;float PEsquizofrenia=0 ; float PDepresion = 0 ; float PTDH =0 ; float PAnsiedad = 0;

    public float getPBipolaridad() {
        return PBipolaridad;
    }

    public void setPBipolaridad(float PBipolaridad) {
        this.PBipolaridad = PBipolaridad;
    }

    public float getPEsquizofrenia() {
        return PEsquizofrenia;
    }

    public void setPEsquizofrenia(float PEsquizofrenia) {
        this.PEsquizofrenia = PEsquizofrenia;
    }

    public float getPDepresion() {
        return PDepresion;
    }

    public void setPDepresion(float PDepresion) {
        this.PDepresion = PDepresion;
    }

    public float getPTDH() {
        return PTDH;
    }

    public void setPTDH(float PTDH) {
        this.PTDH = PTDH;
    }

    public float getPAnsiedad() {
        return PAnsiedad;
    }

    public void setPAnsiedad(float PAnsiedad) {
        this.PAnsiedad = PAnsiedad;
    }

boolean evento = false; boolean evento2 = false;boolean evento3 = false; boolean evento4 = false;boolean evento5 = false;
boolean evento6 = false; boolean evento7 = false;boolean evento8 = false; boolean evento9 = false;boolean evento10 = false;
boolean evento11 = false; boolean evento12 = false;boolean evento13 = false; boolean evento14 = false;boolean evento15 = false;
boolean evento16 = false; boolean evento17 = false;boolean evento18 = false; boolean evento19 = false;boolean evento20 = false;
boolean evento21 = false; boolean evento22 = false;boolean evento23 = false; boolean evento24 = false;boolean evento25 = false;
boolean evento26 = false; boolean evento27 = false;boolean evento28 = false; boolean evento29 = false;boolean evento30 = false;
String pathOp1 = "src/img/boton1.jpg";
    String pathOp2 = "src/img/boton2.jpg";
    Image image1 = Toolkit.getDefaultToolkit().getImage(pathOp1);
    Image image2 = Toolkit.getDefaultToolkit().getImage(pathOp2);
    ImageIcon icon1 = new ImageIcon(image1);
    ImageIcon icon2 = new ImageIcon(image2);
    
    public Question() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        
        LabelP1.setText(StrToHtml("¿Te has sentido inusualmente cansado o agotado sin una razón clara en las últimas semanas?"));
        LabelP2.setText(StrToHtml("¿Has tenido dificultades para entender lo que sientes o para diferenciar tus emociones claramente?"));
        LabelP3.setText(StrToHtml("¿Has experimentado situaciones en las que ves, oyes o sientes cosas que no están presentes o que otros no pueden percibir?"));
        LabelP4.setText(StrToHtml("¿Has mantenido creencias que otras personas consideran inusuales o incorrectas, y sientes que a pesar de sus explicaciones, tus creencias siguen siendo verdaderas?"));
        LabelP5.setText(StrToHtml("¿Has sentido una tristeza profunda o falta de interés en actividades que antes disfrutabas, de manera casi diaria?"));
        LabelP6.setText(StrToHtml("¿Has tenido períodos recientes donde te sientes anormalmente energético o eufórico, lo que ha resultado en tomar decisiones impulsivas o en iniciar múltiples proyectos a la vez?"));
        LabelP7.setText(StrToHtml("¿Qué tanto presentas aislamiento social?"));
        LabelP8.setText(StrToHtml("¿Qué tan recurrente presentas tus delirios?"));
        LabelP9.setText(StrToHtml("¿Qué tan recurrente presentas alucinaciones?"));
        LabelP10.setText(StrToHtml("¿Qué tan seguido tienes pensamientos desordenados(Descontrol de ideas o desorientación)?"));
        LabelP11.setText(StrToHtml("¿Qué tan recurrente tiene alteraciones de la percepción alterada de ti mismo(No reconocerte como un individuo integro)?"));
        LabelP12.setText(StrToHtml("¿Tienes alteraciones emocionales(Descontrol de las emociones)?"));
        LabelP13.setText(StrToHtml("¿Con que frecuencia tiendes a no poder dormir?"));
        LabelP14.setText(StrToHtml("¿Tiene pensamientos suicidas?"));
        LabelP15.setText(StrToHtml("¿Ha presentado irritabilidad constantemente?"));
        LabelP16.setText(StrToHtml("¿Últimamente a presenta sentimientos de angustia?"));
        LabelP17.setText(StrToHtml("¿Tiene pensamientos de culpa sin saber el por qué o impotencia?"));
        LabelP18.setText(StrToHtml("¿Siente menos interés por cosas particulares o pasatiempos?"));
        LabelP19.setText(StrToHtml("¿Tiene cambios repentinos de humor?"));
        LabelP20.setText(StrToHtml("¿Cuentas con escasa habilidad para organizar tus tiempos?"));
        LabelP21.setText(StrToHtml("¿Últimamente tiendes a olvidar las cosas?"));
        LabelP22.setText(StrToHtml("¿Últimamente tiendes a tener dificultad para concentrarte en una actividad o pasatiempos?"));
        LabelP23.setText(StrToHtml("¿Tienes dificultad para poner atención a una actividad?"));
        LabelP24.setText(StrToHtml("¿Tienes dificultad para el aprender o desarrollar habilidades?"));
        LabelP25.setText(StrToHtml("¿Últimamente sientes pánico o sensación de peligro sobre el entorno en el que te encuentras?"));
        LabelP26.setText(StrToHtml("¿Tienes tensión, agitación o sensación de nerviosismo?"));
        LabelP27.setText(StrToHtml("¿Últimamente tienes problemas para conciliar el sueño?"));
        LabelP28.setText(StrToHtml("¿Tienes cansancio progresivo o debilidad?"));
        LabelP29.setText(StrToHtml("¿Has presentado sudoración excesiva y temblores involuntarios?"));
        LabelP30.setText(StrToHtml("¿Ha presentado descontrol o aumento de ritmo cardiaco?"));
    
    }
    
    public final String StrToHtml(String texto){
        return "<html><p>" + texto + "</p></html>";
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        jLabelN = new javax.swing.JLabel();
        jLabelTrecuente = new javax.swing.JLabel();
        jLabelMucho = new javax.swing.JLabel();
        jLabelPoco = new javax.swing.JLabel();
        jLabelLeve = new javax.swing.JLabel();
        jLabelNunca = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        LabelP1 = new javax.swing.JLabel();
        PanelP1Op1 = new javax.swing.JPanel();
        P1F = new javax.swing.JLabel();
        PanelP1Op2 = new javax.swing.JPanel();
        P1M = new javax.swing.JLabel();
        PanelP1Op3 = new javax.swing.JPanel();
        P1P = new javax.swing.JLabel();
        PanelP1Op4 = new javax.swing.JPanel();
        P1L = new javax.swing.JLabel();
        PanelP1Op5 = new javax.swing.JPanel();
        P1N = new javax.swing.JLabel();
        LabelP2 = new javax.swing.JLabel();
        PanelP2Op1 = new javax.swing.JPanel();
        P2F = new javax.swing.JLabel();
        PanelP2Op2 = new javax.swing.JPanel();
        P2M = new javax.swing.JLabel();
        PanelP2Op3 = new javax.swing.JPanel();
        P2P = new javax.swing.JLabel();
        PanelP2Op4 = new javax.swing.JPanel();
        P2L = new javax.swing.JLabel();
        PanelP2Op5 = new javax.swing.JPanel();
        P2N = new javax.swing.JLabel();
        LabelP3 = new javax.swing.JLabel();
        PanelP3Op1 = new javax.swing.JPanel();
        P3F = new javax.swing.JLabel();
        PanelP3Op2 = new javax.swing.JPanel();
        P3M = new javax.swing.JLabel();
        PanelP3Op3 = new javax.swing.JPanel();
        P3P = new javax.swing.JLabel();
        PanelP3Op4 = new javax.swing.JPanel();
        P3L = new javax.swing.JLabel();
        PanelP3Op5 = new javax.swing.JPanel();
        P3N = new javax.swing.JLabel();
        LabelP4 = new javax.swing.JLabel();
        PanelP4Op11 = new javax.swing.JPanel();
        P4F = new javax.swing.JLabel();
        PanelP2Op12 = new javax.swing.JPanel();
        P4M = new javax.swing.JLabel();
        PanelP2Op13 = new javax.swing.JPanel();
        P4P = new javax.swing.JLabel();
        PanelP2Op14 = new javax.swing.JPanel();
        P4L = new javax.swing.JLabel();
        PanelP2Op15 = new javax.swing.JPanel();
        P4N = new javax.swing.JLabel();
        LabelP5 = new javax.swing.JLabel();
        PanelP2Op16 = new javax.swing.JPanel();
        P5F = new javax.swing.JLabel();
        PanelP2Op17 = new javax.swing.JPanel();
        P5M = new javax.swing.JLabel();
        PanelP2Op18 = new javax.swing.JPanel();
        P5P = new javax.swing.JLabel();
        PanelP2Op19 = new javax.swing.JPanel();
        P5L = new javax.swing.JLabel();
        PanelP2Op20 = new javax.swing.JPanel();
        P5N = new javax.swing.JLabel();
        LabelP6 = new javax.swing.JLabel();
        PanelP2Op21 = new javax.swing.JPanel();
        P6F = new javax.swing.JLabel();
        PanelP2Op22 = new javax.swing.JPanel();
        P6M = new javax.swing.JLabel();
        PanelP2Op23 = new javax.swing.JPanel();
        P6P = new javax.swing.JLabel();
        PanelP2Op24 = new javax.swing.JPanel();
        P6L = new javax.swing.JLabel();
        PanelP2Op25 = new javax.swing.JPanel();
        P6N = new javax.swing.JLabel();
        LabelP7 = new javax.swing.JLabel();
        PanelP2Op26 = new javax.swing.JPanel();
        P7F = new javax.swing.JLabel();
        PanelP2Op27 = new javax.swing.JPanel();
        P7M = new javax.swing.JLabel();
        PanelP2Op28 = new javax.swing.JPanel();
        P7P = new javax.swing.JLabel();
        PanelP2Op29 = new javax.swing.JPanel();
        P7L = new javax.swing.JLabel();
        PanelP2Op30 = new javax.swing.JPanel();
        P7N = new javax.swing.JLabel();
        LabelP8 = new javax.swing.JLabel();
        PanelP2Op31 = new javax.swing.JPanel();
        P8F = new javax.swing.JLabel();
        PanelP2Op32 = new javax.swing.JPanel();
        P8M = new javax.swing.JLabel();
        PanelP2Op33 = new javax.swing.JPanel();
        P8P = new javax.swing.JLabel();
        PanelP2Op34 = new javax.swing.JPanel();
        P8L = new javax.swing.JLabel();
        PanelP2Op35 = new javax.swing.JPanel();
        P8N = new javax.swing.JLabel();
        LabelP9 = new javax.swing.JLabel();
        PanelP2Op36 = new javax.swing.JPanel();
        P9F = new javax.swing.JLabel();
        PanelP2Op37 = new javax.swing.JPanel();
        P9M = new javax.swing.JLabel();
        PanelP2Op38 = new javax.swing.JPanel();
        P9P = new javax.swing.JLabel();
        PanelP2Op39 = new javax.swing.JPanel();
        P9L = new javax.swing.JLabel();
        PanelP2Op40 = new javax.swing.JPanel();
        P9N = new javax.swing.JLabel();
        LabelP10 = new javax.swing.JLabel();
        PanelP2Op41 = new javax.swing.JPanel();
        P10F = new javax.swing.JLabel();
        PanelP2Op42 = new javax.swing.JPanel();
        P10M = new javax.swing.JLabel();
        PanelP2Op43 = new javax.swing.JPanel();
        P10P = new javax.swing.JLabel();
        PanelP2Op44 = new javax.swing.JPanel();
        P10L = new javax.swing.JLabel();
        PanelP2Op45 = new javax.swing.JPanel();
        P10N = new javax.swing.JLabel();
        LabelP11 = new javax.swing.JLabel();
        PanelP2Op46 = new javax.swing.JPanel();
        P11F = new javax.swing.JLabel();
        PanelP2Op47 = new javax.swing.JPanel();
        P11M = new javax.swing.JLabel();
        PanelP2Op48 = new javax.swing.JPanel();
        P11P = new javax.swing.JLabel();
        PanelP2Op49 = new javax.swing.JPanel();
        P11L = new javax.swing.JLabel();
        PanelP2Op50 = new javax.swing.JPanel();
        P11N = new javax.swing.JLabel();
        LabelP12 = new javax.swing.JLabel();
        PanelP2Op51 = new javax.swing.JPanel();
        P12F = new javax.swing.JLabel();
        PanelP2Op52 = new javax.swing.JPanel();
        P12M = new javax.swing.JLabel();
        PanelP2Op53 = new javax.swing.JPanel();
        P12P = new javax.swing.JLabel();
        PanelP2Op54 = new javax.swing.JPanel();
        P12L = new javax.swing.JLabel();
        PanelP2Op55 = new javax.swing.JPanel();
        P12N = new javax.swing.JLabel();
        LabelP13 = new javax.swing.JLabel();
        PanelP2Op56 = new javax.swing.JPanel();
        P13F = new javax.swing.JLabel();
        PanelP2Op57 = new javax.swing.JPanel();
        P13M = new javax.swing.JLabel();
        PanelP2Op58 = new javax.swing.JPanel();
        P13P = new javax.swing.JLabel();
        PanelP2Op59 = new javax.swing.JPanel();
        P13L = new javax.swing.JLabel();
        PanelP2Op60 = new javax.swing.JPanel();
        P13N = new javax.swing.JLabel();
        LabelP14 = new javax.swing.JLabel();
        PanelP2Op61 = new javax.swing.JPanel();
        P14F = new javax.swing.JLabel();
        PanelP2Op62 = new javax.swing.JPanel();
        P14M = new javax.swing.JLabel();
        PanelP2Op63 = new javax.swing.JPanel();
        P14P = new javax.swing.JLabel();
        PanelP2Op64 = new javax.swing.JPanel();
        P14L = new javax.swing.JLabel();
        PanelP2Op65 = new javax.swing.JPanel();
        P14N = new javax.swing.JLabel();
        LabelP15 = new javax.swing.JLabel();
        PanelP2Op66 = new javax.swing.JPanel();
        P15F = new javax.swing.JLabel();
        PanelP2Op67 = new javax.swing.JPanel();
        P15M = new javax.swing.JLabel();
        PanelP2Op68 = new javax.swing.JPanel();
        P15P = new javax.swing.JLabel();
        PanelP2Op69 = new javax.swing.JPanel();
        P15L = new javax.swing.JLabel();
        PanelP2Op70 = new javax.swing.JPanel();
        P15N = new javax.swing.JLabel();
        LabelP16 = new javax.swing.JLabel();
        PanelP2Op71 = new javax.swing.JPanel();
        P16F = new javax.swing.JLabel();
        PanelP2Op72 = new javax.swing.JPanel();
        P16M = new javax.swing.JLabel();
        PanelP2Op73 = new javax.swing.JPanel();
        P16P = new javax.swing.JLabel();
        PanelP2Op74 = new javax.swing.JPanel();
        P16L = new javax.swing.JLabel();
        PanelP2Op75 = new javax.swing.JPanel();
        P16N = new javax.swing.JLabel();
        LabelP17 = new javax.swing.JLabel();
        PanelP2Op76 = new javax.swing.JPanel();
        P17F = new javax.swing.JLabel();
        PanelP2Op77 = new javax.swing.JPanel();
        P17M = new javax.swing.JLabel();
        PanelP2Op78 = new javax.swing.JPanel();
        P17P = new javax.swing.JLabel();
        PanelP2Op79 = new javax.swing.JPanel();
        P17L = new javax.swing.JLabel();
        PanelP2Op80 = new javax.swing.JPanel();
        P17N = new javax.swing.JLabel();
        LabelP18 = new javax.swing.JLabel();
        PanelP2Op81 = new javax.swing.JPanel();
        P18F = new javax.swing.JLabel();
        PanelP2Op82 = new javax.swing.JPanel();
        P18M = new javax.swing.JLabel();
        PanelP2Op83 = new javax.swing.JPanel();
        P18P = new javax.swing.JLabel();
        PanelP2Op84 = new javax.swing.JPanel();
        P18L = new javax.swing.JLabel();
        PanelP2Op85 = new javax.swing.JPanel();
        P18N = new javax.swing.JLabel();
        LabelP19 = new javax.swing.JLabel();
        PanelP2Op86 = new javax.swing.JPanel();
        P19F = new javax.swing.JLabel();
        PanelP2Op87 = new javax.swing.JPanel();
        P19M = new javax.swing.JLabel();
        PanelP2Op88 = new javax.swing.JPanel();
        P19P = new javax.swing.JLabel();
        PanelP2Op89 = new javax.swing.JPanel();
        P19L = new javax.swing.JLabel();
        PanelP2Op90 = new javax.swing.JPanel();
        P19N = new javax.swing.JLabel();
        LabelP20 = new javax.swing.JLabel();
        PanelP2Op91 = new javax.swing.JPanel();
        P20F = new javax.swing.JLabel();
        PanelP2Op92 = new javax.swing.JPanel();
        P20M = new javax.swing.JLabel();
        PanelP2Op93 = new javax.swing.JPanel();
        P20P = new javax.swing.JLabel();
        PanelP2Op94 = new javax.swing.JPanel();
        P20L = new javax.swing.JLabel();
        PanelP2Op95 = new javax.swing.JPanel();
        P20N = new javax.swing.JLabel();
        LabelP21 = new javax.swing.JLabel();
        PanelP2Op96 = new javax.swing.JPanel();
        P21F = new javax.swing.JLabel();
        PanelP2Op97 = new javax.swing.JPanel();
        P21M = new javax.swing.JLabel();
        PanelP2Op98 = new javax.swing.JPanel();
        P21P = new javax.swing.JLabel();
        PanelP2Op99 = new javax.swing.JPanel();
        P21L = new javax.swing.JLabel();
        PanelP2Op100 = new javax.swing.JPanel();
        P21N = new javax.swing.JLabel();
        LabelP22 = new javax.swing.JLabel();
        PanelP2Op101 = new javax.swing.JPanel();
        P22F = new javax.swing.JLabel();
        PanelP2Op106 = new javax.swing.JPanel();
        P2F21 = new javax.swing.JLabel();
        PanelP2Op107 = new javax.swing.JPanel();
        P2M21 = new javax.swing.JLabel();
        PanelP2Op108 = new javax.swing.JPanel();
        P2P21 = new javax.swing.JLabel();
        PanelP2Op109 = new javax.swing.JPanel();
        P2L21 = new javax.swing.JLabel();
        PanelP2Op110 = new javax.swing.JPanel();
        P2N21 = new javax.swing.JLabel();
        PanelP2Op102 = new javax.swing.JPanel();
        P22M = new javax.swing.JLabel();
        PanelP2Op103 = new javax.swing.JPanel();
        P22P = new javax.swing.JLabel();
        PanelP2Op104 = new javax.swing.JPanel();
        P22L = new javax.swing.JLabel();
        PanelP2Op105 = new javax.swing.JPanel();
        P22N = new javax.swing.JLabel();
        LabelP23 = new javax.swing.JLabel();
        PanelP2Op111 = new javax.swing.JPanel();
        P23F = new javax.swing.JLabel();
        PanelP2Op112 = new javax.swing.JPanel();
        P23M = new javax.swing.JLabel();
        PanelP2Op113 = new javax.swing.JPanel();
        P23P = new javax.swing.JLabel();
        PanelP2Op114 = new javax.swing.JPanel();
        P23L = new javax.swing.JLabel();
        PanelP2Op115 = new javax.swing.JPanel();
        P23N = new javax.swing.JLabel();
        LabelP24 = new javax.swing.JLabel();
        PanelP2Op116 = new javax.swing.JPanel();
        P24F = new javax.swing.JLabel();
        PanelP2Op117 = new javax.swing.JPanel();
        P24M = new javax.swing.JLabel();
        PanelP2Op118 = new javax.swing.JPanel();
        P24P = new javax.swing.JLabel();
        PanelP2Op119 = new javax.swing.JPanel();
        P24L = new javax.swing.JLabel();
        PanelP2Op120 = new javax.swing.JPanel();
        P24N = new javax.swing.JLabel();
        LabelP25 = new javax.swing.JLabel();
        PanelP2Op121 = new javax.swing.JPanel();
        P25F = new javax.swing.JLabel();
        PanelP2Op122 = new javax.swing.JPanel();
        P25M = new javax.swing.JLabel();
        PanelP2Op123 = new javax.swing.JPanel();
        P25P = new javax.swing.JLabel();
        PanelP2Op124 = new javax.swing.JPanel();
        P25L = new javax.swing.JLabel();
        PanelP2Op125 = new javax.swing.JPanel();
        P25N = new javax.swing.JLabel();
        LabelP26 = new javax.swing.JLabel();
        PanelP2Op126 = new javax.swing.JPanel();
        P26F = new javax.swing.JLabel();
        PanelP2Op127 = new javax.swing.JPanel();
        P26M = new javax.swing.JLabel();
        PanelP2Op128 = new javax.swing.JPanel();
        P26P = new javax.swing.JLabel();
        PanelP2Op129 = new javax.swing.JPanel();
        P26L = new javax.swing.JLabel();
        PanelP2Op130 = new javax.swing.JPanel();
        P26N = new javax.swing.JLabel();
        LabelP27 = new javax.swing.JLabel();
        PanelP2Op131 = new javax.swing.JPanel();
        P27F = new javax.swing.JLabel();
        PanelP2Op132 = new javax.swing.JPanel();
        P27M = new javax.swing.JLabel();
        PanelP2Op133 = new javax.swing.JPanel();
        P27P = new javax.swing.JLabel();
        PanelP2Op134 = new javax.swing.JPanel();
        P27L = new javax.swing.JLabel();
        PanelP2Op135 = new javax.swing.JPanel();
        P27N = new javax.swing.JLabel();
        LabelP28 = new javax.swing.JLabel();
        PanelP2Op136 = new javax.swing.JPanel();
        P28F = new javax.swing.JLabel();
        PanelP2Op137 = new javax.swing.JPanel();
        P28M = new javax.swing.JLabel();
        PanelP2Op138 = new javax.swing.JPanel();
        P28P = new javax.swing.JLabel();
        PanelP2Op139 = new javax.swing.JPanel();
        P28L = new javax.swing.JLabel();
        PanelP2Op140 = new javax.swing.JPanel();
        P28N = new javax.swing.JLabel();
        LabelP29 = new javax.swing.JLabel();
        PanelP2Op141 = new javax.swing.JPanel();
        P29F = new javax.swing.JLabel();
        PanelP2Op142 = new javax.swing.JPanel();
        P29M = new javax.swing.JLabel();
        PanelP2Op143 = new javax.swing.JPanel();
        P29P = new javax.swing.JLabel();
        PanelP2Op144 = new javax.swing.JPanel();
        P29L = new javax.swing.JLabel();
        PanelP2Op145 = new javax.swing.JPanel();
        P29N = new javax.swing.JLabel();
        LabelP30 = new javax.swing.JLabel();
        PanelP2Op146 = new javax.swing.JPanel();
        P30F = new javax.swing.JLabel();
        PanelP2Op147 = new javax.swing.JPanel();
        P30M = new javax.swing.JLabel();
        PanelP2Op148 = new javax.swing.JPanel();
        P30P = new javax.swing.JLabel();
        PanelP2Op149 = new javax.swing.JPanel();
        P30L = new javax.swing.JLabel();
        PanelP2Op150 = new javax.swing.JPanel();
        P30N = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelEdad = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 10));
        setMinimumSize(new java.awt.Dimension(1212, 664));
        setSize(new java.awt.Dimension(1210, 660));

        jPanel1.setBackground(new java.awt.Color(163, 177, 138));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEncabezado.setBackground(new java.awt.Color(204, 204, 204));
        panelEncabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelN.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelN.setForeground(new java.awt.Color(0, 0, 0));
        jLabelN.setText("N°");
        panelEncabezado.add(jLabelN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jLabelTrecuente.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelTrecuente.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTrecuente.setText("Frecuentemente (4)");
        panelEncabezado.add(jLabelTrecuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 190, 30));

        jLabelMucho.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelMucho.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMucho.setText("Mucho (3)");
        panelEncabezado.add(jLabelMucho, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 100, 30));

        jLabelPoco.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelPoco.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPoco.setText("Poco (2)");
        panelEncabezado.add(jLabelPoco, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, 30));

        jLabelLeve.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelLeve.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLeve.setText("Leve (1)");
        panelEncabezado.add(jLabelLeve, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 80, 30));

        jLabelNunca.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelNunca.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNunca.setText("Nunca (0)");
        panelEncabezado.add(jLabelNunca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 100, 30));

        jPanel1.add(panelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1180, 40));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1117, 178));

        jPanel2.setBackground(new java.awt.Color(247, 247, 247));
        jPanel2.setMinimumSize(new java.awt.Dimension(1170, 1520));
        jPanel2.setPreferredSize(new java.awt.Dimension(1140, 1800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelP1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP1.setForeground(new java.awt.Color(0, 0, 0));
        LabelP1.setText("1");
        LabelP1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 510, 40));

        PanelP1Op1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelP1Op1.setPreferredSize(new java.awt.Dimension(30, 30));

        P1F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P1F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P1F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P1F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP1Op1Layout = new javax.swing.GroupLayout(PanelP1Op1);
        PanelP1Op1.setLayout(PanelP1Op1Layout);
        PanelP1Op1Layout.setHorizontalGroup(
            PanelP1Op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP1Op1Layout.setVerticalGroup(
            PanelP1Op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP1Op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 30, 30));

        PanelP1Op2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelP1Op2.setPreferredSize(new java.awt.Dimension(30, 30));

        P1M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P1M.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P1M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P1M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP1Op2Layout = new javax.swing.GroupLayout(PanelP1Op2);
        PanelP1Op2.setLayout(PanelP1Op2Layout);
        PanelP1Op2Layout.setHorizontalGroup(
            PanelP1Op2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP1Op2Layout.setVerticalGroup(
            PanelP1Op2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP1Op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 30, 30));

        PanelP1Op3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P1P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P1P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P1P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP1Op3Layout = new javax.swing.GroupLayout(PanelP1Op3);
        PanelP1Op3.setLayout(PanelP1Op3Layout);
        PanelP1Op3Layout.setHorizontalGroup(
            PanelP1Op3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP1Op3Layout.setVerticalGroup(
            PanelP1Op3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP1Op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, 30));

        PanelP1Op4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P1L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P1L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P1L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP1Op4Layout = new javax.swing.GroupLayout(PanelP1Op4);
        PanelP1Op4.setLayout(PanelP1Op4Layout);
        PanelP1Op4Layout.setHorizontalGroup(
            PanelP1Op4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP1Op4Layout.setVerticalGroup(
            PanelP1Op4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP1Op4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 30, 30));

        PanelP1Op5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P1N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P1N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P1N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP1Op5Layout = new javax.swing.GroupLayout(PanelP1Op5);
        PanelP1Op5.setLayout(PanelP1Op5Layout);
        PanelP1Op5Layout.setHorizontalGroup(
            PanelP1Op5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP1Op5Layout.setVerticalGroup(
            PanelP1Op5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP1Op5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 30, 30));

        LabelP2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP2.setForeground(new java.awt.Color(0, 0, 0));
        LabelP2.setText("2");
        LabelP2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 510, 50));

        PanelP2Op1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P2F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P2F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op1Layout = new javax.swing.GroupLayout(PanelP2Op1);
        PanelP2Op1.setLayout(PanelP2Op1Layout);
        PanelP2Op1Layout.setHorizontalGroup(
            PanelP2Op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op1Layout.setVerticalGroup(
            PanelP2Op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 30, 30));

        PanelP2Op2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P2M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op2Layout = new javax.swing.GroupLayout(PanelP2Op2);
        PanelP2Op2.setLayout(PanelP2Op2Layout);
        PanelP2Op2Layout.setHorizontalGroup(
            PanelP2Op2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op2Layout.setVerticalGroup(
            PanelP2Op2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 30, 30));

        PanelP2Op3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P2P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op3Layout = new javax.swing.GroupLayout(PanelP2Op3);
        PanelP2Op3.setLayout(PanelP2Op3Layout);
        PanelP2Op3Layout.setHorizontalGroup(
            PanelP2Op3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op3Layout.setVerticalGroup(
            PanelP2Op3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, 30, 30));

        PanelP2Op4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P2L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op4Layout = new javax.swing.GroupLayout(PanelP2Op4);
        PanelP2Op4.setLayout(PanelP2Op4Layout);
        PanelP2Op4Layout.setHorizontalGroup(
            PanelP2Op4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op4Layout.setVerticalGroup(
            PanelP2Op4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, 30, 30));

        PanelP2Op5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P2N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op5Layout = new javax.swing.GroupLayout(PanelP2Op5);
        PanelP2Op5.setLayout(PanelP2Op5Layout);
        PanelP2Op5Layout.setHorizontalGroup(
            PanelP2Op5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op5Layout.setVerticalGroup(
            PanelP2Op5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 80, 30, 30));

        LabelP3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP3.setForeground(new java.awt.Color(0, 0, 0));
        LabelP3.setText("3");
        LabelP3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 510, 40));

        PanelP3Op1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P3F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P3F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P3F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P3F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P3FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP3Op1Layout = new javax.swing.GroupLayout(PanelP3Op1);
        PanelP3Op1.setLayout(PanelP3Op1Layout);
        PanelP3Op1Layout.setHorizontalGroup(
            PanelP3Op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P3F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP3Op1Layout.setVerticalGroup(
            PanelP3Op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P3F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP3Op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 30, 30));

        PanelP3Op2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P3M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P3M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P3M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P3MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP3Op2Layout = new javax.swing.GroupLayout(PanelP3Op2);
        PanelP3Op2.setLayout(PanelP3Op2Layout);
        PanelP3Op2Layout.setHorizontalGroup(
            PanelP3Op2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P3M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP3Op2Layout.setVerticalGroup(
            PanelP3Op2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P3M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP3Op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 30, 30));

        PanelP3Op3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P3P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P3P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P3P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P3PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP3Op3Layout = new javax.swing.GroupLayout(PanelP3Op3);
        PanelP3Op3.setLayout(PanelP3Op3Layout);
        PanelP3Op3Layout.setHorizontalGroup(
            PanelP3Op3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P3P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP3Op3Layout.setVerticalGroup(
            PanelP3Op3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P3P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP3Op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 30, 30));

        PanelP3Op4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P3L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P3L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P3L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P3LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP3Op4Layout = new javax.swing.GroupLayout(PanelP3Op4);
        PanelP3Op4.setLayout(PanelP3Op4Layout);
        PanelP3Op4Layout.setHorizontalGroup(
            PanelP3Op4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P3L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP3Op4Layout.setVerticalGroup(
            PanelP3Op4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P3L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP3Op4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 140, 30, 30));

        PanelP3Op5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P3N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P3N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P3N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P3NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP3Op5Layout = new javax.swing.GroupLayout(PanelP3Op5);
        PanelP3Op5.setLayout(PanelP3Op5Layout);
        PanelP3Op5Layout.setHorizontalGroup(
            PanelP3Op5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P3N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP3Op5Layout.setVerticalGroup(
            PanelP3Op5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P3N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP3Op5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 140, 30, 30));

        LabelP4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP4.setForeground(new java.awt.Color(0, 0, 0));
        LabelP4.setText("4");
        LabelP4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 510, 60));

        PanelP4Op11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P4F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P4F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P4F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P4F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P4FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP4Op11Layout = new javax.swing.GroupLayout(PanelP4Op11);
        PanelP4Op11.setLayout(PanelP4Op11Layout);
        PanelP4Op11Layout.setHorizontalGroup(
            PanelP4Op11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P4F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP4Op11Layout.setVerticalGroup(
            PanelP4Op11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P4F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP4Op11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 30, 30));

        PanelP2Op12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P4M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P4M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P4M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P4MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op12Layout = new javax.swing.GroupLayout(PanelP2Op12);
        PanelP2Op12.setLayout(PanelP2Op12Layout);
        PanelP2Op12Layout.setHorizontalGroup(
            PanelP2Op12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P4M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op12Layout.setVerticalGroup(
            PanelP2Op12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P4M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 30, 30));

        PanelP2Op13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P4P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P4P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P4P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P4PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op13Layout = new javax.swing.GroupLayout(PanelP2Op13);
        PanelP2Op13.setLayout(PanelP2Op13Layout);
        PanelP2Op13Layout.setHorizontalGroup(
            PanelP2Op13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P4P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op13Layout.setVerticalGroup(
            PanelP2Op13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P4P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op13, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 30, 30));

        PanelP2Op14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P4L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P4L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P4L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P4LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op14Layout = new javax.swing.GroupLayout(PanelP2Op14);
        PanelP2Op14.setLayout(PanelP2Op14Layout);
        PanelP2Op14Layout.setHorizontalGroup(
            PanelP2Op14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P4L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op14Layout.setVerticalGroup(
            PanelP2Op14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P4L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 200, 30, 30));

        PanelP2Op15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P4N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P4N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P4N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P4NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op15Layout = new javax.swing.GroupLayout(PanelP2Op15);
        PanelP2Op15.setLayout(PanelP2Op15Layout);
        PanelP2Op15Layout.setHorizontalGroup(
            PanelP2Op15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P4N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op15Layout.setVerticalGroup(
            PanelP2Op15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P4N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 200, 30, 30));

        LabelP5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP5.setForeground(new java.awt.Color(0, 0, 0));
        LabelP5.setText("5");
        LabelP5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 510, 40));

        PanelP2Op16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P5F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P5F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P5F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P5F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P5FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op16Layout = new javax.swing.GroupLayout(PanelP2Op16);
        PanelP2Op16.setLayout(PanelP2Op16Layout);
        PanelP2Op16Layout.setHorizontalGroup(
            PanelP2Op16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P5F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op16Layout.setVerticalGroup(
            PanelP2Op16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P5F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 30, 30));

        PanelP2Op17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P5M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P5M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P5M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P5MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op17Layout = new javax.swing.GroupLayout(PanelP2Op17);
        PanelP2Op17.setLayout(PanelP2Op17Layout);
        PanelP2Op17Layout.setHorizontalGroup(
            PanelP2Op17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P5M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op17Layout.setVerticalGroup(
            PanelP2Op17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P5M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 30, 30));

        PanelP2Op18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P5P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P5P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P5P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P5PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op18Layout = new javax.swing.GroupLayout(PanelP2Op18);
        PanelP2Op18.setLayout(PanelP2Op18Layout);
        PanelP2Op18Layout.setHorizontalGroup(
            PanelP2Op18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P5P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op18Layout.setVerticalGroup(
            PanelP2Op18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P5P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op18, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 260, 30, 30));

        PanelP2Op19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P5L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P5L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P5L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P5LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op19Layout = new javax.swing.GroupLayout(PanelP2Op19);
        PanelP2Op19.setLayout(PanelP2Op19Layout);
        PanelP2Op19Layout.setHorizontalGroup(
            PanelP2Op19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P5L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op19Layout.setVerticalGroup(
            PanelP2Op19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P5L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, 30, 30));

        PanelP2Op20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P5N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P5N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P5N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P5NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op20Layout = new javax.swing.GroupLayout(PanelP2Op20);
        PanelP2Op20.setLayout(PanelP2Op20Layout);
        PanelP2Op20Layout.setHorizontalGroup(
            PanelP2Op20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P5N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op20Layout.setVerticalGroup(
            PanelP2Op20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P5N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 260, 30, 30));

        LabelP6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP6.setForeground(new java.awt.Color(0, 0, 0));
        LabelP6.setText("6");
        LabelP6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 510, 60));

        PanelP2Op21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P6F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P6F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P6F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P6F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P6FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op21Layout = new javax.swing.GroupLayout(PanelP2Op21);
        PanelP2Op21.setLayout(PanelP2Op21Layout);
        PanelP2Op21Layout.setHorizontalGroup(
            PanelP2Op21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P6F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op21Layout.setVerticalGroup(
            PanelP2Op21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P6F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 30, 30));

        PanelP2Op22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P6M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P6M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P6M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P6MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op22Layout = new javax.swing.GroupLayout(PanelP2Op22);
        PanelP2Op22.setLayout(PanelP2Op22Layout);
        PanelP2Op22Layout.setHorizontalGroup(
            PanelP2Op22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P6M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op22Layout.setVerticalGroup(
            PanelP2Op22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P6M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op22, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 30, 30));

        PanelP2Op23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P6P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P6P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P6P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P6PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op23Layout = new javax.swing.GroupLayout(PanelP2Op23);
        PanelP2Op23.setLayout(PanelP2Op23Layout);
        PanelP2Op23Layout.setHorizontalGroup(
            PanelP2Op23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P6P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op23Layout.setVerticalGroup(
            PanelP2Op23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P6P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op23, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, 30, 30));

        PanelP2Op24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P6L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P6L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P6L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P6LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op24Layout = new javax.swing.GroupLayout(PanelP2Op24);
        PanelP2Op24.setLayout(PanelP2Op24Layout);
        PanelP2Op24Layout.setHorizontalGroup(
            PanelP2Op24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P6L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op24Layout.setVerticalGroup(
            PanelP2Op24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P6L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, 30, 30));

        PanelP2Op25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P6N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P6N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P6N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P6NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op25Layout = new javax.swing.GroupLayout(PanelP2Op25);
        PanelP2Op25.setLayout(PanelP2Op25Layout);
        PanelP2Op25Layout.setHorizontalGroup(
            PanelP2Op25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P6N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op25Layout.setVerticalGroup(
            PanelP2Op25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P6N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 320, 30, 30));

        LabelP7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP7.setForeground(new java.awt.Color(0, 0, 0));
        LabelP7.setText("7");
        LabelP7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 510, 30));

        PanelP2Op26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P7F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P7F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P7F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P7F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P7FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op26Layout = new javax.swing.GroupLayout(PanelP2Op26);
        PanelP2Op26.setLayout(PanelP2Op26Layout);
        PanelP2Op26Layout.setHorizontalGroup(
            PanelP2Op26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P7F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op26Layout.setVerticalGroup(
            PanelP2Op26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P7F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op26, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 30, 30));

        PanelP2Op27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P7M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P7M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P7M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P7MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op27Layout = new javax.swing.GroupLayout(PanelP2Op27);
        PanelP2Op27.setLayout(PanelP2Op27Layout);
        PanelP2Op27Layout.setHorizontalGroup(
            PanelP2Op27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P7M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op27Layout.setVerticalGroup(
            PanelP2Op27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P7M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op27, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 30, 30));

        PanelP2Op28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P7P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P7P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P7P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P7PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op28Layout = new javax.swing.GroupLayout(PanelP2Op28);
        PanelP2Op28.setLayout(PanelP2Op28Layout);
        PanelP2Op28Layout.setHorizontalGroup(
            PanelP2Op28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P7P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op28Layout.setVerticalGroup(
            PanelP2Op28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P7P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op28, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, 30, 30));

        PanelP2Op29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P7L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P7L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P7L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P7LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op29Layout = new javax.swing.GroupLayout(PanelP2Op29);
        PanelP2Op29.setLayout(PanelP2Op29Layout);
        PanelP2Op29Layout.setHorizontalGroup(
            PanelP2Op29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P7L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op29Layout.setVerticalGroup(
            PanelP2Op29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P7L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 380, 30, 30));

        PanelP2Op30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P7N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P7N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P7N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P7NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op30Layout = new javax.swing.GroupLayout(PanelP2Op30);
        PanelP2Op30.setLayout(PanelP2Op30Layout);
        PanelP2Op30Layout.setHorizontalGroup(
            PanelP2Op30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P7N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op30Layout.setVerticalGroup(
            PanelP2Op30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P7N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 380, 30, 30));

        LabelP8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP8.setForeground(new java.awt.Color(0, 0, 0));
        LabelP8.setText("8");
        LabelP8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 510, 30));

        PanelP2Op31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P8F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P8F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P8F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P8F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P8FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op31Layout = new javax.swing.GroupLayout(PanelP2Op31);
        PanelP2Op31.setLayout(PanelP2Op31Layout);
        PanelP2Op31Layout.setHorizontalGroup(
            PanelP2Op31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P8F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op31Layout.setVerticalGroup(
            PanelP2Op31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P8F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op31, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 30, 30));

        PanelP2Op32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P8M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P8M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P8M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P8MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op32Layout = new javax.swing.GroupLayout(PanelP2Op32);
        PanelP2Op32.setLayout(PanelP2Op32Layout);
        PanelP2Op32Layout.setHorizontalGroup(
            PanelP2Op32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P8M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op32Layout.setVerticalGroup(
            PanelP2Op32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P8M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op32, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, 30, 30));

        PanelP2Op33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P8P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P8P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P8P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P8PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op33Layout = new javax.swing.GroupLayout(PanelP2Op33);
        PanelP2Op33.setLayout(PanelP2Op33Layout);
        PanelP2Op33Layout.setHorizontalGroup(
            PanelP2Op33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P8P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op33Layout.setVerticalGroup(
            PanelP2Op33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P8P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op33, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 30, 30));

        PanelP2Op34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P8L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P8L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P8L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P8LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op34Layout = new javax.swing.GroupLayout(PanelP2Op34);
        PanelP2Op34.setLayout(PanelP2Op34Layout);
        PanelP2Op34Layout.setHorizontalGroup(
            PanelP2Op34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P8L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op34Layout.setVerticalGroup(
            PanelP2Op34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P8L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 440, 30, 30));

        PanelP2Op35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P8N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P8N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P8N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P8NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op35Layout = new javax.swing.GroupLayout(PanelP2Op35);
        PanelP2Op35.setLayout(PanelP2Op35Layout);
        PanelP2Op35Layout.setHorizontalGroup(
            PanelP2Op35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P8N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op35Layout.setVerticalGroup(
            PanelP2Op35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P8N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 440, 30, 30));

        LabelP9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP9.setForeground(new java.awt.Color(0, 0, 0));
        LabelP9.setText("9");
        LabelP9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 510, 30));

        PanelP2Op36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P9F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P9F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P9F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P9F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P9FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op36Layout = new javax.swing.GroupLayout(PanelP2Op36);
        PanelP2Op36.setLayout(PanelP2Op36Layout);
        PanelP2Op36Layout.setHorizontalGroup(
            PanelP2Op36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P9F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op36Layout.setVerticalGroup(
            PanelP2Op36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P9F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op36, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 30, 30));

        PanelP2Op37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P9M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P9M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P9M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P9MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op37Layout = new javax.swing.GroupLayout(PanelP2Op37);
        PanelP2Op37.setLayout(PanelP2Op37Layout);
        PanelP2Op37Layout.setHorizontalGroup(
            PanelP2Op37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P9M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op37Layout.setVerticalGroup(
            PanelP2Op37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P9M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op37, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, 30, 30));

        PanelP2Op38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P9P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P9P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P9P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P9PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op38Layout = new javax.swing.GroupLayout(PanelP2Op38);
        PanelP2Op38.setLayout(PanelP2Op38Layout);
        PanelP2Op38Layout.setHorizontalGroup(
            PanelP2Op38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P9P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op38Layout.setVerticalGroup(
            PanelP2Op38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P9P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op38, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, 30, 30));

        PanelP2Op39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P9L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P9L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P9L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P9LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op39Layout = new javax.swing.GroupLayout(PanelP2Op39);
        PanelP2Op39.setLayout(PanelP2Op39Layout);
        PanelP2Op39Layout.setHorizontalGroup(
            PanelP2Op39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P9L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op39Layout.setVerticalGroup(
            PanelP2Op39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P9L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 500, 30, 30));

        PanelP2Op40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P9N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P9N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P9N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P9NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op40Layout = new javax.swing.GroupLayout(PanelP2Op40);
        PanelP2Op40.setLayout(PanelP2Op40Layout);
        PanelP2Op40Layout.setHorizontalGroup(
            PanelP2Op40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P9N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op40Layout.setVerticalGroup(
            PanelP2Op40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P9N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 500, 30, 30));

        LabelP10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP10.setForeground(new java.awt.Color(0, 0, 0));
        LabelP10.setText("10");
        LabelP10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 510, 50));

        PanelP2Op41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P10F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P10F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P10F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P10F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P10FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op41Layout = new javax.swing.GroupLayout(PanelP2Op41);
        PanelP2Op41.setLayout(PanelP2Op41Layout);
        PanelP2Op41Layout.setHorizontalGroup(
            PanelP2Op41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P10F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op41Layout.setVerticalGroup(
            PanelP2Op41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P10F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op41, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 30, 30));

        PanelP2Op42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P10M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P10M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P10M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P10MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op42Layout = new javax.swing.GroupLayout(PanelP2Op42);
        PanelP2Op42.setLayout(PanelP2Op42Layout);
        PanelP2Op42Layout.setHorizontalGroup(
            PanelP2Op42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P10M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op42Layout.setVerticalGroup(
            PanelP2Op42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P10M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op42, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 30, 30));

        PanelP2Op43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P10P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P10P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P10P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P10PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op43Layout = new javax.swing.GroupLayout(PanelP2Op43);
        PanelP2Op43.setLayout(PanelP2Op43Layout);
        PanelP2Op43Layout.setHorizontalGroup(
            PanelP2Op43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P10P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op43Layout.setVerticalGroup(
            PanelP2Op43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P10P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op43, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, 30, 30));

        PanelP2Op44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P10L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P10L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P10L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P10LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op44Layout = new javax.swing.GroupLayout(PanelP2Op44);
        PanelP2Op44.setLayout(PanelP2Op44Layout);
        PanelP2Op44Layout.setHorizontalGroup(
            PanelP2Op44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P10L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op44Layout.setVerticalGroup(
            PanelP2Op44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P10L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 560, 30, 30));

        PanelP2Op45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P10N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P10N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P10N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P10NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op45Layout = new javax.swing.GroupLayout(PanelP2Op45);
        PanelP2Op45.setLayout(PanelP2Op45Layout);
        PanelP2Op45Layout.setHorizontalGroup(
            PanelP2Op45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P10N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op45Layout.setVerticalGroup(
            PanelP2Op45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P10N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 560, 30, 30));

        LabelP11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP11.setForeground(new java.awt.Color(0, 0, 0));
        LabelP11.setText("11");
        LabelP11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 510, 40));

        PanelP2Op46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P11F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P11F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P11F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P11F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P11FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op46Layout = new javax.swing.GroupLayout(PanelP2Op46);
        PanelP2Op46.setLayout(PanelP2Op46Layout);
        PanelP2Op46Layout.setHorizontalGroup(
            PanelP2Op46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P11F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op46Layout.setVerticalGroup(
            PanelP2Op46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P11F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op46, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 30, 30));

        PanelP2Op47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P11M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P11M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P11M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P11MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op47Layout = new javax.swing.GroupLayout(PanelP2Op47);
        PanelP2Op47.setLayout(PanelP2Op47Layout);
        PanelP2Op47Layout.setHorizontalGroup(
            PanelP2Op47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P11M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op47Layout.setVerticalGroup(
            PanelP2Op47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P11M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op47, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 620, 30, 30));

        PanelP2Op48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P11P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P11P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P11P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P11PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op48Layout = new javax.swing.GroupLayout(PanelP2Op48);
        PanelP2Op48.setLayout(PanelP2Op48Layout);
        PanelP2Op48Layout.setHorizontalGroup(
            PanelP2Op48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P11P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op48Layout.setVerticalGroup(
            PanelP2Op48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P11P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op48, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, 30, 30));

        PanelP2Op49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P11L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P11L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P11L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P11LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op49Layout = new javax.swing.GroupLayout(PanelP2Op49);
        PanelP2Op49.setLayout(PanelP2Op49Layout);
        PanelP2Op49Layout.setHorizontalGroup(
            PanelP2Op49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P11L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op49Layout.setVerticalGroup(
            PanelP2Op49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P11L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 620, 30, 30));

        PanelP2Op50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P11N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P11N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P11N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P11NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op50Layout = new javax.swing.GroupLayout(PanelP2Op50);
        PanelP2Op50.setLayout(PanelP2Op50Layout);
        PanelP2Op50Layout.setHorizontalGroup(
            PanelP2Op50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P11N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op50Layout.setVerticalGroup(
            PanelP2Op50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P11N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 620, 30, 30));

        LabelP12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP12.setForeground(new java.awt.Color(0, 0, 0));
        LabelP12.setText("12");
        LabelP12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, 510, 30));

        PanelP2Op51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P12F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P12F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P12F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P12F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P12FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op51Layout = new javax.swing.GroupLayout(PanelP2Op51);
        PanelP2Op51.setLayout(PanelP2Op51Layout);
        PanelP2Op51Layout.setHorizontalGroup(
            PanelP2Op51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P12F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op51Layout.setVerticalGroup(
            PanelP2Op51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P12F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op51, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 680, 30, 30));

        PanelP2Op52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P12M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P12M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P12M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P12MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op52Layout = new javax.swing.GroupLayout(PanelP2Op52);
        PanelP2Op52.setLayout(PanelP2Op52Layout);
        PanelP2Op52Layout.setHorizontalGroup(
            PanelP2Op52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P12M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op52Layout.setVerticalGroup(
            PanelP2Op52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P12M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op52, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 680, 30, 30));

        PanelP2Op53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P12P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P12P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P12P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P12PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op53Layout = new javax.swing.GroupLayout(PanelP2Op53);
        PanelP2Op53.setLayout(PanelP2Op53Layout);
        PanelP2Op53Layout.setHorizontalGroup(
            PanelP2Op53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P12P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op53Layout.setVerticalGroup(
            PanelP2Op53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P12P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op53, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 680, 30, 30));

        PanelP2Op54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P12L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P12L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P12L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P12LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op54Layout = new javax.swing.GroupLayout(PanelP2Op54);
        PanelP2Op54.setLayout(PanelP2Op54Layout);
        PanelP2Op54Layout.setHorizontalGroup(
            PanelP2Op54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P12L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op54Layout.setVerticalGroup(
            PanelP2Op54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P12L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op54, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 680, 30, 30));

        PanelP2Op55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P12N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P12N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P12N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P12NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op55Layout = new javax.swing.GroupLayout(PanelP2Op55);
        PanelP2Op55.setLayout(PanelP2Op55Layout);
        PanelP2Op55Layout.setHorizontalGroup(
            PanelP2Op55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P12N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op55Layout.setVerticalGroup(
            PanelP2Op55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P12N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op55, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 680, 30, 30));

        LabelP13.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP13.setForeground(new java.awt.Color(0, 0, 0));
        LabelP13.setText("13");
        LabelP13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 510, 30));

        PanelP2Op56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P13F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P13F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P13F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P13F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P13FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op56Layout = new javax.swing.GroupLayout(PanelP2Op56);
        PanelP2Op56.setLayout(PanelP2Op56Layout);
        PanelP2Op56Layout.setHorizontalGroup(
            PanelP2Op56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P13F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op56Layout.setVerticalGroup(
            PanelP2Op56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P13F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op56, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 740, 30, 30));

        PanelP2Op57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P13M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P13M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P13M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P13MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op57Layout = new javax.swing.GroupLayout(PanelP2Op57);
        PanelP2Op57.setLayout(PanelP2Op57Layout);
        PanelP2Op57Layout.setHorizontalGroup(
            PanelP2Op57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P13M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op57Layout.setVerticalGroup(
            PanelP2Op57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P13M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op57, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 740, 30, 30));

        PanelP2Op58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P13P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P13P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P13P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P13PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op58Layout = new javax.swing.GroupLayout(PanelP2Op58);
        PanelP2Op58.setLayout(PanelP2Op58Layout);
        PanelP2Op58Layout.setHorizontalGroup(
            PanelP2Op58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P13P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op58Layout.setVerticalGroup(
            PanelP2Op58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P13P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op58, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 740, 30, 30));

        PanelP2Op59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P13L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P13L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P13L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P13LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op59Layout = new javax.swing.GroupLayout(PanelP2Op59);
        PanelP2Op59.setLayout(PanelP2Op59Layout);
        PanelP2Op59Layout.setHorizontalGroup(
            PanelP2Op59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P13L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op59Layout.setVerticalGroup(
            PanelP2Op59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P13L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op59, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 740, 30, 30));

        PanelP2Op60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P13N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P13N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P13N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P13NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op60Layout = new javax.swing.GroupLayout(PanelP2Op60);
        PanelP2Op60.setLayout(PanelP2Op60Layout);
        PanelP2Op60Layout.setHorizontalGroup(
            PanelP2Op60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P13N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op60Layout.setVerticalGroup(
            PanelP2Op60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P13N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op60, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 740, 30, 30));

        LabelP14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP14.setForeground(new java.awt.Color(0, 0, 0));
        LabelP14.setText("14");
        LabelP14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 790, 510, 30));

        PanelP2Op61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P14F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P14F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P14F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P14F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P14FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op61Layout = new javax.swing.GroupLayout(PanelP2Op61);
        PanelP2Op61.setLayout(PanelP2Op61Layout);
        PanelP2Op61Layout.setHorizontalGroup(
            PanelP2Op61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P14F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op61Layout.setVerticalGroup(
            PanelP2Op61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P14F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op61, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 800, 30, 30));

        PanelP2Op62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P14M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P14M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P14M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P14MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op62Layout = new javax.swing.GroupLayout(PanelP2Op62);
        PanelP2Op62.setLayout(PanelP2Op62Layout);
        PanelP2Op62Layout.setHorizontalGroup(
            PanelP2Op62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P14M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op62Layout.setVerticalGroup(
            PanelP2Op62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P14M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op62, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 800, 30, 30));

        PanelP2Op63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P14P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P14P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P14P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P14PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op63Layout = new javax.swing.GroupLayout(PanelP2Op63);
        PanelP2Op63.setLayout(PanelP2Op63Layout);
        PanelP2Op63Layout.setHorizontalGroup(
            PanelP2Op63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P14P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op63Layout.setVerticalGroup(
            PanelP2Op63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P14P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op63, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 800, 30, 30));

        PanelP2Op64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P14L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P14L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P14L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P14LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op64Layout = new javax.swing.GroupLayout(PanelP2Op64);
        PanelP2Op64.setLayout(PanelP2Op64Layout);
        PanelP2Op64Layout.setHorizontalGroup(
            PanelP2Op64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P14L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op64Layout.setVerticalGroup(
            PanelP2Op64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P14L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op64, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 800, 30, 30));

        PanelP2Op65.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P14N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P14N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P14N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P14NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op65Layout = new javax.swing.GroupLayout(PanelP2Op65);
        PanelP2Op65.setLayout(PanelP2Op65Layout);
        PanelP2Op65Layout.setHorizontalGroup(
            PanelP2Op65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P14N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op65Layout.setVerticalGroup(
            PanelP2Op65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P14N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op65, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 800, 30, 30));

        LabelP15.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP15.setForeground(new java.awt.Color(0, 0, 0));
        LabelP15.setText("15");
        LabelP15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 850, 510, 30));

        PanelP2Op66.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P15F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P15F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P15F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P15F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P15FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op66Layout = new javax.swing.GroupLayout(PanelP2Op66);
        PanelP2Op66.setLayout(PanelP2Op66Layout);
        PanelP2Op66Layout.setHorizontalGroup(
            PanelP2Op66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P15F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op66Layout.setVerticalGroup(
            PanelP2Op66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P15F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op66, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 860, 30, 30));

        PanelP2Op67.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P15M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P15M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P15M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P15MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op67Layout = new javax.swing.GroupLayout(PanelP2Op67);
        PanelP2Op67.setLayout(PanelP2Op67Layout);
        PanelP2Op67Layout.setHorizontalGroup(
            PanelP2Op67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P15M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op67Layout.setVerticalGroup(
            PanelP2Op67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P15M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op67, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 860, 30, 30));

        PanelP2Op68.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P15P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P15P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P15P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P15PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op68Layout = new javax.swing.GroupLayout(PanelP2Op68);
        PanelP2Op68.setLayout(PanelP2Op68Layout);
        PanelP2Op68Layout.setHorizontalGroup(
            PanelP2Op68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P15P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op68Layout.setVerticalGroup(
            PanelP2Op68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P15P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op68, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 860, 30, 30));

        PanelP2Op69.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P15L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P15L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P15L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P15LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op69Layout = new javax.swing.GroupLayout(PanelP2Op69);
        PanelP2Op69.setLayout(PanelP2Op69Layout);
        PanelP2Op69Layout.setHorizontalGroup(
            PanelP2Op69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P15L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op69Layout.setVerticalGroup(
            PanelP2Op69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P15L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op69, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 860, 30, 30));

        PanelP2Op70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P15N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P15N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P15N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P15NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op70Layout = new javax.swing.GroupLayout(PanelP2Op70);
        PanelP2Op70.setLayout(PanelP2Op70Layout);
        PanelP2Op70Layout.setHorizontalGroup(
            PanelP2Op70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P15N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op70Layout.setVerticalGroup(
            PanelP2Op70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P15N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 860, 30, 30));

        LabelP16.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP16.setForeground(new java.awt.Color(0, 0, 0));
        LabelP16.setText("16");
        LabelP16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 910, 510, 30));

        PanelP2Op71.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P16F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P16F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P16F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P16F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P16FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op71Layout = new javax.swing.GroupLayout(PanelP2Op71);
        PanelP2Op71.setLayout(PanelP2Op71Layout);
        PanelP2Op71Layout.setHorizontalGroup(
            PanelP2Op71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P16F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op71Layout.setVerticalGroup(
            PanelP2Op71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P16F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op71, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 920, 30, 30));

        PanelP2Op72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P16M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P16M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P16M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P16MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op72Layout = new javax.swing.GroupLayout(PanelP2Op72);
        PanelP2Op72.setLayout(PanelP2Op72Layout);
        PanelP2Op72Layout.setHorizontalGroup(
            PanelP2Op72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P16M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op72Layout.setVerticalGroup(
            PanelP2Op72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P16M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op72, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 920, 30, 30));

        PanelP2Op73.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P16P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P16P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P16P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P16PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op73Layout = new javax.swing.GroupLayout(PanelP2Op73);
        PanelP2Op73.setLayout(PanelP2Op73Layout);
        PanelP2Op73Layout.setHorizontalGroup(
            PanelP2Op73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P16P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op73Layout.setVerticalGroup(
            PanelP2Op73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P16P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op73, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 920, 30, 30));

        PanelP2Op74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P16L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P16L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P16L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P16LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op74Layout = new javax.swing.GroupLayout(PanelP2Op74);
        PanelP2Op74.setLayout(PanelP2Op74Layout);
        PanelP2Op74Layout.setHorizontalGroup(
            PanelP2Op74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P16L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op74Layout.setVerticalGroup(
            PanelP2Op74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P16L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op74, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 920, 30, 30));

        PanelP2Op75.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P16N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P16N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P16N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P16NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op75Layout = new javax.swing.GroupLayout(PanelP2Op75);
        PanelP2Op75.setLayout(PanelP2Op75Layout);
        PanelP2Op75Layout.setHorizontalGroup(
            PanelP2Op75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P16N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op75Layout.setVerticalGroup(
            PanelP2Op75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P16N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op75, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 920, 30, 30));

        LabelP17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP17.setForeground(new java.awt.Color(0, 0, 0));
        LabelP17.setText("17");
        LabelP17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 970, 510, 30));

        PanelP2Op76.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P17F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P17F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P17F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P17F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P17FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op76Layout = new javax.swing.GroupLayout(PanelP2Op76);
        PanelP2Op76.setLayout(PanelP2Op76Layout);
        PanelP2Op76Layout.setHorizontalGroup(
            PanelP2Op76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P17F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op76Layout.setVerticalGroup(
            PanelP2Op76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P17F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op76, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 980, 30, 30));

        PanelP2Op77.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P17M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P17M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P17M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P17MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op77Layout = new javax.swing.GroupLayout(PanelP2Op77);
        PanelP2Op77.setLayout(PanelP2Op77Layout);
        PanelP2Op77Layout.setHorizontalGroup(
            PanelP2Op77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P17M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op77Layout.setVerticalGroup(
            PanelP2Op77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P17M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op77, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 980, 30, 30));

        PanelP2Op78.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P17P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P17P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P17P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P17PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op78Layout = new javax.swing.GroupLayout(PanelP2Op78);
        PanelP2Op78.setLayout(PanelP2Op78Layout);
        PanelP2Op78Layout.setHorizontalGroup(
            PanelP2Op78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P17P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op78Layout.setVerticalGroup(
            PanelP2Op78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P17P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op78, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 980, 30, 30));

        PanelP2Op79.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P17L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P17L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P17L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P17LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op79Layout = new javax.swing.GroupLayout(PanelP2Op79);
        PanelP2Op79.setLayout(PanelP2Op79Layout);
        PanelP2Op79Layout.setHorizontalGroup(
            PanelP2Op79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P17L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op79Layout.setVerticalGroup(
            PanelP2Op79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P17L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op79, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 980, 30, 30));

        PanelP2Op80.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P17N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P17N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P17N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P17NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op80Layout = new javax.swing.GroupLayout(PanelP2Op80);
        PanelP2Op80.setLayout(PanelP2Op80Layout);
        PanelP2Op80Layout.setHorizontalGroup(
            PanelP2Op80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P17N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op80Layout.setVerticalGroup(
            PanelP2Op80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P17N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op80, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 980, 30, 30));

        LabelP18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP18.setForeground(new java.awt.Color(0, 0, 0));
        LabelP18.setText("18");
        LabelP18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1030, 510, 30));

        PanelP2Op81.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P18F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P18F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P18F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P18F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P18FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op81Layout = new javax.swing.GroupLayout(PanelP2Op81);
        PanelP2Op81.setLayout(PanelP2Op81Layout);
        PanelP2Op81Layout.setHorizontalGroup(
            PanelP2Op81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P18F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op81Layout.setVerticalGroup(
            PanelP2Op81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P18F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op81, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1040, 30, 30));

        PanelP2Op82.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P18M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P18M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P18M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P18MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op82Layout = new javax.swing.GroupLayout(PanelP2Op82);
        PanelP2Op82.setLayout(PanelP2Op82Layout);
        PanelP2Op82Layout.setHorizontalGroup(
            PanelP2Op82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P18M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op82Layout.setVerticalGroup(
            PanelP2Op82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P18M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op82, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1040, 30, 30));

        PanelP2Op83.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P18P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P18P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P18P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P18PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op83Layout = new javax.swing.GroupLayout(PanelP2Op83);
        PanelP2Op83.setLayout(PanelP2Op83Layout);
        PanelP2Op83Layout.setHorizontalGroup(
            PanelP2Op83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P18P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op83Layout.setVerticalGroup(
            PanelP2Op83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P18P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op83, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1040, 30, 30));

        PanelP2Op84.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P18L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P18L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P18L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P18LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op84Layout = new javax.swing.GroupLayout(PanelP2Op84);
        PanelP2Op84.setLayout(PanelP2Op84Layout);
        PanelP2Op84Layout.setHorizontalGroup(
            PanelP2Op84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P18L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op84Layout.setVerticalGroup(
            PanelP2Op84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P18L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op84, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1040, 30, 30));

        PanelP2Op85.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P18N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P18N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P18N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P18NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op85Layout = new javax.swing.GroupLayout(PanelP2Op85);
        PanelP2Op85.setLayout(PanelP2Op85Layout);
        PanelP2Op85Layout.setHorizontalGroup(
            PanelP2Op85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P18N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op85Layout.setVerticalGroup(
            PanelP2Op85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P18N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op85, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1040, 30, 30));

        LabelP19.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP19.setForeground(new java.awt.Color(0, 0, 0));
        LabelP19.setText("19");
        LabelP19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1090, 510, 30));

        PanelP2Op86.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P19F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P19F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P19F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P19F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P19FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op86Layout = new javax.swing.GroupLayout(PanelP2Op86);
        PanelP2Op86.setLayout(PanelP2Op86Layout);
        PanelP2Op86Layout.setHorizontalGroup(
            PanelP2Op86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P19F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op86Layout.setVerticalGroup(
            PanelP2Op86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P19F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op86, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1100, 30, 30));

        PanelP2Op87.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P19M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P19M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P19M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P19MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op87Layout = new javax.swing.GroupLayout(PanelP2Op87);
        PanelP2Op87.setLayout(PanelP2Op87Layout);
        PanelP2Op87Layout.setHorizontalGroup(
            PanelP2Op87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P19M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op87Layout.setVerticalGroup(
            PanelP2Op87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P19M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op87, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1100, 30, 30));

        PanelP2Op88.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P19P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P19P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P19P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P19PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op88Layout = new javax.swing.GroupLayout(PanelP2Op88);
        PanelP2Op88.setLayout(PanelP2Op88Layout);
        PanelP2Op88Layout.setHorizontalGroup(
            PanelP2Op88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P19P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op88Layout.setVerticalGroup(
            PanelP2Op88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P19P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op88, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1100, 30, 30));

        PanelP2Op89.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P19L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P19L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P19L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P19LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op89Layout = new javax.swing.GroupLayout(PanelP2Op89);
        PanelP2Op89.setLayout(PanelP2Op89Layout);
        PanelP2Op89Layout.setHorizontalGroup(
            PanelP2Op89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P19L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op89Layout.setVerticalGroup(
            PanelP2Op89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P19L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op89, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1100, 30, 30));

        PanelP2Op90.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P19N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P19N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P19N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P19NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op90Layout = new javax.swing.GroupLayout(PanelP2Op90);
        PanelP2Op90.setLayout(PanelP2Op90Layout);
        PanelP2Op90Layout.setHorizontalGroup(
            PanelP2Op90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P19N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op90Layout.setVerticalGroup(
            PanelP2Op90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P19N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op90, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1100, 30, 30));

        LabelP20.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP20.setForeground(new java.awt.Color(0, 0, 0));
        LabelP20.setText("20");
        LabelP20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1150, 510, 30));

        PanelP2Op91.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P20F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P20F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P20F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P20F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P20FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op91Layout = new javax.swing.GroupLayout(PanelP2Op91);
        PanelP2Op91.setLayout(PanelP2Op91Layout);
        PanelP2Op91Layout.setHorizontalGroup(
            PanelP2Op91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P20F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op91Layout.setVerticalGroup(
            PanelP2Op91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P20F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op91, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1160, 30, 30));

        PanelP2Op92.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P20M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P20M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P20M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P20MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op92Layout = new javax.swing.GroupLayout(PanelP2Op92);
        PanelP2Op92.setLayout(PanelP2Op92Layout);
        PanelP2Op92Layout.setHorizontalGroup(
            PanelP2Op92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P20M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op92Layout.setVerticalGroup(
            PanelP2Op92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P20M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op92, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1160, 30, 30));

        PanelP2Op93.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P20P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P20P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P20P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P20PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op93Layout = new javax.swing.GroupLayout(PanelP2Op93);
        PanelP2Op93.setLayout(PanelP2Op93Layout);
        PanelP2Op93Layout.setHorizontalGroup(
            PanelP2Op93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P20P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op93Layout.setVerticalGroup(
            PanelP2Op93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P20P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op93, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1160, 30, 30));

        PanelP2Op94.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P20L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P20L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P20L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P20LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op94Layout = new javax.swing.GroupLayout(PanelP2Op94);
        PanelP2Op94.setLayout(PanelP2Op94Layout);
        PanelP2Op94Layout.setHorizontalGroup(
            PanelP2Op94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P20L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op94Layout.setVerticalGroup(
            PanelP2Op94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P20L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op94, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1160, 30, 30));

        PanelP2Op95.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P20N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P20N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P20N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P20NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op95Layout = new javax.swing.GroupLayout(PanelP2Op95);
        PanelP2Op95.setLayout(PanelP2Op95Layout);
        PanelP2Op95Layout.setHorizontalGroup(
            PanelP2Op95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P20N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op95Layout.setVerticalGroup(
            PanelP2Op95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P20N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op95, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1160, 30, 30));

        LabelP21.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP21.setForeground(new java.awt.Color(0, 0, 0));
        LabelP21.setText("21");
        LabelP21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1210, 510, 30));

        PanelP2Op96.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P21F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P21F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P21F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P21F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P21FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op96Layout = new javax.swing.GroupLayout(PanelP2Op96);
        PanelP2Op96.setLayout(PanelP2Op96Layout);
        PanelP2Op96Layout.setHorizontalGroup(
            PanelP2Op96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P21F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op96Layout.setVerticalGroup(
            PanelP2Op96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P21F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op96, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1220, 30, 30));

        PanelP2Op97.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P21M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P21M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P21M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P21MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op97Layout = new javax.swing.GroupLayout(PanelP2Op97);
        PanelP2Op97.setLayout(PanelP2Op97Layout);
        PanelP2Op97Layout.setHorizontalGroup(
            PanelP2Op97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P21M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op97Layout.setVerticalGroup(
            PanelP2Op97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P21M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op97, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1220, 30, 30));

        PanelP2Op98.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P21P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P21P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P21P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P21PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op98Layout = new javax.swing.GroupLayout(PanelP2Op98);
        PanelP2Op98.setLayout(PanelP2Op98Layout);
        PanelP2Op98Layout.setHorizontalGroup(
            PanelP2Op98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P21P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op98Layout.setVerticalGroup(
            PanelP2Op98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P21P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op98, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1220, 30, 30));

        PanelP2Op99.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P21L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P21L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P21L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P21LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op99Layout = new javax.swing.GroupLayout(PanelP2Op99);
        PanelP2Op99.setLayout(PanelP2Op99Layout);
        PanelP2Op99Layout.setHorizontalGroup(
            PanelP2Op99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P21L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op99Layout.setVerticalGroup(
            PanelP2Op99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P21L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op99, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1220, 30, 30));

        PanelP2Op100.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P21N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P21N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P21N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P21NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op100Layout = new javax.swing.GroupLayout(PanelP2Op100);
        PanelP2Op100.setLayout(PanelP2Op100Layout);
        PanelP2Op100Layout.setHorizontalGroup(
            PanelP2Op100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P21N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op100Layout.setVerticalGroup(
            PanelP2Op100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P21N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op100, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1220, 30, 30));

        LabelP22.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP22.setForeground(new java.awt.Color(0, 0, 0));
        LabelP22.setText("22");
        LabelP22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1270, 510, 40));

        PanelP2Op101.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P22F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P22F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P22F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P22F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P22FMouseClicked(evt);
            }
        });

        PanelP2Op106.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P2F21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2F21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P2F21.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2F21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2F21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op106Layout = new javax.swing.GroupLayout(PanelP2Op106);
        PanelP2Op106.setLayout(PanelP2Op106Layout);
        PanelP2Op106Layout.setHorizontalGroup(
            PanelP2Op106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2F21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op106Layout.setVerticalGroup(
            PanelP2Op106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2F21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelP2Op107.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P2M21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2M21.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2M21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2M21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op107Layout = new javax.swing.GroupLayout(PanelP2Op107);
        PanelP2Op107.setLayout(PanelP2Op107Layout);
        PanelP2Op107Layout.setHorizontalGroup(
            PanelP2Op107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2M21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op107Layout.setVerticalGroup(
            PanelP2Op107Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2M21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelP2Op108.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P2P21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2P21.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2P21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2P21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op108Layout = new javax.swing.GroupLayout(PanelP2Op108);
        PanelP2Op108.setLayout(PanelP2Op108Layout);
        PanelP2Op108Layout.setHorizontalGroup(
            PanelP2Op108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2P21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op108Layout.setVerticalGroup(
            PanelP2Op108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2P21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelP2Op109.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P2L21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2L21.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2L21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2L21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op109Layout = new javax.swing.GroupLayout(PanelP2Op109);
        PanelP2Op109.setLayout(PanelP2Op109Layout);
        PanelP2Op109Layout.setHorizontalGroup(
            PanelP2Op109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2L21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op109Layout.setVerticalGroup(
            PanelP2Op109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2L21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelP2Op110.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P2N21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2N21.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P2N21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2N21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op110Layout = new javax.swing.GroupLayout(PanelP2Op110);
        PanelP2Op110.setLayout(PanelP2Op110Layout);
        PanelP2Op110Layout.setHorizontalGroup(
            PanelP2Op110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2N21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op110Layout.setVerticalGroup(
            PanelP2Op110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P2N21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelP2Op101Layout = new javax.swing.GroupLayout(PanelP2Op101);
        PanelP2Op101.setLayout(PanelP2Op101Layout);
        PanelP2Op101Layout.setHorizontalGroup(
            PanelP2Op101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P22F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelP2Op101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelP2Op101Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelP2Op106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(130, 130, 130)
                    .addComponent(PanelP2Op107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(70, 70, 70)
                    .addComponent(PanelP2Op108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(60, 60, 60)
                    .addComponent(PanelP2Op109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(70, 70, 70)
                    .addComponent(PanelP2Op110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PanelP2Op101Layout.setVerticalGroup(
            PanelP2Op101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P22F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelP2Op101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelP2Op101Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(PanelP2Op101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelP2Op106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PanelP2Op107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PanelP2Op108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PanelP2Op109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PanelP2Op110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(PanelP2Op101, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1280, 30, 30));

        PanelP2Op102.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P22M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P22M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P22M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P22MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op102Layout = new javax.swing.GroupLayout(PanelP2Op102);
        PanelP2Op102.setLayout(PanelP2Op102Layout);
        PanelP2Op102Layout.setHorizontalGroup(
            PanelP2Op102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P22M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op102Layout.setVerticalGroup(
            PanelP2Op102Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P22M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op102, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1280, 30, 30));

        PanelP2Op103.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P22P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P22P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P22P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P22PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op103Layout = new javax.swing.GroupLayout(PanelP2Op103);
        PanelP2Op103.setLayout(PanelP2Op103Layout);
        PanelP2Op103Layout.setHorizontalGroup(
            PanelP2Op103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P22P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op103Layout.setVerticalGroup(
            PanelP2Op103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P22P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op103, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1280, 30, 30));

        PanelP2Op104.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P22L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P22L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P22L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P22LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op104Layout = new javax.swing.GroupLayout(PanelP2Op104);
        PanelP2Op104.setLayout(PanelP2Op104Layout);
        PanelP2Op104Layout.setHorizontalGroup(
            PanelP2Op104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P22L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op104Layout.setVerticalGroup(
            PanelP2Op104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P22L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op104, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1280, 30, 30));

        PanelP2Op105.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P22N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P22N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P22N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P22NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op105Layout = new javax.swing.GroupLayout(PanelP2Op105);
        PanelP2Op105.setLayout(PanelP2Op105Layout);
        PanelP2Op105Layout.setHorizontalGroup(
            PanelP2Op105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P22N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op105Layout.setVerticalGroup(
            PanelP2Op105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P22N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op105, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1280, 30, 30));

        LabelP23.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP23.setForeground(new java.awt.Color(0, 0, 0));
        LabelP23.setText("23");
        LabelP23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1330, 510, 30));

        PanelP2Op111.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P23F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P23F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P23F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P23F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P23FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op111Layout = new javax.swing.GroupLayout(PanelP2Op111);
        PanelP2Op111.setLayout(PanelP2Op111Layout);
        PanelP2Op111Layout.setHorizontalGroup(
            PanelP2Op111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P23F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op111Layout.setVerticalGroup(
            PanelP2Op111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P23F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op111, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1340, 30, 30));

        PanelP2Op112.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P23M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P23M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P23M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P23MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op112Layout = new javax.swing.GroupLayout(PanelP2Op112);
        PanelP2Op112.setLayout(PanelP2Op112Layout);
        PanelP2Op112Layout.setHorizontalGroup(
            PanelP2Op112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P23M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op112Layout.setVerticalGroup(
            PanelP2Op112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P23M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op112, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1340, 30, 30));

        PanelP2Op113.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P23P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P23P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P23P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P23PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op113Layout = new javax.swing.GroupLayout(PanelP2Op113);
        PanelP2Op113.setLayout(PanelP2Op113Layout);
        PanelP2Op113Layout.setHorizontalGroup(
            PanelP2Op113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P23P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op113Layout.setVerticalGroup(
            PanelP2Op113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P23P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op113, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1340, 30, 30));

        PanelP2Op114.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P23L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P23L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P23L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P23LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op114Layout = new javax.swing.GroupLayout(PanelP2Op114);
        PanelP2Op114.setLayout(PanelP2Op114Layout);
        PanelP2Op114Layout.setHorizontalGroup(
            PanelP2Op114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P23L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op114Layout.setVerticalGroup(
            PanelP2Op114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P23L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op114, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1340, 30, 30));

        PanelP2Op115.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P23N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P23N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P23N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P23NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op115Layout = new javax.swing.GroupLayout(PanelP2Op115);
        PanelP2Op115.setLayout(PanelP2Op115Layout);
        PanelP2Op115Layout.setHorizontalGroup(
            PanelP2Op115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P23N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op115Layout.setVerticalGroup(
            PanelP2Op115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P23N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op115, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1340, 30, 30));

        LabelP24.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP24.setForeground(new java.awt.Color(0, 0, 0));
        LabelP24.setText("24");
        LabelP24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1390, 510, 30));

        PanelP2Op116.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P24F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P24F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P24F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P24F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P24FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op116Layout = new javax.swing.GroupLayout(PanelP2Op116);
        PanelP2Op116.setLayout(PanelP2Op116Layout);
        PanelP2Op116Layout.setHorizontalGroup(
            PanelP2Op116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P24F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op116Layout.setVerticalGroup(
            PanelP2Op116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P24F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op116, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1400, 30, 30));

        PanelP2Op117.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P24M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P24M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P24M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P24MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op117Layout = new javax.swing.GroupLayout(PanelP2Op117);
        PanelP2Op117.setLayout(PanelP2Op117Layout);
        PanelP2Op117Layout.setHorizontalGroup(
            PanelP2Op117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P24M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op117Layout.setVerticalGroup(
            PanelP2Op117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P24M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op117, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1400, 30, 30));

        PanelP2Op118.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P24P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P24P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P24P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P24PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op118Layout = new javax.swing.GroupLayout(PanelP2Op118);
        PanelP2Op118.setLayout(PanelP2Op118Layout);
        PanelP2Op118Layout.setHorizontalGroup(
            PanelP2Op118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P24P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op118Layout.setVerticalGroup(
            PanelP2Op118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P24P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op118, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1400, 30, 30));

        PanelP2Op119.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P24L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P24L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P24L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P24LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op119Layout = new javax.swing.GroupLayout(PanelP2Op119);
        PanelP2Op119.setLayout(PanelP2Op119Layout);
        PanelP2Op119Layout.setHorizontalGroup(
            PanelP2Op119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P24L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op119Layout.setVerticalGroup(
            PanelP2Op119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P24L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op119, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1400, 30, 30));

        PanelP2Op120.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P24N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P24N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P24N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P24NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op120Layout = new javax.swing.GroupLayout(PanelP2Op120);
        PanelP2Op120.setLayout(PanelP2Op120Layout);
        PanelP2Op120Layout.setHorizontalGroup(
            PanelP2Op120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P24N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op120Layout.setVerticalGroup(
            PanelP2Op120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P24N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op120, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1400, 30, 30));

        LabelP25.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP25.setForeground(new java.awt.Color(0, 0, 0));
        LabelP25.setText("25");
        LabelP25.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1440, 510, 50));

        PanelP2Op121.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P25F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P25F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P25F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P25F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P25FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op121Layout = new javax.swing.GroupLayout(PanelP2Op121);
        PanelP2Op121.setLayout(PanelP2Op121Layout);
        PanelP2Op121Layout.setHorizontalGroup(
            PanelP2Op121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P25F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op121Layout.setVerticalGroup(
            PanelP2Op121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P25F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op121, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1460, 30, 30));

        PanelP2Op122.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P25M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P25M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P25M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P25MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op122Layout = new javax.swing.GroupLayout(PanelP2Op122);
        PanelP2Op122.setLayout(PanelP2Op122Layout);
        PanelP2Op122Layout.setHorizontalGroup(
            PanelP2Op122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P25M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op122Layout.setVerticalGroup(
            PanelP2Op122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P25M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op122, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1460, 30, 30));

        PanelP2Op123.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P25P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P25P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P25P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P25PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op123Layout = new javax.swing.GroupLayout(PanelP2Op123);
        PanelP2Op123.setLayout(PanelP2Op123Layout);
        PanelP2Op123Layout.setHorizontalGroup(
            PanelP2Op123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P25P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op123Layout.setVerticalGroup(
            PanelP2Op123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P25P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op123, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1460, 30, 30));

        PanelP2Op124.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P25L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P25L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P25L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P25LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op124Layout = new javax.swing.GroupLayout(PanelP2Op124);
        PanelP2Op124.setLayout(PanelP2Op124Layout);
        PanelP2Op124Layout.setHorizontalGroup(
            PanelP2Op124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P25L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op124Layout.setVerticalGroup(
            PanelP2Op124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P25L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op124, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1460, 30, 30));

        PanelP2Op125.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P25N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P25N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P25N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P25NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op125Layout = new javax.swing.GroupLayout(PanelP2Op125);
        PanelP2Op125.setLayout(PanelP2Op125Layout);
        PanelP2Op125Layout.setHorizontalGroup(
            PanelP2Op125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P25N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op125Layout.setVerticalGroup(
            PanelP2Op125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P25N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op125, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1460, 30, 30));

        LabelP26.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP26.setForeground(new java.awt.Color(0, 0, 0));
        LabelP26.setText("26");
        LabelP26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1510, 510, 30));

        PanelP2Op126.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P26F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P26F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P26F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P26F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P26FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op126Layout = new javax.swing.GroupLayout(PanelP2Op126);
        PanelP2Op126.setLayout(PanelP2Op126Layout);
        PanelP2Op126Layout.setHorizontalGroup(
            PanelP2Op126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P26F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op126Layout.setVerticalGroup(
            PanelP2Op126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P26F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op126, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1520, 30, 30));

        PanelP2Op127.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P26M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P26M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P26M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P26MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op127Layout = new javax.swing.GroupLayout(PanelP2Op127);
        PanelP2Op127.setLayout(PanelP2Op127Layout);
        PanelP2Op127Layout.setHorizontalGroup(
            PanelP2Op127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P26M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op127Layout.setVerticalGroup(
            PanelP2Op127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P26M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op127, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1520, 30, 30));

        PanelP2Op128.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P26P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P26P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P26P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P26PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op128Layout = new javax.swing.GroupLayout(PanelP2Op128);
        PanelP2Op128.setLayout(PanelP2Op128Layout);
        PanelP2Op128Layout.setHorizontalGroup(
            PanelP2Op128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P26P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op128Layout.setVerticalGroup(
            PanelP2Op128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P26P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op128, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1520, 30, 30));

        PanelP2Op129.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P26L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P26L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P26L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P26LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op129Layout = new javax.swing.GroupLayout(PanelP2Op129);
        PanelP2Op129.setLayout(PanelP2Op129Layout);
        PanelP2Op129Layout.setHorizontalGroup(
            PanelP2Op129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P26L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op129Layout.setVerticalGroup(
            PanelP2Op129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P26L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op129, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1520, 30, 30));

        PanelP2Op130.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P26N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P26N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P26N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P26NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op130Layout = new javax.swing.GroupLayout(PanelP2Op130);
        PanelP2Op130.setLayout(PanelP2Op130Layout);
        PanelP2Op130Layout.setHorizontalGroup(
            PanelP2Op130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P26N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op130Layout.setVerticalGroup(
            PanelP2Op130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P26N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op130, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1520, 30, 30));

        LabelP27.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP27.setForeground(new java.awt.Color(0, 0, 0));
        LabelP27.setText("27");
        LabelP27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1570, 510, 30));

        PanelP2Op131.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P27F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P27F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P27F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P27F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P27FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op131Layout = new javax.swing.GroupLayout(PanelP2Op131);
        PanelP2Op131.setLayout(PanelP2Op131Layout);
        PanelP2Op131Layout.setHorizontalGroup(
            PanelP2Op131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P27F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op131Layout.setVerticalGroup(
            PanelP2Op131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P27F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op131, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1580, 30, 30));

        PanelP2Op132.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P27M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P27M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P27M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P27MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op132Layout = new javax.swing.GroupLayout(PanelP2Op132);
        PanelP2Op132.setLayout(PanelP2Op132Layout);
        PanelP2Op132Layout.setHorizontalGroup(
            PanelP2Op132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P27M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op132Layout.setVerticalGroup(
            PanelP2Op132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P27M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op132, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1580, 30, 30));

        PanelP2Op133.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P27P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P27P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P27P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P27PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op133Layout = new javax.swing.GroupLayout(PanelP2Op133);
        PanelP2Op133.setLayout(PanelP2Op133Layout);
        PanelP2Op133Layout.setHorizontalGroup(
            PanelP2Op133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P27P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op133Layout.setVerticalGroup(
            PanelP2Op133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P27P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op133, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1580, 30, 30));

        PanelP2Op134.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P27L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P27L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P27L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P27LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op134Layout = new javax.swing.GroupLayout(PanelP2Op134);
        PanelP2Op134.setLayout(PanelP2Op134Layout);
        PanelP2Op134Layout.setHorizontalGroup(
            PanelP2Op134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P27L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op134Layout.setVerticalGroup(
            PanelP2Op134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P27L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op134, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1580, 30, 30));

        PanelP2Op135.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P27N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P27N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P27N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P27NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op135Layout = new javax.swing.GroupLayout(PanelP2Op135);
        PanelP2Op135.setLayout(PanelP2Op135Layout);
        PanelP2Op135Layout.setHorizontalGroup(
            PanelP2Op135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P27N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op135Layout.setVerticalGroup(
            PanelP2Op135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P27N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op135, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1580, 30, 30));

        LabelP28.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP28.setForeground(new java.awt.Color(0, 0, 0));
        LabelP28.setText("28");
        LabelP28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1630, 510, 30));

        PanelP2Op136.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P28F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P28F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P28F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P28F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P28FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op136Layout = new javax.swing.GroupLayout(PanelP2Op136);
        PanelP2Op136.setLayout(PanelP2Op136Layout);
        PanelP2Op136Layout.setHorizontalGroup(
            PanelP2Op136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P28F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op136Layout.setVerticalGroup(
            PanelP2Op136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P28F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op136, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1640, 30, 30));

        PanelP2Op137.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P28M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P28M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P28M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P28MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op137Layout = new javax.swing.GroupLayout(PanelP2Op137);
        PanelP2Op137.setLayout(PanelP2Op137Layout);
        PanelP2Op137Layout.setHorizontalGroup(
            PanelP2Op137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P28M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op137Layout.setVerticalGroup(
            PanelP2Op137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P28M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op137, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1640, 30, 30));

        PanelP2Op138.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P28P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P28P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P28P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P28PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op138Layout = new javax.swing.GroupLayout(PanelP2Op138);
        PanelP2Op138.setLayout(PanelP2Op138Layout);
        PanelP2Op138Layout.setHorizontalGroup(
            PanelP2Op138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P28P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op138Layout.setVerticalGroup(
            PanelP2Op138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P28P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op138, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1640, 30, 30));

        PanelP2Op139.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P28L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P28L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P28L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P28LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op139Layout = new javax.swing.GroupLayout(PanelP2Op139);
        PanelP2Op139.setLayout(PanelP2Op139Layout);
        PanelP2Op139Layout.setHorizontalGroup(
            PanelP2Op139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P28L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op139Layout.setVerticalGroup(
            PanelP2Op139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P28L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op139, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1640, 30, 30));

        PanelP2Op140.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P28N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P28N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P28N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P28NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op140Layout = new javax.swing.GroupLayout(PanelP2Op140);
        PanelP2Op140.setLayout(PanelP2Op140Layout);
        PanelP2Op140Layout.setHorizontalGroup(
            PanelP2Op140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P28N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op140Layout.setVerticalGroup(
            PanelP2Op140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P28N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op140, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1640, 30, 30));

        LabelP29.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP29.setForeground(new java.awt.Color(0, 0, 0));
        LabelP29.setText("29");
        LabelP29.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1690, 510, 30));

        PanelP2Op141.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P29F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P29F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P29F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P29F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P29FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op141Layout = new javax.swing.GroupLayout(PanelP2Op141);
        PanelP2Op141.setLayout(PanelP2Op141Layout);
        PanelP2Op141Layout.setHorizontalGroup(
            PanelP2Op141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P29F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op141Layout.setVerticalGroup(
            PanelP2Op141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P29F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op141, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1700, 30, 30));

        PanelP2Op142.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P29M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P29M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P29M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P29MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op142Layout = new javax.swing.GroupLayout(PanelP2Op142);
        PanelP2Op142.setLayout(PanelP2Op142Layout);
        PanelP2Op142Layout.setHorizontalGroup(
            PanelP2Op142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P29M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op142Layout.setVerticalGroup(
            PanelP2Op142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P29M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op142, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1700, 30, 30));

        PanelP2Op143.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P29P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P29P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P29P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P29PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op143Layout = new javax.swing.GroupLayout(PanelP2Op143);
        PanelP2Op143.setLayout(PanelP2Op143Layout);
        PanelP2Op143Layout.setHorizontalGroup(
            PanelP2Op143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P29P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op143Layout.setVerticalGroup(
            PanelP2Op143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P29P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op143, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1700, 30, 30));

        PanelP2Op144.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P29L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P29L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P29L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P29LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op144Layout = new javax.swing.GroupLayout(PanelP2Op144);
        PanelP2Op144.setLayout(PanelP2Op144Layout);
        PanelP2Op144Layout.setHorizontalGroup(
            PanelP2Op144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P29L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op144Layout.setVerticalGroup(
            PanelP2Op144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P29L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op144, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1700, 30, 30));

        PanelP2Op145.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P29N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P29N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P29N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P29NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op145Layout = new javax.swing.GroupLayout(PanelP2Op145);
        PanelP2Op145.setLayout(PanelP2Op145Layout);
        PanelP2Op145Layout.setHorizontalGroup(
            PanelP2Op145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P29N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op145Layout.setVerticalGroup(
            PanelP2Op145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P29N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op145, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1700, 30, 30));

        LabelP30.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LabelP30.setForeground(new java.awt.Color(0, 0, 0));
        LabelP30.setText("30");
        LabelP30.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabelP30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(LabelP30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1750, 510, 30));

        PanelP2Op146.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P30F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P30F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P30F.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P30F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P30FMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op146Layout = new javax.swing.GroupLayout(PanelP2Op146);
        PanelP2Op146.setLayout(PanelP2Op146Layout);
        PanelP2Op146Layout.setHorizontalGroup(
            PanelP2Op146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P30F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op146Layout.setVerticalGroup(
            PanelP2Op146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P30F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op146, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1760, 30, 30));

        PanelP2Op147.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P30M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P30M.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P30M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P30MMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op147Layout = new javax.swing.GroupLayout(PanelP2Op147);
        PanelP2Op147.setLayout(PanelP2Op147Layout);
        PanelP2Op147Layout.setHorizontalGroup(
            PanelP2Op147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P30M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op147Layout.setVerticalGroup(
            PanelP2Op147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P30M, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op147, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1760, 30, 30));

        PanelP2Op148.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P30P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P30P.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P30P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P30PMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op148Layout = new javax.swing.GroupLayout(PanelP2Op148);
        PanelP2Op148.setLayout(PanelP2Op148Layout);
        PanelP2Op148Layout.setHorizontalGroup(
            PanelP2Op148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P30P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op148Layout.setVerticalGroup(
            PanelP2Op148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P30P, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op148, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 1760, 30, 30));

        PanelP2Op149.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P30L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P30L.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P30L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P30LMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op149Layout = new javax.swing.GroupLayout(PanelP2Op149);
        PanelP2Op149.setLayout(PanelP2Op149Layout);
        PanelP2Op149Layout.setHorizontalGroup(
            PanelP2Op149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P30L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op149Layout.setVerticalGroup(
            PanelP2Op149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P30L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op149, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 1760, 30, 30));

        PanelP2Op150.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        P30N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P30N.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton1.jpg"))); // NOI18N
        P30N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P30NMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelP2Op150Layout = new javax.swing.GroupLayout(PanelP2Op150);
        PanelP2Op150.setLayout(PanelP2Op150Layout);
        PanelP2Op150Layout.setHorizontalGroup(
            PanelP2Op150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P30N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelP2Op150Layout.setVerticalGroup(
            PanelP2Op150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P30N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(PanelP2Op150, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 1760, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("1.-");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("2.-");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("3.-");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("4.-");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("5.-");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("6.-");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("7.-");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("8.-");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("9.-");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("10.-");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("11.-");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("12.-");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("13.-");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("14.-");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 800, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("15.-");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 860, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("16.-");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 920, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("17.-");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 980, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("18.-");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1040, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("19.-");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1100, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("20.-");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1160, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("21.-");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1220, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("22.-");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1270, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("23.-");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1340, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("24.-");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1400, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("25.-");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1450, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("26.-");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1520, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("27.-");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1580, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("28.-");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1640, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("29.-");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1700, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("30.-");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1760, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator1.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1170, 5));

        jSeparator2.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator2.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1170, 5));

        jSeparator3.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator3.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1170, 5));

        jSeparator4.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator4.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1170, 5));

        jSeparator5.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator5.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator5.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1170, 5));

        jSeparator6.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator6.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator6.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1170, 5));

        jSeparator7.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator7.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator7.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 1170, 5));

        jSeparator8.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator8.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator8.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1170, 5));

        jSeparator9.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator9.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator9.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1170, 5));

        jSeparator10.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator10.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator10.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1170, 5));

        jSeparator11.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator11.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator11.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1170, 5));

        jSeparator12.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator12.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator12.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 1170, 5));

        jSeparator13.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator13.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator13.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 1170, 5));

        jSeparator14.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator14.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator14.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, 1170, 5));

        jSeparator15.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator15.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator15.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 900, 1170, 5));

        jSeparator16.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator16.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator16.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 960, 1170, 5));

        jSeparator17.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator17.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator17.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1020, 1170, 5));

        jSeparator18.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator18.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator18.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1080, 1170, 5));

        jSeparator19.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator19.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator19.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1140, 1170, 5));

        jSeparator20.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator20.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator20.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1200, 1170, 5));

        jSeparator21.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator21.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator21.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1260, 1170, 5));

        jSeparator22.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator22.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator22.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1320, 1170, 5));

        jSeparator23.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator23.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator23.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1380, 1170, 5));

        jSeparator24.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator24.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator24.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1440, 1170, 5));

        jSeparator25.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator25.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator25.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1500, 1170, 5));

        jSeparator26.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator26.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator26.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1560, 1170, -1));

        jSeparator27.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator27.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator27.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1620, 1170, 5));

        jSeparator28.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator28.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator28.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1680, 1170, 5));

        jSeparator29.setBackground(new java.awt.Color(224, 224, 224));
        jSeparator29.setForeground(new java.awt.Color(224, 224, 224));
        jSeparator29.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        jPanel2.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1740, 1170, 5));

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1180, 450));
        jScrollPane1.getAccessibleContext().setAccessibleParent(this);

        jButton1.setBackground(new java.awt.Color(192, 189, 44));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 130, 40));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setText("Nombre");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 50));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 450, 30));

        jLabelApellidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelApellidos.setText("Apellidos");
        jPanel1.add(jLabelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 50));
        jPanel1.add(jTextFieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 450, 30));

        jLabelEdad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEdad.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEdad.setText("Edad");
        jPanel1.add(jLabelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 160, 50));
        jPanel1.add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 180, 30));

        jLabelSexo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSexo.setText("Sexo");
        jPanel1.add(jLabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 160, 50));

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Femenino", "Masculino" }));
        jPanel1.add(jComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void P1FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1FMouseClicked
        if (evento != true) {
            P1F.setIcon(icon2);
            P1M.setEnabled(false);
            P1P.setEnabled(false);
            P1L.setEnabled(false);
            P1N.setEnabled(false);
            Bipolaridad = Bipolaridad + 4;
            System.out.println("Bipolaridad suma 4 puntos");
            actualizarEvento();
            evento = true;
        }
    }//GEN-LAST:event_P1FMouseClicked

    private void P1MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1MMouseClicked
        if (evento != true) {
        P1F.setEnabled(false);
        P1M.setIcon(icon2);
        P1P.setEnabled(false);
        P1L.setEnabled(false);
        P1N.setEnabled(false);
        System.out.println("Bipolaridad suma 3 puntos");        
        Bipolaridad = Bipolaridad + 3;
        actualizarEvento();
        evento = true;
        } 
    }//GEN-LAST:event_P1MMouseClicked

    private void P1PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1PMouseClicked
        if (evento != true) {
        P1F.setEnabled(false);
        P1M.setEnabled(false);
        P1P.setIcon(icon2);
        P1L.setEnabled(false);
        P1N.setEnabled(false);
        System.out.println("Bipolaridad suma 2 puntos");
        Bipolaridad = Bipolaridad + 2;
        actualizarEvento();
        evento = true;
        }
    }//GEN-LAST:event_P1PMouseClicked

    private void P1LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1LMouseClicked
        if (evento != true) {
            P1F.setEnabled(false);
            P1M.setEnabled(false);
            P1P.setEnabled(false);
            P1L.setIcon(icon2);
            P1N.setEnabled(false);
            System.out.println("Bipolaridad suma 1 puntos");
            Bipolaridad = Bipolaridad + 1;
            actualizarEvento();
            evento = true;
        }
    }//GEN-LAST:event_P1LMouseClicked

    private void P1NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1NMouseClicked
        if (evento != true) {
            P1F.setEnabled(false);
            P1M.setEnabled(false);
            P1P.setEnabled(false);
            P1L.setEnabled(false);
            P1N.setIcon(icon2);
            System.out.println("Bipolaridad suma 0 puntos");
            Bipolaridad = Bipolaridad + 0;
            actualizarEvento(); 
            evento = true;
        }
    }//GEN-LAST:event_P1NMouseClicked

    private void P2FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2FMouseClicked
        if (evento2 != true) {
            P2F.setIcon(icon2);
            P2M.setEnabled(false);
            P2P.setEnabled(false);
            P2L.setEnabled(false);
            P2N.setEnabled(false);
            System.out.println("Bipolaridad suma 4 puntos");
            Bipolaridad = Bipolaridad + 4;
            actualizarEvento();
            evento2 = true;
        }
    }//GEN-LAST:event_P2FMouseClicked

    private void P2MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2MMouseClicked
         if (evento2 != true) {
        P2F.setEnabled(false);
        P2M.setIcon(icon2);
        P2P.setEnabled(false);
        P2L.setEnabled(false);
        P2N.setEnabled(false);
        System.out.println("Bipolaridad suma 3 puntos");
        Bipolaridad = Bipolaridad + 3;
        actualizarEvento();
        evento2 = true;
        }
    }//GEN-LAST:event_P2MMouseClicked

    private void P2PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2PMouseClicked
        if (evento2 != true) {
        P2F.setEnabled(false);
        P2M.setEnabled(false);
        P2P.setIcon(icon2);
        P2L.setEnabled(false);
        P2N.setEnabled(false);
        System.out.println("Bipolaridad suma 2 puntos");
        Bipolaridad = Bipolaridad + 2;
        actualizarEvento();
        evento2 = true;
        }
    }//GEN-LAST:event_P2PMouseClicked

    private void P2LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2LMouseClicked
       if (evento2 != true) {
            P2F.setEnabled(false);
            P2M.setEnabled(false);
            P2P.setEnabled(false);
            P2L.setIcon(icon2);
            P2N.setEnabled(false);
            System.out.println("Bipolaridad suma 1 puntos");
            Bipolaridad = Bipolaridad + 1;
            actualizarEvento();
            evento2 = true;            
        }
    }//GEN-LAST:event_P2LMouseClicked

    private void P2NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2NMouseClicked
       if (evento2 != true) {
            P2F.setEnabled(false);
            P2M.setEnabled(false);
            P2P.setEnabled(false);
            P2L.setEnabled(false);
            P2N.setIcon(icon2);
            Bipolaridad = Bipolaridad + 0;
            System.out.print("Bipolaridad suma 0 puntos");
            actualizarEvento();
            evento2 = true;
        }
    }//GEN-LAST:event_P2NMouseClicked

    private void P3FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P3FMouseClicked
        if (evento3 != true) {
            P3N.setEnabled(false);
            P3M.setEnabled(false);
            P3P.setEnabled(false);
            P3L.setEnabled(false);
            P3F.setIcon(icon2);
            Bipolaridad = Bipolaridad + 4;
            System.out.print(Bipolaridad);
            actualizarEvento();
            evento3 = true;       
    }//GEN-LAST:event_P3FMouseClicked
    }
    
    private void P3MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P3MMouseClicked
      if (evento3 != true) {
            P3F.setEnabled(false);
	    P3M.setIcon(icon2);
            P3P.setEnabled(false);
            P3L.setEnabled(false);
            P3N.setEnabled(false);
            Bipolaridad = Bipolaridad + 3;
            System.out.println("Bipolaridad suma 3 puntos");
            actualizarEvento();
            evento3 = true;
      } 
    }//GEN-LAST:event_P3MMouseClicked

    private void P3PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P3PMouseClicked
       if (evento3 != true) {
            P3F.setEnabled(false);
	    P3M.setEnabled(false);
            P3P.setIcon(icon2);
            P3L.setEnabled(false);
            P3N.setEnabled(false);
            Bipolaridad = Bipolaridad + 2;
            System.out.println("Bipolaridad suma 2 puntos");
            actualizarEvento();
            evento3 = true;
        }
    }//GEN-LAST:event_P3PMouseClicked

    private void P3LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P3LMouseClicked
        if (evento3 != true) {
            P3F.setEnabled(false);
	    P3M.setEnabled(false);
            P3P.setEnabled(false);
            P3L.setIcon(icon2);
            P3N.setEnabled(false);
            Bipolaridad = Bipolaridad + 1;
            System.out.println("Bipolaridad suma 1 puntos");
            actualizarEvento();
            evento3 = true;
        }
    }//GEN-LAST:event_P3LMouseClicked

    private void P3NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P3NMouseClicked
        if (evento3 != true) {
            P3F.setEnabled(false);
	    P3M.setEnabled(false);
            P3P.setEnabled(false);
            P3L.setEnabled(false);
            P3N.setIcon(icon2);
            Bipolaridad = Bipolaridad + 0;
            System.out.println("Bipolaridad suma 0 puntos");
            actualizarEvento();
            evento3 = true;
        }
    }//GEN-LAST:event_P3NMouseClicked

    private void P4FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P4FMouseClicked
        if (evento4 != true) {
            P4F.setIcon(icon2);
            P4M.setEnabled(false);
            P4P.setEnabled(false);
            P4L.setEnabled(false);
            P4N.setEnabled(false);
            Bipolaridad = Bipolaridad + 4;
            System.out.println("Bipolaridad suma 4 puntos");
            actualizarEvento();
            evento4 = true;
        }
    }//GEN-LAST:event_P4FMouseClicked

    private void P4MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P4MMouseClicked
        if (evento4 != true) {
            P4F.setEnabled(false);
	    P4M.setIcon(icon2);
            P4P.setEnabled(false);
            P4L.setEnabled(false);
            P4N.setEnabled(false);
            Bipolaridad = Bipolaridad + 3;
            System.out.println("Bipolaridad suma 3 puntos");
            actualizarEvento();
            evento4 = true;
        }
    }//GEN-LAST:event_P4MMouseClicked

    private void P4PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P4PMouseClicked
            if (evento4 != true) {
            P4F.setEnabled(false);
	    P4M.setEnabled(false);
            P4P.setIcon(icon2);
            P4L.setEnabled(false);
            P4N.setEnabled(false);
            Bipolaridad = Bipolaridad + 2;
            System.out.println("Bipolaridad suma 2 puntos");
            actualizarEvento();
            evento4 = true;
        }
    }//GEN-LAST:event_P4PMouseClicked

    private void P4LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P4LMouseClicked
        if (evento4 != true) {
            P4F.setEnabled(false);
	    P4M.setEnabled(false);
            P4P.setEnabled(false);
            P4L.setIcon(icon2);
            P4N.setEnabled(false);
            Bipolaridad = Bipolaridad + 1;
            System.out.println("Bipolaridad suma 1 puntos");
            actualizarEvento();
            evento4 = true;
        }
    }//GEN-LAST:event_P4LMouseClicked

    private void P4NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P4NMouseClicked
        if (evento4 != true) {
            P4F.setEnabled(false);
	    P4M.setEnabled(false);
            P4P.setEnabled(false);
            P4L.setEnabled(false);
            P4N.setIcon(icon2);
            Bipolaridad = Bipolaridad + 0;
            System.out.println("Bipolaridad suma 0 puntos");
            actualizarEvento();
            evento4 = true;
        }
    }//GEN-LAST:event_P4NMouseClicked

    private void P5FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P5FMouseClicked
            if (evento5 != true) {
            P5F.setIcon(icon2);
            P5M.setEnabled(false);
            P5P.setEnabled(false);
            P5L.setEnabled(false);
            P5N.setEnabled(false);
            Bipolaridad = Bipolaridad + 4;
            System.out.println("Bipolaridad suma 4 puntos");
            actualizarEvento();
            evento5 = true;
        }
    }//GEN-LAST:event_P5FMouseClicked

    private void P5MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P5MMouseClicked
        if (evento5 != true) {
            P5F.setEnabled(false);
	    P5M.setIcon(icon2);
            P5P.setEnabled(false);
            P5L.setEnabled(false);
            P5N.setEnabled(false);
            Bipolaridad = Bipolaridad + 3;
            System.out.println("Bipolaridad suma 3 puntos");
            actualizarEvento();
            evento5 = true;
        }
    }//GEN-LAST:event_P5MMouseClicked

    private void P5PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P5PMouseClicked
        if (evento5 != true) {
            P5F.setEnabled(false);
	    P5M.setEnabled(false);
            P5P.setIcon(icon2);
            P5L.setEnabled(false);
            P5N.setEnabled(false);
            Bipolaridad = Bipolaridad + 2;
            System.out.println("Bipolaridad suma 2 puntos");
            actualizarEvento();
            evento3 = true;
        }
    }//GEN-LAST:event_P5PMouseClicked

    private void P5LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P5LMouseClicked
        if (evento5 != true) {
            P5F.setEnabled(false);
	    P5M.setEnabled(false);
            P5P.setEnabled(false);
            P5L.setIcon(icon2);
            P5N.setEnabled(false);
            Bipolaridad = Bipolaridad + 1;
            System.out.println("Bipolaridad suma 1 puntos");
            actualizarEvento();
            evento5 = true;
        }
    }//GEN-LAST:event_P5LMouseClicked

    private void P5NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P5NMouseClicked
        if (evento5 != true) {
            P5F.setEnabled(false);
	    P5M.setEnabled(false);
            P5P.setEnabled(false);
            P5L.setEnabled(false);
            P5N.setIcon(icon2);
            Bipolaridad = Bipolaridad + 0;
            System.out.println("Bipolaridad suma 0 puntos");
            actualizarEvento();
            evento5 = true;
        }
    }//GEN-LAST:event_P5NMouseClicked

    private void P6FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P6FMouseClicked
        if (evento6 != true) {
            P6F.setIcon(icon2);
            P6M.setEnabled(false);
            P6P.setEnabled(false);
            P6L.setEnabled(false);
            P6N.setEnabled(false);
            Bipolaridad = Bipolaridad + 4;
            System.out.println("Bipolaridad suma 4 puntos");
            actualizarEvento();
            evento6 = true;
        }
    }//GEN-LAST:event_P6FMouseClicked

    private void P6MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P6MMouseClicked
        if (evento6 != true) {
            P6F.setEnabled(false);
	    P6M.setIcon(icon2);
            P6P.setEnabled(false);
            P6L.setEnabled(false);
            P6N.setEnabled(false);
            Bipolaridad = Bipolaridad + 3;
            System.out.println("Bipolaridad suma 3 puntos");
            actualizarEvento();
            evento6 = true;
        }
    }//GEN-LAST:event_P6MMouseClicked

    private void P6PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P6PMouseClicked
        if (evento6 != true) {
            P6F.setEnabled(false);
	    P6M.setEnabled(false);
            P6P.setIcon(icon2);
            P6L.setEnabled(false);
            P6N.setEnabled(false);
            Bipolaridad = Bipolaridad + 2;
            System.out.println("Bipolaridad suma 2 puntos");
            actualizarEvento();
            evento6 = true;
        }
    }//GEN-LAST:event_P6PMouseClicked

    private void P6LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P6LMouseClicked
        if (evento6 != true) {
            P6F.setEnabled(false);
	    P6M.setEnabled(false);
            P6P.setEnabled(false);
            P6L.setIcon(icon2);
            P6N.setEnabled(false);
            Bipolaridad = Bipolaridad + 1;
            System.out.println("Bipolaridad suma 1 puntos");
            actualizarEvento();
            evento6 = true;
        }
    }//GEN-LAST:event_P6LMouseClicked

    private void P6NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P6NMouseClicked
        if (evento6 != true) {
            P6F.setEnabled(false);
	    P6M.setEnabled(false);
            P6P.setEnabled(false);
            P6L.setEnabled(false);
            P6N.setIcon(icon2);
            Bipolaridad = Bipolaridad + 0;
            System.out.println("Bipolaridad suma 0 puntos");
            actualizarEvento();
            evento6 = true;
        }
    }//GEN-LAST:event_P6NMouseClicked

    private void P7FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P7FMouseClicked
        if (evento7 != true) {
            P7F.setIcon(icon2);
            P7M.setEnabled(false);
            P7P.setEnabled(false);
            P7L.setEnabled(false);
            P7N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 4;
            System.out.println("Esquizofrenia suma 4 puntos");
            actualizarEvento();
            evento7 = true;
        }
    }//GEN-LAST:event_P7FMouseClicked

    private void P7MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P7MMouseClicked
        if (evento7 != true) {
            P7F.setEnabled(false);
	    P7M.setIcon(icon2);
            P7P.setEnabled(false);
            P7L.setEnabled(false);
            P7N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 3;
            System.out.println("Esquizofrenia suma 3 puntos");
            actualizarEvento();
            evento7 = true;
        }
    }//GEN-LAST:event_P7MMouseClicked

    private void P7PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P7PMouseClicked
        if (evento7 != true) {
            P7F.setEnabled(false);
	    P7M.setEnabled(false);
            P7P.setIcon(icon2);
            P7L.setEnabled(false);
            P7N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 2;
            System.out.println("Esquizofrenia suma 2 puntos");
            actualizarEvento();
            evento7 = true;
        }
    }//GEN-LAST:event_P7PMouseClicked

    private void P7LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P7LMouseClicked
        if (evento7 != true) {
            P7F.setEnabled(false);
	    P7M.setEnabled(false);
            P7P.setEnabled(false);
            P7L.setIcon(icon2);
            P7N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 1;
            System.out.println("Esquizofrenia suma 1 puntos");
            actualizarEvento();
            evento7 = true;
        }
    }//GEN-LAST:event_P7LMouseClicked

    private void P7NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P7NMouseClicked
        if (evento7 != true) {
            P7F.setEnabled(false);
	    P7M.setEnabled(false);
            P7P.setEnabled(false);
            P7L.setEnabled(false);
            P7N.setIcon(icon2);
            Esquizofrenia = Esquizofrenia + 0;
            System.out.println("Esquizofrenia suma 0 puntos");
            actualizarEvento();
            evento7 = true;
        }
    }//GEN-LAST:event_P7NMouseClicked

    private void P8FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P8FMouseClicked
        if (evento8 != true) {
            P8F.setIcon(icon2);
            P8M.setEnabled(false);
            P8P.setEnabled(false);
            P8L.setEnabled(false);
            P8N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 4;
            System.out.println("Esquizofrenia suma 4 puntos");
            actualizarEvento();
            evento8 = true;
        }
    }//GEN-LAST:event_P8FMouseClicked

    private void P8MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P8MMouseClicked
        if (evento8 != true) {
            P8F.setEnabled(false);
	    P8M.setIcon(icon2);
            P8P.setEnabled(false);
            P8L.setEnabled(false);
            P8N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 3;
            System.out.println("Esquizofrenia suma 3 puntos");
            actualizarEvento();
            evento8 = true;
        }
    }//GEN-LAST:event_P8MMouseClicked

    private void P8PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P8PMouseClicked
        if (evento8 != true) {
            P8F.setEnabled(false);
	    P8M.setEnabled(false);
            P8P.setIcon(icon2);
            P8L.setEnabled(false);
            P8N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 2;
            System.out.println("Esquizofrenia suma 2 puntos");
            actualizarEvento();
            evento8 = true;
        }
    }//GEN-LAST:event_P8PMouseClicked

    private void P8LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P8LMouseClicked
       if (evento8 != true) {
            P8F.setEnabled(false);
	    P8M.setEnabled(false);
            P8P.setEnabled(false);
            P8L.setIcon(icon2);
            P8N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 1;
            System.out.println("Esquizofrenia suma 1 puntos");
            actualizarEvento();
            evento8 = true;
        }
    }//GEN-LAST:event_P8LMouseClicked

    private void P8NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P8NMouseClicked
        if (evento8 != true) {
            P8F.setEnabled(false);
	    P8M.setEnabled(false);
            P8P.setEnabled(false);
            P8L.setEnabled(false);
            P8N.setIcon(icon2);
            Esquizofrenia = Esquizofrenia + 0;
            System.out.println("Esquizofrenia suma 0 puntos");
            actualizarEvento();
            evento8 = true;
        }
    }//GEN-LAST:event_P8NMouseClicked

    private void P9FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P9FMouseClicked
        if (evento9 != true) {
            P9F.setIcon(icon2);
            P9M.setEnabled(false);
            P9P.setEnabled(false);
            P9L.setEnabled(false);
            P9N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 4;
            System.out.println("Esquizofrenia suma 4 puntos");
            actualizarEvento();
            evento9 = true;
        }
    }//GEN-LAST:event_P9FMouseClicked

    private void P9MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P9MMouseClicked
        if (evento9 != true) {
            P9F.setEnabled(false);
	    P9M.setIcon(icon2);
            P9P.setEnabled(false);
            P9L.setEnabled(false);
            P9N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 3;
            System.out.println("Esquizofrenia suma 3 puntos");
            actualizarEvento();
            evento9 = true;
        }
    }//GEN-LAST:event_P9MMouseClicked

    private void P9PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P9PMouseClicked
        if (evento9 != true) {
            P9F.setEnabled(false);
	    P9M.setEnabled(false);
            P9P.setIcon(icon2);
            P9L.setEnabled(false);
            P9N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 2;
            System.out.println("Esquizofrenia suma 2 puntos");
            actualizarEvento();
            evento9 = true;
        }
    }//GEN-LAST:event_P9PMouseClicked

    private void P9LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P9LMouseClicked
        if (evento9 != true) {
            P9F.setEnabled(false);
	    P9M.setEnabled(false);
            P9P.setEnabled(false);
            P9L.setIcon(icon2);
            P9N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 1;
            System.out.println("Esquizofrenia suma 1 puntos");
            actualizarEvento();
            evento9 = true;
        }
    }//GEN-LAST:event_P9LMouseClicked

    private void P9NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P9NMouseClicked
        if (evento9 != true) {
            P9F.setEnabled(false);
	    P9M.setEnabled(false);
            P9P.setEnabled(false);
            P9L.setEnabled(false);
            P9N.setIcon(icon2);
            Esquizofrenia = Esquizofrenia + 0;
            System.out.println("Esquizofrenia suma 0 puntos");
            actualizarEvento();
            evento9 = true;
        }
    }//GEN-LAST:event_P9NMouseClicked

    private void P10FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P10FMouseClicked
        if (evento10 != true) {
            P10F.setIcon(icon2);
            P10M.setEnabled(false);
            P10P.setEnabled(false);
            P10L.setEnabled(false);
            P10N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 4;
            System.out.println("Esquizofrenia suma 4 puntos");
            actualizarEvento();
            evento10 = true;
        }
    }//GEN-LAST:event_P10FMouseClicked

    private void P10MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P10MMouseClicked
        if (evento10 != true) {
            P10F.setEnabled(false);
	    P10M.setIcon(icon2);
            P10P.setEnabled(false);
            P10L.setEnabled(false);
            P10N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 3;
            System.out.println("Esquizofrenia suma 3 puntos");
            actualizarEvento();
            evento10 = true;
        }
    }//GEN-LAST:event_P10MMouseClicked

    private void P10PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P10PMouseClicked
        if (evento10 != true) {
            P10F.setEnabled(false);
	    P10M.setEnabled(false);
            P10P.setIcon(icon2);
            P10L.setEnabled(false);
            P10N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 2;
            System.out.println("Esquizofrenia suma 2 puntos");
            actualizarEvento();
            evento10 = true;
        }
    }//GEN-LAST:event_P10PMouseClicked

    private void P10LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P10LMouseClicked
        if (evento10 != true) {
            P10F.setEnabled(false);
	    P10M.setEnabled(false);
            P10P.setEnabled(false);
            P10L.setIcon(icon2);
            P10N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 1;
            System.out.println("Esquizofrenia suma 1 puntos");
            actualizarEvento();
            evento10 = true;
        }
    }//GEN-LAST:event_P10LMouseClicked

    private void P10NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P10NMouseClicked
        if (evento10 != true) {
            P10F.setEnabled(false);
	    P10M.setEnabled(false);
            P10P.setEnabled(false);
            P10L.setEnabled(false);
            P10N.setIcon(icon2);
            Esquizofrenia = Esquizofrenia + 0;
            System.out.println("Esquizofrenia suma 0 puntos");
            actualizarEvento();
            evento10 = true;
        }
    }//GEN-LAST:event_P10NMouseClicked

    private void P11FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P11FMouseClicked
        if (evento11 != true) {
            P11F.setIcon(icon2);
            P11M.setEnabled(false);
            P11P.setEnabled(false);
            P11L.setEnabled(false);
            P11N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 4;
            System.out.println("Esquizofrenia suma 4 puntos");
            actualizarEvento();
            evento11 = true;
        }
    }//GEN-LAST:event_P11FMouseClicked

    private void P11MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P11MMouseClicked
        if (evento11 != true) {
            P11F.setEnabled(false);
	    P11M.setIcon(icon2);
            P11P.setEnabled(false);
            P11L.setEnabled(false);
            P11N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 3;
            System.out.println("Esquizofrenia suma 3 puntos");
            actualizarEvento();
            evento11 = true;
        }
    }//GEN-LAST:event_P11MMouseClicked

    private void P11PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P11PMouseClicked
        if (evento11 != true) {
            P11F.setEnabled(false);
	    P11M.setEnabled(false);
            P11P.setIcon(icon2);
            P11L.setEnabled(false);
            P11N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 2;
            System.out.println("Esquizofrenia suma 2 puntos");
            actualizarEvento();
            evento11 = true;
        }
    }//GEN-LAST:event_P11PMouseClicked

    private void P11LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P11LMouseClicked
        if (evento11 != true) {
            P11F.setEnabled(false);
	    P11M.setEnabled(false);
            P11P.setEnabled(false);
            P11L.setIcon(icon2);
            P11N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 1;
            System.out.println("Esquizofrenia suma 1 puntos");
            actualizarEvento();
            evento11 = true;
        }
    }//GEN-LAST:event_P11LMouseClicked

    private void P11NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P11NMouseClicked
        if (evento11 != true) {
            P11F.setEnabled(false);
	    P11M.setEnabled(false);
            P11P.setEnabled(false);
            P11L.setEnabled(false);
            P11N.setIcon(icon2);
            Esquizofrenia = Esquizofrenia + 0;
            System.out.println("Esquizofrenia suma 0 puntos");
            actualizarEvento();
            evento11 = true;
        }
    }//GEN-LAST:event_P11NMouseClicked

    private void P12FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P12FMouseClicked
        if (evento12 != true) {
            P12F.setIcon(icon2);
            P12M.setEnabled(false);
            P12P.setEnabled(false);
            P12L.setEnabled(false);
            P12N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 4;
            System.out.println("Esquizofrenia suma 4 puntos");
            actualizarEvento();
            evento12 = true;
        }
    }//GEN-LAST:event_P12FMouseClicked

    private void P12MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P12MMouseClicked
        if (evento12 != true) {
            P12F.setEnabled(false);
	    P12M.setIcon(icon2);
            P12P.setEnabled(false);
            P12L.setEnabled(false);
            P12N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 3;
            System.out.println("Esquizofrenia suma 3 puntos");
            actualizarEvento();
            evento12 = true;
        }
    }//GEN-LAST:event_P12MMouseClicked

    private void P12PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P12PMouseClicked
        if (evento12 != true) {
            P12F.setEnabled(false);
	    P12M.setEnabled(false);
            P12P.setIcon(icon2);
            P12L.setEnabled(false);
            P12N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 2;
            System.out.println("Esquizofrenia suma 2 puntos");
            actualizarEvento();
            evento12 = true;
        }
    }//GEN-LAST:event_P12PMouseClicked

    private void P12LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P12LMouseClicked
        if (evento12 != true) {
            P12F.setEnabled(false);
	    P12M.setEnabled(false);
            P12P.setEnabled(false);
            P12L.setIcon(icon2);
            P12N.setEnabled(false);
            Esquizofrenia = Esquizofrenia + 1;
            System.out.println("Esquizofrenia suma 1 puntos");
            actualizarEvento();
            evento12 = true;
        }
    }//GEN-LAST:event_P12LMouseClicked

    private void P12NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P12NMouseClicked
        if (evento12 != true) {
            P12F.setEnabled(false);
	    P12M.setEnabled(false);
            P12P.setEnabled(false);
            P12L.setEnabled(false);
            P12N.setIcon(icon2);
            Esquizofrenia = Esquizofrenia + 0;
            System.out.println("Esquizofrenia suma 0 puntos");
            actualizarEvento();
            evento12 = true;
        }
    }//GEN-LAST:event_P12NMouseClicked

    private void P13FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P13FMouseClicked
        if (evento13 != true) {
            P13F.setIcon(icon2);
            P13M.setEnabled(false);
            P13P.setEnabled(false);
            P13L.setEnabled(false);
            P13N.setEnabled(false);
            Depresion = Depresion + 4;
            System.out.println("Depresion suma 4 puntos");
            actualizarEvento();
            evento13 = true;
        }
    }//GEN-LAST:event_P13FMouseClicked

    private void P13MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P13MMouseClicked
        if (evento13 != true) {
            P13F.setEnabled(false);
	    P13M.setIcon(icon2);
            P13P.setEnabled(false);
            P13L.setEnabled(false);
            P13N.setEnabled(false);
            Depresion = Depresion + 3;
            System.out.println("Depresion suma 3 puntos");
            actualizarEvento();
            evento13 = true;
        }
    }//GEN-LAST:event_P13MMouseClicked

    private void P13PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P13PMouseClicked
        if (evento13 != true) {
            P13F.setEnabled(false);
	    P13M.setEnabled(false);
            P13P.setIcon(icon2);
            P13L.setEnabled(false);
            P13N.setEnabled(false);
            Depresion = Depresion + 2;
            System.out.println("Depresion suma 2 puntos");
            actualizarEvento();
            evento13 = true;
        }
    }//GEN-LAST:event_P13PMouseClicked

    private void P13LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P13LMouseClicked
        if (evento13 != true) {
            P13F.setEnabled(false);
	    P13M.setEnabled(false);
            P13P.setEnabled(false);
            P13L.setIcon(icon2);
            P13N.setEnabled(false);
            Depresion = Depresion + 1;
            System.out.println("Depresion suma 1 puntos");
            actualizarEvento();
            evento13 = true;
        }
    }//GEN-LAST:event_P13LMouseClicked

    private void P13NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P13NMouseClicked
        if (evento13 != true) {
            P13F.setEnabled(false);
	    P13M.setEnabled(false);
            P13P.setEnabled(false);
            P13L.setEnabled(false);
            P13N.setIcon(icon2);
            Depresion = Depresion + 0;
            System.out.println("Depresion suma 0 puntos");
            actualizarEvento();
            evento13 = true;
        }
    }//GEN-LAST:event_P13NMouseClicked

    private void P14FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P14FMouseClicked
        if (evento14 != true) {
            P14F.setIcon(icon2);
            P14M.setEnabled(false);
            P14P.setEnabled(false);
            P14L.setEnabled(false);
            P14N.setEnabled(false);
            Depresion = Depresion + 4;
            System.out.println("Depresion suma 4 puntos");
            actualizarEvento();
            evento14 = true;
        }
    }//GEN-LAST:event_P14FMouseClicked

    private void P14MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P14MMouseClicked
        if (evento14 != true) {
            P14F.setEnabled(false);
	    P14M.setIcon(icon2);
            P14P.setEnabled(false);
            P14L.setEnabled(false);
            P14N.setEnabled(false);
            Depresion = Depresion + 3;
            System.out.println("Depresion suma 3 puntos");
            actualizarEvento();
            evento14 = true;
        }
    }//GEN-LAST:event_P14MMouseClicked

    private void P14PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P14PMouseClicked
        if (evento14 != true) {
            P14F.setEnabled(false);
	    P14M.setEnabled(false);
            P14P.setIcon(icon2);
            P14L.setEnabled(false);
            P14N.setEnabled(false);
            Depresion = Depresion + 2;
            System.out.println("Depresion suma 2 puntos");
            actualizarEvento();
            evento14 = true;
        }
    }//GEN-LAST:event_P14PMouseClicked

    private void P14LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P14LMouseClicked
        if (evento14 != true) {
            P14F.setEnabled(false);
	    P14M.setEnabled(false);
            P14P.setEnabled(false);
            P14L.setIcon(icon2);
            P14N.setEnabled(false);
            Depresion = Depresion + 1;
            System.out.println("Depresion suma 1 puntos");
            actualizarEvento();
            evento14 = true;
        }
    }//GEN-LAST:event_P14LMouseClicked

    private void P14NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P14NMouseClicked
        if (evento14 != true) {
            P14F.setEnabled(false);
	    P14M.setEnabled(false);
            P14P.setEnabled(false);
            P14L.setEnabled(false);
            P14N.setIcon(icon2);
            Depresion = Depresion + 0;
            System.out.println("Depresion suma 0 puntos");
            actualizarEvento();
            evento14 = true;
        }
    }//GEN-LAST:event_P14NMouseClicked

    private void P15FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P15FMouseClicked
        if (evento15 != true) {
            P15F.setIcon(icon2);
            P15M.setEnabled(false);
            P15P.setEnabled(false);
            P15L.setEnabled(false);
            P15N.setEnabled(false);
            Depresion = Depresion + 4;
            System.out.println("Depresion suma 4 puntos");
            actualizarEvento();
            evento15 = true;
        }
    }//GEN-LAST:event_P15FMouseClicked

    private void P15MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P15MMouseClicked
        if (evento15 != true) {
            P15F.setEnabled(false);
	    P15M.setIcon(icon2);
            P15P.setEnabled(false);
            P15L.setEnabled(false);
            P15N.setEnabled(false);
            Depresion = Depresion + 3;
            System.out.println("Depresion suma 3 puntos");
            actualizarEvento();
            evento15 = true;
        }
    }//GEN-LAST:event_P15MMouseClicked

    private void P15PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P15PMouseClicked
        if (evento15 != true) {
            P15F.setEnabled(false);
	    P15M.setEnabled(false);
            P15P.setIcon(icon2);
            P15L.setEnabled(false);
            P15N.setEnabled(false);
            Depresion = Depresion + 2;
            System.out.println("Depresion suma 2 puntos");
            actualizarEvento();
            evento15 = true;
        }
    }//GEN-LAST:event_P15PMouseClicked

    private void P15LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P15LMouseClicked
        if (evento15 != true) {
            P15F.setEnabled(false);
	    P15M.setEnabled(false);
            P15P.setEnabled(false);
            P15L.setIcon(icon2);
            P15N.setEnabled(false);
            Depresion = Depresion + 1;
            System.out.println("Depresion suma 1 puntos");
            actualizarEvento();
            evento15 = true;
        }
    }//GEN-LAST:event_P15LMouseClicked

    private void P15NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P15NMouseClicked
        if (evento15 != true) {
            P15F.setEnabled(false);
	    P15M.setEnabled(false);
            P15P.setEnabled(false);
            P15L.setEnabled(false);
            P15N.setIcon(icon2);
            Depresion = Depresion + 0;
            System.out.println("Depresion suma 0 puntos");
            actualizarEvento();
            evento15 = true;
        }
    }//GEN-LAST:event_P15NMouseClicked

    private void P16FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P16FMouseClicked
        if (evento16 != true) {
            P16F.setIcon(icon2);
            P16M.setEnabled(false);
            P16P.setEnabled(false);
            P16L.setEnabled(false);
            P16N.setEnabled(false);
            Depresion = Depresion + 4;
            System.out.println("Depresion suma 4 puntos");
            actualizarEvento();
            evento16 = true;
        }
    }//GEN-LAST:event_P16FMouseClicked

    private void P16MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P16MMouseClicked
        if (evento16 != true) {
            P16F.setEnabled(false);
	    P16M.setIcon(icon2);
            P16P.setEnabled(false);
            P16L.setEnabled(false);
            P16N.setEnabled(false);
            Depresion = Depresion + 3;
            System.out.println("Depresion suma 3 puntos");
            actualizarEvento();
            evento16 = true;
        }
    }//GEN-LAST:event_P16MMouseClicked

    private void P16PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P16PMouseClicked
        if (evento16 != true) {
            P16F.setEnabled(false);
	    P16M.setEnabled(false);
            P16P.setIcon(icon2);
            P16L.setEnabled(false);
            P16N.setEnabled(false);
            Depresion = Depresion + 2;
            System.out.println("Depresion suma 2 puntos");
            actualizarEvento();
            evento16 = true;
        }
    }//GEN-LAST:event_P16PMouseClicked

    private void P16LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P16LMouseClicked
        if (evento16 != true) {
            P16F.setEnabled(false);
	    P16M.setEnabled(false);
            P16P.setEnabled(false);
            P16L.setIcon(icon2);
            P16N.setEnabled(false);
            Depresion = Depresion + 1;
            System.out.println("Depresion suma 1 puntos");
            actualizarEvento();
            evento16 = true;
        }
    }//GEN-LAST:event_P16LMouseClicked

    private void P16NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P16NMouseClicked
        if (evento16 != true) {
            P16F.setEnabled(false);
	    P16M.setEnabled(false);
            P16P.setEnabled(false);
            P16L.setEnabled(false);
            P16N.setIcon(icon2);
            Depresion = Depresion + 0;
            System.out.println("Depresion suma 0 puntos");
            actualizarEvento();
            evento16 = true;
        }
    }//GEN-LAST:event_P16NMouseClicked

    private void P17FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P17FMouseClicked
        if (evento17 != true) {
            P17F.setIcon(icon2);
            P17M.setEnabled(false);
            P17P.setEnabled(false);
            P17L.setEnabled(false);
            P17N.setEnabled(false);
            Depresion = Depresion + 4;
            System.out.println("Depresion suma 4 puntos");
            actualizarEvento();
            evento17 = true;
        }
    }//GEN-LAST:event_P17FMouseClicked

    private void P17MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P17MMouseClicked
        if (evento17 != true) {
            P17F.setEnabled(false);
	    P17M.setIcon(icon2);
            P17P.setEnabled(false);
            P17L.setEnabled(false);
            P17N.setEnabled(false);
            Depresion = Depresion + 3;
            System.out.println("Depresion suma 3 puntos");
            actualizarEvento();
            evento17 = true;
        }
    }//GEN-LAST:event_P17MMouseClicked

    private void P17PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P17PMouseClicked
        if (evento17 != true) {
            P17F.setEnabled(false);
	    P17M.setEnabled(false);
            P17P.setIcon(icon2);
            P17L.setEnabled(false);
            P17N.setEnabled(false);
            Depresion = Depresion + 2;
            System.out.println("Depresion suma 2 puntos");
            actualizarEvento();
            evento17 = true;
        }
    }//GEN-LAST:event_P17PMouseClicked

    private void P17LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P17LMouseClicked
        if (evento17 != true) {
            P17F.setEnabled(false);
	    P17M.setEnabled(false);
            P17P.setEnabled(false);
            P17L.setIcon(icon2);
            P17N.setEnabled(false);
            Depresion = Depresion + 1;
            System.out.println("Depresion suma 1 puntos");
            actualizarEvento();
            evento17 = true;
        }
    }//GEN-LAST:event_P17LMouseClicked

    private void P17NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P17NMouseClicked
        if (evento17 != true) {
            P17F.setEnabled(false);
	    P17M.setEnabled(false);
            P17P.setEnabled(false);
            P17L.setEnabled(false);
            P17N.setIcon(icon2);
            Depresion = Depresion + 0;
            System.out.println("Depresion suma 0 puntos");
            actualizarEvento();
            evento17 = true;
        }
    }//GEN-LAST:event_P17NMouseClicked

    private void P18FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P18FMouseClicked
        if (evento18 != true) {
            P18F.setIcon(icon2);
            P18M.setEnabled(false);
            P18P.setEnabled(false);
            P18L.setEnabled(false);
            P18N.setEnabled(false);
            Depresion = Depresion + 4;
            System.out.println("Depresion suma 4 puntos");
            actualizarEvento();
            evento18 = true;
        }
    }//GEN-LAST:event_P18FMouseClicked

    private void P18MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P18MMouseClicked
         if (evento18 != true) {
            P18F.setEnabled(false);
	    P18M.setIcon(icon2);
            P18P.setEnabled(false);
            P18L.setEnabled(false);
            P18N.setEnabled(false);
            Depresion = Depresion + 3;
            System.out.println("Depresion suma 3 puntos");
            actualizarEvento();
            evento18 = true;
        }
    }//GEN-LAST:event_P18MMouseClicked

    private void P18PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P18PMouseClicked
        if (evento18 != true) {
            P18F.setEnabled(false);
	    P18M.setEnabled(false);
            P18P.setIcon(icon2);
            P18L.setEnabled(false);
            P18N.setEnabled(false);
            Depresion = Depresion + 2;
            System.out.println("Depresion suma 2 puntos");
            actualizarEvento();
            evento18 = true;
        }
    }//GEN-LAST:event_P18PMouseClicked

    private void P18LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P18LMouseClicked
        if (evento18 != true) {
            P18F.setEnabled(false);
	    P18M.setEnabled(false);
            P18P.setEnabled(false);
            P18L.setIcon(icon2);
            P18N.setEnabled(false);
            Depresion = Depresion + 1;
            System.out.println("Depresion suma 1 puntos");
            actualizarEvento();
            evento18 = true;
        }
    }//GEN-LAST:event_P18LMouseClicked

    private void P18NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P18NMouseClicked
        if (evento18 != true) {
            P18F.setEnabled(false);
	    P18M.setEnabled(false);
            P18P.setEnabled(false);
            P18L.setEnabled(false);
            P18N.setIcon(icon2);
            Depresion = Depresion + 0;
            System.out.println("Depresion suma 0 puntos");
            actualizarEvento();
            evento18 = true;
        }
    }//GEN-LAST:event_P18NMouseClicked

    private void P19FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P19FMouseClicked
         if (evento19 != true) {
            P19F.setIcon(icon2);
            P19M.setEnabled(false);
            P19P.setEnabled(false);
            P19L.setEnabled(false);
            P19N.setEnabled(false);
            TDH = TDH + 4;
            System.out.println("TDH suma 4 puntos");
            actualizarEvento();
            evento19 = true;
        }
    }//GEN-LAST:event_P19FMouseClicked

    private void P19MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P19MMouseClicked
       if (evento19 != true) {
            P19F.setEnabled(false);
	    P19M.setIcon(icon2);
            P19P.setEnabled(false);
            P19L.setEnabled(false);
            P19N.setEnabled(false);
            TDH = TDH + 3;
            System.out.println("TDH suma 3 puntos");
            actualizarEvento();
            evento19 = true;
        }
    }//GEN-LAST:event_P19MMouseClicked

    private void P19PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P19PMouseClicked
        if (evento19 != true) {
            P19F.setEnabled(false);
	    P19M.setEnabled(false);
            P19P.setIcon(icon2);
            P19L.setEnabled(false);
            P19N.setEnabled(false);
            TDH = TDH + 2;
            System.out.println("TDH suma 2 puntos");
            actualizarEvento();
            evento19 = true;
        }
    }//GEN-LAST:event_P19PMouseClicked

    private void P19LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P19LMouseClicked
        if (evento19 != true) {
            P19F.setEnabled(false);
	    P19M.setEnabled(false);
            P19P.setEnabled(false);
            P19L.setIcon(icon2);
            P19N.setEnabled(false);
            TDH = TDH + 1;
            System.out.println("TDH suma 1 puntos");
            actualizarEvento();
            evento19 = true;
        }
    }//GEN-LAST:event_P19LMouseClicked

    private void P19NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P19NMouseClicked
        if (evento19 != true) {
            P19F.setEnabled(false);
	    P19M.setEnabled(false);
            P19P.setEnabled(false);
            P19L.setEnabled(false);
            P19N.setIcon(icon2);
            TDH = TDH + 0;
            System.out.println("TDH suma 0 puntos");
            actualizarEvento();
            evento19 = true;
        }
    }//GEN-LAST:event_P19NMouseClicked

    private void P20FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P20FMouseClicked
        if (evento20 != true) {
            P20F.setIcon(icon2);
            P20M.setEnabled(false);
            P20P.setEnabled(false);
            P20L.setEnabled(false);
            P20N.setEnabled(false);
            TDH = TDH + 4;
            System.out.println("TDH suma 4 puntos");
            actualizarEvento();
            evento20 = true;
        }
    }//GEN-LAST:event_P20FMouseClicked

    private void P20MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P20MMouseClicked
        if (evento20 != true) {
            P20F.setEnabled(false);
	    P20M.setIcon(icon2);
            P20P.setEnabled(false);
            P20L.setEnabled(false);
            P20N.setEnabled(false);
            TDH = TDH + 3;
            System.out.println("TDH suma 3 puntos");
            actualizarEvento();
            evento20 = true;
        }
    }//GEN-LAST:event_P20MMouseClicked

    private void P20PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P20PMouseClicked
        if (evento20 != true) {
            P20F.setEnabled(false);
	    P20M.setEnabled(false);
            P20P.setIcon(icon2);
            P20L.setEnabled(false);
            P20N.setEnabled(false);
            TDH = TDH + 2;
            System.out.println("TDH suma 2 puntos");
            actualizarEvento();
            evento20 = true;
        }
    }//GEN-LAST:event_P20PMouseClicked

    private void P20LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P20LMouseClicked
        if (evento20 != true) {
            P20F.setEnabled(false);
	    P20M.setEnabled(false);
            P20P.setEnabled(false);
            P20L.setIcon(icon2);
            P20N.setEnabled(false);
            TDH = TDH + 1;
            System.out.println("TDH suma 1 puntos");
            actualizarEvento();
            evento20 = true;
        }
    }//GEN-LAST:event_P20LMouseClicked

    private void P20NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P20NMouseClicked
        if (evento20 != true) {
            P20F.setEnabled(false);
	    P20M.setEnabled(false);
            P20P.setEnabled(false);
            P20L.setEnabled(false);
            P20N.setIcon(icon2);
            TDH = TDH + 0;
            System.out.println("TDH suma 0 puntos");
            actualizarEvento();
            evento20 = true;
        }
    }//GEN-LAST:event_P20NMouseClicked

    private void P21FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P21FMouseClicked
         if (evento21 != true) {
            P21F.setIcon(icon2);
            P21M.setEnabled(false);
            P21P.setEnabled(false);
            P21L.setEnabled(false);
            P21N.setEnabled(false);
            TDH = TDH + 4;
            System.out.println("TDH suma 4 puntos");
            actualizarEvento();
            evento21 = true;
        }
    }//GEN-LAST:event_P21FMouseClicked

    private void P21MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P21MMouseClicked
         if (evento21 != true) {
            P21F.setEnabled(false);
	    P21M.setIcon(icon2);
            P21P.setEnabled(false);
            P21L.setEnabled(false);
            P21N.setEnabled(false);
            TDH = TDH + 3;
            System.out.println("TDH suma 3 puntos");
            actualizarEvento();
            evento21 = true;
        }
    }//GEN-LAST:event_P21MMouseClicked

    private void P21PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P21PMouseClicked
        if (evento21 != true) {
            P21F.setEnabled(false);
	    P21M.setEnabled(false);
            P21P.setIcon(icon2);
            P21L.setEnabled(false);
            P21N.setEnabled(false);
            TDH = TDH + 2;
            System.out.println("TDH suma 2 puntos");
            actualizarEvento();
            evento21 = true;
        }
    }//GEN-LAST:event_P21PMouseClicked

    private void P21LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P21LMouseClicked
        if (evento21 != true) {
            P21F.setEnabled(false);
	    P21M.setEnabled(false);
            P21P.setEnabled(false);
            P21L.setIcon(icon2);
            P21N.setEnabled(false);
            TDH = TDH + 1;
            System.out.println("TDH suma 1 puntos");
            actualizarEvento();
            evento21 = true;
        }
    }//GEN-LAST:event_P21LMouseClicked

    private void P21NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P21NMouseClicked
        if (evento21 != true) {
            P21F.setEnabled(false);
	    P21M.setEnabled(false);
            P21P.setEnabled(false);
            P21L.setEnabled(false);
            P21N.setIcon(icon2);
            TDH = TDH + 0;
            System.out.println("TDH suma 0 puntos");
            actualizarEvento();
            evento21 = true;
        }
    }//GEN-LAST:event_P21NMouseClicked

    private void P22FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P22FMouseClicked
         if (evento22 != true) {
            P22F.setIcon(icon2);
            P22M.setEnabled(false);
            P22P.setEnabled(false);
            P22L.setEnabled(false);
            P22N.setEnabled(false);
            TDH = TDH + 4;
            System.out.println("TDH suma 4 puntos");
            actualizarEvento();
            evento22 = true;
        }
    }//GEN-LAST:event_P22FMouseClicked

    private void P22MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P22MMouseClicked
        if (evento22 != true) {
            P22F.setEnabled(false);
	    P22M.setIcon(icon2);
            P22P.setEnabled(false);
            P22L.setEnabled(false);
            P22N.setEnabled(false);
            TDH = TDH + 3;
            System.out.println("TDH suma 3 puntos");
            actualizarEvento();
            evento22 = true;
        }
    }//GEN-LAST:event_P22MMouseClicked

    private void P22PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P22PMouseClicked
        if (evento22 != true) {
            P22F.setEnabled(false);
	    P22M.setEnabled(false);
            P22P.setIcon(icon2);
            P22L.setEnabled(false);
            P22N.setEnabled(false);
            TDH = TDH + 2;
            System.out.println("TDH suma 2 puntos");
            actualizarEvento();
            evento22 = true;
        }
    }//GEN-LAST:event_P22PMouseClicked

    private void P22LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P22LMouseClicked
        if (evento22 != true) {
            P22F.setEnabled(false);
	    P22M.setEnabled(false);
            P22P.setEnabled(false);
            P22L.setIcon(icon2);
            P22N.setEnabled(false);
            TDH = TDH + 1;
            System.out.println("TDH suma 1 puntos");
            actualizarEvento();
            evento22 = true;
        }
    }//GEN-LAST:event_P22LMouseClicked

    private void P22NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P22NMouseClicked
           if (evento22 != true) {
            P22F.setEnabled(false);
	    P22M.setEnabled(false);
            P22P.setEnabled(false);
            P22L.setEnabled(false);
            P22N.setIcon(icon2);
            TDH = TDH + 0;
            System.out.println("TDH suma 0 puntos");
            actualizarEvento();
            evento22 = true;
        }
    }//GEN-LAST:event_P22NMouseClicked

    private void P2F21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2F21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_P2F21MouseClicked

    private void P2M21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2M21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_P2M21MouseClicked

    private void P2P21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2P21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_P2P21MouseClicked

    private void P2L21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2L21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_P2L21MouseClicked

    private void P2N21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2N21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_P2N21MouseClicked

    private void P23FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P23FMouseClicked
        if (evento23 != true) {
            P23F.setIcon(icon2);
            P23M.setEnabled(false);
            P23P.setEnabled(false);
            P23L.setEnabled(false);
            P23N.setEnabled(false);
            TDH = TDH + 4;
            System.out.println("TDH suma 4 puntos");
            actualizarEvento();
            evento23 = true;
        }
    }//GEN-LAST:event_P23FMouseClicked

    private void P23MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P23MMouseClicked
         if (evento23 != true) {
            P23F.setEnabled(false);
	    P23M.setIcon(icon2);
            P23P.setEnabled(false);
            P23L.setEnabled(false);
            P23N.setEnabled(false);
            TDH = TDH + 3;
            System.out.println("TDH suma 3 puntos");
            actualizarEvento();
            evento23 = true;
        }
    }//GEN-LAST:event_P23MMouseClicked

    private void P23PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P23PMouseClicked
        if (evento23 != true) {
            P23F.setEnabled(false);
	    P23M.setEnabled(false);
            P23P.setIcon(icon2);
            P23L.setEnabled(false);
            P23N.setEnabled(false);
            TDH = TDH + 2;
            System.out.println("TDH suma 2 puntos");
            actualizarEvento();
            evento23 = true;
        }
    }//GEN-LAST:event_P23PMouseClicked

    private void P23LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P23LMouseClicked
        if (evento23 != true) {
            P23F.setEnabled(false);
	    P23M.setEnabled(false);
            P23P.setEnabled(false);
            P23L.setIcon(icon2);
            P23N.setEnabled(false);
            TDH = TDH + 1;
            System.out.println("TDH suma 1 puntos");
            actualizarEvento();
            evento23 = true;
        }
    }//GEN-LAST:event_P23LMouseClicked

    private void P23NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P23NMouseClicked
        if (evento23 != true) {
            P23F.setEnabled(false);
	    P23M.setEnabled(false);
            P23P.setEnabled(false);
            P23L.setEnabled(false);
            P23N.setIcon(icon2);
            TDH = TDH + 0;
            System.out.println("TDH suma 0 puntos");
            actualizarEvento();
            evento23 = true;
        }
    }//GEN-LAST:event_P23NMouseClicked

    private void P24FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P24FMouseClicked
         if (evento24 != true) {
            P24F.setIcon(icon2);
            P24M.setEnabled(false);
            P24P.setEnabled(false);
            P24L.setEnabled(false);
            P24N.setEnabled(false);
            TDH = TDH + 4;
            System.out.println("TDH suma 4 puntos");
            actualizarEvento();
            evento24 = true;
        }
    }//GEN-LAST:event_P24FMouseClicked

    private void P24MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P24MMouseClicked
        if (evento24 != true) {
            P24F.setEnabled(false);
	    P24M.setIcon(icon2);
            P24P.setEnabled(false);
            P24L.setEnabled(false);
            P24N.setEnabled(false);
            TDH = TDH + 3;
            System.out.println("TDH suma 3 puntos");
            actualizarEvento();
            evento24 = true;
        }
    }//GEN-LAST:event_P24MMouseClicked

    private void P24PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P24PMouseClicked
        if (evento24 != true) {
            P24F.setEnabled(false);
	    P24M.setEnabled(false);
            P24P.setIcon(icon2);
            P24L.setEnabled(false);
            P24N.setEnabled(false);
            TDH = TDH + 2;
            System.out.println("TDH suma 2 puntos");
            actualizarEvento();
            evento24 = true;
        }
    }//GEN-LAST:event_P24PMouseClicked

    private void P24LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P24LMouseClicked
        if (evento24 != true) {
            P24F.setEnabled(false);
	    P24M.setEnabled(false);
            P24P.setEnabled(false);
            P24L.setIcon(icon2);
            P24N.setEnabled(false);
            TDH = TDH + 1;
            System.out.println("TDH suma 1 puntos");
            actualizarEvento();
            evento24 = true;
        }
    }//GEN-LAST:event_P24LMouseClicked

    private void P24NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P24NMouseClicked
        if (evento24 != true) {
            P24F.setEnabled(false);
	    P24M.setEnabled(false);
            P24P.setEnabled(false);
            P24L.setEnabled(false);
            P24N.setIcon(icon2);
            TDH = TDH + 0;
            System.out.println("TDH suma 0 puntos");
            actualizarEvento();
            evento24 = true;
        }
    }//GEN-LAST:event_P24NMouseClicked

    private void P25FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P25FMouseClicked
       if (evento25 != true) {
            P25F.setIcon(icon2);
            P25M.setEnabled(false);
            P25P.setEnabled(false);
            P25L.setEnabled(false);
            P25N.setEnabled(false);
            Ansiedad = Ansiedad + 4;
            System.out.println("Ansiedad suma 4 puntos");
            actualizarEvento();
            evento25 = true;
        }
    }//GEN-LAST:event_P25FMouseClicked

    private void P25MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P25MMouseClicked
         if (evento25 != true) {
            P25F.setEnabled(false);
	    P25M.setIcon(icon2);
            P25P.setEnabled(false);
            P25L.setEnabled(false);
            P25N.setEnabled(false);
            Ansiedad = Ansiedad + 3;
            System.out.println("Ansiedad suma 3 puntos");
            actualizarEvento();
            evento25 = true;
        }
    }//GEN-LAST:event_P25MMouseClicked

    private void P25PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P25PMouseClicked
        if (evento25 != true) {
            P25F.setEnabled(false);
	    P25M.setEnabled(false);
            P25P.setIcon(icon2);
            P25L.setEnabled(false);
            P25N.setEnabled(false);
            Ansiedad = Ansiedad + 2;
            System.out.println("Ansiedad suma 2 puntos");
            actualizarEvento();
            evento25 = true;
        }
    }//GEN-LAST:event_P25PMouseClicked

    private void P25LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P25LMouseClicked
        if (evento25 != true) {
            P25F.setEnabled(false);
	    P25M.setEnabled(false);
            P25P.setEnabled(false);
            P25L.setIcon(icon2);
            P25N.setEnabled(false);
            Ansiedad = Ansiedad + 1;
            System.out.println("Ansiedad suma 1 puntos");
            actualizarEvento();
            evento25 = true;
        }
    }//GEN-LAST:event_P25LMouseClicked

    private void P25NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P25NMouseClicked
        if (evento25 != true) {
            P25F.setEnabled(false);
	    P25M.setEnabled(false);
            P25P.setEnabled(false);
            P25L.setEnabled(false);
            P25N.setIcon(icon2);
            Ansiedad = Ansiedad + 0;
            System.out.println("Ansiedad suma 0 puntos");
            actualizarEvento();
            evento25 = true;
        }
    }//GEN-LAST:event_P25NMouseClicked

    private void P26FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P26FMouseClicked
        if (evento26 != true) {
            P26F.setIcon(icon2);
            P26M.setEnabled(false);
            P26P.setEnabled(false);
            P26L.setEnabled(false);
            P26N.setEnabled(false);
            Ansiedad = Ansiedad + 4;
            System.out.println("Ansiedad suma 4 puntos");
            actualizarEvento();
            evento26 = true;
        }
    }//GEN-LAST:event_P26FMouseClicked

    private void P26MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P26MMouseClicked
        if (evento26 != true) {
            P26F.setEnabled(false);
	    P26M.setIcon(icon2);
            P26P.setEnabled(false);
            P26L.setEnabled(false);
            P26N.setEnabled(false);
            Ansiedad = Ansiedad + 3;
            System.out.println("Ansiedad suma 3 puntos");
            actualizarEvento();
            evento26 = true;
        }
    }//GEN-LAST:event_P26MMouseClicked

    private void P26PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P26PMouseClicked
        if (evento26 != true) {
            P26F.setEnabled(false);
	    P26M.setEnabled(false);
            P26P.setIcon(icon2);
            P26L.setEnabled(false);
            P26N.setEnabled(false);
            Ansiedad = Ansiedad + 2;
            System.out.println("Ansiedad suma 2 puntos");
            actualizarEvento();
            evento26 = true;
        }
    }//GEN-LAST:event_P26PMouseClicked

    private void P26LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P26LMouseClicked
        if (evento26 != true) {
            P26F.setEnabled(false);
	    P26M.setEnabled(false);
            P26P.setEnabled(false);
            P26L.setIcon(icon2);
            P26N.setEnabled(false);
            Ansiedad = Ansiedad + 1;
            System.out.println("Ansiedad suma 1 puntos");
            actualizarEvento();
            evento26 = true;
        }
    }//GEN-LAST:event_P26LMouseClicked

    private void P26NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P26NMouseClicked
        if (evento26 != true) {
            P26F.setEnabled(false);
	    P26M.setEnabled(false);
            P26P.setEnabled(false);
            P26L.setEnabled(false);
            P26N.setIcon(icon2);
            Ansiedad = Ansiedad + 0;
            System.out.println("Ansiedad suma 0 puntos");
            actualizarEvento();
            evento26 = true;
        }
    }//GEN-LAST:event_P26NMouseClicked

    private void P27FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P27FMouseClicked
        if (evento27 != true) {
            P27F.setIcon(icon2);
            P27M.setEnabled(false);
            P27P.setEnabled(false);
            P27L.setEnabled(false);
            P27N.setEnabled(false);
            Ansiedad = Ansiedad + 4;
            System.out.println("Ansiedad suma 4 puntos");
            actualizarEvento();
            evento27 = true;
        }
    }//GEN-LAST:event_P27FMouseClicked

    private void P27MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P27MMouseClicked
         if (evento27 != true) {
            P27F.setEnabled(false);
	    P27M.setIcon(icon2);
            P27P.setEnabled(false);
            P27L.setEnabled(false);
            P27N.setEnabled(false);
            Ansiedad = Ansiedad + 3;
            System.out.println("Ansiedad suma 3 puntos");
            actualizarEvento();
            evento27 = true;
        }
    }//GEN-LAST:event_P27MMouseClicked

    private void P27PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P27PMouseClicked
        if (evento27 != true) {
            P27F.setEnabled(false);
	    P27M.setEnabled(false);
            P27P.setIcon(icon2);
            P27L.setEnabled(false);
            P27N.setEnabled(false);
            Ansiedad = Ansiedad + 2;
            System.out.println("Ansiedad suma 2 puntos");
            actualizarEvento();
            evento27 = true;
        }
    }//GEN-LAST:event_P27PMouseClicked

    private void P27LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P27LMouseClicked
        if (evento27 != true) {
            P27F.setEnabled(false);
	    P27M.setEnabled(false);
            P27P.setEnabled(false);
            P27L.setIcon(icon2);
            P27N.setEnabled(false);
            Ansiedad = Ansiedad + 1;
            System.out.println("Ansiedad suma 1 puntos");
            actualizarEvento();
            evento27 = true;
        }
    }//GEN-LAST:event_P27LMouseClicked

    private void P27NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P27NMouseClicked
        if (evento27 != true) {
            P27F.setEnabled(false);
	    P27M.setEnabled(false);
            P27P.setEnabled(false);
            P27L.setEnabled(false);
            P27N.setIcon(icon2);
            Ansiedad = Ansiedad + 0;
            System.out.println("Ansiedad suma 0 puntos");
            actualizarEvento();
            evento27 = true;
        }
    }//GEN-LAST:event_P27NMouseClicked

    private void P28FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P28FMouseClicked
        if (evento28 != true) {
            P28F.setIcon(icon2);
            P28M.setEnabled(false);
            P28P.setEnabled(false);
            P28L.setEnabled(false);
            P28N.setEnabled(false);
            Ansiedad = Ansiedad + 4;
            System.out.println("Ansiedad suma 4 puntos");
            actualizarEvento();
            evento28 = true;
        }
    }//GEN-LAST:event_P28FMouseClicked

    private void P28MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P28MMouseClicked
         if (evento28 != true) {
            P28F.setEnabled(false);
	    P28M.setIcon(icon2);
            P28P.setEnabled(false);
            P28L.setEnabled(false);
            P28N.setEnabled(false);
            Ansiedad = Ansiedad + 3;
            System.out.println("Ansiedad suma 3 puntos");
            actualizarEvento();
            evento28 = true;
        }
    }//GEN-LAST:event_P28MMouseClicked

    private void P28PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P28PMouseClicked
        if (evento28 != true) {
            P28F.setEnabled(false);
	    P28M.setEnabled(false);
            P28P.setIcon(icon2);
            P28L.setEnabled(false);
            P28N.setEnabled(false);
            Ansiedad = Ansiedad + 2;
            System.out.println("Ansiedad suma 2 puntos");
            actualizarEvento();
            evento28 = true;
        }
    }//GEN-LAST:event_P28PMouseClicked

    private void P28LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P28LMouseClicked
        if (evento28 != true) {
            P28F.setEnabled(false);
	    P28M.setEnabled(false);
            P28P.setEnabled(false);
            P28L.setIcon(icon2);
            P28N.setEnabled(false);
            Ansiedad = Ansiedad + 1;
            System.out.println("Ansiedad suma 1 puntos");
            actualizarEvento();
            evento28 = true;
        }
    }//GEN-LAST:event_P28LMouseClicked

    private void P28NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P28NMouseClicked
        if (evento28 != true) {
            P28F.setEnabled(false);
	    P28M.setEnabled(false);
            P28P.setEnabled(false);
            P28L.setEnabled(false);
            P28N.setIcon(icon2);
            Ansiedad = Ansiedad + 0;
            System.out.println("Ansiedad suma 0 puntos");
            actualizarEvento();
            evento28 = true;
        }
    }//GEN-LAST:event_P28NMouseClicked

    private void P29FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P29FMouseClicked
        if (evento29 != true) {
            P29F.setIcon(icon2);
            P29M.setEnabled(false);
            P29P.setEnabled(false);
            P29L.setEnabled(false);
            P29N.setEnabled(false);
            Ansiedad = Ansiedad + 4;
            System.out.println("Ansiedad suma 4 puntos");
            actualizarEvento();
            evento29 = true;
        }
    }//GEN-LAST:event_P29FMouseClicked

    private void P29MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P29MMouseClicked
        if (evento29 != true) {
            P29F.setEnabled(false);
	    P29M.setIcon(icon2);
            P29P.setEnabled(false);
            P29L.setEnabled(false);
            P29N.setEnabled(false);
            Ansiedad = Ansiedad + 3;
            System.out.println("Ansiedad suma 3 puntos");
            actualizarEvento();
            evento29 = true;
        }
    }//GEN-LAST:event_P29MMouseClicked

    private void P29PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P29PMouseClicked
        if (evento29 != true) {
            P29F.setEnabled(false);
	    P29M.setEnabled(false);
            P29P.setIcon(icon2);
            P29L.setEnabled(false);
            P29N.setEnabled(false);
            Ansiedad = Ansiedad + 2;
            System.out.println("Ansiedad suma 2 puntos");
            actualizarEvento();
            evento29 = true;
        }
    }//GEN-LAST:event_P29PMouseClicked

    private void P29LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P29LMouseClicked
        if (evento29 != true) {
            P29F.setEnabled(false);
	    P29M.setEnabled(false);
            P29P.setEnabled(false);
            P29L.setIcon(icon2);
            P29N.setEnabled(false);
            Ansiedad = Ansiedad + 1;
            System.out.println("Ansiedad suma 1 puntos");
            actualizarEvento();
            evento29 = true;
        }
    }//GEN-LAST:event_P29LMouseClicked

    private void P29NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P29NMouseClicked
        if (evento29 != true) {
            P29F.setEnabled(false);
	    P29M.setEnabled(false);
            P29P.setEnabled(false);
            P29L.setEnabled(false);
            P29N.setIcon(icon2);
            Ansiedad = Ansiedad + 0;
            System.out.println("Ansiedad suma 0 puntos");
            actualizarEvento();
            evento29 = true;
        }
    }//GEN-LAST:event_P29NMouseClicked

    private void P30FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P30FMouseClicked
         if (evento30 != true) {
            P30F.setIcon(icon2);
            P30M.setEnabled(false);
            P30P.setEnabled(false);
            P30L.setEnabled(false);
            P30N.setEnabled(false);
            Ansiedad = Ansiedad + 4;
            System.out.println("Ansiedad suma 4 puntos");
            actualizarEvento();
            evento30 = true;
        }
    }//GEN-LAST:event_P30FMouseClicked

    private void P30MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P30MMouseClicked
         if (evento30 != true) {
            P30F.setEnabled(false);
	    P30M.setIcon(icon2);
            P30P.setEnabled(false);
            P30L.setEnabled(false);
            P30N.setEnabled(false);
            Ansiedad = Ansiedad + 3;
            System.out.println("Ansiedad suma 3 puntos");
            actualizarEvento();
            evento30 = true;
        }
    }//GEN-LAST:event_P30MMouseClicked

    private void P30PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P30PMouseClicked
        if (evento30 != true) {
            P30F.setEnabled(false);
	    P30M.setEnabled(false);
            P30P.setIcon(icon2);
            P30L.setEnabled(false);
            P30N.setEnabled(false);
            Ansiedad = Ansiedad + 2;
            System.out.println("Ansiedad suma 2 puntos");
            actualizarEvento();
            evento30 = true;
        }
    }//GEN-LAST:event_P30PMouseClicked

    private void P30LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P30LMouseClicked
        if (evento30 != true) {
            P30F.setEnabled(false);
	    P30M.setEnabled(false);
            P30P.setEnabled(false);
            P30L.setIcon(icon2);
            P30N.setEnabled(false);
            Ansiedad = Ansiedad + 1;
            System.out.println("Ansiedad suma 1 puntos");
            actualizarEvento();
            evento30 = true;
        }
    }//GEN-LAST:event_P30LMouseClicked

    private void P30NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P30NMouseClicked
        if (evento30 != true) {
            P30F.setEnabled(false);
	    P30M.setEnabled(false);
            P30P.setEnabled(false);
            P30L.setEnabled(false);
            P30N.setIcon(icon2);
            Ansiedad = Ansiedad + 0;
            System.out.println("Ansiedad suma 0 puntos");
            actualizarEvento();
            evento30 = true;
        }
    }//GEN-LAST:event_P30NMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String nombre = jTextFieldNombre.getText();
        String apellido = jTextFieldApellidos.getText();
        String edad = jTextFieldEdad.getText();
        String sexo = (String) jComboBoxSexo.getSelectedItem();
        
        System.out.println( "Puntos totales de Bipolaridad: " + Bipolaridad);
        setPBipolaridad(porcentaje((Bipolaridad)));
        
        System.out.println( "Puntos totales de Esquizofrenia: " + Esquizofrenia);
        setPEsquizofrenia(porcentaje(Esquizofrenia));
        
        System.out.println( "Puntos totales de Depresion: " + Depresion);
        setPDepresion(porcentaje(Depresion));
        
        System.out.println( "Puntos totales de TDH: " + TDH);
        setPTDH(porcentaje(TDH));
        
        System.out.println( "Puntos totales de Ansiedad: " + Ansiedad);
        setPAnsiedad(porcentaje(Ansiedad));
        
        Index index= new Index();
        index.setVisible(true);
        
        Circular c = new Circular( PBipolaridad, PEsquizofrenia,PDepresion, PTDH,PAnsiedad );
        c.setVisible(true);
        
        Registro r= new Registro();
        r.guardarUsuario(nombre, apellido, sexo, edad, getPBipolaridad() ,getPEsquizofrenia(), getPDepresion(), getPTDH(),getPAnsiedad());
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void actualizarEvento(){
        PanelP1Op1.revalidate();
        PanelP1Op1.repaint();
        PanelP1Op2.revalidate();
        PanelP1Op2.repaint();
    }
    
    public float porcentaje(float puntos){
        float val= ((float)puntos / 24)*100;
        //System.out.println("porcentaje " + val);
        return val;
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question().setVisible(true);
            }
        });
        
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel LabelP1;
    public javax.swing.JLabel LabelP10;
    public javax.swing.JLabel LabelP11;
    public javax.swing.JLabel LabelP12;
    public javax.swing.JLabel LabelP13;
    public javax.swing.JLabel LabelP14;
    public javax.swing.JLabel LabelP15;
    public javax.swing.JLabel LabelP16;
    public javax.swing.JLabel LabelP17;
    public javax.swing.JLabel LabelP18;
    public javax.swing.JLabel LabelP19;
    public javax.swing.JLabel LabelP2;
    public javax.swing.JLabel LabelP20;
    public javax.swing.JLabel LabelP21;
    public javax.swing.JLabel LabelP22;
    public javax.swing.JLabel LabelP23;
    public javax.swing.JLabel LabelP24;
    public javax.swing.JLabel LabelP25;
    public javax.swing.JLabel LabelP26;
    public javax.swing.JLabel LabelP27;
    public javax.swing.JLabel LabelP28;
    public javax.swing.JLabel LabelP29;
    public javax.swing.JLabel LabelP3;
    public javax.swing.JLabel LabelP30;
    public javax.swing.JLabel LabelP4;
    public javax.swing.JLabel LabelP5;
    public javax.swing.JLabel LabelP6;
    public javax.swing.JLabel LabelP7;
    public javax.swing.JLabel LabelP8;
    public javax.swing.JLabel LabelP9;
    public javax.swing.JLabel P10F;
    public javax.swing.JLabel P10L;
    public javax.swing.JLabel P10M;
    public javax.swing.JLabel P10N;
    public javax.swing.JLabel P10P;
    public javax.swing.JLabel P11F;
    public javax.swing.JLabel P11L;
    public javax.swing.JLabel P11M;
    public javax.swing.JLabel P11N;
    public javax.swing.JLabel P11P;
    public javax.swing.JLabel P12F;
    public javax.swing.JLabel P12L;
    public javax.swing.JLabel P12M;
    public javax.swing.JLabel P12N;
    public javax.swing.JLabel P12P;
    public javax.swing.JLabel P13F;
    public javax.swing.JLabel P13L;
    public javax.swing.JLabel P13M;
    public javax.swing.JLabel P13N;
    public javax.swing.JLabel P13P;
    public javax.swing.JLabel P14F;
    public javax.swing.JLabel P14L;
    public javax.swing.JLabel P14M;
    public javax.swing.JLabel P14N;
    public javax.swing.JLabel P14P;
    public javax.swing.JLabel P15F;
    public javax.swing.JLabel P15L;
    public javax.swing.JLabel P15M;
    public javax.swing.JLabel P15N;
    public javax.swing.JLabel P15P;
    public javax.swing.JLabel P16F;
    public javax.swing.JLabel P16L;
    public javax.swing.JLabel P16M;
    public javax.swing.JLabel P16N;
    public javax.swing.JLabel P16P;
    public javax.swing.JLabel P17F;
    public javax.swing.JLabel P17L;
    public javax.swing.JLabel P17M;
    public javax.swing.JLabel P17N;
    public javax.swing.JLabel P17P;
    public javax.swing.JLabel P18F;
    public javax.swing.JLabel P18L;
    public javax.swing.JLabel P18M;
    public javax.swing.JLabel P18N;
    public javax.swing.JLabel P18P;
    public javax.swing.JLabel P19F;
    public javax.swing.JLabel P19L;
    public javax.swing.JLabel P19M;
    public javax.swing.JLabel P19N;
    public javax.swing.JLabel P19P;
    public javax.swing.JLabel P1F;
    public javax.swing.JLabel P1L;
    public javax.swing.JLabel P1M;
    public javax.swing.JLabel P1N;
    public javax.swing.JLabel P1P;
    public javax.swing.JLabel P20F;
    public javax.swing.JLabel P20L;
    public javax.swing.JLabel P20M;
    public javax.swing.JLabel P20N;
    public javax.swing.JLabel P20P;
    public javax.swing.JLabel P21F;
    public javax.swing.JLabel P21L;
    public javax.swing.JLabel P21M;
    public javax.swing.JLabel P21N;
    public javax.swing.JLabel P21P;
    public javax.swing.JLabel P22F;
    public javax.swing.JLabel P22L;
    public javax.swing.JLabel P22M;
    public javax.swing.JLabel P22N;
    public javax.swing.JLabel P22P;
    public javax.swing.JLabel P23F;
    public javax.swing.JLabel P23L;
    public javax.swing.JLabel P23M;
    public javax.swing.JLabel P23N;
    public javax.swing.JLabel P23P;
    public javax.swing.JLabel P24F;
    public javax.swing.JLabel P24L;
    public javax.swing.JLabel P24M;
    public javax.swing.JLabel P24N;
    public javax.swing.JLabel P24P;
    public javax.swing.JLabel P25F;
    public javax.swing.JLabel P25L;
    public javax.swing.JLabel P25M;
    public javax.swing.JLabel P25N;
    public javax.swing.JLabel P25P;
    public javax.swing.JLabel P26F;
    public javax.swing.JLabel P26L;
    public javax.swing.JLabel P26M;
    public javax.swing.JLabel P26N;
    public javax.swing.JLabel P26P;
    public javax.swing.JLabel P27F;
    public javax.swing.JLabel P27L;
    public javax.swing.JLabel P27M;
    public javax.swing.JLabel P27N;
    public javax.swing.JLabel P27P;
    public javax.swing.JLabel P28F;
    public javax.swing.JLabel P28L;
    public javax.swing.JLabel P28M;
    public javax.swing.JLabel P28N;
    public javax.swing.JLabel P28P;
    public javax.swing.JLabel P29F;
    public javax.swing.JLabel P29L;
    public javax.swing.JLabel P29M;
    public javax.swing.JLabel P29N;
    public javax.swing.JLabel P29P;
    public javax.swing.JLabel P2F;
    public javax.swing.JLabel P2F21;
    public javax.swing.JLabel P2L;
    public javax.swing.JLabel P2L21;
    public javax.swing.JLabel P2M;
    public javax.swing.JLabel P2M21;
    public javax.swing.JLabel P2N;
    public javax.swing.JLabel P2N21;
    public javax.swing.JLabel P2P;
    public javax.swing.JLabel P2P21;
    public javax.swing.JLabel P30F;
    public javax.swing.JLabel P30L;
    public javax.swing.JLabel P30M;
    public javax.swing.JLabel P30N;
    public javax.swing.JLabel P30P;
    public javax.swing.JLabel P3F;
    public javax.swing.JLabel P3L;
    public javax.swing.JLabel P3M;
    public javax.swing.JLabel P3N;
    public javax.swing.JLabel P3P;
    public javax.swing.JLabel P4F;
    public javax.swing.JLabel P4L;
    public javax.swing.JLabel P4M;
    public javax.swing.JLabel P4N;
    public javax.swing.JLabel P4P;
    public javax.swing.JLabel P5F;
    public javax.swing.JLabel P5L;
    public javax.swing.JLabel P5M;
    public javax.swing.JLabel P5N;
    public javax.swing.JLabel P5P;
    public javax.swing.JLabel P6F;
    public javax.swing.JLabel P6L;
    public javax.swing.JLabel P6M;
    public javax.swing.JLabel P6N;
    public javax.swing.JLabel P6P;
    public javax.swing.JLabel P7F;
    public javax.swing.JLabel P7L;
    public javax.swing.JLabel P7M;
    public javax.swing.JLabel P7N;
    public javax.swing.JLabel P7P;
    public javax.swing.JLabel P8F;
    public javax.swing.JLabel P8L;
    public javax.swing.JLabel P8M;
    public javax.swing.JLabel P8N;
    public javax.swing.JLabel P8P;
    public javax.swing.JLabel P9F;
    public javax.swing.JLabel P9L;
    public javax.swing.JLabel P9M;
    public javax.swing.JLabel P9N;
    public javax.swing.JLabel P9P;
    public javax.swing.JPanel PanelP1Op1;
    public javax.swing.JPanel PanelP1Op2;
    public javax.swing.JPanel PanelP1Op3;
    public javax.swing.JPanel PanelP1Op4;
    public javax.swing.JPanel PanelP1Op5;
    public javax.swing.JPanel PanelP2Op1;
    public javax.swing.JPanel PanelP2Op100;
    public javax.swing.JPanel PanelP2Op101;
    public javax.swing.JPanel PanelP2Op102;
    public javax.swing.JPanel PanelP2Op103;
    public javax.swing.JPanel PanelP2Op104;
    public javax.swing.JPanel PanelP2Op105;
    public javax.swing.JPanel PanelP2Op106;
    public javax.swing.JPanel PanelP2Op107;
    public javax.swing.JPanel PanelP2Op108;
    public javax.swing.JPanel PanelP2Op109;
    public javax.swing.JPanel PanelP2Op110;
    public javax.swing.JPanel PanelP2Op111;
    public javax.swing.JPanel PanelP2Op112;
    public javax.swing.JPanel PanelP2Op113;
    public javax.swing.JPanel PanelP2Op114;
    public javax.swing.JPanel PanelP2Op115;
    public javax.swing.JPanel PanelP2Op116;
    public javax.swing.JPanel PanelP2Op117;
    public javax.swing.JPanel PanelP2Op118;
    public javax.swing.JPanel PanelP2Op119;
    public javax.swing.JPanel PanelP2Op12;
    public javax.swing.JPanel PanelP2Op120;
    public javax.swing.JPanel PanelP2Op121;
    public javax.swing.JPanel PanelP2Op122;
    public javax.swing.JPanel PanelP2Op123;
    public javax.swing.JPanel PanelP2Op124;
    public javax.swing.JPanel PanelP2Op125;
    public javax.swing.JPanel PanelP2Op126;
    public javax.swing.JPanel PanelP2Op127;
    public javax.swing.JPanel PanelP2Op128;
    public javax.swing.JPanel PanelP2Op129;
    public javax.swing.JPanel PanelP2Op13;
    public javax.swing.JPanel PanelP2Op130;
    public javax.swing.JPanel PanelP2Op131;
    public javax.swing.JPanel PanelP2Op132;
    public javax.swing.JPanel PanelP2Op133;
    public javax.swing.JPanel PanelP2Op134;
    public javax.swing.JPanel PanelP2Op135;
    public javax.swing.JPanel PanelP2Op136;
    public javax.swing.JPanel PanelP2Op137;
    public javax.swing.JPanel PanelP2Op138;
    public javax.swing.JPanel PanelP2Op139;
    public javax.swing.JPanel PanelP2Op14;
    public javax.swing.JPanel PanelP2Op140;
    public javax.swing.JPanel PanelP2Op141;
    public javax.swing.JPanel PanelP2Op142;
    public javax.swing.JPanel PanelP2Op143;
    public javax.swing.JPanel PanelP2Op144;
    public javax.swing.JPanel PanelP2Op145;
    public javax.swing.JPanel PanelP2Op146;
    public javax.swing.JPanel PanelP2Op147;
    public javax.swing.JPanel PanelP2Op148;
    public javax.swing.JPanel PanelP2Op149;
    public javax.swing.JPanel PanelP2Op15;
    public javax.swing.JPanel PanelP2Op150;
    public javax.swing.JPanel PanelP2Op16;
    public javax.swing.JPanel PanelP2Op17;
    public javax.swing.JPanel PanelP2Op18;
    public javax.swing.JPanel PanelP2Op19;
    public javax.swing.JPanel PanelP2Op2;
    public javax.swing.JPanel PanelP2Op20;
    public javax.swing.JPanel PanelP2Op21;
    public javax.swing.JPanel PanelP2Op22;
    public javax.swing.JPanel PanelP2Op23;
    public javax.swing.JPanel PanelP2Op24;
    public javax.swing.JPanel PanelP2Op25;
    public javax.swing.JPanel PanelP2Op26;
    public javax.swing.JPanel PanelP2Op27;
    public javax.swing.JPanel PanelP2Op28;
    public javax.swing.JPanel PanelP2Op29;
    public javax.swing.JPanel PanelP2Op3;
    public javax.swing.JPanel PanelP2Op30;
    public javax.swing.JPanel PanelP2Op31;
    public javax.swing.JPanel PanelP2Op32;
    public javax.swing.JPanel PanelP2Op33;
    public javax.swing.JPanel PanelP2Op34;
    public javax.swing.JPanel PanelP2Op35;
    public javax.swing.JPanel PanelP2Op36;
    public javax.swing.JPanel PanelP2Op37;
    public javax.swing.JPanel PanelP2Op38;
    public javax.swing.JPanel PanelP2Op39;
    public javax.swing.JPanel PanelP2Op4;
    public javax.swing.JPanel PanelP2Op40;
    public javax.swing.JPanel PanelP2Op41;
    public javax.swing.JPanel PanelP2Op42;
    public javax.swing.JPanel PanelP2Op43;
    public javax.swing.JPanel PanelP2Op44;
    public javax.swing.JPanel PanelP2Op45;
    public javax.swing.JPanel PanelP2Op46;
    public javax.swing.JPanel PanelP2Op47;
    public javax.swing.JPanel PanelP2Op48;
    public javax.swing.JPanel PanelP2Op49;
    public javax.swing.JPanel PanelP2Op5;
    public javax.swing.JPanel PanelP2Op50;
    public javax.swing.JPanel PanelP2Op51;
    public javax.swing.JPanel PanelP2Op52;
    public javax.swing.JPanel PanelP2Op53;
    public javax.swing.JPanel PanelP2Op54;
    public javax.swing.JPanel PanelP2Op55;
    public javax.swing.JPanel PanelP2Op56;
    public javax.swing.JPanel PanelP2Op57;
    public javax.swing.JPanel PanelP2Op58;
    public javax.swing.JPanel PanelP2Op59;
    public javax.swing.JPanel PanelP2Op60;
    public javax.swing.JPanel PanelP2Op61;
    public javax.swing.JPanel PanelP2Op62;
    public javax.swing.JPanel PanelP2Op63;
    public javax.swing.JPanel PanelP2Op64;
    public javax.swing.JPanel PanelP2Op65;
    public javax.swing.JPanel PanelP2Op66;
    public javax.swing.JPanel PanelP2Op67;
    public javax.swing.JPanel PanelP2Op68;
    public javax.swing.JPanel PanelP2Op69;
    public javax.swing.JPanel PanelP2Op70;
    public javax.swing.JPanel PanelP2Op71;
    public javax.swing.JPanel PanelP2Op72;
    public javax.swing.JPanel PanelP2Op73;
    public javax.swing.JPanel PanelP2Op74;
    public javax.swing.JPanel PanelP2Op75;
    public javax.swing.JPanel PanelP2Op76;
    public javax.swing.JPanel PanelP2Op77;
    public javax.swing.JPanel PanelP2Op78;
    public javax.swing.JPanel PanelP2Op79;
    public javax.swing.JPanel PanelP2Op80;
    public javax.swing.JPanel PanelP2Op81;
    public javax.swing.JPanel PanelP2Op82;
    public javax.swing.JPanel PanelP2Op83;
    public javax.swing.JPanel PanelP2Op84;
    public javax.swing.JPanel PanelP2Op85;
    public javax.swing.JPanel PanelP2Op86;
    public javax.swing.JPanel PanelP2Op87;
    public javax.swing.JPanel PanelP2Op88;
    public javax.swing.JPanel PanelP2Op89;
    public javax.swing.JPanel PanelP2Op90;
    public javax.swing.JPanel PanelP2Op91;
    public javax.swing.JPanel PanelP2Op92;
    public javax.swing.JPanel PanelP2Op93;
    public javax.swing.JPanel PanelP2Op94;
    public javax.swing.JPanel PanelP2Op95;
    public javax.swing.JPanel PanelP2Op96;
    public javax.swing.JPanel PanelP2Op97;
    public javax.swing.JPanel PanelP2Op98;
    public javax.swing.JPanel PanelP2Op99;
    public javax.swing.JPanel PanelP3Op1;
    public javax.swing.JPanel PanelP3Op2;
    public javax.swing.JPanel PanelP3Op3;
    public javax.swing.JPanel PanelP3Op4;
    public javax.swing.JPanel PanelP3Op5;
    public javax.swing.JPanel PanelP4Op11;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelEdad;
    public javax.swing.JLabel jLabelLeve;
    public javax.swing.JLabel jLabelMucho;
    private javax.swing.JLabel jLabelN;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNunca;
    public javax.swing.JLabel jLabelPoco;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTrecuente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldEdad;
    public javax.swing.JTextField jTextFieldNombre;
    public javax.swing.JPanel panelEncabezado;
    // End of variables declaration//GEN-END:variables
}
