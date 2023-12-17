#include <stdio.h>
#include <stdlib.h>
#include "header.h"

int main()
{
    int soma;
    int a,b,op;
    printf("Entre com o numero do exercicio: ");
    scanf("%d", &op);

    switch(op){
    case 1:
        soma = ex01();
        printf("Resp. Ex1: %d\n",soma);
        break;
    case 2:
        printf("Entre com a:");
        scanf("%d",&a);
        printf("Entre com b:");
        scanf("%d",&b);
        soma = ex02(a,b);
        printf("Resp. Ex2: %d\n",soma);
        break;
    case 3:
        ex03();
        break;
    case 4:
        printf("Entre com a:");
        scanf("%d",&a);
        printf("Entre com b:");
        scanf("%d",&b);
        ex04(a,b);
        break;
    }

    return 0;
}
