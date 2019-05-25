package aplicacionISI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class scrappingTuTiendaVJ {
	public Document tienda(String buscame){
		print("running...");
		print(buscame);
		Document document= null;
//		Map<String, String> myMap = new HashMap<>();
		ArrayList< Pair<String, String> > NombrePrecio = new ArrayList();
		String littlePrice = null;
		String names = null;



		try {
			print(buscame);
			document = Jsoup.connect(buscame).get();
			String title = document.title(); //Get title
			print("  Title: " + title); //Print title.
			Elements price = document.body().select("span.price.product-price"); //Get price
			Elements titulos = document.body().select("a.product-name");
			
			for (int i=0; i < price.size(); i++) {
				littlePrice = price.get(i).text();
				names = titulos.get(i).ownText();
				myMap.put(names, littlePrice);
				NombrePrecio.add(myMap);
				
				
			}
			
			p
			print(NombrePrecio.get(0));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		print("done");
		
		return document;
	}
	public static void print(String string) {
		System.out.println(string);
	}
}