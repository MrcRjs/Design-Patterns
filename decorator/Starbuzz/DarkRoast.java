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
public class DarkRoast extends Beverage
{
    public DarkRoast()
    {
        description = "Dark Roast";
    }
    
    public double cost()
    {
        return 1.49;
    }
}
