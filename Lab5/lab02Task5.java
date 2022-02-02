package Lab5;

import java.io.IOException;
//Name: Wasin Heesawat
//ID: 6288077
//Section: 3
public class lab02Task5 {
    public static void main(String[] args) throws IOException
    {
        String math = "23+75**";
        int output = 0;
        int i = 1;
        while(i==1)
        {
            if( math == "" )      
                break;
            ParsePost parsepost = new ParsePost(math);
            output = parsepost.doParse(); 
            System.out.println("Output is " + output);
            i++;
        }
    }  

}