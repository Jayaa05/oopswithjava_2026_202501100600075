public class TicketCounter implements Runnable {

    int availableTickets = 3;

    @Override
    public void run() {
        while (availableTickets > 0) {
            bookTickets();
        }
    }

    synchronized void bookTickets() {
        if (availableTickets > 0) {
            availableTickets = availableTickets - 1;

            System.out.println("Ticket booked by "
                    + Thread.currentThread().getName());

            System.out.println("Left tickets are "
                    + availableTickets);
        } else {
            System.out.println("Tickets are sold out");
        }
    }

    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        Thread t1 = new Thread(counter, "Person 1");
        Thread t2 = new Thread(counter, "Person 2");
        Thread t3 = new Thread(counter, "Person 3");

        t1.start();
        t2.start();
        t3.start();
    }
}