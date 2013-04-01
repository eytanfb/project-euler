import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestPalindrome
{

	@Rule public TestName testName = new TestName();
	
	@After
	public void printCompletion()
	{
		System.out.println(testName.getMethodName() + " completed");
	}
	
	@Test
	public void testIsPalindrome()
	{
		assertTrue(Palindrome.isPalindrome(9009));
		assertTrue(Palindrome.isPalindrome(32123));
		assertFalse(Palindrome.isPalindrome(382749));
		assertFalse(Palindrome.isPalindrome(64738));
	}
	
	@Test
	public void testIsProductPalindrome()
	{
		assertTrue(Palindrome.isProductPalindrome(101, 101));
		assertTrue(Palindrome.isProductPalindrome(202, 202));
		assertFalse(Palindrome.isProductPalindrome(123, 123));
		assertFalse(Palindrome.isProductPalindrome(546, 937));
	}

	@Test
	public void testFindLargestPalindromeCoupleBelow()
	{
		int[] twoLargestNumbers = {91, 99};
		assertTrue(Arrays.equals(twoLargestNumbers, Palindrome.largestPalindromeCoupleBelow(100)));
		
		int[] twoLargestNumbers2 = {191, 193};
		assertTrue(Arrays.equals(twoLargestNumbers2, Palindrome.largestPalindromeCoupleBelow(202)));
	}

	@Test
	public void testLargestProductPalindromeBelow()
	{
		assertEquals(9009, Palindrome.largestProductPalindromeBelow(100));
		assertEquals(36863, Palindrome.largestProductPalindromeBelow(202));
	}
	
	@Test
	public void testReverseArray()
	{
		char[] array = {9, 0};
		char[] reversedArray = {0, 9};
		
		assertTrue(Arrays.equals(reversedArray, Palindrome.reverseArray(array)));
		
		char[] anotherArray = {1,2,3,4,5,6,7};
		char[] anotherArrayReversed = {7,6,5,4,3,2,1};
		
		assertTrue(Arrays.equals(anotherArrayReversed, Palindrome.reverseArray(anotherArray)));
		
	}
	
	
}
