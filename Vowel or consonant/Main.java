#include<stdio.h>
int main()
{
  char c;
  scanf("%c",&c);
  if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
    printf("Vowel");
  else
    printf("Consonant");
  return 0;
}