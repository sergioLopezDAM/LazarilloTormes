/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package vista;


import controladores.ContrJuego;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import trabajodi.Logica;


/**

 @author Guille
 */
public class VJuego extends JPanel {

    private ContrJuego controlador;
    //private Carta[] carta;
    private ArrayList<Carta> carta;


    public VJuego(Logica logica) {
        controlador = new ContrJuego(this, logica);
    }


    public void generar(String[] rutas) {
        for(int i=0;i<rutas.length;i++){
            carta.add(new Carta(rutas[i]));
            carta.add(carta.get(i));
        }
        Collections.shuffle(carta);
        //rutas=nº cartas
<<<<<<< HEAD
        ImageIcon img=new ImageIcon("src/img/carga2.jpg");
        JLabel f=new JLabel();
        f.setIcon(img);
        //f.setBounds(0, 0, 500, 500);
=======
        ImageIcon img = new ImageIcon("/img/carga2.jpg");

        JLabel f = new JLabel(img);
>>>>>>> b79f474d70e9d330ed2a39f35606075c6245a341
        f.setBackground(Color.red);
        this.add(f);
        repaint();
<<<<<<< HEAD
      /*  System.out.println(rutas[0]);
        carta=new Carta[1];
        carta[0]=new Carta(rutas[0]);
        this.add(carta[0]);
        carta[0].addMouseListener(controlador);
        */
        
=======

        /*
         System.out.println(rutas[0]);
         carta=new Carta[1];
         carta[0]=new Carta(rutas[0]);
         this.add(carta[0]);
         carta[0].addMouseListener(controlador);
         */
        carta = new Carta[1];
        carta[0] = new Carta(rutas[0]);
        this.add(carta[0]);
        carta[0].addMouseListener(controlador);

>>>>>>> b79f474d70e9d330ed2a39f35606075c6245a341
    }
}
