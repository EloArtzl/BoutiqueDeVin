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
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/adminFonctionnality.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String IName = request.getParameter("nameInput");
		String IYear = request.getParameter("yearInput");
		String ICastle = request.getParameter("castleInput");
		String IRegion = request.getParameter("regionInput");
		String IDegree = request.getParameter("degreeInput");
		String IVolume = request.getParameter("volumeInput");
		String IPrice = request.getParameter("priceInput");
		String IUrl = request.getParameter("urlInput");
		String IDescription = request.getParameter("descriptionInput");
		
		Vin vin = new Vin();
		vin.setNom(IName);
		vin.setAnnee(IYear);
		vin.setChateau(ICastle);
		vin.setRegion(IRegion);
		vin.setPourcentageAlcool(IDegree);
		vin.setVolume(IVolume);
		vin.setPrix(IPrice);
		vin.setUrlImage(IUrl);
		vin.setDescription(IDescription);
		
		Vins vins = Vins.getInstance();
		doGet(request, response);

	}

}
