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
public class MagoAdaptador implements Fighter{
    private Mago mago;
    public MagoAdaptador(Mago mago) {
        this.mago = mago;
    }
    @Override
    public void ataque() {
         this.mago.lanzarhechizosdedestrucción();
    }

    @Override
    public void defender() {
        this.mago.proteger();
    }

    @Override
    public void escapar() {
        this.mago.abrirPortal();
    }
    
}
