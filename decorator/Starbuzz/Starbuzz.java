/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.Starbuzz;

/**
 *
 * @author mrcrjs
 */
public class Starbuzz {
    public static void main(String[] args)
    {
        Espresso es1 = new Espresso();
        Soy soyalv = new Soy(es1);
        Hazelnut hz = new Hazelnut(soyalv);
        Large caf = new Large(hz);
        System.out.println(caf.getDescription() + " $" + caf.cost());
    }
}
