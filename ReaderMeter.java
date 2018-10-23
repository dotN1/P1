package test;
import java.util.Scanner;

public class ReaderMeter {
    double incomingValue;
    public void scan(){
        Scanner scn = new Scanner(System.in);
        incomingValue = scn.nextDouble();
    }
}
