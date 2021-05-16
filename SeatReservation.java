
class SeatReservation
{
    public static void main(String[] args)
    {
        Reservation reserve = new Reservation(); // LINE A
        Person thread1 = new Person(reserve, 5); // LINE B
        thread1.start();
        Person thread2 = new Person(reserve, 4);
        thread2.start();
        Person thread3 = new Person(reserve, 2);
        thread3.start();
    }
}