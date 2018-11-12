/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import vista.VJuego;
import trabajodi.Logica;

/**
 *
 * @author Guille
 */
public class ContrJuego {
    private VJuego vista;
    private Logica logica;

    public ContrJuego(VJuego vista, Logica logica) {
        this.vista = vista;
        this.logica = logica;
    }
    
}
