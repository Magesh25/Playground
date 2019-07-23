#include<stdio.h>
int recSearch(int arr[], int l, int r, int x) 
{ 
     if (r < l) 
        return -1; 
     if (arr[l] == x) 
        return l; 
     if (arr[r] == x) 
        return r; 
     return recSearch(arr, l+1, r-1, x); 
} 
int main() 
{ 
	int x,n;
    int arr[50],i; 
    scanf("%d",&n);
    for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
    int m = sizeof(arr)/sizeof(arr[0]); 
    scanf("%d",&x);
    int index = recSearch(arr, 0, m-1, x); 
    if (index != -1) 
       printf("%d",index+1); 
    else
        printf("%d isn't present in the array.", x); 
    return 0; 
} 