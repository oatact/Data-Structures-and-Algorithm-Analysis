package Lab7;
//Name: Wasin Heesawat
//ID: 6288077
//Section: 3
public class lab02Task7 {
    public static void main(String[] args)
    {
        PriorityQ pri = new PriorityQ(50);
        
        pri.insert(15);
        pri.insert(5);
        pri.insert(30);
        pri.insert(25);

        while (!pri.isEmpty()) {
            long queue = pri.remove();
            System.out.print(queue + " ");
        }
    }
}