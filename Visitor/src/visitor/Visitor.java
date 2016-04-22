/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Sandra
 */
public class Visitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoNormal producto1 = new ProductoNormal();
        producto1.setPrecio(100);
        
        ProductoDescuento producto2 = new ProductoDescuento();
        producto2.setPrecio(100);        
         
        IVA iva = new IVA();
        double resultado1 = producto1.aceptaVisitante(iva);
        double resultado2 = producto2.aceptaVisitante(iva);
        
        System.out.println("Resultado Precio Normal: " + resultado1);
        System.out.println("Resultado Precio con Descuento: " + resultado2);
    }
    
}
