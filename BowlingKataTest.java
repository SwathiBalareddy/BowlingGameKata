import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.experimental.theories.suppliers.TestedOn;

import CodeClass.Game;

public class BowlingKataTest {
	
	private Game game;	
	
	@Before
	public void setUp()
	{
		game =  new Game();
	}
	
	@Test
	public void canScoreGutterGame() 
	{
		game.roll(20, 0);
		assertThat(game.score(),is(0));
	}	
	
	@Test
	public void canScoreGamesOfOnes() 
	{
		game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1 );
		assertThat(game.score(),is(20));
	}
	
	@Test
	public void canScoreSpareFollowedByThree()
	{
		game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(game.score(), is(16));
	}
	
	@Test
	public void canScoreSpareFollowedByThreeThenThree()
	{
		game.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		assertThat(game.score(), is(22));
	}
	
	@Test
	public void canScorePerfectGame()
	{
		game.roll(10,10,10,10,10,10,10,10,10,10,10,10);
		assertThat(game.score(), is(300));
	}
	
	}
	
	

	
