#include<stdio.h>
#include<math.h>
int main()
{
  float b,h,a;
  scanf("%f%f",&b,&h);
  a=sqrt((b*b)+(h*h));
  printf("%.2f",a);
  return 0;
}