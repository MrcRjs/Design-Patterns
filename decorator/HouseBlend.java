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
public class HouseBlend extends Beverage
{
    public HouseBlend()
    {
        description = "House Blend";
    }
    
    public double cost()
    {
        return 0.99;
    }
}