package testingProject;

import java.util.Scanner;

/**
 * Represents a variety of information about a geocache. A geocache has a title, an owner, a difficulty rating, a
 * terrain rating, a GC code, a latitude, and a longitude.
 */
public class Cache
{
    // TODO: Put representation here

    /**
     * Creates a Cache from a string that consists of these seven cache attributes: the GC code, the title, the owner,
     * the difficulty rating, the terrain rating, the latitude, and the longitude, in that order, separated by single
     * TAB ('\t') characters.
     * 
     * If any of the following problems are present, throws an IllegalArgumentException:
     * <ul>
     * <li>Fewer than seven attributes</li>
     * <li>More than seven attributes</li>
     * <li>A GC code that is anything other than "GC" followed by one or more upper-case letters and/or digits</li>
     * <li>A difficulty or terrain rating that parses to anything other than the doubles 1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5,
     * or 5.</li>
     * <li>A title, owner, latitude, or longitude that consists only of white space</li>
     */
    
    
    /**
     * Creating the different variables that will be used throughout
     */
    
    // The gcCode as a string
    private String gcCode = null;
    
    //The title as a string
    private String title = null; 
    
    //The owner as a string
    private String owner = null; 
    
    //The difficulty as a string
    private String difficulty = null; 
    
    //The terrain as a string
    private String terrain = null;
    
    //The latitude as a string
    private String latitude = null; 
    
    //The longitude as a string
    private String longitude = null;
    
    
    
    
    
    
    
    /**
     * The cache used 
     * @param attributes
     */
    
    public Cache (String attributes)
    {
        String[] arrayOfAttributes = attributes.split("\t"); 
        
        gcCode = arrayOfAttributes[0]; 
        title = arrayOfAttributes[1]; 
        owner = arrayOfAttributes[2];
        difficulty = arrayOfAttributes[3]; 
        terrain = arrayOfAttributes[4]; 
        latitude = arrayOfAttributes[5]; 
        longitude = arrayOfAttributes[6]; 
               
    }
    
    
    
    
    
    

    /**
     * Converts this cache to a string
     */
    public String toString ()
    {
        return getTitle() + " by " + getOwner();
    }
    

    
    
    

    /**
     * Returns the owner of this cache
     */
    public String getOwner ()
    {
        String a = owner.trim(); 
        if(a.isEmpty())
        {
            throw new IllegalArgumentException("The owner can't be all whitespace");  
        }
        else
        {
           return owner;  
        }
    }

    
    
    
    
    
    /**
     * Returns the title of this cache
     */
    public String getTitle ()
    {
            String a = title.trim(); 
            if(a.isEmpty())
            {
                throw new IllegalArgumentException("The title can't be all whitespace");  
            }
            else
            {
               return title;  
            }
        }
    
    
    
    
    
    

    /**
     * Returns the difficulty rating of this cache
     */
    public double getDifficulty ()
    {
        Double myDifficulty = Double.parseDouble(difficulty); 
        if(myDifficulty == 1.0 ||myDifficulty == 1.5 ||myDifficulty == 2.0 ||myDifficulty == 2.5 ||myDifficulty == 3.0 ||myDifficulty == 3.5 ||myDifficulty == 4.0 ||myDifficulty == 4.5 ||myDifficulty == 5.0)
        {
            return myDifficulty; 
        }
        else
        {
            throw new IllegalArgumentException("The difficulty must equal 1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5, or 5");  
        }
    }
    
    
    
    
    

    /**
     * Returns the terrain rating of this cache
     */
    public double getTerrain ()
    {
        Double myTerrain = Double.parseDouble(terrain); 
        if(myTerrain == 1 ||myTerrain == 1.5 ||myTerrain == 2 ||myTerrain == 2.5 ||myTerrain == 3 ||myTerrain == 3.5 ||myTerrain == 4 ||myTerrain == 4.5 ||myTerrain == 5)
        {
            return myTerrain;  
        }
        else
        {
            throw new IllegalArgumentException("The terrain must equal 1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5, or 5");
        }
    }

    
    
    
    
    
    
    /**
     * Returns the GC code of this cache
     */
    public String getGcCode ()
    {
        char c; 
        int i = 0; 
        
        if (gcCode.substring(0,2).equals("GC"))
        {
            while (i < gcCode.length())
            {
                c = gcCode.charAt(i); 
                if (!Character.isLetterOrDigit(c))
                {
                    throw new IllegalArgumentException("The GC code must be alphanumeric"); 
                }
                else
                {
                    break; 
                }
            }
        }
        else {        
            throw new IllegalArgumentException("The GC code must start with GC"); 
            }
        return gcCode; 
        }

    
    
    
    
    
    
    /**
     * Returns the latitude of this cache
     */
    public String getLatitude ()
    {
        String a = latitude.trim(); 
        if(a.isEmpty())
        {
            throw new IllegalArgumentException("The latitude can't be all whitespace");  
        }
        else
        {
           return latitude;  
        }
    }
    
    
    
    
    
    
    

    /**
     * Returns the longitude of this cache
     */
    public String getLongitude ()
    {
        String a = longitude.trim(); 
        if(a.isEmpty())
        {
            throw new IllegalArgumentException("The longitude can't be all whitespace");  
        }
        else
        {
           return longitude;  
        }
    }
    
    
    
    
    
    

    public int getNumberTabs (String attributes)
    {
      
        Scanner scnr = new Scanner(attributes);
        
        int count = 0;
        int myNum = 0; 
        
        while(myNum < attributes.length()-1)
        {
           char a = scnr.next().charAt(myNum); 
           if(a == '\t') 
           {
               count++; 
           }
           myNum++; 
        }
        return count; 
    }
}