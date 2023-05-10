package com.SearchingSorting;

import java.util.Arrays;

public class Sort<T extends Comparable<T>> implements SortingAlgorithm {

	// Data Member
	T[] array;

	// constructor
	public Sort(T[] rollNumbers) {
		this.array = rollNumbers;
	}

	// Member Functions

	@Override
	public void bubbleSort() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					// swapping
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	@Override
	public void selectionSort() {

		for (int i = 0; i < array.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareTo(array[smallest]) < 0) {
					smallest = j;
				}
			}
			T temp = array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
		}
	}

	@Override
	public void insertionSort() {
		for (int i = 1; i < array.length; i++) {
			T temp = array[i];
			int j = i - 1;

			while (j >= 0 && (array[j].compareTo(temp) > 0)) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
	}

	@Override
	public void quickSort(int low, int high) {

		if (low < high) {
			int pi = partition(low, high);
			quickSort(low, pi - 1);
			quickSort(pi + 1, high);
		}

	}

	private int partition(int low, int high) {
		T pivot = array[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {

			if (array[j].compareTo(pivot) < 0) {
				i++;
				T temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		T temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return i + 1;
	}

	@Override
	public void mergeSort() {
		// yet to be complete
	}

	@Override
	public void heapSort() {
		// yet to be complete
	}
//////////////////////////////////////////////////////////

	@Override
	public String toString() {
		return " Data => " + Arrays.toString(array);
	}

}
