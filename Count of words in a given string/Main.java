#include<stdio.h>
int main()
{
	char str[50],i,count=1;
	//scanf("%s",str);
	scanf("%[^\n]s", str);//(space)
	//gets(str);puts(str);//(string copy)
	for(i = 0;str[i] != '\0';i++)
  {
  if(str[i] ==' ')
  {
    count=count+1;
  }
    }
	printf("%d",count);
}