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
public class Large extends Size {
    Beverage beverage;
    public Large(Beverage beverage)
    {
        this.beverage = beverage;
        this.setSizeMultiplier((float) 1.75);
    }

    public String getDescription()
    {
       return beverage.getDescription() + ", Large";
    }

    public double cost()
    {
        return  Math.round(beverage.cost() * this.getSizeMultiplier() * 100.0) / 100.0;
    }
}
