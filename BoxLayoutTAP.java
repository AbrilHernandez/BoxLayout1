import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Container;
import java.awt.Component;

public class BoxLayoutTAP extends JFrame{

public static void agregarComponentes(Container pane){
pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));
pane.setVisible(true);
agregarBotones("Boton uno",pane);
agregarBotones("Botonsito <3",pane);
agregarEtiqueta("Etiqueta uno", pane);
agregarEtiqueta("Etiquetota", pane);
}

private static void agregarBotones(String texto, Container container){
JButton boton=new JButton(texto);
boton.setAlignmentX(Component.LEFT_ALIGNMENT);
container.add(boton);
}
public static void agregarEtiqueta(String texto, Container container){
JLabel label=new JLabel(texto);
label.setAlignmentY(Component.RIGHT_ALIGNMENT);
container.add(label);


}



public static void crearVentana(){
JFrame frame=new JFrame("Ejemplo de ventana con BoxLayout");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setSize(500,400);
frame.setVisible(true);
agregarComponentes(frame.getContentPane());
}



public static void main (String []ar){
crearVentana();
}

}

