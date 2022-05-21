package model;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public final class ConnexionForm {
    private static final String CHAMP_EMAIL  = "emailUserConnect";
    private static final String CHAMP_PASS   = "passwordUserConnect";

    private String              resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();

    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public Personne connecterUtilisateur( HttpServletRequest request ) {
        /* Récupération des champs du formulaire */
        String email = getValeurChamp( request, CHAMP_EMAIL );
        String motDePasse = getValeurChamp( request, CHAMP_PASS );

        Personne utilisateur = new Personne();

        /* Validation du champ email. */
        try {
            validationEmail( email );
        } catch ( Exception e ) {
            setErreur( CHAMP_EMAIL, e.getMessage() );
        }
        utilisateur.setEmail( email );

        
        /* Validation du champ mot de passe. */
        try {
            validationMotDePasse(email, motDePasse );
        } catch ( Exception e ) {
            setErreur( CHAMP_PASS, e.getMessage() );
        }
        //utilisateur.setMotDepasse( motDePasse );
        utilisateur.setName(Annuaire.getInstance().getNameOfPersonne(email));
        utilisateur.setSirname(Annuaire.getInstance().getSurNameOfPersonne(email));

        /* Initialisation du résultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succès de la connexion.";
        } else {
            resultat = "Échec de la connexion.";
        }

        return utilisateur;
    }

    /**
     * Valide l'adresse email saisie.
     */
    private void validationEmail( String email ) throws Exception {
        if ( email != null && !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
            throw new Exception( "Merci de saisir une adresse mail valide." );
        }
    }

    /**
     * Valide le mot de passe saisi.
     */
    private Boolean validationMotDePasse(String email, String motDePasse ) throws Exception {
        if ( motDePasse != null ) {
        	
			Annuaire annuaire = Annuaire.getInstance();
			if (annuaire.containsEmail(email)) {
				Boolean loginOk = annuaire.emailverification(email, motDePasse);
				if (loginOk) {
					return true;
					// connexion
					
				}else {
					throw new Exception("Le mot de passe saisi est incorrect");
					// afficher la div avec l'id : wrongPassword

				}
			} else {
				throw new Exception("Le login est incorrect, veuillez créer un compte avant de vous connecter");
				// l'utilisateur n'est pas enregistre
				// afficher la div avec l'id : wrongID

			}
        	
        	
        	
            /**if ( motDePasse.length() < 3 ) {
                throw new Exception( "Le mot de passe doit contenir au moins 3 caractères." );
            }**/
        } else {
            throw new Exception( "Merci de saisir votre mot de passe." );
        }
    }

    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }

    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur;
        }
    }
}