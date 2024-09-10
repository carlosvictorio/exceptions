package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.WithdrawException;
import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		System.out.print("Number:");;
		int number = sc.nextInt();
		System.out.print("Holder:");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Initial Balance:");
		double balance = sc.nextDouble();
		System.out.print("Withdraw Limit:");
		double withdrawLimit = sc.nextDouble();
		System.out.println();

		Account account = new Account(number, name, balance, withdrawLimit);
				
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		
		try {
			account.withdraw(amount);
		} 
		catch (WithdrawException error) {
			System.out.println(error.getMessage());
		}
		finally {
			System.out.printf("Saldo atual: %.2f", account.getBalance());
		}
		

	}

}
