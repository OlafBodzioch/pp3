public class zad9 {
    
    private static double balance=0;

    zad9()
    {
        this.balance = 0;
    }

    public void depositBalance(double n){

        balance = balance + n;
        
    }

    public String withdrawBalance(double n)
    {
        if(balance>=n)
        {
            balance = balance - n;
            return "Kwota została wypłacona";
        }
        else 
        if(n>500)
            return "Przekroczono limit wypłaty dziennej.";
        else
            return "Brak dostatecznych środków na koncie.";
    }   


    public double getBalance() {
        return (double)balance;
    }


    public void setBalance(int balance) {
        zad9.balance = balance;
    }

    public static void main(String[] args) {

        zad9 x1 = new zad9();
    
        x1.depositBalance(500);

        System.out.println(x1.getBalance());

        x1.depositBalance(200);

        System.out.println(x1.getBalance());

        x1.withdrawBalance(300);

        System.out.println(x1.getBalance());

    }
}



