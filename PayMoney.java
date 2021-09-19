package com.greatlearning.paymoney;

public class PayMoney {
	public int numberDays(int transaction[], int target) {
		for (int i = 0; i < transaction.length; i++) {
			if (transaction[i] == target || target < transaction[i]) {
				return i + 1;
			}
				target = target - transaction[i];
		}
		return -1;
	}
}
