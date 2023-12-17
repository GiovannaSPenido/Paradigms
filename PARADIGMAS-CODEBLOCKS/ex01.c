#include <stdio.h>
#include <stdlib.h>

int ex01()
{
    // sem parametro e com retorno
    printf("\nExercicio 01\n");
    int a,b,soma;
    printf("Entre com a:");
    scanf("%d",&a);
    printf("Entre com b:");
    scanf("%d",&b);
    soma = a + b;
    return soma;
}
