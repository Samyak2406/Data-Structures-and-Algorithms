def calc_fib(n):
    
    fiblist=[]
    fiblist.append(0)
    fiblist.append(1)
    
    for i in range(2,n+1):
        fiblist.append(fiblist[i-1] + fiblist[i-2])

    return fiblist[n]
      

n = int(input())
print(calc_fib(n))
