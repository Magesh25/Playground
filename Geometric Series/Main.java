/* C Program to find Sum of Geometric Progression Series */
#include <stdio.h>
#include<math.h>
int main() {
    
    int a, n, r,t,t1,nt;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=1;r=2;
    t=(n+1)/2;
    nt = a * pow(r,t-1);
    printf("%d",nt);
  }
  else
  {
     a=1;r=3;
    t1=n/2;
    nt = a * pow(r,t1-1);
    printf("%d",nt);
  }
    return 0;
}