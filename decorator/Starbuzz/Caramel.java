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
public class Caramel extends ExtraCondiments
{
    Beverage beverage;
    public Caramel(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDescription()
    {
       return beverage.getDescription() + ", Caramel";
    }

    public double cost()
    {
        return .25 + beverage.cost();
    }
}