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
public abstract class Beverage
{
    String description = "Unkown Beverage";

    public String getDescription()
    {
        return description;
    }
    
    public abstract double cost();
}
