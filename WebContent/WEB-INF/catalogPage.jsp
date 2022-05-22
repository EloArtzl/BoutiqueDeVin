<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/flexStyle.css">
    <link rel="stylesheet" href="css/headerStyle.css">
    <link rel="stylesheet" href="css/footerStyle.css">
    <link rel="stylesheet" href="css/catalogStyle.css">
    <title>Document</title>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ page import="model.Vins" %>
	<%@ page import="model.Personne" %></head>
	<jsp:useBean id="utilisateur" class="model.Personne" scope="request"></jsp:useBean>
	
	<jsp:useBean id="vins" class="java.util.HashSet" scope="request"></jsp:useBean>

</head>
<body>
    <div class="secondaryAxisFlexContent">
        <%@include file="hearder.jsp" %>
     <div class="mainContentItem verticalItem" style="width: 50%;" >
     <!-- axe principal : 
                    <input class="searchbar " onkeyup="search_animal()" 
                    type="text" name="search" placeholder="Chercher un vin par son nom et appuyer sur Entr�e">
                    ordonnée -->
                    <form method="post" action="catalogPage">
                    <input class="searchbar " onkeyup="search_animal()" style="width:100%;"
                    type="text" name="nom" placeholder="Chercher un vin par son nom et appuyer sur Entr&eacute;e">
<!--                     <label for="nom"> Chercher</label> -->
<!--                      <input type="text" name="nom" id="nom"> -->
<!--                     <input type="submit"> -->
                     </form>
                </div>
        <div class="mainContent targetInjection primaryAxisflexContent max2itemContainer">
            <!-- Catalogue :  -->
                <!-- nom, volume, ann&eacutee, chateau, region, prix, PourcentageAlcool, description, url_image -->
                
                
  
                
              <c:forEach var="d" items="${vins}">
            
                
               
                <div class="mainContentItem horizontalItem primaryAxisflexContent max2itemContainer max2item textLink">
                    <h2 class="name mainFullContentItem "><c:out value="${d.nom}"  /></h2>
                    <img class="bottlePicture horizontalItem " src="https://www.vinatis.com/64473-thickbox_default/chateau-haut-brion-2019-1er-cru-classe.png" alt="chateau haut brion boouteille 2019">
                
                    <div class="horizontalItem presentContent ">
                        <p class="description">
                            <c:out value="${d.description}"  />
                        </p>
                        <ul>
                            <li>
                                <p class="year">Mill&eacute;sime : <span><c:out value="${d.annee}"  /></span></p>
                            </li>
                            <li>
                                <p class="castle">Ch�teau : <span><c:out value="${d.chateau}"  /></span></p>
                            </li>
                            <li>
                                <p class="region">R&eacute;gion: <span><c:out value="${d.region}"  /></span></p>
                            </li>
                            <li>
                                <p class="alcoholPourcent">Degr&eacute; : <span><c:out value="${d.pourcentageAlcool}"  /></span> %</p>
                            </li>
                            <li>
                                <p class="volume">Volume : <span><c:out value="${d.volume}"  /></span> cl</p>
                            </li>
                            <li>
                                <p class="price">Prix : <span><c:out value="${d.prix}"  /></span> &euro;</p>
                            </li>
                        </ul>
                    </div>
                    <div class=" icoCatalogContainer">
                        <div class="pushDiv"></div>
           
                        <!-- Enleve une quantit� du panier -->
                        <img class="icoCatalog userOnly" src="Assets/moins.png" alt="moins suppression panier">
                        <!-- affiche le nombre pr�sent dans le panier -->
                        <input class="icoCatalog userOnly" value="0" style="text-align: center;">  
                        <!-- Ajouter une quantit� au panier -->
                        <img class="icoCatalog userOnly" src="Assets/plus.png" alt="plus ajout panier" > 
                        <!-- <img class="icoCatalog" src="Assets/ajouter-un-panier.png" alt="ajout au panier"> -->
                      	
                      	<c:if test = "${utilisateur.getName() == 'Admin'}">
                      		<a href="<c:url value="/adminFonctionnality">
  								<c:param name="change" value="${d.id}"/>
								</c:url>"><img class="icoCatalog adminOnly" src="Assets/crayon.png" alt="crayon modification">
							</a>
                      		
							
							<a href="<c:url value="/catalogPage">
  								<c:param name="suppr" value="${d.id}"/>
								</c:url>"><img class="icoCatalog adminOnly" src="Assets/croix.png" alt="croix suppression">
							</a>                        
      					</c:if>
                        
                        
                    </div>
                    
                </div>
                
                
                </c:forEach>
                
                
                
                 

        </div>
       
         <%@include file="footer.jsp" %>
    </div><!-- fin de l'axe principal : ordonn&eacutee -->

</body>
</html>
<!-- 
<c:forEach var="d" items="${vins}">
                <tr>
                    <td><c:out value="${d.nom}"  /></td>
                    <td><c:out value="${d.volume}" /></td>
                </tr>
                 </c:forEach>

    La classe mère comporte une classe targetInjection afin de cibler l'innjection de code jsp

    Code à injecter : 
    //----Value   :   signifie la place de l'atribut à ins&eacuterer
    Dans l'ordre : 
        descriptioon
        year
        castle
        region
        alcoholPourcent
        volume
        price
    style="visibility:hidden;" à passer en visible dans le cas de l'administrateur


<div class="mainContentItem horizontalItem primaryAxisflexContent max2itemContainer max2item textLink">
    <h2 class="name mainFullContentItem ">Sauternes Blanc 2019</h2>
    <img class="bottlePicture horizontalItem max2item" src="https://www.vinatis.com/64473-thickbox_default/chateau-haut-brion-2019-1er-cru-classe.png" alt="chateau haut brion boouteille 2019">

    <div class="horizontalItem max2item">
        <p class="description">
            //----Value 
        </p>
        <ul>
            <li>
                <p class="year">Mill&eacutesime : <span>//----Value </span></p>
            </li>
            <li>
                <p class="castle">Château : <span>//----Value </span></p>
            </li>
            <li>
                <p class="region">R&eacutegion : <span>//----Value </span></p>
            </li>
            <li>
                <p class="alcoholPourcent">Degr&eacute : <span>//----Value </span> %</p>
            </li>
            <li>
                <p class="volume">Volume : <span>//----Value </span>cl</p>
            </li>
            <li>
                <p class="price">Prix : <span>//----Value </span> &euro;</p>
            </li>
        </ul>
    </div>
    <div class=" icoCatalogContainer" style="visibility:hidden;>
        <div class="pushDiv"></div>
        <img class="icoCatalog" src="Assets/crayon.png" alt="crayon modification">
        <img class="icoCatalog" src="Assets/croix.png" alt="croix suppression">
    </div>
</div>

 -->