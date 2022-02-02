package Lab1;
//Name:Wasin Heesawat
//ID: 6288077
//Section: 3
public class lab02task1 {
    public static void main(String[] args)
    {
        StackX stack = new StackX(50); 
        stack.push(5);               
        stack.push(15);
        stack.push(25);
        stack.push(30);

        while( !stack.isEmpty() )     
        {                             
            long data = stack.pop();
            System.out.print(data+" "); 
        } 
    }  
}