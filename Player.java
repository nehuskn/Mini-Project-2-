/*
Mini Project 2
Group #7: Kayla Nehus, Calvin Catania, Nigel Burris, John Trygier 
Date: 3/15/2021
*/

import java.util.ArrayList;

//create
class Player 
{
  private int eggs;
  private ArrayList<Egg> basket;

  Player() 
  {
    eggs = 0;
    basket = new ArrayList<Egg>();
  }

  public void foundEgg(Egg anEgg) 
  {
    eggs++;
    basket.add(anEgg);
  }

  public void printBasket() 
  {
    for(int i=0; i<basket.size(); i++) 
    {
      basket.get(i).printEgg();
    }
  }

  public int getNumEggs() 
  {
    return eggs;
  }

  public ArrayList<Egg> getBasket() 
  {
    return basket;
  }
}