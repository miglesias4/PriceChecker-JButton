import java.util.Scanner;
import java.io.IOException;
import java.util.*;
public class ConsoleUi {
	private Item item;

	public ConsoleUi(Item item) {
		this.item = item;
	}

	public void showWelcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to PW!");
	
	}

	public void showItem(String URL) throws IOException {
		// TODO Auto-generated method stub
		String url_entity = URL;
		System.out.println("Here're item details...");
		Item.itemDetails(url_entity);
		
	}

	public int promptUser() throws NoSuchElementException{
		// TODO Auto-generated method stub
		System.out.println("Select any of the following: (1) to check price (2) to open URL or -1 to quit");
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		scan.close();
		
		return r;
	}

}