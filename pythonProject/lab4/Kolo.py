from Punkt import *

class Kolo(Punkt):
    def __init__(self,x=0,y=0,r=1):
        super().__init__(x, y)
        self.r=r
    def __str__(self):
        return f"Kolo({self.x},{self.y},{self.r})"
    def __repr__(self):
        return f"({self.x},{self.y},{self.r})"
    def obwod(self):
        return 2*math.pi*self.r
    def pole(self):
        return math.pi*(self.r)**2
    def przesun(self,wektorX,wektorY):
        self.x += wektorX
        self.y += wektorY
    def cz_wsp(self, other):
        dystansDwoch= self.dystans(other)
        if dystansDwoch >= self.r + other.r:
            return True
        else:
            return False
