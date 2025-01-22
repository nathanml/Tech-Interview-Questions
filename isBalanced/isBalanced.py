# Method for determining if all parentheses/brackets are closed
# Input is a strings of these characters "(){}[]". Any other string not accepted
# Valid Inputs: "[](){}", "[{()}]"
# Invalid Inputs: "([]", "([)]"

def isBalanced(s):
    balanced = True
    stack = []
    for i in range(len(s)):
        if s[i] == '(' or s[i] == '[' or s[i] =='{':
            stack.append(s[i])
        if s[i] == "}":
            x = stack.pop()
            if x != "{":
                balanced = False
        if s[i] == ")":
            x = stack.pop()
            if x != "(":
                balanced = False
        if s[i] == "]":
            x = stack.pop()
            if x != "[":
                balanced = False
    if balanced == True and stack == []:
        return "Balanced string"
    else:
        return "Not balanced"
        
##print(isBalanced("[]"))
##print(isBalanced("()[]{}"))
##print(isBalanced("{[()]}"))
##print(isBalanced("["))
##print(isBalanced("([)]"))
##print(isBalanced("([]"))
