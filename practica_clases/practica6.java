package practica_clases;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class practica6 {

    public static void main(String[] args){

        DamelaHora oyente=new DamelaHora();

        Timer miTemporizador=new Timer(5000, oyente);

        miTemporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");

        System.exit(0);


    }
    
}

class DamelaHora implements ActionListener{

    public void actionPerformed(ActionEvent e){

        Date ahora=new Date();

        System.out.println("te doy la hora " + ahora);

        Toolkit.getDefaultToolkit().beep();

        



    }
}