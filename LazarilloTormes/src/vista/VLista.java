/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controladores.ContrLista;
import trabajodi.Logica;

/**
 *
 * @author Guille
 */
public class VLista {
    private ContrLista controlador;

    public VLista(Logica logica) {
        controlador=new ContrLista(this, logica);
    }
    
}
