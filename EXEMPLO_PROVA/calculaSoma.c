#include <stdio.h>
#include <stdlib.h>

void calculaSoma(){
    int a, b;
    printf("Entre com o primeiro n�mero: ");
    scanf("%d",&a);
    printf("Entre com o segundo n�mero: ");
    scanf("%d",&b);
    int soma = a + b;
    printf("%d + %d = %d\n",a,b,soma);
    return 0;
}
