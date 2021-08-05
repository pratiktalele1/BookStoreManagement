package Service;

import java.util.List;

import Model.Book;
import Model.BookManagement;
import Model.Customer;

public interface IBookManagementService {
	void buyBook(List<Book> books, List<Customer> customers, List<BookManagement> bookManagements);
}
