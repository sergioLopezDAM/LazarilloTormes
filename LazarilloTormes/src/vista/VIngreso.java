/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controladores.ContrIngreso;
import trabajodi.Logica;

/**
 *
 * @author Guille
 */
public class VIngreso {
    private ContrIngreso controlador;

    public VIngreso(Logica logica) {
        controlador=new ContrIngreso(this, logica);
    }
    
}
