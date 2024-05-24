package com.accenture.mavnewproject;

import java.util.*;

public class App {
	public static void main(String[] args) {
		Set<String> h = new HashSet<>();

		Scanner sc = new Scanner(System.in);
		int choice = 0;
	
		System.out.println("Enter your Choice:");
		System.out.println("Enter 1 to add a player ");
		System.out.println("Enter 2 to remove a player");
		System.out.println("Enter 3 to check if a player is on team ");
		System.out.println("Enter 4 to display player");
		System.out.println("Enter 0 to exit");
		do {
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
		
				System.out.println("Enter Player Name");
				String pname = sc.next();
				h.add(pname);
				break;
			case 2:
				System.out.println("Enter the player name to remove");
				String rem = sc.next();
				if(h.contains(rem)) {
					h.remove(rem);
					System.out.println("Player removed");
					break;
				}
				else {
					System.out.println("Invalid player name");
				}
				
				break;
			case 3:
				System.out.println("Enter player name : ");
				String p_name = sc.next();
				if(h.contains(p_name)) {
					System.out.println("Player exist");
				}
				else {
					System.out.println("Player doesn't exist");
				}
				break;

			case 4:
				System.out.println(h);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

		} while (choice != 0);
	}
}
