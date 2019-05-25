package aplicacionISI;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import aplicacionISI.tuTiendaVJ;
import aplicacionISI.instantGaming;
import aplicacionISI.Juego;


@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public tuTiendaVJ tu_tienda = new tuTiendaVJ();
	public instantGaming instant = new instantGaming();
	public Juego j = new Juego(); 
	
	public String busqueda="";
	public String edicion="";
	public String plataforma="";

	public String urlOne   = "https://www.tiendacpu.com/buscar?controller=search&orderby=position&orderway=desc&search_query=loquequieresbsucar&submit_search=";
	public String urlTwo  = "https://www.instant-gaming.com/es/busquedas/?q=loquequieresbsucar";

	



private void print(String string) {
		// TODO Auto-generated method stub
		
	}


@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
	String buscame = request.getParameter("buscame");
	String plataforma = request.getParameter("plataforma");
	String edicion = request.getParameter("edicion");
	
	request.setAttribute(buscame, j.nombre);
	request.setAttribute(plataforma, j.plataforma);
	request.setAttribute(buscame, j.nombre);

	urlOne = urlOne.replace("loquequieresbsucar", buscame );
	urlTwo = urlTwo.replace("loquequieresbsucar", buscame );

	ArrayList<Juego> dOne = tu_tienda.tienda(urlOne);
	ArrayList<Juego> dTwo = instant.tienda(urlTwo);

	
	response.setContentType("text/plain;charset=UTF-8");
	
	for(int i = 0; i < dOne.size(); i++) {
		Juego j = dOne.get(i);
		response.getWriter().print(j.getNombre()+"---->"+j.getPrecio()+ System.lineSeparator());

	}
	
	
	response.getWriter().print(System.lineSeparator());
	response.getWriter().print(System.lineSeparator());

	
	
	for(int i = 0; i < dTwo.size(); i++) {
		Juego a = dTwo.get(i);
		response.getWriter().print(a.getNombre()+"---->"+a.getPrecio()+ System.lineSeparator());

	}
	
    
    
	}



  }