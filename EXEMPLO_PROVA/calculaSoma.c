#include <stdio.h>
#include <stdlib.h>

void calculaSoma(){
    int a, b;
    printf("Entre com o primeiro número: ");
    scanf("%d",&a);
    printf("Entre com o segundo número: ");
    scanf("%d",&b);
    int soma = a + b;
    printf("%d + %d = %d\n",a,b,soma);
    return 0;
}
