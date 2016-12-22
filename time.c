#include<stdio.h>
void main()
{
    int hr1,min1,hr2,min2,min=0;
    scanf("%d%d",&hr1,&min1);
    scanf("%d%d",&hr2,&min2);
    if(min1==min2)
        min=(hr2-hr1)*60;
    else if(min1<min2)
            {
                min=(hr2-hr1)*60;
                min+=min2-min1;
            }
          else if(min1>min2)
            {
                min=((hr2-hr1)*60)-60;
                min+=(60-min1)+min2;
            }
    printf("%d min",min);
}
