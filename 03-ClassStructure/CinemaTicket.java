public class CinemaTicket {
    
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int row;
    int seat;
    int price;

    public CinemaTicket(String filmTitle, int row, int seat)
    {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        if(row<=2)
            price = 10;
        else
            price = 25;     
    }


    String display()
    {
        String result = "Cinema: " + cinemaName +"\nTitle: "+ filmTitle +"\nRow: "+ Integer.toString(row) +"\nSeat: "+ Integer.toString(seat) +"\nPrice: "+ Integer.toString(price) +"PLN\n";
        return result;
    }


    public static void main(String[] args)
    {

        CinemaTicket x1 = new CinemaTicket("Gladiator",2,3);
        CinemaTicket x2 = new CinemaTicket("Gladiator",7,1);

        System.out.println(x1.display());
        System.out.println(x2.display());

    }

}
