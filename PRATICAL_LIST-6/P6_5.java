 import java.io.BufferedReader;
import java.io.FileReader;

public class P6_5{
    public static void main(String[] args) {

try
 {
 
 FileReader fileReader=new FileReader("myFile.txt");
 BufferedReader b=new BufferedReader(fileReader);
 String line;
 while((line=b.readLine())!=null)
 {
 System.out.println(line);
}
 }
 catch(Exception e)
 {
 e.printStackTrace();
}
}
}