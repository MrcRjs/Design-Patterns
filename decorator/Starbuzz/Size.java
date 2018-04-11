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
public abstract class Size extends Beverage
{
    public float sizeMult = 1;
    public abstract String getDescription();
    public float getSizeMultiplier()
    {
        return sizeMult;
    }
    public void setSizeMultiplier(float size)
    {
        this.sizeMult = size;
    }
}
