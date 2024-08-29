#include<stdio.h>
#include<math.h>
double fact(double x, double y);
int main()
{
   double i, j, k,temp,sum;
   double BR=0, SV=0, GD=0, PL=0, DI=0;
   double W, D, L;
   scanf("%lf %lf %lf", &W, &L, &D);
   DI = pow(W, 20);
   for (i = 0; i <= 20; i++){
      for (j = 0; j <= 20-i; j++) {
         temp = 2000 + i * 50 + j * 0 - (20 - i - j) * 50;
         if ((temp >= 1000) && (temp <= 1499)) {
            sum = pow(W, i) * pow(D, j) * pow(L, 20 - i - j);
            sum = sum*fact(i, j);
            BR += sum;
         }
         if ((temp >= 1500) && (temp <= 1999)) {
            sum = pow(W, i) * pow(D, j) * pow(L, 20 - i - j);
            sum = sum*fact(i, j);
            SV += sum;
         }
         if ((temp >= 2000) && (temp <= 2499)) {
            sum = pow(W, i) * pow(D, j) * pow(L, 20 - i - j);
            sum = sum*fact(i, j);
            GD += sum;
         }
         if ((temp >= 2500) && (temp <= 2999)) {
            sum = pow(W, i) * pow(D, j) * pow(L, 20 - i - j);
            sum = sum*fact(i, j);
            PL += sum;
         }
      }
   }
   printf("%.8lf\n", BR);
   printf("%.8lf\n", SV);
   printf("%.8lf\n", GD);
   printf("%.8lf\n", PL);
   printf("%.8lf\n", DI);
   return 0;    
}
double fact(double x, double y)
{
   double i, p;
   p = 1;
   for (i = 1; i <= 20; i++) {
      p = p*i;
      if (i <= x)
         p = p/i;
      if (i <= y)
         p = p / i;
      if (i <= 20 - x - y)
         p = p / i;
   }
   return p;
}