package Service;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Model.Book;
import Model.BookManagement;
import Model.Customer;

public class BookManagementServiceImpl implements IBookManagementService {
	static Scanner scan = new Scanner(System.in);

	@Override
	public void buyBook(List<Book> books, List<Customer> customers, List<BookManagement> bookManagements) {

		Book book = books.stream()
				.filter(data -> data.getBookName().compareToIgnoreCase(getBookNameFromCustomer()) == 0)
				.collect(Collectors.toList()).get(0);

	}

	private String getBookNameFromCustomer() {
		System.out.println("Enter book name");
		String bookName = scan.next();
		return bookName;
		
}
}
