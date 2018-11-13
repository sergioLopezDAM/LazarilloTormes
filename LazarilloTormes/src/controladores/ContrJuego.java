/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package controladores;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.VJuego;
import trabajodi.Logica;


/**

 @author Guille
 */
public class ContrJuego implements MouseListener {

    private VJuego vista;
    private Logica logica;


    public ContrJuego(VJuego vista, Logica logica) {
        this.vista = vista;
        this.logica = logica;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getComponent().getName());
        vista.algo();
    }


    @Override
    public void mousePressed(MouseEvent e) {
    }


    @Override
    public void mouseReleased(MouseEvent e) {
    }


    @Override
    public void mouseEntered(MouseEvent e) {
    }


    @Override
    public void mouseExited(MouseEvent e) {
    }

}
