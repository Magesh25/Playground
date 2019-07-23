#include <stdio.h>
int main() {
	char c,z;
  scanf("%c",&c);
  if(c>='a'&&c<='z')
  {
    z=c-32;
    printf("%c",z);
  }
  if(c>='A'&&c<='Z')
  {
    z=c+32;
    printf("%c",z);
  }
  
    
	return 0;
}