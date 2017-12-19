//Author: Guilty Complex
//Base game
package nechronica;
import java.util.*;

public class Nechronica 
{   
    public static void main(String[] args) 
    {
        // Start of main method
        
        Scanner keyBoard = new Scanner(System.in);
        
        //Start screen
        System.out.print("Nechronica\n");
        System.out.println(" 1) New Game \n 2) Continue \n 3) Quit \n");
        
        int selection = keyBoard.nextInt();
        
        switch(selection)
        {
            case 1:
                //New Game Intro
                new Interface().newLine();
                System.out.println("A world in which humanity has met its end.\n"
                        + "A world in which everyone has died.\n"
                        + "A world in which nothing more can die.\n"
                        + "In which naught stirs but walking corpses.\n"
                        + "As we have a cup of tea, beneath these skies as gray as lead let us tell the tale of this long, long epilogue.\n");
        }       
    }
    
    /*Example Code
        //Roll Example
        int roll = new RNG().getD6();
        System.out.println(roll);
    */
}
