import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FilesSimplified {
  public static void main(String [] args) throws IOException{
    Scanner fileIn = new Scanner(new File("example.txt"));
    
    while(fileIn.hasNext()){
      System.out.println(fileIn.nextLine());
    }
  }
}
