/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author mrcrjs
 */
public class Venti extends Size
{
    Beverage beverage;
    public Venti(Beverage beverage)
    {
        this.beverage = beverage;
        this.setSizeMultiplier((float) 2);
    }

    public String getDescription()
    {
       return beverage.getDescription() + ", Venti";
    }

    public double cost()
    {
        return  Math.round(beverage.cost() * this.getSizeMultiplier() * 100.0) / 100.0;
    }
}