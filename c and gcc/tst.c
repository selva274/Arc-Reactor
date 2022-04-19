#include <stdio.h>
int main()
{
   int a,b,c;
   printf("\n enter two numbers");
   scanf("%d%d",&a,&b);
   printf("\n enter the oeration to be done");
   printf("1-addition,2-subtraction,3-product,4-division");
   scanf("%d",&c);
   if (c==1)
   {
      printf("\n the sum of two nos is : %d",a+b);
   }
   if (c==2)
   {
      printf("\n the difference is : %d",a-b);
   }
   if (c==3)
   {
      printf("\n the product is : %d",a*b);
   }
   if (c==4)
   {
      printf("\n the rem is : %d",a/b);
   }
   else
   {
      printf("\n incorrect option");
   }

}
