package test;


public class TrialProgram {
    public static void main(String[] args) {
    
        double meter;
        int answer;
        
        ReaderMeter meterValue = new ReaderMeter();
        ReaderAnswer answerValue = new ReaderAnswer();
        
        while(true){
            System.out.println("Enter the number of meters ");
            meterValue.scan();
            meter = meterValue.incomingValue;
            System.out.println();
        
            System.out.println("In which units you want to convert? "
                    + "1 - inches, 2 - feet, 3 - yards ");
            answerValue.scan();
            answer = answerValue.answerNumber;
            
            switch (answer) { 
                case 1:
                    System.out.print(meter + " meters are equal = ");
                    System.out.printf("%.2f", meter*39.37);
                    System.out.println(" inches");
                    break;
                case 2:
                    System.out.print(meter + " meters are equal = ");
                    System.out.printf("%.2f", meter*3.28);
                    System.out.println(" feet");
                    break;
                case 3:
                    System.out.print(meter + " meters are equal = ");
                    System.out.printf("%.2f", meter*1.09);
                    System.out.println(" yards");
                    break;
                default:
                    System.out.println("You entered an invalid value");
                    break;
            
            
        }
           
            
            while(true){
                System.out.println("Do you want to continue?" 
                        + " 1 - yes , 2 - no "); 
                answerValue.scan();
                
                if (answerValue.answerNumber == 1){
                    break;
                }
                else if (answerValue.answerNumber == 2){
                    System.exit(0);
                 }
                else {
                    System.out.println("You entered an invalid value");
                }
                    
            }
        }
    }
}
    