#include<iostream>
#include<vector>
using namespace std;

void dfsTraversal(vector<vector<int> > &adjList,int source,int N,vector<bool> &visited)
{
    visited[source]=true;
    cout<<"Visited : "<<source<<endl;
    int totalNeighbour=adjList[source].size();
    for(int i=0;i<totalNeighbour;i++)
    {
        int neighbourNode=adjList[source][i];
        if(visited[neighbourNode]==false)
        {
            dfsTraversal(adjList,neighbourNode,N,visited);
        }
    }
}

int main()
{
    int N=6;
    vector<vector<int> > adjList(N);
    vector<bool> visited(N,false);
    adjList[0].push_back(1);
    adjList[0].push_back(2);
    adjList[1].push_back(3);
    adjList[2].push_back(3);
    adjList[3].push_back(4);
    adjList[3].push_back(5);
    dfsTraversal(adjList,0,N,visited);
    /*
    int arr[]={1,2,3,4,5,6};
    for(auto var:arr)
    {
        cout<<var<<endl;
    }
    */
    return 0;
}
