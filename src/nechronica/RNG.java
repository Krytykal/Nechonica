//Author: Guilty Complex
//Houses all RNG related functions
package nechronica;

import java.util.Random;

public class RNG 
{    
    //Rolls a set number of D6s
    public int getD6()
    {
        Random  dice = new Random();
        int roll = dice.nextInt(6)+1;
        return roll;
    }

    //Rolls a set number of D10s
    public int getD10()
    {
        Random  dice = new Random();
        int roll = dice.nextInt(10)+1;
        return roll;
    }
    
    //Rolls a set number of D20s
    public int getD20()
    {
        Random  dice = new Random();
        int roll = dice.nextInt(20)+1;
        return roll;
    }        
}
