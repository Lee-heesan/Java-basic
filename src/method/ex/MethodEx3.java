package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance =10000;
        balance = deposit(balance,1000);
        balance = withdraw(balance,2000);
    }
    public static int deposit(int balance,int depositAmount){
        balance+=depositAmount;
        System.out.println(depositAmount+"원을 입금하였습니다. 현재 잔액은"+balance+"입니다.");
        return balance;
    }
    public static int withdraw(int balance, int withdrawAmount){
        if(balance>=withdrawAmount){
            balance-=withdrawAmount;
            System.out.println(withdrawAmount+"원을 출금하였습니다. 현재 잔액은 "+balance+"입니다.");
        }else {
            System.out.println(withdrawAmount+"원을 출금하려고 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
