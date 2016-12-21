#include<stdio.h>
#include<string.h>
void main()
{
	char g[10];
	int i;
	scanf("%s",g);
	i=strlen(g)-1;
	while(i>=0)
	{
		printf("%c",g[i]);
		i--;
	}
}
