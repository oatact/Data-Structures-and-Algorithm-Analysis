%include "asm_io.inc"
segment _DATA public align=4 class=DATA use32
Input db "Please input 3 numbers to find min ", 10,0
Firstnum db "Please input the first number: ", 0
Secondnum db "Please input the second number: ", 0
Thirdnum db "Please input the third number: ", 0
Output db "The minimum of 3 number is: ", 0


segment _BSS public align=4 class=BSS use32
num1   resd 1    ;input number1
num2   resd 1    ;input number2
num3   resd 1    ;input number3
min    resd 1    ;find min of 3 number

group DGROUP _BSS _DATA

segment _TEXT public align=1 class=CODE use32
        global  _asm_main
_asm_main:
	enter 0,0		 ; setup routine
	pusha
 
	mov eax, Input      
	call print_string	; print Input

	
	mov eax, Firstnum      
	call print_string	; print Firstnum

	call read_int		;scanf("%d" , &num1)
	mov [num1],eax
	

	mov eax, Secondnum       
	call print_string	; print Secondnum

	call read_int		;scanf("%d" , &num2)
	mov [num2],eax
	
	mov eax, Thirdnum       
	call print_string	; print Thirdnum

	call read_int		;scanf("%d" , &num3)
	mov [num3],eax



	mov ebx,[num1]            ;mov num1 to ebx 
	cmp ebx,[num2]	           ; compair ebx and num2
	
	jl Check_third_num         ; if(num1<num2 go to check third num) 
	mov ebx,[num2]		   ;mov num2 to ebx
	

Check_third_num: 
	cmp ebx,[num3]		 ; compair ebx and num 3
	jl Show_output           ; if(num1 or num2 < num3) go to show output
	mov ebx,[num3] 		 ;mov num3 to ebx

Show_output:
	mov [min] , ebx		; mov ebx to min

	mov eax, Output
	call print_string	;print output
	
	mov eax,[min]
	call print_int		; print min
	
	ret


	


	
	

	

