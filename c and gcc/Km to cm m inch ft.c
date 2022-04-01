#include<stdio.h>
int main()
{
               float km,cm,m,inch,ft;
               printf("Enter the Kilometer:");
               scanf("%f",&km);
               m=km*1000;
               cm=m*100;
               inch=cm/2.54;
               ft=inch/12;
               printf("Meter:%0.2f\n",m);
               printf("Centimeter:%0.2f\n",cm);
               printf("Inch:%0.2f\n",inch);
               printf("Feet:%0.2f\n",ft);
}
