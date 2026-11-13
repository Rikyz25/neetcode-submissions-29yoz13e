class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        word = []
        l = 0
        r = 0
        f = 0
        
        while l < len(word1) and r < len(word2):
            if f == 0:
                word.append(word1[l])
                f = 1
                l += 1
            else:
                word.append(word2[r])
                f = 0
                r += 1
                
        while l < len(word1):
            word.append(word1[l])
            l += 1
            
        while r < len(word2):
            word.append(word2[r])
            r += 1
            
        return "".join(word)
