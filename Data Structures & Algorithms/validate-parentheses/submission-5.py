
class Solution:
    def isValid(self, s: str) -> bool:
        li = []

        if len(s) % 2 != 0:
            return False

        for i in range(len(s)):
            if s[i] == '[' or s[i] == '{' or s[i] == '(':
                li.append(s[i])

            elif s[i] == ']':
                if not li or li[-1] != '[':
                    return False
                li.pop()

            elif s[i] == '}':
                if not li or li[-1] != '{':
                    return False
                li.pop()

            elif s[i] == ')':
                if not li or li[-1] != '(':
                    return False
                li.pop()

        return len(li) == 0
