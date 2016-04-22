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
public interface Ivisitante {
    public double visit(ProductoNormal normal);
    public double visit(ProductoDescuento reducido);
}
