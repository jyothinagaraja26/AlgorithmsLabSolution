package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.paymoney.PayMoney;

public class Driver {

	public static void main(String[] args) {

		int[] transaction;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		transaction = new int[size];
		System.out.println("Enter the value of array");
		for (int i = 0; i < size; i++) {
			transaction[i] = sc.nextInt();
		}
		System.out.println("Enter the total number of targets that needs to be achieved");
		int totalTarget = sc.nextInt();
		for (int j = 0; j < totalTarget; j++) {

			System.out.println("Enter the target");
			int target = sc.nextInt();
			PayMoney paymoney = new PayMoney();
			int numberDays = paymoney.numberDays(transaction, target);

			if (numberDays == -1) {
				System.out.println("Given target is not achieved");
			} else {
				System.out.println("Target is achieved after " + numberDays + " transactions \n");
			}
		}
	}

}
