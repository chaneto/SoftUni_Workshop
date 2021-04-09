package Vlojeni_Uslovni_Construkci;

import java.util.Scanner;

public class CLASS7_On_Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minuteArrive = Integer.parseInt(scanner.nextLine());

        int exam = hourExam * 60 + minutesExam;
        int arrive = hourArrive * 60 + minuteArrive;

        int diff = Math.abs(exam - arrive);

        if (exam < arrive) {
            System.out.println("Late");
            diff = arrive - exam;
            if (diff >= 60) {
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if (exam - 30 > arrive ){
            System.out.println("Early");
            diff = Math.abs(arrive - exam);
            if (diff >= 60) {
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("On time");
            if (exam != arrive) {
                diff = exam - arrive;
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}