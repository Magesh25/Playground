#include<stdio.h>
int main()
{
	char a[50];
	scanf("%s",a);
	int l,i,count=1;
	for(l=0;a[l]!=0;l++);
	if(l>20)
	{
	printf("Invalid Input");
	}
	else
	{
	for(i=0;i<l;i++)
	{
	if(a[i]==a[i+1])
	{
	count++;
	}
	else
	{
	printf("%c%d",a[i],count);
	count=1;
	}
	}

}
}
