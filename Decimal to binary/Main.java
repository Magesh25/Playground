#include<stdio.h>
int bin(int num,int a[],int len)
{
  if(num>0)
  {
    a[len]=num%2;
    return bin(num/2,a,len+1);
  }
  return len;
}
  int prt(int a[],int len)
  {
    if(len>=0)
    {
      printf("%d",a[len]);
      return prt(a,len-1);
    }
  }
int main()
{
  int num,l;
  int a[100];
  scanf("%d",&num);
  if(num==0)
    printf("0");
  else
  {
    l=bin(num,a,0);
    prt(a,l-1);
  }
  return 0;
}