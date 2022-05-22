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
<jsp:useBean id="vins" class="java.util.ArrayList" scope="session"></jsp:useBean>
</head>
<body>
    <div class="secondaryAxisFlexContent"><!-- axe principal : ordonnÃ©e -->
        <%@include file="hearder.jsp" %>
     <div class="mainContentItem verticalItem" style="width:50%">
                    <form method="post" action="catalogPage" >
                    <input class="searchbar " onkeyup="search_animal()" style="width:100%;"
                    type="text" name="nom" placeholder="Chercher un vin par son nom et appuyer sur Entrée">
<!--                     <label for="nom"> Chercher</label> -->
<!--                      <input type="text" name="nom" id="nom"> -->
<!--                     <input type="submit"> -->
                     </form>
                </div>
        <div class="mainContent targetInjection primaryAxisflexContent max2itemContainer">
          
              <c:choose>
                <c:when test="${!vins.isEmpty()}">
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
                                <p class="castle">Château : <span><c:out value="${d.chateau}"  /></span></p>
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
                        <!-- Enleve une quantité du panier -->
                        <img class="icoCatalog userOnly" src="Assets/moins.png" alt="moins suppression panier">
                        <!-- affiche le nombre présent dans le panier -->
                        <input class="icoCatalog userOnly" value="0" style="text-align: center;">  
                        <!-- Ajouter une quantité au panier -->
                        <img class="icoCatalog userOnly" src="Assets/plus.png" alt="plus ajout panier" > 
                        <!-- <img class="icoCatalog" src="Assets/ajouter-un-panier.png" alt="ajout au panier"> -->
                        <img class="icoCatalog adminOnly" src="Assets/crayon.png" alt="crayon modification">
                        <img class="icoCatalog adminOnly" src="Assets/croix.png" alt="croix suppression">
                    </div>
                    
                </div>
                
                
                </c:forEach>
                
                </c:when>
    
    <c:otherwise><div>Nous avons pas ce Vin</div></c:otherwise>
</c:choose>
                
         </div>
          
                
                
        
    </div><!-- fin de l'axe principal : ordonn&eacutee -->
 <%@include file="footer.jsp" %>
</body>
</html>

