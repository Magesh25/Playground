#include <stdio.h>
#include<math.h>
int main()
{
  	int b,p,a;
  scanf("%d%d",&b,&p);
  a=(pow(b,p));
  if(p<0)
    printf("Wrong input");
  else
    printf("%d",a);
    return 0;
}