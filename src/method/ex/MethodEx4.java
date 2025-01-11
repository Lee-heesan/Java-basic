package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.println("선택 : ");
            int num = sc.nextInt();
            int amount;
            if(num==1){
                System.out.println("입금 액을 입력하시오 : ");
                amount= sc.nextInt();
                balance=deposit(balance,amount);
            }else if(num==2){
                System.out.println("출금 액을 입력하시오 : ");
                amount=sc.nextInt();
                balance = withdraw(balance,amount);
            }else if(num==3){
                System.out.println("현재 잔액: " + balance+" 원");
            }else if(num==4){
                System.out.println("시스탬을 종료합니다.");
                return;
            }else{
                System.out.println("올바른 선택이 아닙니다.");
            }
        }

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
