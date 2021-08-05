package Controller;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.BookManagement;
import Model.Customer;

public class DashBoard {

	List<Customer> customers = new ArrayList<Customer>();
	List<Book> books = new ArrayList<Book>();
	List<BookManagement> bookManagements = new ArrayList<BookManagement>();
	
	static Scanner scanInput = new Scanner(System.in);
	
	public void menu() {
		int i = 0;
		
		do {
			System.out.print("1->add book \t 2-> buy book ");
			
			int getUserInput = scanInput.nextInt();

			switch (getUserInput) {
			case 1: {
				
				break;
			}
			case 2: {
				break;
			}
			}

			System.out.print("want to continue- ");

			i = scanInput.nextInt();

		} while (i == 1);
	}
	

	public static void main(String[] args) {

	}
}
