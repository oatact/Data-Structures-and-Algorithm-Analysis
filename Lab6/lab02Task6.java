package Lab6;
//Name: Wasin Heesawat
//ID: 6288077
//Section: 3
public class lab02Task6 {
    public static void main(String[] args)
    {
        Queue queue = new Queue(50);  

        
        queue.insert(5);           
        queue.insert(15);
        queue.insert(25);
        queue.insert(30);

        
        
        while( !queue.isEmpty() )   
        {                         
            long number = queue.remove(); 
            System.out.print(number+" ");
        }
    }  // end main()
}