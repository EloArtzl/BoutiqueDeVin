package servelet_files;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Vin;
import model.Vins;

/**
 * Servlet implementation class ServeletCatalog
 */
@WebServlet("/catalogPage")
public class ServeletCatalog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletCatalog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Vins vins=Vins.getInstance();
		
		request.setAttribute("vins", vins.getLesVins());
		
		String id=request.getParameter("suppr");
		System.out.println("le ID est : " +id);
		if(id!=null) {
			 System.out.println("le ID est : " +id);
			 Vin v= vins.findById(Integer.parseInt(id));
			 vins.getLesVins().remove(v);
			  vins.getQuantities().remove(v.getId());
			  //this.getServletContext().getRequestDispatcher("/WEB-INF/catalogPage.jsp").forward(request, response);
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/catalogPage.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// request.getParameter("id");
		// TODO Auto-generated method stub
		
           String mot=request.getParameter("nom");
           System.out.println("le mot es : " +mot);
		
		   Vins vins=Vins.getInstance();
		   //response.getWriter().append(mot).append(request.getContextPath());
		
		   request.setAttribute("vins",  vins.ListerParMot(mot.toLowerCase()));
		   this.getServletContext().getRequestDispatcher("/WEB-INF/SearchCatalogue.jsp").forward(request, response);
		
		
		//doGet(request, response);
	}

}
