import java.io.IOException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import java.io.IOException;

import org.jsoup.nodes.Document;

import aplicacionISI.scrappingTuTiendaVJ;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public scrappingTuTiendaVJ tu_tienda = new scrappingTuTiendaVJ();
	public String busqueda="";
	public String urlInicial  = "https://www.tiendacpu.com/buscar?controller=search&orderby=position&orderway=desc&search_query=fifa&submit_search=";
	



private void print(String string) {
		// TODO Auto-generated method stub
		
	}


@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
	String buscame = request.getParameter("buscame");
	urlInicial = urlInicial.replace("loquequieresbsucar", "fifa" );
	Document d = tu_tienda.tienda(urlInicial);
	response.setContentType("text/plain;charset=UTF-8");
	response.getWriter().print(d);
    
    
	}



  }