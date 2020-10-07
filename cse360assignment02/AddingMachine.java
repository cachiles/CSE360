package cse360assignment02;

// *Assignment Instructions*:
/*
  Create the initial version: 
    -Document this file using the Javadoc comment style but do not make any 
    code changes to the file at this time. Most of the methods are blank.
    -Commit the project to git and github (or bitbucket)

  Create the second version
    Make the following changes to the AddingMachine file:
      -Use the normal operators for the operations (+, -).
      -There is no limit on the size of the String returned.
      -The format of the String should separate all operations and values with a 
      space. For example:
          myCalculator.add (4); 
          myCalculator.subtract (2); 
          myCalculator.add(5);
        then the toString method should return
          "0 + 4 – 2 + 5"
      -Add other variables as needed to the class. Any additional variables must be 
      private. Make changes to the other methods if needed.
      -Update all documentations as needed
      -*Do not modify the function signature (the method name, parameters and 
      return type).
      -Test your solution and then commit the project to git and github. 
      (or bitbucket)

  Submit your java file (AddingMachine.java) on Canvas.
*/

public class AddingMachine 
{
  private int total;
  
  // 
  public AddingMachine () 
  {
    total = 0;  // not needed - included for clarity
  }
  
  // The getTotal method should return the current total
  public int getTotal () 
  {
    return 0;
  }
  
  // The add method should add the parameter to the total variable
  public void add (int value) 
  {

  }

  // The subtract method should subtract the parameter from the total variable
  public void subtract (int value) 
  {

  }

  // A history of the transactions must be kept to be returned by the toString 
  // method. The history should start from the initial 0 value to the last input.
  public String toString () 
  {
    return "";
  }

  // The clear method should clear your AddingMachine.
  public void clear() 
  {

  }
}