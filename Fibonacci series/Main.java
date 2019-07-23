#include<stdio.h>
int main()
{
  int n,f,f1=0,f2=1,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    if(i<=1)
    f=i;
    else
    {
    f=f1+f2;
      f1=f2;
      f2=f;
    }
    printf("%d ",f);
    
  }
  return 0;
}