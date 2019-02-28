import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
	
	public static void run() throws IOException, URISyntaxException{
		Item item = new Item();
		ConsoleUi ui = new ConsoleUi(item);
		String URL_entity = "https://www.barnesandnoble.com/w/toys-games-the-mind/32481555?ean=0854382007139";
		ui.showWelcome(); //Displays greeting
		
		
		int userRequest = ui.promptUser(); //User request case 1 or case 2
		switch(userRequest) {
		case 1:
			ui.showItem(URL_entity);
			break;
		case 2:
			Desktop myURL = Desktop.getDesktop();
			myURL.browse(new URI(URL_entity));
			break;
		}
		while (userRequest == -1) { //Quits program completely iff user input is -1
			System.out.println("Quit Program");
			System.exit(userRequest);
		}
			
	}
	
	public static void main(String []args) throws IOException, URISyntaxException {
		run();
	}
}