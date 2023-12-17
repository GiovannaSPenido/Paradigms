#include <stdio.h>
#include <stdlib.h>
#include "header.h";

int main()
{
    int op;
    printf("Escolha a opção desejada:\n|1- Calcular uma soma\n|2-Calcular uma média artimética\nResposta -> ");
    scanf("%d",&op);
    switch(op){
    case 1 : calculaSoma();break;
    case 2 : calculaMedia();break;
    }
    return 0;
}


