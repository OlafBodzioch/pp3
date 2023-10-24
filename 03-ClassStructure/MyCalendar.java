public class MyCalendar {

    static int year = 2023;
    static int month = 4;
    static int day = 9;

    static String myDate()
    {
        String monthS;
        if(month<10){
            monthS = "0"+Integer.toString(month);
        }
        else{monthS = Integer.toString(month);}

        String dayS;
        if(day<10){
            dayS = "0"+Integer.toString(day);
        }
        else{dayS = Integer.toString(day);}
        
        String data = Integer.toString(year) +"-"+ monthS +"-"+ dayS;
        return data;
    }

    static int days()
    {
        int numOfDays = 0;
        int d=0;

        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
  
        for(int i=0; i<month-1; i++)
        {
            d = d + monthDays[i];            
        }

        numOfDays = numOfDays + day;
        numOfDays = numOfDays + d;

        return numOfDays;
    }

    static String monthName()
    {

        String[] monthDays = {"Styczen","Luty","Marzec","Kwiecien","Maj","Czerwiec","Lipiec","Sierpien","Wrzesien","Pazdziernik","Listopad","Grudzien"};

        return monthDays[month-1];

    }


    public static void main(String[] args)
    {

        System.out.println(myDate());      
        System.out.println(days()); 
        System.out.println(monthName());   

    }

}
