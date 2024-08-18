package streams;

import java.time.*;
import java.util.Scanner;

public class JavaDataEx {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year : ");
        int y=scanner.nextInt();
        Year year=Year.of(y);
        if(year.isLeap()){
            System.out.println(" given year "+year+" is a leap year");
        }else{
            System.out.println(year+ " not a leap year ");
        }

//How to create custom date using LocalDateTime class.
//        LocalDateTime localdt=LocalDateTime.of(1995, Month.APRIL,28,15,12,15);
//        System.out.println(localdt);
//        System.out.println("after 3moonths "+localdt.plusMonths(3));
//        System.out.println("before  3 moonths "+localdt.minusMonths(3));

//How to get Age using Period class
//        LocalDate date1=LocalDate.of(2001,02,06);
//        LocalDate present=LocalDate.now();
//        Period period= Period.between(date1,present);
//        System.out.printf(" age of rahul is %d - %d - %d ",period.getYears(),period.getMonths(),period.getDays());

        //        LocalDateTime ldt=LocalDateTime.now();
//        System.out.println(ldt);

//        LocalDate date=LocalDate.now();
//        System.out.println(date);
//Demo of LocalDate class methods.
//        int dd=date.getDayOfMonth();
//        int mm=date.getMonthValue();
//        int yyyy= date.getYear();
//        System.out.printf("%d-%d-%d\n",dd,mm,yyyy);



        LocalTime time=LocalTime.now();
        System.out.println(time);
    }
}
