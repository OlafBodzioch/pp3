public class CinemaTicket {
    
    static String cinemaName = "Kino";
    String filmTitle;
    int row;
    int seat;
    int price;


    String display()
    {
        String result = "Cinema: " + cinemaName +"\nTitle: "+ filmTitle +"\nRow: "+ Integer.toString(row) +"\nSeat: "+ Integer.toString(seat) +"\nPrice: "+ Integer.toString(price) +"PLN\n";
        return result;
    }


    public static void main(String[] args)
    {

        CinemaTicket x1 = new CinemaTicket();
        x1.filmTitle="Movie 2";
        x1.row=1;
        x1.seat=4;
        x1.price=77;

        System.out.println(display());

    }

}
