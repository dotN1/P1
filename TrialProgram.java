package TrialProgram;


public class TrialProgram {
    public static void main(String[] args) {
         
        double meter;
        int answer; 
        
        ReaderMeter input1 = new ReaderMeter();
        ReaderAnswer input2 = new ReaderAnswer();
        
        System.out.println("Введите кол-во метров");
        input1.scan1();
        meter = input1.x;
     
        System.out.println("В какие единицы измерения хотите перевести? "
                            + "1 - дюймы , 2 - футы , 3 - ярды");
        input2.scan2();
        answer = input2.y;
        
        switch (answer) {
            case 1:
                System.out.print(meter + " метров равны = ");
                System.out.printf("%.2f" , meter*39.37);
                System.out.println(" дюймов.");
                break;
            case 2:
                System.out.print(meter + " метров равны = ");
                System.out.printf("%.2f" , meter*3.28);
                System.out.println(" футов.");
                break;
            case 3:
                System.out.print(meter + " метров равны = ");
                System.out.printf("%.2f" , meter*1.09);
                System.out.println(" ярдов.");
                break;
            default:
                System.out.println("Вы ввели неверное значение");
                break;
        }
    }
}



