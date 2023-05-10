package com.SearchingSorting;

@SuppressWarnings("rawtypes")
public class Search<T extends Comparable<T>> implements SearchingAlgorithm {

	// Data Member
	T[] array;

	// Constructor
	Search(T[] array) {
		this.array = array;
	}

	// Member Functions

	@SuppressWarnings("unchecked")
	@Override
	public int binarySearch(Object target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid].equals(target)) {
				return mid;
			} else if (array[mid].compareTo((T) target) < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}

	@Override
	public int linearSearch(Object target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(target)) {
				return i;
			}
		}

		return -1;
	}

}
