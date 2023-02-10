import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        try{
            int[] ar = {1, 2};
            System.out.println(ar[2]); //creating the error
        } catch (Exception e){
            appendToFile(e);
        }

    }

    public static void appendToFile(Exception e){
        try{
            FileWriter newFile = new FileWriter("Error-log.txt", true);
            BufferedWriter buffFile = new BufferedWriter(newFile);
            PrintWriter printFile = new PrintWriter(buffFile, true);
            e.printStackTrace(printFile);
        } catch (Exception ex){
            System.out.println("error");
        }
    }
}