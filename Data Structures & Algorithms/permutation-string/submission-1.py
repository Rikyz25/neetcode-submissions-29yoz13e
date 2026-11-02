class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1)>len(s2):
            return False
        l=0
        r=len(s1)-1
        s3="".join(sorted(s1))
        while r<len(s2):
            if "".join(sorted(s2[l:r+1]))==s3:
                return True
            l+=1
            r+=1
        return False
