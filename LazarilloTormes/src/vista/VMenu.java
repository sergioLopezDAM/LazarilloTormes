/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package vista;


import controladores.ContrMenu;
import trabajodi.Logica;


/**

 @author Guille
 */
public class VMenu {

    private ContrMenu controlador;


    public VMenu(Logica logica) {
        controlador = new ContrMenu(logica, this);
    }

}
