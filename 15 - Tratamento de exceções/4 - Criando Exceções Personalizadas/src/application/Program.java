package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import model.entities.*;

public class Program {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in (dd/MM/yyyy)");
        Date checkin = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy)");
        Date checkout = sdf.parse(sc.next());

        if (!checkout.after(checkin)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date.");
        }
        else {
            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation: " + reservation);
            
            System.out.println();
            System.out.println();
            System.out.println("Enter date to update the reservation: ");

            System.out.println("Check-in (dd/MM/yyyy)");
            checkin = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy)");
            checkout = sdf.parse(sc.next());

            String error = reservation.updateDates(checkin, checkout);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            }
            else {
                System.out.println("Reservation: " + reservation);
            }

            reservation.updateDates(checkin, checkout);
        }
    }
}