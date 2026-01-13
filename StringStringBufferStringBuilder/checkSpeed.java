import java.util.*;
public class checkSpeed{
    public static void main(String[] args) throws InterruptedException{
        long startTime, endTime;

        //using string
        startTime = System.currentTimeMillis();
        String str = "Java";
        for(int i=0;i<100000;i++){
            str += " program";
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + " ms.");

        //using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Java");
        for(int i=0;i<100000;i++){
            sb.append(" program");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms.");

        //using stringbuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Java");
        for(int i=0;i<100000;i++){
            sbf.append(" program");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms.");
    }
}