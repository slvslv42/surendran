#include<stdio.h>
#include<string.h>
void main()
{
    char g[10],t[10];
    int i=0,j;
    scanf("%s",g);
   j=strlen(g);
    for(i=0;i<j-1;i=i+2)
        t[i+1]=g[i];
    for(i=1;i<j;i=i+2)
        t[i-1]=g[i];
    if(j%2!=0)
        t[j-1]=g[j-1];
    printf("%s",t);
}
