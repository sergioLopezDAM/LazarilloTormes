/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package vista;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**

 @author Guille
 */
public class Carta extends JLabel {

    public Carta(String url) {
        this.setIcon(cambiarTamano(new ImageIcon(url),100,100));
    }
    public void Aparecer(){
        
    }
    public ImageIcon cambiarTamano(ImageIcon icono, int anchoImagen, int altoImagen) {
        Image imagen = icono.getImage();
        Image reescalada = imagen.getScaledInstance(anchoImagen, altoImagen, java.awt.Image.SCALE_SMOOTH);
        icono = new ImageIcon(reescalada);
        return icono;
    }
    //ocultar
    //es igual
    //
}
