/*
Mini Project 2
Group #7: Kayla Nehus, Calvin Catania, Nigel Burris, John Trygier 
Date: 
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    //ec opportunity - prevent user from entering a negative number ** NOT COMPLETED
    Scanner s = new Scanner(System.in);
    System.out.println("How many players are in this Easter egg hunt? Enter a positive whole number: ");
    int num = s.nextInt();

    //create array with however many players the user inputs in scanner
    ArrayList<Player> players = new ArrayList<Player>();
    for(int i=0; i<num; i++) 
    {
      players.add(new Player());
    }
    System.out.println("We added " + num + " players to the hunt. Let's find some eggs!");
    
    //start hunt, recap, stats methods
    hunt(players);
    recap(players);
    stats(players);
  }

  //"hunt" method that generates a random number of eggs found for each player
  public static void hunt(ArrayList<Player> thePlayers) 
  {
    Random r = new Random();
    int eggsFound; 

    for(int i=0; i<thePlayers.size(); i++) {
      eggsFound = r.nextInt(11);
      for(int j=0; j<eggsFound; j++) {
        thePlayers.get(i).foundEgg(new Egg());
      }
    }
  }

  //"recap" method to print out what each player found
  // "/n" creates a paragraph between the next line :) 
  public static void recap(ArrayList<Player> thePlayers) 
  {
    for (int i=0; i<thePlayers.size(); i++) {
      System.out.println("\nPlayer " + i + " found " + thePlayers.get(i).getNumEggs() + " eggs");
      thePlayers.get(i).printBasket();
    }
  }

  //""stats" method  
  public static void stats(ArrayList<Player> thePlayers) 
  {
    int mostEggsPlayer = 0, mostEggsNumber = 0;
      
    for(int i=0; i<thePlayers.size(); i++) 
    {
      if(thePlayers.get(i).getNumEggs() > mostEggsNumber) 
      {
        mostEggsNumber = thePlayers.get(i).getNumEggs();
        mostEggsPlayer = i;
      }
    }
    
    System.out.println("\nPlayer " + mostEggsPlayer + " found the most eggs, with " + thePlayers.get(mostEggsPlayer).getNumEggs() + " eggs!"); 

    int[] colors = new int[4];
    for(int i=0; i<thePlayers.size(); i++) 
    {
      for(int j=0; j<thePlayers.get(i).getNumEggs(); j++)
      {
        if(thePlayers.get(i).getBasket().get(j).getColor().equals("Blue"))
          colors[0]++;
        if(thePlayers.get(i).getBasket().get(j).getColor().equals("Pink"))
          colors[1]++;
        if(thePlayers.get(i).getBasket().get(j).getColor().equals("Yellow"))
          colors[2]++;
        if(thePlayers.get(i).getBasket().get(j).getColor().equals("Green"))
          colors[3]++;
        }
      }

    // extra code that sums total of all eggs
    int sum = 0;
    for(int i : colors)
    sum += i;

    System.out.println("\n\nTotal eggs found by color: ");
    System.out.println("There were a total of " + sum + " eggs found!");
    System.out.println("Blue eggs: " + colors[0]);
    System.out.println("Pink eggs: " + colors[1]);
    System.out.println("Yellow eggs: " + colors[2]);
    System.out.println("Green eggs: " + colors[3]);
    


    //extra credit - essentially the same as the stats for the color eggs but change to contents "C" and "getContents"
  int[] c = new int[7];
    for(int i=0; i<thePlayers.size(); i++) 
    {
      for(int j=0; j<thePlayers.get(i).getNumEggs(); j++)
      {
        if(thePlayers.get(i).getBasket().get(j).getContents().equals("Cadbury Egg"))
          c[0]++;
        if(thePlayers.get(i).getBasket().get(j).getContents().equals("Reese Egg"))
          c[1]++;
        if(thePlayers.get(i).getBasket().get(j).getContents().equals("Pink Starburst"))
          c[2]++;
        if(thePlayers.get(i).getBasket().get(j).getContents().equals("Yellow Peep"))
          c[3]++;
        if(thePlayers.get(i).getBasket().get(j).getContents().equals("$0.25"))
          c[4]++;
        if(thePlayers.get(i).getBasket().get(j).getContents().equals("$0.50"))
          c[5]++;
        if(thePlayers.get(i).getBasket().get(j).getContents().equals("$1.00"))
          c[6]++;
        }
      }

    System.out.println("\n\nTotal eggs found by contents: ");
    System.out.println("Cadbury Egg eggs: " + c[0]);
    System.out.println("Reese Egg eggs: " + c[1]);
    System.out.println("Pink Starburst eggs: " + c[2]);
    System.out.println("Yellow Peep eggs: " + c[3]);
    System.out.println("$0.25 eggs: " + c[4]);
    System.out.println("$0.50 eggs: " + c[5]);
    System.out.println("$1.00: " + c[6]);
  } 
}

