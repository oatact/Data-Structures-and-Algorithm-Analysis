public class AlphabetinArray {
	
	
	public static void display(char[] alphabet)             // displays array contents
    {
    for(int j=0; j<alphabet.length; j++)       // for each element,
       System.out.print(alphabet[j] + " ");  // display it
    System.out.println("");
    }
	 public static void bubbleSort(char arr[]) 
	    { 
	        int n = arr.length; 
	        int step = 1;
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (arr[j] > arr[j+1]) 
	                {  // swap arr[j] and arr[j+1] 
	                	System.out.println("step " + step + ". swap " + arr[j] + " and " + arr[j+1]);
	                    char temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                    step++;
	                } 
	    }
	 public static void findmissing(char[] arr1)
	 { 
		 char Truealphabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		 int a = Truealphabet.length; 
		 int b = arr1.length;
		 char[] missing_alpha = new char[50];
		 int count = 0;
		 for (int i = 0; i < a; i++) {
		   int check = 0;
		   	for (int j = 0; j < b; j++) {
		   		if (Truealphabet[i]==arr1[j])
		   			check = 1;
		   		}
		   	if (check == 0) {
		   		missing_alpha[count++] = Truealphabet[i];
		   	}
		  	}
		  	for(int k = 0 ; k<a; k++)
		  {
			  System.out.print(missing_alpha[k]+" ");
		  }
	 }
	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alphabet[] = {'Y','W','N','A','C','B','D','T','Z','U','D','F','G','P','Q','H','R','J','K','N','O','V','W','X'};
		System.out.printf("This is unsorted array :");
		display(alphabet);
		System.out.println("Sorting result step-step:");
		bubbleSort(alphabet);
		System.out.print("This is sorted array :");
		display(alphabet);
		System.out.printf("This is a missing alphabet: ");
		findmissing(alphabet);
		
		
	}
}
 


	
