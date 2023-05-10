package com.SearchingSorting;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {

	@SuppressWarnings({ "rawtypes", "unchecked", "resource" })
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("\n Enter the number of Elements : ");
		int n = scanner.nextInt();

		Comparable[] array = new Comparable[n];
		System.out.println("\n Enter the Data : ");

		// Reading inputs
		for (int i = 0; i < n; i++) {

			array[i] = scanner.next();

//			if (scanner.hasNextInt()) {
//				array[i] = scanner.nextInt();
//			} else {
//				array[i] = scanner.next();
//			}

		}

		int choice1;

		do {

			System.out.println("\n 1. Sort Data");
			System.out.println("\n 2. Search Data");
			System.out.println("\n 3. View Data");
			System.out.println("\n 0. Exit !!");

			System.out.print("\n Enter your Choice :  ");

			choice1 = scanner.nextInt();

			System.out.println("\n-------------------------------------------------------\n");

			switch (choice1) {

			// Sorting Algorithms
			case 1:

				Sort data = new Sort(array);

				int choice2;

				do {
					System.out.println("\n 1. Bubble Sort");
					System.out.println("\n 2. Insertion Sort");
					System.out.println("\n 3. Selection Sort");
					System.out.println("\n 4. Quick Sort");
					System.out.println("\n 5. Merge Sort");
					System.out.println("\n 6. Heap Sort");
					System.out.println("\n 7. View Data");
					System.out.println("\n 0. Main Menu !!");

					System.out.print("\n Enter you Choice : ");

					choice2 = scanner.nextInt();

					System.out.println("\n-------------------------------------------------------\n");

					switch (choice2) {

					// Bubble Sort
					case 1:

						data.bubbleSort();

						System.out.println("\n Given Data is Sorted By Bubble Sort \n");
						System.out.println(data);

						System.out.println("\n-------------------------------------------------------\n");

						break;

					// Insertion Sort
					case 2:

						data.insertionSort();

						System.out.println("\n Given Data is Sorted By Insertion Sort \n");
						System.out.println(data);
						System.out.println("\n-------------------------------------------------------\n");

						break;

					// Selection Sort
					case 3:

						data.selectionSort();

						System.out.println("\n Given Data is Sorted By Selection Sort \n");
						System.out.println(data);
						System.out.println("\n-------------------------------------------------------\n");

						break;

					// Quick Sort
					case 4:

						data.quickSort(0, data.array.length - 1);
						// data is object of Sort class
						// array is the property of sort class
						// here we have used recursive approach so these parameters are need to be there
						// 1st param is starting index of Array and 2nd param is last index of Array

						System.out.println("\n Given Data is Sorted By Quick Sort \n");
						System.out.println(data);
						System.out.println("\n-------------------------------------------------------\n");

						break;

					// Merge Sort
					case 5:

						System.out.println("Sorry !! This function will be added soon");
						System.out.println("\n-------------------------------------------------------\n");

						break;

					// Heap Sort
					case 6:
						System.out.println("Sorry !! This function will be added soon");
						System.out.println("\n-------------------------------------------------------\n");

						break;
						
					// View Data
					case 7:
						System.out.println(" Data --> "+Arrays.toString(array));
						System.out.println("\n-------------------------------------------------------\n");
						break;

					// Main Menu
					case 0:

						System.out.println("\n-------------------------------------------------------\n");

						break;
					}
				} while (choice2 != 0);

				break;
				
///////////////////////////////////////////////////////////////////////////////

			// Searching Algorithms
			case 2:
				// creating object of Search Class
				Search search = new Search(array);

				int choice3;

				do {
					System.out.println("\n 1. Linear Search");
					System.out.println("\n 2. Binary Search");
					System.out.println("\n 3. View Data");
					System.out.println("\n 0. Main Menu !!");

					System.out.print("\n Enter you choice : ");
					choice3 = scanner.nextInt();

					switch (choice3) {

					// Linear Search
					case 1:

						System.out.print("\n Enter Data which you want to Found : ");
						Comparable target = scanner.next();

						int position = search.linearSearch(target);

						if (position >= 0) {
							System.out.println("\n Given Data is Present at Position : " + (position + 1));
						} else {
							System.out.println("\n Sorry !! Given Data in Not Present");
						}

						System.out.println("\n-------------------------------------------------------\n");

						break;

					// Binary Search
					case 2:
						System.out.print("\n Enter Data which you want to Found : ");
						Comparable target2 = scanner.next();

						int position2 = search.binarySearch(target2);

						if (position2 >= 0) {
							System.out.println("\n Given Data is Present at Position : " + (position2 + 1));
						} else {
							System.out.println("\n Sorry !! Given Data in Not Present");
						}

						System.out.println("\n-------------------------------------------------------\n");
						break;
					
					// View Data
					case 3:
						System.out.println(" Data --> "+Arrays.toString(array));
						System.out.println("\n-------------------------------------------------------\n");
						break;

					case 0:
						System.out.println("\n-------------------------------------------------------\n");
						break;
					}
				} while (choice3 != 0);

				break;
////////////////////////////////////////////////////////////////////////
			
			// View Data
			case 3:
				System.out.println(" Data --> "+Arrays.toString(array));
				System.out.println("\n-------------------------------------------------------\n");
				break;
				
			// Exit
			case 0:
				System.out.println("        *********** * THANK-YOU * ***********");
				System.out.println("\n-------------------------------------------------------\n");

				break;
			}
		} while (choice1 != 0);
	}

}
