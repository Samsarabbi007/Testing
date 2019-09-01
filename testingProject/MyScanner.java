package testingProject;


import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class MyScanner
{
    
    //The arrayList of tokens that the string contains
    public String[] tokens; 
    
    //The string used in MyScanner
    private String myString = ""; 
    
    
    //Counting the amount of times hasNext is called
    private static int hasNextCount = 0; 
    
    //String used with hasNextCount
    private String hasNextCountString = ""; 
    
    
    //Counting the amount of times next is called
    private static int nextCount = 0; 
    
    //String used with nextCount
    private String nextCountString = ""; 
    
    
    //Counting the amount of times hasNextInt is called
    private static int hasNextIntCount = 0; 
    
    //String used with hasNextIntCount
    private String hasNextIntCountString = ""; 
    
    
    //Counting the amount of times nextInt is called
    private static int nextIntCount = 0; 
    
    //String used with nextIntCount
    private String nextIntCountString = ""; 
    
    
    /**
     * Converts a string to an array list of the tokens within the string
     * @param myString
     */
    public MyScanner (String myString)
    {
        String[] tokens = myString.trim().split("\\s+"); 
        
        hasNextCountString = tokens[hasNextCount]; 
        nextCountString = tokens[nextCount];
        hasNextIntCountString = tokens[hasNextIntCount]; 
        nextIntCountString = tokens[nextIntCount]; 
    }
    
    
    
    /**
     * Returns true if this scanner has another token in its input.
     * @return
     */
    public boolean hasNext ()
    {
        hasNextCount++; 
        return (hasNextCount <= hasNextCountString.length() && hasNextCountString.length() > 0);        
    }
    
    
    
    
    /**
     * Finds and returns the next complete token from this scanner.
     * Throws NoSuchElementException if no more tokens are available 
     */
    public String next()
    {
        nextCount++; 
        
        if(nextCount > nextCountString.length())
        {
            throw new NoSuchElementException("No more tokens are available"); 
        }
        
        return nextCountString; 
    }
    
    
    
    /**
     * Returns true if the next token in this scanner's input can be interpreted as an int value in the default radix 
     * using the nextInt() method.
     */
    public boolean hasNextInt()
    {
        hasNextIntCount++; 
        
        try 
        {
        int x = Integer.parseInt(hasNextIntCountString); 
        }
        
        catch (NumberFormatException e)
        {
            return false; 
        }
  
        return (hasNextIntCount <= hasNextIntCountString.length() && hasNextIntCountString.length()  > 0); 
    }
    
    
    
    /**
     * Scans the next token of the input as an int.
     * Throws InputMismatchException if the next token isn't an int
     * Throws NoSuchElementException if no more tokens are available 
     */
    public int nextInt()
    {
        nextIntCount++; 
        int x = 0; 
        try
        {
        x = Integer.parseInt(nextIntCountString); 
        }
        catch (NumberFormatException e)
        {
            throw new InputMismatchException("Can't parse to Int"); 
        }
        if(nextIntCount > nextIntCountString.length())
        {
            throw new NoSuchElementException("Input is exhausted"); 
        }
        return x; 
    }

}