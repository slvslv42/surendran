#include <stdio.h>
int main()
{
    int n, i, flag = 0,p,q;

    scanf("%d%d",&p,&q);
    if(p<0||q<0)
        exit(0);
    for(n=p;n<=q;n++)
    {
        for(i=2; i<=n/2; ++i)
        {
        if(n%i==0)
        flag=1;
        }

        if(flag==0)
            printf("%d\t",n);
        else
            flag=0;
    }
        return 0;
}
