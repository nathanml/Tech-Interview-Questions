package isPalindrome;

//Method for determining if a string is or contains a palindrome
public class PalindromeMethods {
	public static Boolean isPalindrome(String s)
	{
		int length = s.length();
		for(int i = 0; i < length/2; i++)
		{
			if(s.charAt(i) != s.charAt(length-i-1))
				return false;
		}
		return true;
	}
	
	public static Boolean containsPalindrome(String s)
	{
		int length = s.length();
		if(length <= 1)
			return false;
		if(isPalindrome(s) == true)
			return true;
		else
			return containsPalindrome(s.substring(1, s.length())) || containsPalindrome(s.substring(0,s.length()-1));
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("a")); //true
		System.out.println(isPalindrome("aba")); //true
		System.out.println(isPalindrome("abad")); //false
		System.out.println(isPalindrome("abcba")); //true
		System.out.println(isPalindrome("abcde")); //false
		System.out.println(containsPalindrome("a")); //false
		System.out.println(containsPalindrome("abc")); //false
		System.out.println(containsPalindrome("abcba")); //true
		System.out.println(containsPalindrome("alab")); //true
		System.out.println(containsPalindrome("abcb")); //true
	}
}