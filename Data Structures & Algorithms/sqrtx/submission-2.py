class Solution:
    def mySqrt(self, x: int) -> int:
        if x==1:
            return 1
        for i in range(0,x+1):
            if i*i==x:
                return i
            if i*i>x:
                return i-1
        return 0