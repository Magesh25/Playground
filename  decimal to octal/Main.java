#include<stdio.h>
int main()
{
 int n,arr[200],i=0;
  scanf("%d",&n);
  while(n!=0)
  {
    arr[i++]=n%8;
    n=n/8;
  }
  for(i=i-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  return 0;
}