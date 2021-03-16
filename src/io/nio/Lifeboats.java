package io.nio;
/**
 * 
 */

import java.util.Scanner;

/**
 * @author Priyanka File name: Lifeboats.java Author :Priyanka Mehta Date:
 *         19-Feb-2021 12:00 PM Description: Calculate the minimum number of
 *         lifeboats required for safety measures and the number of people
 *         rescued and drowned in the given number of available lifeboat.
 * 
 */
public class Lifeboats {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// title of the project
		System.out.println("\t\t\tLifeboat Capacity Analysis");
		System.out.println("\t\t*****************************************\n");

		// Create scanner object
		Scanner in = new Scanner(System.in);

		// Creating Variable
		String shipName;
		System.out.print("Enter the name of the ship: ");
		shipName = in.nextLine();

		// Creating Variable
		// int people;
		double people;
		System.out.print("Enter the no of people on board the " + shipName + ": ");
		people = in.nextDouble();
		// people = in.nextFloat();

		// Creating Variable
		// int maxPeople;
		double maxPeople;
		System.out.print("Enter the maximun number of people per lifeboat: ");
		// maxPeople = in.nextInt();
		maxPeople = in.nextDouble();

		// Creating Variable
		double lifeboats;
		System.out.print("Enter the number of lifeboats that are available on the " + shipName + ": ");
		// Lifeboats = in.nextInt();
		lifeboats = in.nextDouble();

		System.out.println("\n\t\t\t\t************************************");
		System.out.println("\t\t\t\t\tHere are the results");
		System.out.println("\t\t\t\t************************************");

		// Minimum lifeboats required
		double minLifeboats = (people / maxPeople);

		// Round off the number
		double number = minLifeboats * 100;
		minLifeboats =  (number / 100);
		System.out.println("A minimum of " + minLifeboats + " lifeboats are required to resuce everyone on board.");

		// No of people that would rescue + Percentage of rescued people
		double peopleRescued = (lifeboats * maxPeople);
		System.out.println("people rescude"+peopleRescued);
		double peopleRescuedPercentage =(peopleRescued*100)/people;
		
		

		if (peopleRescued > people) {
			peopleRescued = people;
			System.out.println(peopleRescued + " people (" + peopleRescuedPercentage + "%) would be rescued.");

		} else {

			System.out.println(peopleRescued + " people (" + peopleRescuedPercentage + "%) would be rescued.");
		}

		// No of people that would drown + Percentage of drowned people
		double peopleDrowned = people - peopleRescued;
		double peopleDrownedPercentage = (double)(peopleDrowned * 100) / people;
		System.out.println(peopleDrowned + " people (" + peopleDrownedPercentage + "%) would likely drown.");

		// Excess Capacity of People carried by the lifeboats
			double extraPeople = ((lifeboats * maxPeople) - people);
			System.out.println("There would be room for an extra " + extraPeople + " people in the lifeboats.");
		}
	}


