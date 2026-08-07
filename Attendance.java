import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] a = new int[7];
    int present = 0;

        System.out.println("Enter attendance (1 = Present, 0 = Absent):");

        for (int i = 0; i < 7; i++) {
        a[i] = sc.nextInt();

            if (a[i] == 1)
         present++;
        
        }

        double percent = present *100.0 / 7;

        System.out.println("Present Days = " + present);
        System.out.println("Attendance = " + percent + "%");

        if (percent >= 75)
            System.out.println("Eligible for Exam");
        else
            System.out.println("Not Eligible");

        sc.close();
    }
