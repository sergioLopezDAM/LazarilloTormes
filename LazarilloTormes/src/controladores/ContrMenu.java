/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import vistas.VMenu;
import trabajodi.Logica;

/**
 *
 * @author Guille
 */
public class ContrMenu {
    private Logica logica;
    private VMenu vista;

    public ContrMenu(Logica logica, VMenu vista) {
        this.logica = logica;
        this.vista = vista;
    }

    
}
