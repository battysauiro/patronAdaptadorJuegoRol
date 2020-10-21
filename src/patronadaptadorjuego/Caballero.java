/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronadaptadorjuego;

/**
 *
 * @author Oscar
 */
public class Caballero implements Fighter{

    @Override
    public void ataque() {
        System.out.println("al ataque!!!!!!");
    }

    @Override
    public void defender() {
        System.out.println("defender...");
    }

    @Override
    public void escapar() {
        System.out.println("corre caballo corre...");
    }
    
}
