#include<stdio.h>
int main()
{
	long int n,fact=1;
  scanf("%ld",&n);
    for(int i=1;i<=n;i++)
    {
      fact=fact*i;
    }
  printf("%ld",fact);
}