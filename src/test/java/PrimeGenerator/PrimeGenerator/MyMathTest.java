package PrimeGenerator.PrimeGenerator;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.BeforeClass;
import org.junit.Test

import junit.framework.TestCase;

public class MyMathTest extends TestCase{

		private MyMath math;
		
		@BeforeClass
		public static void prepare() {
			math = new MyMath();
		}
		
		@Test
		public void primeNumbersGeneratorWorks() {
			assertEquals(new LinkedList<>(), math.primeNumbersGenerator(1));
			assertEquals(Arrays.asList(2, 3, 5, 7, 9, 11, 13, 17, 19), math.primeNumbersGenerator(20));
		}
}
