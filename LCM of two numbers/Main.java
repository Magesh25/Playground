#include<stdio.h>
int main()
{
  int a,b,large,i;
  scanf("%d%d",&a,&b);
  if(a>b)
    large=a;
  else
    large=b;
  for(i=large;i<=a*b;i++)
  {
    if(i%a==0&&i%b==0)
    {
      printf("%d",i);
      break;
    }
  }
  return 0;
}