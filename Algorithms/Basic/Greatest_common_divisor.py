# Uses python3
import sys
def gcd_euclid(a, b):
    if b==0:
        return a
    return gcd_euclid(b,a%b)        

if __name__ == "__main__":
    input = sys.stdin.readline()
    a, b = map(int, input.split())
    print(gcd_euclid(a, b))
