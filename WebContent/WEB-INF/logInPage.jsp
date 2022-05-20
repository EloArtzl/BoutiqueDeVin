<!DOCTYPE jsp>
<jsp lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/flexStyle.css">
    <link rel="stylesheet" href="css/headerStyle.css">
    <link rel="stylesheet" href="css/footerStyle.css">
    <link rel="stylesheet" href="css/logInStyle.css">
    <title>Document</title>
</head>
<body>
    <div class="secondaryAxisFlexContent"><!-- axe principal : ordonn&eacutee -->
         <%@include file="hearder.jsp" %>
    
        <div class="mainContent primaryAxisflexContent ">
            <div class="connectionContainer">
                <div class="introConnect">
                    <h2>Connexion en tant qu'administrateur</h2>
                    <p>Un administrateur a la possibilit&eacute de rajouter, de modifier et de supprimer les produits pr&eacutesents dans le catalogue</p>
                    <p>Pour vous connecter en tant qu'administrateur, veuillez vous r&eacutef&eacuterer à la notice utilisateur</p>
                </div>
                <div class="connectZone">
                    <h3>Veuillez saisir le nom d'utilisateur et le mot de passe</h3>
                    <form action="" id="formLogIn" class="max2itemContainer">
                        <div class="itemInput">
                            <label for=" userName">Nom d'utilisateur : </label>
                            <input name=" userName" id="userName" type="text"><br>
                        </div>
                        <div class="itemInput">
                            <label for=" password">Mot de passe : </label>
                            <input name=" password" id="password" type="text"><br>
                        </div>
                        <input type="button" value="Se connecter">
                    </form>
                </div>
            </div>
            
        </div>
        <%@include file="footer.jsp" %>
    </div><!-- fin de l'axe principal : ordonn&eacutee -->

</body>
</jsp>