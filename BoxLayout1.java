import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Component;
import javax.swing.BoxLayout;

public class BoxLayout1 extends JFrame{

public static void agregarComponentes(Container pane){
pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
pane.setVisible(true);
agregarBotones("Boton numero 1",pane);
agregarBotones("Boton numero 2",pane);
agregarBotones("Boton numero 3",pane);
agregarEtiqueta("Etiqueta 1", pane);
}


public static void agregarEtiqueta(String texto, Container container){
JLabel label=new JLabel(texto);
label.setAlignmentY(Component.RIGHT_ALIGNMENT);
container.add(label);

}

private static void agregarBotones(String texto, Container container){
 JButton boton=new JButton(texto);
boton.setAlignmentX(Component.LEFT_ALIGNMENT);
container.add(boton);
}

public static void crearVentana(){
JFrame frame=new JFrame("Ejemplo de Ventana con BoxLayout");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setSize(500, 400);
frame.setVisible(true);
agregarComponentes(frame.getContentPane());
}
public static void main(String arg[]){

crearVentana();

}

}//clase
