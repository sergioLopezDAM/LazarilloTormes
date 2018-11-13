/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package vista;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.border.Border;


/**

 @author Guille
 */
public class Carta extends JLabel {
    private ImageIcon carta,aux;
    private final Border borde= BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1), BorderFactory.createLoweredBevelBorder());

    private final int ANCHOMAX=100,ALTOMAX=100;
    int altura,ancho;
    private boolean sale;
    private Timer timer;
    public Carta(String url) {
        this.setBorder(borde);//Border(borde);
        carta=cambiarTamano(new ImageIcon(url), 100, 100);
        this.setIcon(carta);
        aux=cambiarTamano(new ImageIcon("src/img/logotrini.png"),100,100);
       // this.setOpaque(false);
    }


    public void Aparecer() {
         //this.setb
    }


    public ImageIcon cambiarTamano(ImageIcon icono, int anchoImagen, int altoImagen) {
        Image imagen = icono.getImage();
        Image reescalada = imagen.getScaledInstance(anchoImagen, altoImagen, java.awt.Image.SCALE_SMOOTH);
        icono = new ImageIcon(reescalada);
        return icono;
    }
    
    public void paint(Graphics g){
        g.drawImage(aux.getImage() , 1, 1, null);
        super.paint(g);
    }
    public void animarSalir(){
         altura=this.getHeight();
        ancho=this.getWidth();
        sale=true;
        empezar();
    } 
    public void animarEntrar(){
        this.setIcon(cambiarTamano((ImageIcon) carta,2,2));
        sale=false;
        empezar();
    }
    public void empezar(){
        timer=new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sale){
                    altura--;
                    ancho--;
                }else{
                    altura++;
                    ancho++;
                }
                ponerImagen();
            }
        });
        timer.start();
        timer.setRepeats(true);
    }
    
    public void ponerImagen(){
        System.out.println(altura+" "+ancho);
        if(altura>0 && ancho>0 && altura<100 && ancho<100){
            System.out.println("poniendo img");
            this.setIcon(cambiarTamano((ImageIcon) this.getIcon(),altura, ancho));
        }else{
            if(sale)
                 setIcon(null);
            else{
                setIcon(carta);
                
            }
            //System.out.println("6748574 "+(altura>0 && ancho>0) +""+( altura<ALTOMAX) +" "+ ancho<ALTOMAX);
            timer.stop();
        }
        this.updateUI();
    }
    
   
    
   
    //ocultar
    //es igual
    //
    
}
