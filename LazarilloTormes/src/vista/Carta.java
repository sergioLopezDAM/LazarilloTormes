/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package vista;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**

 @author Guille
 */
public class Carta extends JLabel {
    private ImageIcon carta,aux;
    public Carta(String url) {
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
    
   
    //ocultar
    //es igual
    //
    
}
