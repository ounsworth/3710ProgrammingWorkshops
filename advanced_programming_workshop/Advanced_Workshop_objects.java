/************************************************************************
 * A program written for the FIRST Robotics teams 3710 & 2809 programming
 * workshop.
 *
 * Introduces the notion of objects.
 *
 * This program will be presented (ie reconstructed on a projector).
 ************************************************************************/
 
 class Fruit{
     // Member Variables
     public boolean hasSeeds;
     private String colour;
     
     /** CONSTRUCTOR - no parameters 
      * If we're not told anything about the fruit, let's make something up!
      */
     public Fruit() {
         colour = "colourless";
         hasSeeds = false;
     }


     /** CONSTRUCTOR - 2 parameters */
     public Fruit(String _colour, boolean _hasSeeds) {
         colour = _colour;
         hasSeeds = _hasSeeds;
     }

     public void printInfo() {
         System.out.print("This fruit is "+colour+" and it ");
         if(hasSeeds)
             System.out.println("has seeds.");
         else
             System.out.println("does not have seeds.");
     }
     
 }




 public class Advanced_Workshop_objects {

    public static void main(String args[]) {
        Fruit apple = new Fruit();
        apple.hasSeeds = true;
        //apple.colour = "red";  // This line would be trouble since hasSeeds is private
        apple.printInfo();

        Fruit banana = new Fruit("yellow", false);
        banana.printInfo();
    }

 }