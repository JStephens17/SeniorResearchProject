/*
 * doBattle takes the data defined in prepareBattle and uses it to simulate the Pokemon battles.
 * The battle simulator simulates each of the 9 move selection pairings 1000 times
 * 
 * ALL MOVE SELECTION COMBOS TO BE TESTED FOR EACH MATCHUP:
 * 
 * Random vs Random
 * Random vs Heuristic
 * Random vs Minmax
 * Heuristic vs Random
 * Heuristic vs Heuristic
 * Heuristic vs Minmax
 * Minmax vs Heuristic
 * Minmax vs Minmax
 * Minmax vs Random
 * 
 * 
 */
import java.util.Random;

public class doBattle extends prepareBattle 
{
	public static void battle(double[] Pokemon1, double[] Pokemon2) 
	{
		for(int moveSelMatchup = 0; moveSelMatchup < 1; moveSelMatchup++)	//0-9 do this or like actually type out the 9 combos with loop below
		{
			for(int battleNumber = 0; battleNumber < 1; battleNumber++)		//0-1000
			{
				double Pokemon1HP = Pokemon1[11];	//reset health after every battle
				double Pokemon2HP = Pokemon2[11];
				boolean winner = false;
				while(winner == false)
				{	
					if (Pokemon1[10] > Pokemon2[10])		//Pokemon 1 is faster
					{
						int move1 = getRandomMove();
						System.out.println("Move one is: " + move1);
						
						double accuracy = Pokemon1[move1 + 4];
						Random rand = new Random();	  
				        int calcAccuracy = rand.nextInt(100);  //1-100
				        calcAccuracy++;
				        
				        if(calcAccuracy <= accuracy*100)	//Move hits
				        {
				        	double damage = (4*Pokemon1[move1]*Pokemon1[8]);
				        	damage = damage / ((Pokemon1[9] * 50) + 2);
				        	Pokemon2HP = Pokemon2HP - damage;
				        }
				        else
				        {
				        	System.out.println("Move missed");
				        }
				        if(Pokemon2HP <= 0)
				        {
				        	winner = true;
				        	System.out.println("Pokemon 1 wins");
				        }
				        
				        else //Pokemon 2 still alive, get move and attempt to use it
				        {
				        	int move2 = getRandomMove();
							System.out.println("Move two is: " + move2);
							
							double accuracy2 = Pokemon1[move2 + 4];
							Random rand2 = new Random();	  
					        int calcAccuracy2 = rand.nextInt(100);  //1-100
					        calcAccuracy2++;
					        
					        if(calcAccuracy2 <= accuracy2*100)	//Move hits
					        {
					        	double damage2 = (4*Pokemon2[move2]*Pokemon2[8]);
					        	damage2 = damage2 / ((Pokemon2[9] * 50) + 2);
					        	Pokemon1HP = Pokemon1HP - damage2;
					        }
					        else
					        {
					        	System.out.println("Move missed");
					        }
					        if(Pokemon1HP <= 0)
					        {
					        	winner = true;
					        	System.out.println("Pokemon 2 wins");
					        }
				        }
					}
					else if(Pokemon2[10] > Pokemon1[10])	//Pokemon 2 is faster
					{
						int move1 = getRandomMove();
						System.out.println("Move one is: " + move1);
						
						double accuracy = Pokemon2[move1 + 4];
						Random rand = new Random();	  
				        int calcAccuracy = rand.nextInt(100);  //1-100
				        calcAccuracy++;
				        
				        if(calcAccuracy <= accuracy*100)	//Move hits
				        {
				        	double damage = (4*Pokemon2[move1]*Pokemon2[8]);
				        	damage = damage / ((Pokemon2[9] * 50) + 2);
				        	Pokemon1HP = Pokemon1HP - damage;
				        }
				        else
				        {
				        	System.out.println("Move missed");
				        }
				        if(Pokemon1HP <= 0)
				        {
				        	winner = true;
				        	System.out.println("Pokemon 2 wins");
				        }
				        
				        else //Pokemon 2 still alive, get move and attempt to use it
				        {
				        	int move2 = getRandomMove();
							System.out.println("Move two is: " + move2);
							
							double accuracy2 = Pokemon2[move2 + 4];
							Random rand2 = new Random();	  
					        int calcAccuracy2 = rand.nextInt(100);  //1-100
					        calcAccuracy2++;
					        
					        if(calcAccuracy2 <= accuracy2*100)	//Move hits
					        {
					        	double damage2 = (4*Pokemon1[move2]*Pokemon1[8]);
					        	damage2 = damage2 / ((Pokemon1[9] * 50) + 2);
					        	Pokemon2HP = Pokemon2HP - damage2;
					        }
					        else
					        {
					        	System.out.println("Move missed");
					        }
					        if(Pokemon2HP <= 0)
					        {
					        	winner = true;
					        	System.out.println("Pokemon 1 wins");
					        }
				        }
					}
					else	//speed tie, need random tie-break
					{
						Random spdTie = new Random();	  
				        int speedTie = spdTie.nextInt(2);
				        
				        if(speedTie == 0)
				        {
				        	int move1 = getRandomMove();
							System.out.println("Move one is: " + move1);
							
							double accuracy = Pokemon1[move1 + 4];
							Random rand = new Random();	  
					        int calcAccuracy = rand.nextInt(100);  //1-100
					        calcAccuracy++;
					        
					        if(calcAccuracy <= accuracy*100)	//Move hits
					        {
					        	double damage = (4*Pokemon1[move1]*Pokemon1[8]);
					        	damage = damage / ((Pokemon1[9] * 50) + 2);
					        	Pokemon2HP = Pokemon2HP - damage;
					        }
					        else
					        {
					        	System.out.println("Move missed");
					        }
					        if(Pokemon2HP <= 0)
					        {
					        	winner = true;
					        	System.out.println("Pokemon 1 wins");
					        }
					        
					        else //Pokemon 2 still alive, get move and attempt to use it
					        {
					        	int move2 = getRandomMove();
								System.out.println("Move two is: " + move2);
								
								double accuracy2 = Pokemon1[move2 + 4];
								Random rand2 = new Random();	  
						        int calcAccuracy2 = rand.nextInt(100);  //1-100
						        calcAccuracy2++;
						        
						        if(calcAccuracy2 <= accuracy2*100)	//Move hits
						        {
						        	double damage2 = (4*Pokemon2[move2]*Pokemon2[8]);
						        	damage2 = damage2 / ((Pokemon2[9] * 50) + 2);
						        	Pokemon1HP = Pokemon1HP - damage2;
						        }
						        else
						        {
						        	System.out.println("Move missed");
						        }
						        if(Pokemon1HP <= 0)
						        {
						        	winner = true;
						        	System.out.println("Pokemon 2 wins");
						        }
					        }
				        }
				        else
				        {
				        	int move1 = getRandomMove();
							System.out.println("Move one is: " + move1);
							
							double accuracy = Pokemon2[move1 + 4];
							Random rand = new Random();	  
					        int calcAccuracy = rand.nextInt(100);  //1-100
					        calcAccuracy++;
					        
					        if(calcAccuracy <= accuracy*100)	//Move hits
					        {
					        	double damage = (4*Pokemon2[move1]*Pokemon2[8]);
					        	damage = damage / ((Pokemon2[9] * 50) + 2);
					        	Pokemon1HP = Pokemon1HP - damage;
					        }
					        else
					        {
					        	System.out.println("Move missed");
					        }
					        if(Pokemon1HP <= 0)
					        {
					        	winner = true;
					        	System.out.println("Pokemon 2 wins");
					        }
					        
					        else //Pokemon 2 still alive, get move and attempt to use it
					        {
					        	int move2 = getRandomMove();
								System.out.println("Move two is: " + move2);
								
								double accuracy2 = Pokemon2[move2 + 4];
								Random rand2 = new Random();	  
						        int calcAccuracy2 = rand.nextInt(100);  //1-100
						        calcAccuracy2++;
						        
						        if(calcAccuracy2 <= accuracy2*100)	//Move hits
						        {
						        	double damage2 = (4*Pokemon1[move2]*Pokemon1[8]);
						        	damage2 = damage2 / ((Pokemon1[9] * 50) + 2);
						        	Pokemon2HP = Pokemon2HP - damage2;
						        }
						        else
						        {
						        	System.out.println("Move missed");
						        }
						        if(Pokemon2HP <= 0)
						        {
						        	winner = true;
						        	System.out.println("Pokemon 1 wins");
						        }
					        }
				        }
				        	
					}
				}
			}
		}
	}
	
	static int getRandomMove()
	{
		Random rand = new Random();	  
        int randMove = rand.nextInt(4);  //0-3
		return randMove;
	}
}
