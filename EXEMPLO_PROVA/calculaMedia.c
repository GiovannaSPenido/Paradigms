#include <stdio.h>
#include <stdlib.h>

void calculaMedia(){
    float x,y;
    printf("Entre com o primeiro número: ");
    scanf("%f",&x);
    printf("Entre com o segundo número: ");
    scanf("%f",&y);
    float media = (x + y)/2;
    printf("(%.2f + %.2f) / 2 = %.2f\n",x,y,media);
    return 0;
}
