package servelet_files;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Annuaire;
import model.ErrorAdd;
import model.Personne;

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
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/adminFonctionnality.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String IName = request.getParameter("nameInput");
		String IYear = request.getParameter("yearInput");
		String UEmail = request.getParameter("userEmail");
		String UPassword = request.getParameter("password");
		String UPass = request.getParameter("secondPassword");
		
		Personne user = new Personne();
		user.setName(UName);
		user.setSirname(USurName);
		user.setEmail(castleInput);
		user.setMotDepasse(UPassword);
		
		Annuaire annuaire = Annuaire.getInstance();
		try {
			annuaire.addPersonne(user);
		} catch (ErrorAdd e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doGet(request, response);

	}

}
