package com.oops;

public class Game
{
    private String country;
    private String nationalgame;
    
    Game(String country)
    {
    	this.country=country;
    	Game();
    }
    
    public Game() {
		// TODO Auto-generated constructor stub
	}

	private void Game()
    {
    	switch(country)
    	{
    	case "india":
    	  nationalgame="Hockey";
    	  break;
    	case "china":
      	  nationalgame="Table Tennis";
      	  break;
    	case "bangladesh":
      	  nationalgame="Kabaddi";
      	  break;
    	case "italy":
      	  nationalgame="Football";
      	  break;
    	case "unites states":
      	  nationalgame="Baseball";
      	  break;
    	  default:
    		  nationalgame="invalid nationalgame";
    	}
    }
    public void display()
    {
    	System.out.println("nationalgame of "+ country +" is "+nationalgame+"");
    }
	public static void main(String[] args)
	{
	   Game g1=new Game("italy");
	   g1.display();
	   

	}

}
