#include <stdlib.h>
#include <stdio.h>

static void change(int x , int y){
  x =1 ;
  y =1;
}
void changearray(int * array, int length){
  int i =0;
  for (i = 0 ; i <length ; i++){
    array[i] = 1;
  }
}

int main()
{
  int x= 35 ;
  int y = 66;
  int i =0;
  int array[5] = { 1, 2,3 ,4,5};
  printf(" x is %d and y is %d \n", x,y );
  change(x, y);
  printf(" x is %d and y is %d \n", x,y );
  printf("------------------------------ \n");
  changearray(array, 5);
  for (i = 0; i<5;i ++){
    printf( " arr[%d] is %d \n", i, array[i] );
  }
}
