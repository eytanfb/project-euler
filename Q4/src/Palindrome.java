import java.util.Arrays;

public class Palindrome
{

	public static boolean isPalindrome(int number)
	{
		String number_string = Integer.toString(number);
		char[] number_array = number_string.toCharArray();
		
		return Arrays.equals(number_array, Palindrome.reverseArray(number_array));
		
	}

	
	public static boolean isProductPalindrome(int multiplicand, int multiplier)
	{
		return isPalindrome(multiplicand*multiplier);
	}
	
	public static int[] largestPalindromeCoupleBelow(int upperLimit)
	{
		int[] twoLargestNumbers = new int[2];
		
		int currentHighestProduct = 0;
		for(int i = 0; i < upperLimit; i++)
		{
			for(int j = 0; j < upperLimit; j++)
			{
				if(i != j && i*j > currentHighestProduct && Palindrome.isProductPalindrome(i, j))
				{
					twoLargestNumbers[0] = i;
					twoLargestNumbers[1] = j;
					currentHighestProduct = i*j;
				}
			}
		}
		
		return twoLargestNumbers;
	}

	public static int largestProductPalindromeBelow(int upperLimit)
	{
		int[] largestCouple = Palindrome.largestPalindromeCoupleBelow(upperLimit);
		return largestCouple[0] * largestCouple[1];
	}
	
	public static void main(String[] args)
	{
		System.out.println(Palindrome.largestProductPalindromeBelow(1000));
	}

	public static char[] reverseArray(char[] array)
	{
		char[] reversed = new char[array.length];
		
		for(int i = 0; i < array.length; i++)
		{
			reversed[array.length-1-i] = array[i];
		}
		
		return reversed;
	}
	
}
