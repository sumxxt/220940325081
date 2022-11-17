import java.sql.SQLOutput;
import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BankAccount i;
        System.out.println("Enter the account number : ");
        int a=sc.nextInt();

        System.out.println("Enter the balance : ");
        int b=sc.nextInt();
        i=new BankAccount(a,b);
        lp :while(true){
            System.out.println("\n1.Withdraw \n2.Deposit \n3.Show Account Details\n0.EXIT");
            int s= sc.nextInt();
            switch(s){
                case 0:
                    break lp;
                case 1:
                    System.out.println("Enter the amount to withdraw");
                    int g= sc.nextInt();
                    i.withdraw(g);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit");
                    int k=sc.nextInt();
                    i.deposit(k);
                    break ;
                case 3:
                    System.out.println("Loading the balance ");
                    i.show();
            }
        }
    }
}
class BankAccount{
    int accno;
    double balance;
    int amount;
    BankAccount(int a,double b){
        this.accno=a;
        this.balance=b;
    }
    void withdraw(int w){
        this.amount=w;
        try {
            if (balance < amount) {
                throw new ArithmeticException("Enter a valid amount to withdraw");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Enter A valid amount");
        }
        if (balance>amount)
        {balance=balance-amount;
            System.out.println("The Balance is :"+balance);
        }
    }
    void deposit(int d){
        this.amount=d;
        balance=balance+amount;
        System.out.println("The balance after deposit is :"+balance);
    }
    void show(){
        System.out.println("The account number is "+accno+" & the current balance is "+balance);
    }
    }

