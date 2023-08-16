
import java.util.Scanner;

interface UserATMInterface{
	double withdrawing(double withdrawalAmount);
	void deposit(double depositAmount);
	double checkBalance();
	
}
class UserBankAccount{
	double userBalance;
	void setUserBalance(double balance) {
		this.userBalance = balance;
	}
}
class Bank extends UserBankAccount implements UserATMInterface{

	double depositAmount;
	int count ;
	
	@Override
	public double withdrawing(double withdrawalAmount) {
		if(withdrawalAmount>0 && withdrawalAmount<=1000 && withdrawalAmount<=depositAmount) {
			if(count == 3) {
				System.out.println("Limit of the day is Over. so you can't get "+withdrawalAmount+" you hava successfully '3' withdrawal attempted");
				return -1;
			}
			this.depositAmount = depositAmount-withdrawalAmount;
			this.setUserBalance(this.depositAmount);
			count++;
			return withdrawalAmount;
		}else if(withdrawalAmount>1000 && withdrawalAmount<=depositAmount){
			System.out.println("You can get Maximum amount '1000' only or 'below' at a time");
			return -1;
		}else {
			System.out.println("You have Insuficient Balance..!");
			return -1;
		}
	}

	@Override
	public void deposit(double depositAmount) {
		this.depositAmount += depositAmount;
	}

	@Override
	public double checkBalance() {
		return this.depositAmount;
	}
	
}
public class ATMmachine {

	public static void main(String[] args) {
		UserATMInterface atmMachine = new Bank();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press '1' to Open Bank Account: ");
		int response = scanner.nextInt();
		while(response !=0 ) {
			System.out.println("Welcome you in your back account..!");
			System.out.println("What would you like to do using bank Services: ");
			System.out.println("Press '5' for 'Withdrawing' Amount. Press '6' for 'Deposit' Amount.");
			System.out.println("Press '7' for 'CheckBalance' Amount.");
			int input = scanner.nextInt();
			switch(input) {
				case 5:
					double userWithdrawalAmount = scanner.nextDouble();
					double withdrawingAmount = atmMachine.withdrawing(userWithdrawalAmount);
					if(withdrawingAmount != -1) {
						System.out.println("Successfully withdraw the Amount: "+withdrawingAmount);
					}
					break;
				case 6:
					System.out.println("How much Amount want to deposit..??");
					double depositAmount = scanner.nextDouble();
					atmMachine.deposit(depositAmount);
					System.out.println("Successfully Deposit your Amount: ");
					break;
				case 7:
					double balance = atmMachine.checkBalance();
					System.out.println("Balance of your Amount is: "+balance);
					break;
			}
			System.out.println("Do you want to perform any other task..??");
			System.out.println("If 'YES' then Press '1'. Else 'NOT' Then Press '0'.!");
			response = scanner.nextInt();
			if(response == 0) {
				System.out.println("Thank You, We hope you may got the best Experience with us..!");
			}
		}
	}

}
