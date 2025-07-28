def isAnagram(s1, s2):
    if len(s1) is not len(s2):
        return False
    else:
        # Sort s1
        s1Sorted = sorted(s1)
        # Sort s2
        s2Sorted = sorted(s2)
        return s1Sorted == s2Sorted


print("Is S, S, anagram? ", isAnagram('s', 's'))
print("Is  ,  , anagram? ", isAnagram('', ''))
print("Is ABCDE, ABC, anagram? ", isAnagram('ABCDE', 'ZKEFA'))
print("Is ABCDE, DCBAE, anagram? ", isAnagram('ABCDE', 'DCBAE'))
print("Is ABCDE, DCBFE, anagram? ", isAnagram('ABCDE', 'DCBFE'))
print("Is ABCDE, ZKEFA, anagram? ", isAnagram('ABCDE', 'ZKEFA'))