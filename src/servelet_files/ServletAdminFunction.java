package servelet_files;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddForm;
import model.Annuaire;
import model.ErrorAdd;
import model.Personne;
import model.Vin;
import model.Vins;

/**
 * Servlet implementation class ServletAdminFunction
 */
@WebServlet("/adminFonctionnality")
public class ServletAdminFunction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAdminFunction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("on est dans le do get");
		AddForm form  =  (AddForm) request.getAttribute("form");
		request.setAttribute("form", form);
		//System.out.println(erreurs.toString());
		this.getServletContext().getRequestDispatcher("/WEB-INF/adminFonctionnality.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AddForm form = new AddForm();
		form.verifChamp(request);
		Map<String, String> erreurs = form.getErreurs();
				
				
			if (erreurs.isEmpty()) {
				System.out.println("il n'y a pas d'erreurs");

				form.addVinToCatalog();
				
				this.getServletContext().getRequestDispatcher("/WEB-INF/adminFonctionnality.jsp").forward(request, response);

			}else {
				System.out.println("il y a une erreurs");
				request.setAttribute("form", form);
				this.getServletContext().getRequestDispatcher("/WEB-INF/adminFonctionnality.jsp").forward(request, response);

				//doGet(request, response);
			}
				
				
//			} catch (Exception e) {
//				System.out.println(vin.toString());
//				System.out.println("l'exception est levee");
//				// style="color:red; visibility:visible;"
//				//le format n'est pas convertible en string
//			}
		
		}	
		
		
		//doGet(request, response);

	}
