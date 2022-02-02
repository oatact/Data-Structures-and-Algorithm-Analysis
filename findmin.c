#include<stdio.h>

main()
{
	int num1 , num2 , num3;
	int min_num;
	printf("Please input 3 number to find minimum number\n");
	printf("Please input first number : ");
	scanf("%d",&num1);
	printf("Please input second number : ");
	scanf("%d",&num2);
	printf("Please input third number : ");
	scanf("%d",&num3);
	
 if(num1 < num2) 
 {
    if(num1 < num3){
        min_num = num1;
    }else{
        min_num = num3;
    }
}else{
    if (num2 < num3)
   {
		     
		min_num = num2;
    }else{
        min_num = num3;
    }
}
	
	printf("The minimum of 3 number is %d",min_num);
}
