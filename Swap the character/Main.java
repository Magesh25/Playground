#include<stdio.h>
int main()
{
char str[100],str1[100],str2[100];
	int i;
	scanf("%s%s%s",str,str1,str2);
	for(i=0;str[i]!='\0';i++)
	{
	if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
	 {
	 str[i] = '$';
	 }
	 }
	for(i=0;str1[i]!='\0';i++)
	{
	if(!(str1[i]=='a'||str1[i]=='e'||str1[i]=='i'||str1[i]=='o'||str1[i]=='u'||str1[i]=='A'||str1[i]=='E'||str1[i]=='I'||str1[i]=='O'||str1[i]=='U'))
	 {
	 str1[i] = '#';
	 }
	 }
	 for(i=0;str2[i]!='\0';i++)
	 {
     if(str2[i]>='a'&&str2[i]<='z')
     {
     str2[i]=str2[i] - 32;
     }
	 }
	 int l;
	 for(l=0;str[l]!='\0';l++);
	 for(i=0;str1[i]!='\0';i++)
     {
         str[l++]=str1[i];
     }
      for(i=0;str2[i]!='\0';i++)
      {
          str[l++]=str2[i];
      }
     str[l]='\0';
     printf("%s",str);
	}