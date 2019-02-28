import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.util.Random;

public class Item {
	
	public static void itemDetails(String URL) throws IOException {
		String URL_entity = URL;
		String price = "";
		String title = "";
		double change = priceChange(URL_entity);
		
		Document page = Jsoup.connect(URL_entity).timeout(6000).get(); //Connects to the URL 
		price = page.select("#pdp-cur-price").text(); //Selects the price and title in div under HTML console
		title = page.select("#pdp-header-info > h1").text();
		System.out.println("Title: " + title);
		System.out.println("Price: " + price);
		System.out.println("Change: " + change +"%");
		System.out.println("URL: " + URL_entity);
	
	}
	
	public static double priceChange(String URL) throws IOException {
		Random rand = new Random();
		String URL_entity = URL;
		double randPrice = rand.nextInt(10);
		String price = "";
		float finalPlaceHolder;
		
		Document page = Jsoup.connect(URL_entity).timeout(6000).get();
		price = page.select("#pdp-cur-price").text();
		String newPrice = price.substring(1);
		double pagePrice = Double.parseDouble(newPrice);
		
		//Mathematical Implementation percentage:
		finalPlaceHolder = (float) ((pagePrice*10)/ randPrice);
		
		return finalPlaceHolder;
	}
	

}
