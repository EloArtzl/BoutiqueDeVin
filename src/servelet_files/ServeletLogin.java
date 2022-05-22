package servelet_files;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Annuaire;
import model.ConnexionForm;
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

    public static final String ATT_USER         = "utilisateur";
    public static final String ATT_FORM         = "form";
    public static final String ATT_SESSION_USER = "sessionUtilisateur";
    public static final String VUE = "catalogPage.jsp";
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("on est dans le doget");
        HttpSession session = request.getSession();
        System.out.println("Session : ATT_SESSION_USER = " + session.getAttribute(ATT_SESSION_USER) );

        request.setAttribute("utilisateur", session.getAttribute("sessionUtilisateur"));

		this.getServletContext().getRequestDispatcher("/WEB-INF/logInPage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("on est dans le dopost");
		//System.out.println(request.getParameter("accountForm"));
		System.out.println("compte :" + request.getParameter("inputAccountButton")!=null);
		System.out.println("connnexion : " + request.getParameter("inputConnectButton")!=null);
		
		if (request.getParameter("inputAccountButton")!=null) {	//formulaire de creation de compte

			System.out.println("creer un compte");

		
		//if (request.getParameter("accountForm")!= null) {
			System.out.println(request.getParameter("accountForm"));
			System.out.println(request.getParameter("inputAccountButton"));

			

			
			String UName = request.getParameter("userName");
			String USurName = request.getParameter("userSurName");
			String UEmail = request.getParameter("userEmail");
			String UPassword = request.getParameter("password");
			String UPass = request.getParameter("secondPassword");
			
			
			if (UName == null || USurName == null || UEmail == null || UPassword == null || UPass == null	|| UName == "" || USurName == "" || UEmail == "" || UPassword == "" || UPass == "") {
				System.out.println("un champ est manquant");
				//afficher la div avec l'id : somethingIsMissing
				this.getServletContext().getRequestDispatcher("/WEB-INF/logInPage.jsp").forward( request, response );
				return;
			}else if (!UPass.equals(UPassword) ) {//!= UPassword
				
				System.out.println("les password sont differents " + UPass+ " " + UPassword);

				// afficher la div avec l'id : notSamePassword
				this.getServletContext().getRequestDispatcher("/WEB-INF/logInPage.jsp").forward( request, response );
				return;
			}else {
				System.out.println(UName+USurName+UEmail+UPassword+UPass);
				System.out.println("debut de création de la personne");

				Personne user = new Personne();
				user.setName(UName);
				user.setSirname(USurName);
				user.setEmail(UEmail);
				user.setMotDepasse(UPassword);
				
				Annuaire annuaire = Annuaire.getInstance();
				try {
					annuaire.addPersonne(user);
				} catch (ErrorAdd e) {
					e.printStackTrace();
				}
				
				//doGet(request, response);
				
				System.out.println("la personne a été créé "+ annuaire.toString()) ;
			
				this.getServletContext().getRequestDispatcher("/WEB-INF/logInPage.jsp").forward( request, response );
			} 
		}else if (request.getParameter("inputConnectButton")!=null) {
			System.out.println(request.getParameter("connectForm"));
			System.out.println("partie connexion");

			//formulaire de connexion
			/* Préparation de l'objet formulaire */
	        ConnexionForm form = new ConnexionForm();
	        System.out.println(form.getErreurs().toString());
            
	        /* Traitement de la requête et récupération du bean en résultant */
	        Personne utilisateur = form.connecterUtilisateur( request );
	
	        /* Récupération de la session depuis la requête */
	        HttpSession session = request.getSession();
	
	        /**
	         * Si aucune erreur de validation n'a eu lieu, alors ajout du bean
	         * Utilisateur à la session, sinon suppression du bean de la session.
	         */
			
	        if ( form.getErreurs().isEmpty() ) {
	        	System.out.println("succes");
	            session.setAttribute( "sessionUtilisateur", utilisateur );
	            request.setAttribute("utilisateur", session.getAttribute("sessionUtilisateur"));
	            this.getServletContext().getRequestDispatcher("/WEB-INF/catalogPage.jsp").forward( request, response );
				
	        } else {
	        	System.out.println(form.getErreurs().toString());
	            session.setAttribute( ATT_SESSION_USER, null );
	            request.setAttribute("form", form);
	            this.getServletContext().getRequestDispatcher("/WEB-INF/logInPage.jsp").forward( request, response );
	        }
	
	        /* Stockage du formulaire et du bean dans l'objet request */
	        request.setAttribute( ATT_FORM, form );
	        request.setAttribute( ATT_USER, utilisateur );
	
	        //this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	        //RequestDispatcher rq = request.getRequestDispatcher("catalogPage.jsp");
	        //rq.forward(request, response);
	        System.out.println("Session : ATT_SESSION_USER = " + session.getAttribute(ATT_SESSION_USER) );

	        	
			/**
			
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
			
			**/
			
			
			
			
		}else {
			System.out.println(request.getParameter("inputAccountButton"));
			System.out.println("2eme: " + request.getParameter("inputConnectButton"));
		}
		
		
		
	}
}
