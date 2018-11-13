/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package vista;


import controladores.ContrJuego;
import java.awt.Color;
import java.awt.GridLayout;
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
        carta=new ArrayList();
        for(int i=0;i<rutas.length;i++){
            System.out.println(rutas[i]);
            carta.add(new Carta(rutas[i]));
            carta.add(new Carta(rutas[i]));
        }
        
        //carta.get(i).
        //
        
        JPanel cartas = new JPanel();
        int cuadrado=(int) Math.sqrt(carta.size());
        cartas.setLayout(new GridLayout(cuadrado, cuadrado));
        for (int i = 0,j=0; i < carta.size();j++ ) {
            System.out.println(i);
            carta.get(i).setName(""+j);
            i++;
            carta.get(i).setName(""+(j));
            i++;
        }
                Collections.shuffle(carta);

        for (int i = 0; i < carta.size(); i++) {
            cartas.add(carta.get(i));
            carta.get(i).addMouseListener(controlador);
        }

        this.add(cartas);
        
        
        //rutas=nº cartas
        /*ImageIcon img=new ImageIcon("/src/img/carga2.jpg");
        JLabel f=new JLabel();
        f.setIcon(img);
        //f.setBounds(0, 0, 500, 500);
        f.setBackground(Color.red);
        this.add(f);*/
        repaint();
      /*  System.out.println(rutas[0]);
        carta=new Carta[1];
        carta[0]=new Carta(rutas[0]);
        this.add(carta[0]);
        carta[0].addMouseListener(controlador);
        */
        
    }

}
