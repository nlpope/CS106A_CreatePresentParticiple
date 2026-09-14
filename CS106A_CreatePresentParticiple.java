/**
 * File: CS106A_CreatePresentParticiple.java 
 * ------------------------------------------
 * The CS106A_CreatePresentParticiple class converts a 
 * String into its present participle / gerund form using
 * the PSGerund package. This file is simply to test 
 * PSGerund's functionality.
 * 
 */

import acm.program.*;
import com.popesoftware.test.*;

public class CS106A_CreatePresentParticiple extends ConsoleProgram
{
	
	private static final String SENTINEL = "ENDPROGRAM";
	public void run()
	{
		while (true){
			String userInput = readLine("enter word:");
			if (userInput.equals(SENTINEL)){ println("bye"); break; }
			println(PSGerund.createPresentParticiple(userInput));
		}
	}
	
}