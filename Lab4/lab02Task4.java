package Lab4;

import java.io.IOException;
//Name: Wasin Heesawat
//ID: 6288077
//Section: 3
public class lab02Task4 {
    public static void main(String[] args) throws IOException
    {
        InToPost num = new InToPost("2 + ((2 + 3) * (7 - 1)))");
        String output = num.doTrans();
        System.out.println(output);
    }
}