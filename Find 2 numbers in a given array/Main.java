#include<stdio.h>
int main()
{
	int x,n,y,index1=-1,index=-1;
    int arr[50],i;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
    scanf("%d%d",&x,&y);
  for(i=0;i<n;i++)
  {
    if (x==arr[i] && index ==-1)
    {
      index=i;
    }
     if (y==arr[i] && index1==-1)
     {
       index1=i;
     }
  }
       printf("Element 1 index = %d\n", index);
       printf("Element 2 index = %d\n", index1);
    return 0;
}