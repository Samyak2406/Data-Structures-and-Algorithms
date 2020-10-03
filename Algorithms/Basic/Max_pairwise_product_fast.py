# import random # for stress test part of the code

# This is the Function of Fast Algorithm
def max_pairwise_productFaster(numbers):
    n = len(numbers)
           
    numbers.sort(reverse=True)
    largest = numbers[0]
    secondlargest = numbers[1]
    
    max_product = largest*secondlargest
    
    return max_product


# To take user input 
if __name__ == '__main__':
    input_n = int(input())
    input_numbers = [int(x) for x in input().split()]
    print(max_pairwise_productFaster(input_numbers))

# this section is for stress test on the algorithm
"""if __name__ == '__main__':
    input_n = int(input())
    input_numbers = [int(x) for x in input().split()]
    print(max_pairwise_productFast(input_numbers))
"""
""" Stress Testing of the Code , Random inputs of custom range , comparing multiple solutions
while True:
    n = random.randint(2,1000)
    print(n)
    a = []

    for i in range(n):
        a.append(random.randint(0,100000))

    for i in range(n):
        print(a[i],end=" ")

    print("\n",max_pairwise_productFaster(a), max_pairwise_productFast(a))

    res1 = max_pairwise_productNaive(a)
    res2 = max_pairwise_productFast(a)

    if(res1!=res2):
        print("wrong answer:", res1, res2,"\n")
        break
    else:
        print("ok\n")

"""
