/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package trabajodi;


import vista.VCarga;
import vista.VDialogoMod;
import vista.VIngreso;
import vista.VJuego;
import vista.VLista;
import vista.VMenu;
import vista.VistaSplash;
import java.awt.Dimension;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/**

 @author Guille
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
        ventana.setMaximumSize(new Dimension(1924, 1047));
        ventana.setSize(600, 600);

        cargarSpash("/img/logotrini.png", "/img/carga.jpg", 0);
        //creamos todas las vistas mandandole la logica
        vCarga = new VCarga(logica);
        vDialogoMod = new VDialogoMod(logica);
        vIngreso = new VIngreso(logica);
        vJuego = new VJuego(logica);
        vLista = new VLista(logica);
        vMenu = new VMenu(logica);
        //no ponemos splash ya que no necesita logica

        // vDialogoMod=new VDialogoMod(logica);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }


    private void cargarSpash(String logo, String fondo, int tiempo) {
        splash = new VistaSplash(logo, fondo, tiempo, fuente, this);
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
        splash = null;

        vDialogoMod.cargar();

        ventana.add(vDialogoMod);
        ventana.setVisible(true);
    }
}
