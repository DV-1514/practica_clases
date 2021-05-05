package practica_clases;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class practica9_Graphics2D {

    public static void main(String[] args){

        Marco marco1=new Marco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

    }

}

class Marco extends JFrame{
    public Marco(){

        setSize(500,300);
        lamina figura=new lamina();
        add(figura);

        
    }
}

class lamina extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2=(Graphics2D) g;

        Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);

        g2.setPaint(Color.blue);

        g2.fill(rectangulo);

        Ellipse2D elipse=new Ellipse2D.Double();

        elipse.setFrame(rectangulo);

        g2.setPaint(Color.red);

        g2.fill(elipse);

        setBackground(Color.pink);

    }
}