#include<stdio.h>
int main()
{
  int r,n,q,g;
  scanf("%d",&n);
  r=(n/100);
  q=n%10;
  g=r+q;
   printf("%d",g);
  return 0;
}