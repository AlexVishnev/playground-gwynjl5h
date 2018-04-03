package com.yourself.exoPart1;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exo1_6Test {

	@Test
	public void test() throws FileNotFoundException {
		try {
            exo1_6.a = 3 ;
            exo1_6.b = 2 ;

            exo1_6.myexec();
			Assert.assertEquals("Calcule de 3 - 2 ", 1, exo1_6.resultat);
            
            exo1_6.a = 7 ;
            exo1_6.b = 2 ;

            exo1_6.myexec();
            Assert.assertEquals("Calcule de 7 - 2 ", 5 , exo1_6.resultat);
			
		} catch (AssertionError ae) {
			success(false);
			msg("Oops! 🐞", ae.getMessage());
			msg("Hint 💡", " 🤔");
		}
	}

	private static void msg(String channel, String msg) {
		System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
	}

	private static void success(boolean success) {
		System.out.println(String.format("TECHIO> success %s", success));
	}

	// check if a string exists in a text file
	private static boolean existsInFile(String str, File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		try {
			while (scanner.hasNextLine()) {
				if (scanner.nextLine().contains(str))
					return true;
			}
			return false;
		} finally {
			scanner.close();
		}
	}
}
