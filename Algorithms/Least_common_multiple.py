import sys

def gcd_euclid(a, b):
    if b == 0:
        return a
    return gcd_euclid(b, a % b)

def lcm_best(a, b):

    c=int((a*b) / gcd_euclid(a, b))
    return c 

if __name__ == '__main__':
    input = sys.stdin.readline()
    a, b = map(int, input.split())
    print(lcm_best(a, b))
