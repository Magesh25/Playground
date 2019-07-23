#include<stdio.h>
#include<math.h>
int main()
{
 float a,b,c,r1,r2,real,img,de;
  scanf("%f%f%f",&a,&b,&c);
  de = ((b*b) - (4*a*c));
  if(de>0)
  {
    r1 = (-b + sqrt(de))/(2*a);
    r2 = (-b - sqrt(de))/(2*a);
    printf("root1 = %0.2f  root2 = %0.2f",r1,r2);
  }
  else if(de == 0)
  {
    r1=r2=(-b/(2*a));
    printf("root1 = %0.2f  root2 = %0.2f",r1,r2);
  }
  else
  {
    real = (-b/(2*a));
    img = sqrt(-de)/(2*a);
    printf("root1 = %0.2f + %0.2fi  root2 = %0.2f - %0.2fi",real,img,real,img);
}
}