<!DOCTYPE html>
<HTML lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/flexStyle.css">
    <link rel="stylesheet" href="css/headerStyle.css">
    <link rel="stylesheet" href="css/footerStyle.css">
    <link rel="stylesheet" href="css/logInStyle.css">
    <title>Document</title>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ page import="model.Personne" %></head>
	<%@ page import="model.Vin" %></head>
	
	<jsp:useBean id="utilisateur" class="model.Personne" scope="request"></jsp:useBean>
	<jsp:useBean id="vinToChange" class="model.Vin" scope="request"></jsp:useBean>
	
	<jsp:useBean id="form" class="model.ConnexionForm" scope="request"></jsp:useBean>
	
<body>
    <div class="secondaryAxisFlexContent"><!-- axe principal : ordonn&eacutee -->
         <%@include file="hearder.jsp" %>
    
        <div class="mainContent primaryAxisflexContent ">
            <div class="connectionContainer">
                <div class="itemInput verticalItem">
                <c:if test = "${utilisateur.getName() != null}">
         		<h2>Vous etes connect? en tant que  <c:out value = "${utilisateur.getName()}"/></h2> 
      			</c:if>
				</div>
                <div class="accountZone">
                    <h2>Cr&eacute;er un compte</h2>
                    <h3>Veuillez remplir les champs si dessous</h3>
                    
                    
                    <form method="post" action="logInPage" id="formCreateAccount" class="" name="accountForm">
                    	<div id="somethingIsMissing" class="verticalItem" style="color:red; visibility:hidden;">Les champs marqu&eacute;s par <span style="color:red;font-size:12px;">*</span> sont obligatoires</div>
                        <div id="notSamePassword" class="verticalItem" style="color:red; visibility:hidden;">Les deux mots de passes ne sont identiques</div>
                            
                        <div class="itemInput verticalItem">
                            <label for=" userName">Nom <span style="color:red;font-size:12px;">*</span>: </label>
                            <input name="userName" id="name" type="text"><br>
                        </div>
                        <div class="itemInput verticalItem">
                            <label for=" userSurName">Pr&eacute;nom <span style="color:red;font-size:12px;">*</span>: </label>
                            <input name="userSurName" id="surName" type="text"><br>
                        </div>
                        <div class="itemInput verticalItem">
                            <label for=" userEmail">Adresse email <span style="color:red;font-size:12px;">*</span>: </label>
                            <input name="userEmail" id="userEmail" type="email"><br>
                        </div>
                        <div class="itemInput verticalItem">
                            <label for=" password">Mot de passe <span style="color:red;font-size:12px;">*</span>: </label>
                            <input name="password" id="password" type="password"><br>
                        </div>
                        <div class="itemInput verticalItem">
                            <label for=" password">Confirmer le mot de passe <span style="color:red;font-size:12px;">*</span>: </label>
                            <input name="secondPassword" id="passwordRepeat" type="password"><br>
                        </div>
                        <div id="accountButton" class="verticalItem" ><input  type="submit" value="Cr&eacute;er le compte" name="inputAccountButton"></div>
                    </form>
                    
                    
                    
                </div>
                
                
                
                
                <div class="connectZone">
                    <h2>Connexion</h2>
                    <h3>Veuillez saisir le nom d'utilisateur et le mot de passe</h3>
                    
                    
                    <form method="post" action="" id="formLogIn" class="" name="connectForm">
                        <div class="itemInput verticalItem">                    	
                        	
                        	<div id="wrongID" class="verticalItem" style="color:red;">${form.erreurs['emailUserConnect']}</div>
                            <label for="emailUserConnect">Login (email) : </label>
                            
                            <input name="emailUserConnect" id="emailUserConnect" type="text"><br>
                        </div>
                        <div class="itemInput verticalItem">
                        	<div id="wrongPassword" class="verticalItem" style="color:red;">${form.erreurs['passwordUserConnect']}</div>
                            
                            <label for="passwordUserConnect">Mot de passe : </label>
                            <input name="passwordUserConnect" id="passwordUserConnect" type="password"><br>
                        </div>
                        <div id="connectButton" class="verticalItem" ><input  type="submit" value="Se connecter" name="inputConnectButton"></div>
                    </form>
                    
                    
                </div>
                <div class="introConnect">
                    <h3>Connexion en tant qu'administrateur</h3>
                    <p>Un administrateur a la possibilit&eacute; de rajouter, de modifier et de supprimer les produits pr&eacute;sents dans le catalogue</p>
                    <p>Pour vous connecter en tant qu'administrateur, veuillez vous r&eacute;f&eacute;rer a la notice utilisateur</p>
                </div>
            </div>
            
        </div>
        <%@include file="footer.jsp" %>
    </div><!-- fin de l'axe principal : ordonn&eacutee -->

</body>
</html>