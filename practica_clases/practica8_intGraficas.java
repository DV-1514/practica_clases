package practica_clases;
import javax.swing.*;
import java.awt.*;
import java.awt.geom;
public class practica8_intGraficas {

    public static void main(String[] args){

        miMarco marco1=new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Texto texto=new Texto();
        //marco1.add(texto);

        Figura figura=new Figura();
        marco1.add(figura);
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

/*class Texto extends JPanel{ //se crea una lamina encima del frame

    public void paintComponent(Graphics g){  //sobreescribiendo los datos

        super.paintComponent(g); //ademas de decirle que haga lo que quiero, que haga para lo que fue creado

        g.drawString("Hola a todos, practicando interfaz grafica", 100, 100);

    }

}

class Figura extends JPanel{ //se crea una lamina encima del frame

    public void paintComponent(Graphics g){  //sobreescribiendo los datos

        super.paintComponent(g); //ademas de decirle que haga lo que quiero, que haga para lo que fue creado

        g.drawRect(120, 120, 80, 50);

    }

}
*/
class Figura extends JPanel{ //se crea una lamina encima del frame

    public void paintComponent(Graphics g){  //sobreescribiendo los datos

        super.paintComponent(g); //ademas de decirle que haga lo que quiero, que haga para lo que fue creado

        Graphics2D g2=(Grafhics) g;

        Rectangle2D rectangulo=new Rectangle2D.Double();

        g2.draw(rectangulo);

    }

}
