#include<stdio.h>
int main()
{
	char str[60],i;
	//scanf("%s",str);
	scanf("%[^\n]s",str);//(space)
	//gets(str);puts(str);//(string copy)
	for(i=0;str[i]!='\0';i++);	
	printf("%d",i);
}