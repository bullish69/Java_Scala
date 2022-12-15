import java.util.Scanner;

class Reservation {
    static int availSeats;

    void setAvlSeats() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no.of seats :");
        availSeats = sc.nextInt();
    }

    synchronized void reserveSeat(int reqSeats) {
        System.out.println("Thread Entered : ");
        System.out.println("AvailabeSeats :" + availSeats + "RequestedSeat :" + reqSeats);
        if (availSeats >= reqSeats) {
            System.out.println("Seat Available. Booked Successfully");
            availSeats = reqSeats;
        } else {
            System.out.println("Not Seats");
        }
        System.out.println("Thread Complete");
        System.out.println("");
    }
}

class Person extends Thread {
    Reservation reserve;
    int reqSeats;

    public Person(Reservation reserve, int reqSeats) {
        this.reserve = reserve;
        this.reqSeats = reqSeats;
    }

    synchronized public void run() {
        reserve.reserveSeat(reqSeats);
    }
}

public class TicketThread {
    public static void main(String args[]) {
        Reservation reserve = new Reservation();
        reserve.setAvlSeats();
        Person thread1 = new Person(reserve, 5);
        thread1.start();
        Person thread2 = new Person(reserve, 6);
        thread2.start();
    }
}