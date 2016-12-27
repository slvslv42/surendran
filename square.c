#include<stdio.h>
void main()
{
    int xy[8],i,j,c=0;
    for(i=0;i<8;i++)
    {
        scanf("%d",&xy[i]);
    }
    for(i=0;i<8;i++)
    {
        for(j=0;j<8;j++)
        {
            if(xy[i]==xy[j])
                c++;
        }
        if(c!=4)
        {
            puts("not a square");
            exit(0);
        }
        c=0;
    }
    puts("square");
}
