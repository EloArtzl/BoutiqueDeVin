<!DOCTYPE jsp>
<jsp lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="flexStyle.css">
    <link rel="stylesheet" href="headerStyle.css">
    <link rel="stylesheet" href="footerStyle.css">
    <link rel="stylesheet" href="logInStyle.css">
    <title>Document</title>
</head>
<body>
    <div class="secondaryAxisFlexContent"><!-- axe principal : ordonn&eacutee -->
        <div class="header" id="secondTypeHeader">
            <div class="navContainer primaryAxisflexContent"><!-- axe principal : abscisse -->
                <div class="horizontalItem"><a href="index.jsp"><img class="logo" src="Assets/transparentModel.png" alt="logo grappe de raison"></a></div>
                <div class="horizontalItem textLink"><a href="index.jsp" class="whiteFont">Accueil</a></div>
                <div class="horizontalItem textLink"><a href="index.jsp#ourStory"class="whiteFont">Histoire</a></div>
                <div class="horizontalItem textLink"><a href="index.jsp#ourWines" class="whiteFont">Nos vins</a></div>
                <div class="horizontalItem textLink"><a href="catalogPage.jsp" class="whiteFont">Catalogue</a></div>
                <div class="horizontalItem ico"><a href="basketPage.jsp"><img class="icoImg" src="Assets/BASKETwhite.png" alt="panier cadie"></a></div>
                <div class="horizontalItem ico"><a href="logInPage.jsp"><img class="icoImg" src="Assets/ACCOUNTwhite.png" alt="mon compte bonhomme"></a></div>
            </div><!-- fin de l'axe principal : abscisse -->
            <div>
                <h1 id="bigMainTitle">
                    Vins d'exception
                </h1>
            </div>
            
        </div>
    
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
        <div class="footer primaryAxisflexContent ">
            <div class="mainUnderFooter horizontalItem textLink">C'est le footer !!!</div>
            <div class="underFooter horizontalItem ">1</div>
            <div class="underFooter horizontalItem ">2</div>
            <div class="underFooter horizontalItem ">3</div>
            <div class="underFooter horizontalItem ">4</div>
            <div class="underFooter horizontalItem ">5</div>
        </div>
    </div><!-- fin de l'axe principal : ordonn&eacutee -->

</body>
</jsp>