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
 * Servlet implementation class ServeletLogin
 */
@WebServlet("/logInPage")
public class ServeletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/logInPage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("accountForm")!= null) {
			//formulaire de creation de compte
			
			String UName = request.getParameter("userName");
			String USurName = request.getParameter("userSurName");
			String UEmail = request.getParameter("userEmail");
			String UPassword = request.getParameter("password");
			String UPass = request.getParameter("secondPassword");
			
			
			if (UName == "" || USurName == "" || UEmail =="" || UPassword == "" || UPass == ""	) {
				System.out.println("un champ est manquant");
				//afficher la div avec l'id : somethingIsMissing
				return;
			}else if (UPass != UPassword) {
				System.out.println("Les mots de passes sont differents");
				// afficher la div avec l'id : notSamePassword
				return;
			}else {
				Personne user = new Personne();
				user.setName(UName);
				user.setSirname(USurName);
				user.setEmail(UEmail);
				user.setMotDepasse(UPassword);
				
				Annuaire annuaire = Annuaire.getInstance();
				try {
					annuaire.addPersonne(user);
				} catch (ErrorAdd e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				doGet(request, response);
		
				System.out.println("la personne a été créé "+ annuaire.toString()) ;
			
			
			} 
		}else if (request.getParameter("connectForm") != null) {
			//formulaire de connexion
			
			String CEmail = request.getParameter("emailUserConnect");
			String CPassword = request.getParameter("passwordUserConnect");
			
			Annuaire annuaire = Annuaire.getInstance();
			if (annuaire.containsEmail(CEmail)) {
				Boolean loginOk = annuaire.emailverification(CEmail, CPassword);
				if (loginOk) {
					// connexion
					
				}else {
					// afficher la div avec l'id : wrongPassword

				}
			} else {
				// l'utilisateur n'est pas enregistre
				// afficher la div avec l'id : wrongID

			}
			
			
			
			
			
			
		}
		
		
		
	}
}
