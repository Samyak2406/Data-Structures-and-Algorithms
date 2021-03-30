#include<bits/stdc++.h>

 

typedef long long ll;
// typedef pair<ll, ll> ipair;

 

using namespace std;
ll an=9;//Number of vertices
vector<vector<pair<ll, ll>>> g(an);

 

vector<ll> primes;

 

// Helping functions
void sieve(ll n)
{
    bool prime[n + 1];
    memset(prime, true, sizeof(prime));
 
    for (ll p = 2; p * p <= n; p++)
    {
        if (prime[p] == true) 
        {
            for (ll i = p * p; i <= n; i += p)
                prime[i] = false;
        }
    }
 
    for (ll p = 2; p <= n; p++)
        if (prime[p])
            primes.push_back(p);
}

 

bool isPrime(ll n) 
{ 
    if (n <= 1) 
        return false; 
    if (n <= 3) 
        return true; 

 

    if (n % 2 == 0 || n % 3 == 0) 
        return false; 
  
    for (ll i = 5; i * i <= n; i = i + 6) 
        if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
  
    return true; 
} 

 

bool checkInSet(set<ll>& s, ll item){
    auto it = s.find(item);
    if(it==s.end())
        return false;
    return true;
}

 

ll fastPower(ll x, ll y)
{
    ll temp;
    if( y == 0)
        return 1;
    temp = fastPower(x, y / 2);
    if (y % 2 == 0)
        return temp * temp;
    else
        return x * temp * temp;
}

 


ll inverseModPower(ll x, ll y, ll p)
{
    ll res = 1; 
 
    x = x % p; 
 
    while (y > 0) 
    {
     
        if (y & 1)
            res = (res * x) % p;
 
        y = y >> 1; 
        x = (x * x) % p;
    }
    return res;
}
 
ll modInverse(ll n, ll p){
    return inverseModPower(n, p - 2, p);
}
 

 

ll nCr(ll n, ll r, ll p)
{

 

    if (n < r)
        return 0;

 

    if (r == 0)
        return 1;
 
    ll fac[n + 1];
    fac[0] = 1;
    for (ll i = 1; i <= n; i++)
        fac[i] = (fac[i - 1] * i) % p;
 
    return (fac[n] * modInverse(fac[r], p) % p * modInverse(fac[n - r], p) % p)
           % p;
}

 

// Here you go

 

void addEdge(ll a, ll b, ll w){
    g[a].push_back(make_pair(b, w));
    g[b].push_back(make_pair(a, w));
}

 

struct mh{
    bool operator()(const pair<ll, ll> a, const pair<ll, ll> b){
        return a.second>b.second;
    }
};

 


ll mst(){
    priority_queue<pair<ll, ll>, vector<pair<ll, ll>>, mh> pq;
    vector<ll> vis(an, 0);
    // starting with 0
    ll index = 0;
    vis[index]=1;
    ll vc=1;
    ll ans = 0, loop=0;
    while(loop<an-1){
        // add all elements of index
        for(auto i: g[index]){
            if(vis[i.first]==0)
                pq.push(i);
        }
        pair<ll, ll> temp;
        // cout<<index<<" ";
        
        while(vis[pq.top().first]==1){
            // cout<<"popped"<<endl;
            pq.pop();
        }
        temp = pq.top();

        index = temp.first;
        ans += temp.second;
        pq.pop();
        // cout<<index<<" "<<temp.second<<endl;
        vis[index] = 1;
        loop++;
    }
    return ans;

 

}

 

void solve(){
    ll n;
    cin>>n;
    for(ll i=0;i<n;i++){
        ll a, b, w;
        cin>>a>>b>>w;
        a--;
        b--;
        addEdge(a, b, w);
    }
    cout<<mst()<<endl;
    // for(ll i=0;i<n;i++){
    //     for(auto j: g[i]){
    //         cout<<j.first<<" "<<j.second<<endl;
    //     }
    // }

 


}

 

int main(){
    #ifndef ONLINE_JUDGE
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    #endif
    ll t=1;
    // cin>>t;
    while(t--)
        solve();
}

/*
INPUT:
14
1 2 4
2 8 11
2 3 8
8 9 7
8 7 1
3 9 2
1 8 8
3 6 4
3 4 7
7 9 6
7 6 2
4 6 14
4 5 9
5 6 10

OUTPUT:
37
*/
