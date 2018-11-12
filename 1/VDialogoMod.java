/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import com.sun.javafx.geom.Matrix3f;
import controladores.ContrDialogoMod;
import java.awt.Button;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.transform.Rotate;
import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import trabajodi.Logica;

/**
 *
 * @author Guille
 */
public class VDialogoMod extends JPanel {
    private ContrDialogoMod controlador;
    private JButton atras;
    public VDialogoMod(Logica logica) {
        controlador=new ContrDialogoMod(this, logica);
    }
    public void cargar(){
       generarBoton();
    }
    private void generarBoton(){
        atras=new JButton();
        
        atras.setIcon(imagenEspejo("/img/flecha.png"));
        atras.setContentAreaFilled(false);
        atras.setBorderPainted(false);
        this.add(atras);
    }
    
    private ImageIcon imagenEspejo(String ruta){
        //BufferedImage for source image
        BufferedImage simg = null;
        //File object
        File f = null;
        //read source image file
        try{
            f = new File("src"+ruta);//necesita la carpera src para enontrar la ruta
            simg = ImageIO.read(f);
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        //guardamos los tamaños de la imagen
        int width = simg.getWidth();
        int height = simg.getHeight();
        //Creamos el BufferedImage con las simensiones de la imagen
        BufferedImage mimg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        
        //Creamos la imagen "espejo"
         for(int y = 0; y < height; y++){
            for(int lx = 0, rx = width - 1; lx < width; lx++, rx--){
              //lx starts from the left side of the image
              //rx starts from the right side of the image
              //get source pixel value
              int p = simg.getRGB(lx, y);
              //set mirror image pixel value - both left and right
              //mimg.setRGB(lx, y, p);
              mimg.setRGB(rx, y, p);
            }
          }
        
        return new ImageIcon(mimg.getScaledInstance(mimg.getWidth(), mimg.getHeight(),  SCALE_SMOOTH));
    } 
    
}
