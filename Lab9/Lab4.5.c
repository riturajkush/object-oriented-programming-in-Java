#include<stdio.h>
#include<stdbool.h>
#include<limits.h>
#include <stdlib.h>
#include <algorithm>

int main(){
	int N;
	scanf("%d",&N);
	long long int weight[N][N];

	long long int D[N];

	bool S[N]={false};
	bool NS[N]={true};

	int CS;

	int i,j;

	printf("Enter weigth adjacency matrix: \n");
	for (i = 0; i < N; ++i)
		for (j = 0; j < N; ++j){
			int in;
			scanf("%d",&in);
			if(in==0)
				weight[i][j]=INT_MAX;
		}

	int source;
	printf("Enter Souce vertex: ");
	scanf("%d",&source);

	S[source] = true;
	NS[source] = false;
	CS = source;

	for(i=0;i<N;i++){
		D[i]=weight[CS][i];
	}

	for(i = 0;i<N-1;i++){
		int min_j = INT_MAX;
		int mins = INT_MAX;
		for(j=0;j<N;j++){
			if(mins>weight[CS][j] && NS[j]==true){
				min_j = j;
				mins = weight[CS][j];
			}
		}

		CS = min_j;
		S[CS] = true;
		NS[CS] = false;

		for(int j = 0 ; j<N; j++){
			if(NS[j]==true){
				D[i] = std::min(D[i],D[CS] + weight[CS][i]);
			}
		}
		
	}

	for(i=0;i<N;i++){
		printf("%lld ", D[i] );
	}
	printf("\n");




}