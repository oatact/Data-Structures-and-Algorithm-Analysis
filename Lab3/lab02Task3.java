package Lab3;
//Name: Wasin Heesawat
//ID: 6288077
//Section: 3
import java.io.IOException;

public class lab02Task3 {
    public static void main(String[] args) throws IOException
    {
        BracketChecker check = new BracketChecker("f(x) = 2x(8 + xsin(2x - 6))");
        check.check();
    }
}