package aplicacionISI;

import java.io.IOException;
import java.util.ArrayList;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class tuTiendaVJ {
	public ArrayList<Juego> tienda(String buscame){
		print("running...");
		print(buscame);
		Document document= null;
		ArrayList<Juego> juegos = new ArrayList();




		try {
			print(buscame);
			document = Jsoup.connect(buscame).get();
			String title = document.title(); //Get title
			print("  Title: " + title); //Print title.
			Elements price = document.body().select("span.price.product-price"); //Get price
			Elements titulos = document.body().select("a.product-name");
			
			for (int i=0; i < price.size(); i++) {
				Juego g = new Juego();
				g.setNombre(titulos.get(i).text());
				g.setPrecio(price.get(i).text());
				juegos.add(g);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		print("done");
		
		return juegos;
	}
	public static void print(String string) {
		System.out.println(string);
	}
}