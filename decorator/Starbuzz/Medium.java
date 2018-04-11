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
public class Medium extends Size
{
    Beverage beverage;
    public Medium(Beverage beverage)
    {
        this.beverage = beverage;
        this.setSizeMultiplier((float) 1.5);
    }

    public String getDescription()
    {
       return beverage.getDescription() + ", Mediano";
    }

    public double cost()
    {
        return  Math.round(beverage.cost() * this.getSizeMultiplier() * 100.0) / 100.0;
    }
}
