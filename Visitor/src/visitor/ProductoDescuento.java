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
public class ProductoDescuento extends Producto{
    private double precio;
    
    @Override
    public double aceptaVisitante(Ivisitante visitor) {
        return visitor.visit(this);
    }   
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }    
}
