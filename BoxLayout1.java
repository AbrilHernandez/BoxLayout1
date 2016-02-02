import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BoxLayoutTAP extends JFrame{

public static void agregarComponentes(Container pane){//parte 3-4
pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));//parte 3
pane.setVisible(true);
agregarBotones("Boton numero 1",pane);//parte 3
agregarBotones("Boton numero 2",pane);//parte 3
agregarBotones("Boton numero 3",pane);//parte 3
}//parte 3-4

private static void agregarBotones(String texto, Container container){//parte 3
 JButton boton=new JButton(texto);
boton.setAlignmentX(Component.LEFT_ALIGNMENT);
container.add(boton);
}//parte 3

public static void crearVentana(){//parte 1
JFrame frame=new JFrame("Ejemplo de Ventana con BoxLayout");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//parte 2
frame.pack();//parte 2
frame.setSize(500, 400);//parte 2
frame.setVisible(true);//parte 1
agregarComponentes(frame.getContentPane());
}
public static void main(String arg[]){

crearVentana();

}

}
