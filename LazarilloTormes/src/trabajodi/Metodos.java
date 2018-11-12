/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package trabajodi;


import java.awt.Color;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;


/**

 @author JesusClase
 */
public class Metodos {

    /**
     Proporciona un color aleatorio para el panel
     @return Devuelve un color
     */
    public Color colorAleatorio() {
        Random aleatorio = new Random();
        int red = aleatorio.nextInt(255);
        int green = aleatorio.nextInt(255);
        int blue = aleatorio.nextInt(255);
        Color color = new Color(red, green, blue);
        return color;
    }


    /**
     Modifica el tamaño de las imagenes

     @param icono
     @param anchoImagen
     @param altoImagen
     @return
     */
    public ImageIcon cambiarTamano(ImageIcon icono, int anchoImagen, int altoImagen) {
        Image imagen = icono.getImage();
        Image reescalada = imagen.getScaledInstance(anchoImagen, altoImagen, java.awt.Image.SCALE_SMOOTH);
        icono = new ImageIcon(reescalada);
        return icono;
    }


    /**
     Modifica el tamaño de las imagenes

     @param icono
     @param anchoImagen
     @param altoImagen
     @return
     */
    public Image cambiarTamano(Image icono, int anchoImagen, int altoImagen) {
        Image reescalada = icono.getScaledInstance(anchoImagen, altoImagen, java.awt.Image.SCALE_SMOOTH);
        return reescalada;
    }
}
