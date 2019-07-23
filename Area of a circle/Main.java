#include<stdio.h>
#include<math.h>
int main()
{
  int a;
  float area,r;
  scanf("%d",&a);
  r=(float)a/2;
  area=3.14*r*r;
  printf("%.2f",area);
  return 0;
}