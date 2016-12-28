#include<stdio.h>

char w_rev(char gi[])
{
    int i,j,st=strlen(gi),e=strlen(gi);
    for(i=strlen(gi)-1;i>=0;i--)
    {   st--;
        if(gi[i]==' ')
        {
            for(j=st;j<e;j++)
                printf("%c",gi[j]);
            e=st;
        }
        if(i==0)
        {
            printf(" ");
            for(j=st;j<e;j++)
                printf("%c",gi[j]);
            break;
        }
    }
}
void main()
{
    char g[20];
    int s;
    gets(g);
    w_rev(g);
}

