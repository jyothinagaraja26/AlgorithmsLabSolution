package com.greatlearning.currencydenomination;

public class MergeSortNoOfNotes {

	public void sortArray(int notes[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sortArray(notes, left, mid);
			sortArray(notes, mid + 1, right);
			merge(notes, left, mid, right);
		}
	}

	public void merge(int notes[], int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i) {
			L[i] = notes[left + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = notes[mid + 1 + j];
		}
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] >= R[j]) {
				notes[k] = L[i];
				i++;
			} else {
				notes[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			notes[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			notes[k] = R[j];
			j++;
			k++;
		}
	}
}
