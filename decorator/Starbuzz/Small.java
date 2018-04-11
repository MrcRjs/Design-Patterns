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
public class Small extends Size
{
    Beverage beverage;
    public Small(Beverage beverage)
    {
        this.beverage = beverage;
        this.setSizeMultiplier((float) 1);
    }

    public String getDescription()
    {
       return beverage.getDescription() + ", Pequeño";
    }

    public double cost()
    {
        return  Math.round(beverage.cost() * this.getSizeMultiplier() * 100.0) / 100.0;
    }
}
