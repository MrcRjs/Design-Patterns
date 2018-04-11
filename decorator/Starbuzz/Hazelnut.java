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
public class Hazelnut extends ExtraCondiments
{
    Beverage beverage;
    public Hazelnut(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDescription()
    {
       return beverage.getDescription() + ", Hazelnut";
    }

    public double cost()
    {
        return .15 + beverage.cost();
    }
}
