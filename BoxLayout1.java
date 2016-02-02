import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class BoxLayout1 extends JFrame{

public static void crearVentana(){
JFrame frame=new JFrame("Ejemplo de Ventana con BoxLayout");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(500, 400);
frame.pack();
frame.setVisible(true);
}

public static void main(String arg[]){
crearVentana();
}//main

}//clase
