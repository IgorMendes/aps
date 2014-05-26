import static org.junit.Assert.*;

import org.junit.Test;


public class Teste {


		
		private RG validarg = new RG();
		@Test
		public void testIsValidaRG(){
		assertFalse(validarg.isValidaRG("128641011"));
		assertFalse(validarg.isValidaRG(null));
		assertFalse(validarg.isValidaRG(""));
		assertFalse(validarg.isValidaRG("489234892348"));
	


		
		
	
	}

}
 