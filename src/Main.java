import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;

public class Main {
    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        int[] ar = {1, 2};

        //#1 method
        try{
            System.out.println(ar[2]); //creating the error
        } catch (Exception e){
            appendToFile(e);
        }


        //#2 method
        Main obj = new Main();
        try{
            obj.divide(); //creating the error
        } catch (ArithmeticException ex){
            logger.error(ex);
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

    private void divide(){

        int i = 10 / 0;

    }
}