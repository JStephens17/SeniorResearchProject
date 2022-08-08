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
public class doBattle extends prepareBattle 
{
	public static void battle(double[] Pokemon1, double[] Pokemon2) 
	{
		for(int moveSelMatchup = 0; moveSelMatchup < 9; moveSelMatchup++)	//do this or like actually type out the 9 combos with loop below
		{
			for(int battleNumber = 0; battleNumber < 1000; battleNumber++)
			{
				boolean winner = false;
				while(winner == false)
				{
					
				}
			}
		}
	}
}
