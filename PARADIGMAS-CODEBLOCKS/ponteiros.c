#include <stdio.h>

int main(){
int myNumbers[4];
//int myNumbers = {10,20,30,40};

int *ptr = myNumbers;

for(int i=0;i<4;i++){
    printf("end de myNumbers[%d] = %p\n",i,ptr+i);
}
for(int i=0;i<4;i++){
    scanf("%d",ptr+i);
}
for(int i=0;i<4;i++){
    printf("%d",*(ptr+i));
}
}
