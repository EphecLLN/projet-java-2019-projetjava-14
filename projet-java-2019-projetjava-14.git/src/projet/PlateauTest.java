package projet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlateauTest {


	private char [][] plateau;

	@Test
	void test() {
		int x =10;
		int y = 10;
		 
		 
		if (plateau[x][y] != 'x') {
			fail( "différent de X ");
	        }
	}

}
