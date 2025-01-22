# Methods for determining if a string is or contains a palindrome

def isPalindrome(s):
    # Determines if string input is a palindrome or not
    # One character strings will be considered palindromes
    for i in range(len(s) - 1):
        # loops through string indices
        if s[i] != s[(-1) - i]:
            # checks if 1st character of string matches last character
            return False
    return True


##print(isPalindrome('a'))
##print(isPalindrome('aba'))
##print(isPalindrome('abad'))
##print(isPalindrome('abcba'))
##print(isPalindrome('abcde'))

def containsPalindrome(s):
    # Determines if string input contains a palindrome larger than
    # an individual character
    if len(s) <= 1:
        # Base case: If the string is a character, return False
        return False
    elif isPalindrome(s) == True:
        # Check for if string is a palindrome
        return True
    else:
        # Recursive call
        return containsPalindrome(s[1:]) or containsPalindrome(s[0:-1])

##print(containsPalindrome('a'))
##print(containsPalindrome('abc'))
##print(containsPalindrome('abcba'))
##print(containsPalindrome('alab'))
##print(containsPalindrome('abab'))
##print(containsPalindrome('abcb'))
