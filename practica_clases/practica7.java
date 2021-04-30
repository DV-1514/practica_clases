package practica_clases;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;


public class practica7 {

    public static void main(String[] args){

        Reloj mireloj=new Reloj();

        mireloj.enMarcha(3000, true);

        JOptionPane.showMessageDialog(null, "Pulsa aceptar");

        System.exit(0);
    }
}
//simplificado con clase interna local 
class Reloj{


    public void enMarcha(int intervalo, final boolean sonido){

        class DamelaHora2 implements ActionListener{ //clase interna local (dentro del metodo)
            public void actionPerformed(ActionEvent evento){
    
                Date ahora=new Date();
    
                System.out.println("tiempo cada 3 seg" + ahora);
    
                if(sonido){

                    Toolkit.getDefaultToolkit().beep();
                }
    
            }
    
            
        }

        ActionListener oyente=new DamelaHora2();

        Timer miTemporizador=new Timer(intervalo, oyente);

        miTemporizador.start();
    }


}
