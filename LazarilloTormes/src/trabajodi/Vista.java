/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodi;

import Vistas.VCarga;
import Vistas.VDialogoMod;
import Vistas.VIngreso;
import Vistas.VJuego;
import Vistas.VLista;
import Vistas.VMenu;
import Vistas.VistaSplash;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Bounds;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Guille
 */
public class Vista {
    private JFrame ventana;
    private Font fuente = new Font("Agency FB", Font.BOLD, 40);
    
    
    private VCarga vCarga;
    private VDialogoMod vDialogoMod;
    private VIngreso vIngreso;
    private VJuego vJuego;
    private VLista vLista;
    private VMenu vMenu;
    private VistaSplash splash;

    
    public Vista(Logica logica) {
        ventana = new JFrame("Memorion");
        ventana.setMaximumSize(new Dimension(1924,1047));
        ventana.setSize(600,600);
        
        cargarSpash("/img/logotrini.png","/img/carga.jpg",0);
        //creamos todas las vistas mandandole la logica
        vCarga=new VCarga(logica);
        vDialogoMod=new VDialogoMod(logica);
        vIngreso=new VIngreso(logica);
        vJuego=new VJuego(logica);
        vLista=new VLista(logica);
        vMenu=new VMenu(logica);
        //no ponemos splash ya que no necesita logica
        
       // vDialogoMod=new VDialogoMod(logica);
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
    private void cargarSpash(String logo,String fondo,int tiempo){
        splash =new VistaSplash(logo,fondo,tiempo,fuente,this);
        ventana.setMinimumSize(splash.getMinimumSize());//asignamos el tamaño minimo para la ventana
        ventana.add(splash);
        splash.empezarAnimaciones();
    }

    public void splasTermina() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        ventana.remove(splash);
        ventana.repaint();
        splash=null;
        
        vDialogoMod.cargar();
        
        ventana.add(vDialogoMod);
        ventana.setVisible(true);
        
    }
    
    
}
    