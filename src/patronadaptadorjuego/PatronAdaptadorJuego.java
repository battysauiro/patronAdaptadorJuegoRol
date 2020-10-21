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
public class PatronAdaptadorJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Fighter caballero = new Caballero();
        Mago mago = new Mago();
        MagoAdaptador magoAdapter = new MagoAdaptador(mago);

        System.out.println("-----Caballero en accion------");
        caballero.ataque();
        caballero.defender();
        caballero.escapar();

        System.out.println("\n-----Mago en accion------");
        magoAdapter.ataque();
        magoAdapter.defender();
        magoAdapter.escapar();
    }
    
}
