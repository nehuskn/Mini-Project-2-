/*
Mini Project 2
Group #7: Kayla Nehus, Calvin Catania, Nigel Burris, John Trygier 
Date: 3/15/2021
*/

import java.util.Random;

class Egg 
{
  private String color;
  private String contents;

  Egg() 
  {
    contents = randomContents();
    color = randomColor();
  }

    // create an array with all the potential contents, index array with a number between 0 and 6, then return string in array 
    public String randomContents() 
  {
    Random r = new Random();
    String[] contents = {"Cadbury Egg", "Reese Egg", "Pink Starburst", "Yellow Peep", "$0.25", "$0.50", "$1.00"};
    int cont = r.nextInt(7); 
    return contents[cont]; 
  }


  //this is essentially the same thing as randomContents() but the array is indexed from 0 to 3 and the array strings represent the colors
  public String randomColor() 
  {
    Random r = new Random();
    String[] colors = {"Blue", "Pink", "Yellow", "Green"};
    int color = r.nextInt(4); 
    return colors[color]; 
  }


  public void printEgg() 
  {
    System.out.println(color + " egg contains " + contents);
  }

  public String getColor() 
  {
    return color;
  }

  public String getContents() 
  {
    return contents;
  }
}