package practica_clases;
import javax.swing.*;
import java.awt.*;
public class practica8_intGraficas {

    public static void main(String[] args){

        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class miMarco extends JFrame{

    public miMarco(){

        Toolkit herramienta=Toolkit.getDefaultToolkit();

        Dimension pantalla=herramienta.getScreenSize();
    
        int alturaPantalla=pantalla.height;

        int anchoPantalla=pantalla.width;

        setSize(anchoPantalla/2, alturaPantalla/2);

        setLocation(anchoPantalla/4, alturaPantalla/4);

        setTitle("Hola XD");

        setResizable(true);

         setExtendedState(Frame.MAXIMIZED_HORIZ);

        //setSize(500,300);



    }

}