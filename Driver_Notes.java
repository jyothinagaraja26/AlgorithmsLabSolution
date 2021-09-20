package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.currencydenomination.MergeSortNoOfNotes;
import com.greatlearning.currencydenomination.NotesCountImplementation;

public class Driver_Notes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of denomination:\n");
		int size = sc.nextInt();
		int denomination[] = new int[size];

		System.out.println("Enter the denomination array:\n");
		for (int i = 0; i < size; i++) {
			denomination[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay:  ");
		int target = sc.nextInt();

		MergeSortNoOfNotes mergesortnoofnotes = new MergeSortNoOfNotes();
		mergesortnoofnotes.sortArray(denomination, 0, size - 1);

		NotesCountImplementation notescountimplementation = new NotesCountImplementation();
		notescountimplementation.notesCount(denomination, target);
	}

}
