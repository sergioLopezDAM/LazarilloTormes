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
        //generamos las cartas
        generarCartas(rutas);
        
        
        
    }
    private void generarCartas(String[] rutas){
        
        carta=new ArrayList();
        //asignamos la misma ruta a 2 carta
        for(int i=0;i<rutas.length;i++){
            carta.add(new Carta(rutas[i]));
            carta.add(new Carta(rutas[i]));
        }
        
        //para cada carta asignamos el mismo id
        for (int i=0,j=0 ; i < carta.size();j++ ) {
            carta.get(i).setName(""+j);
            i++;
            carta.get(i).setName(""+(j));
            i++;
        }
        
        //creamos el panel donde estarán las cartas
        JPanel cartas = new JPanel();
        int cuadrado=(int) Math.sqrt(carta.size());
        //asignamos un layout a las cartas
        cartas.setLayout(new GridLayout(cuadrado, cuadrado));
        
        //deshordenamos las cartas
        Collections.shuffle(carta);
        
        //añadimos todas las cartas y les ponemos escuchador
        for (int i = 0; i < carta.size(); i++) {
            cartas.add(carta.get(i));
            carta.get(i).addMouseListener(controlador);
        }

        this.add(cartas);
    }

}
