package cse360assignment02;

public class test
{
    public static void main(String[] args) 
    {
    	AddingMachine test = new AddingMachine();
    	
    	int value = test.getTotal();
        System.out.println(value);
        
        test.add(5);
        value = test.getTotal();
        System.out.println(value);
        
        test.subtract(3);
        value = test.getTotal();
        System.out.println(value);
        
        String history = test.toString();
        System.out.println(history);
        
        test.clear();
        value = test.getTotal();
        history = test.toString();
        
        test.add(10);
        value = test.getTotal();
        System.out.println(value);        
        
        test.subtract(5);
        value = test.getTotal();
        System.out.println(value);
        
        test.add(2);
        value = test.getTotal();
        System.out.println(value);
        
        history = test.toString();
        System.out.println(history);
    }
}