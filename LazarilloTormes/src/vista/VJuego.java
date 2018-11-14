/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package vista;


import controladores.ContrJuego;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.Action;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import trabajodi.Logica;


/**

 @author Guille
 */
public class VJuego extends JPanel {

    private ContrJuego controlador;
    //private Carta[] carta;
    private ArrayList<Carta> carta;
    private int contadorSeg,contMov;
    private Timer tReloj;
    private JLabel lMovimientos,lReloj;
    private JButton bPausa,bGuardar,bContinuar;

    public VJuego(Logica logica) {
        controlador = new ContrJuego(this, logica);
        //this.setLayout(new G);
    }


    public void generar(String[] rutas) {
        
        //generamos las cartas
        asignarLabels();
        this.add((Box.createHorizontalGlue()));
        generarCartas(rutas);
        this.add((Box.createHorizontalGlue()));
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
    }
    private void asignarLabels(){
        JPanel labels=new JPanel();
        labels.setOpaque(false);
        contMov=0;
        lMovimientos=new JLabel(""+contMov);
        labels.add(lMovimientos);
        
        contadorSeg=0;
        lReloj=new JLabel(""+contadorSeg);
        labels.add(lReloj);
        
        
        this.add(labels);
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
        cartas.setSize((100+8)*4,(100+8)*2);
        int cuadrado=(int) Math.sqrt(carta.size());
        //asignamos un layout a las cartas
        cartas.setLayout(new GridLayout(cuadrado, cuadrado,8,8));
        
        //deshordenamos las cartas
        Collections.shuffle(carta);
        
        //añadimos todas las cartas y les ponemos escuchador
        for (int i = 0; i < carta.size(); i++) {
            cartas.add(carta.get(i));
            carta.get(i).addMouseListener(controlador);
        }

        this.add(cartas);
    }
    
    
    private void empezarReloj(){
        tReloj=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contadorSeg++;
                lReloj.setText(contadorSeg+"");
                repaint();
            }
        });
        tReloj.setRepeats(true);
        tReloj.start();
    }
    
    
    
    
    
    
    
    
    
    
    
    
     //auxiliar, para probar
    boolean a=true;
    public void algo(){
        if(a){
            carta.get(3).animarSalir();
            a=false;
         }else{
            carta.get(3).animarEntrar();  
            a=true;
        }
    }

}
