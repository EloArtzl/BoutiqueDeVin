
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/flexStyle.css">
    <link rel="stylesheet" href="css/footerStyle.css">
    <link rel="stylesheet" href="css/headerStyle.css">
    <link rel="stylesheet" href="css/logInStyle.css">
    <title>Admin </title>
</head>
<body>
<div class="secondaryAxisFlexContent"><!-- axe principal : ordonn&eacutee -->
        <%@include file="hearder.jsp" %>
        
    
        <div class="mainContent primaryAxisflexContent max3itemContainer">
            <div class="max2itemContainer">
                <div class="horizontalItem max2item">
                    <div class="verticalItem">
                        <h3>Vous etes connect� en tant qu'administrateur</h3>
                    </div>
                    <div class="verticalItem">
                        <p>Vous pouvez d�sormais ajouter des vins au catalogue depuis le formulaire ci dessous, ou modifier et supprimer des produits existants <a href="catalogPage.html">depuis le catalogue</a></p>
                    </div>
                    <div>
                        <h3>Se d�connecter</h3>
                        <input id="logOutButton" value="D&eacute;connexion" type="button"></input>
                    </div>
                </div>
                <div class="horizontalItem max2item">
                    <h3 class="caseAdd">Ajouter un vin au catalogue</h3>
                    <h3 class="caseChange">Modifier un vin</h3>

                    <form action="" id="addProduct" class="max2itemContainer">
                        <div class="horizontalItem max2item secondaryAxisFlexContent">
                            <div class="itemInput ">
                                <!-- <label for="nameInput">Nom : </label> -->
                                <input name="nameInput" class="verticalItem"  id="nameInput" type="text" placeholder="Nom"><br>
                            </div>
                            <div class="itemInput ">
                                <!-- <label for="yearInput">Mill&eacute;sime : </label> -->
                                <input name="yearInput" class="verticalItem"  id="yearInput" type="text" placeholder="Mill&eacute;sime"><br>
                            </div>
                            <div class="itemInput ">
                                <!-- <label for="castleInput">Chateau : </label> -->
                                <input name="castleInput" class="verticalItem"  id="castleInput" type="text" placeholder="Chateau"><br>
                            </div>
                            <div class="itemInput ">
                                <!-- <label for="regionInput">R&eacute;gion : </label> -->
                                <input name="regionInput" class="verticalItem"  id="regionInput" type="text" placeholder="R&eacute;gion"><br>
                            </div>
                        </div>
                        <div class="horizontalItem max2item secondaryAxisFlexContent">
                            <div class="itemInput ">
                                <!-- <label for="degreeInput">Degr&eacute; : </label> -->
                                <input name="degreeInput" class="verticalItem"  id="degreeInput" type="text" placeholder="Degr&eacute;"><br>
                            </div>
                            <div class="itemInput ">
                                <!-- <label for="volumeInput">Volume : </label> -->
                                <input name="volumeInput" class="verticalItem"  id="volumeInput" type="text" placeholder="Volume"><br>
                            </div>
                            <div class="itemInput ">
                                <!-- <label for="priceInput">Prix : </label> -->
                                <input name="priceInput" class="verticalItem"  id="priceInput" type="text" placeholder="Prix"><br>
                            </div>
                            <div class="itemInput ">
                                <!-- <label for="urlInput">Url de l'image : </label> -->
                                <input name="urlInput" class="verticalItem" id="urlInput" type="text" placeholder="Url de l'image"><br>
                            </div>
                        </div>
                        <div class="itemInput verticalItem">
                            <!-- <label for="descriptionInput">Description : </label> -->
                            <textarea class="inputArea verticalItem" name="descriptionInput" id="descriptionInput" placeholder="Description" cols="18" rows="10"></textarea>
                        </div>
                        <div id="connectButton" class="verticalItem" >
                            <input class="caseAdd" type="button" value="Ajouter">
                            <input class="caseChange" type="button" value="Modifier">

                        </div>
                    </form>
                </div>
            </div>
        </div>
         <%@include file="footer.jsp" %>

    </div><!-- fin de l'axe principal : ordonn&eacutee -->
    <script>
        document.getElementById("logOutButton").addEventListener('click',function () {
            sessionStorage.removeItem('log');
            document.location.href="logInPage.html"
        });
    </script>
</body>
</html>