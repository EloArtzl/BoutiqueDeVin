<!DOCTYPE jsp>
<jsp lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="flexStyle.css">
    <link rel="stylesheet" href="headerStyle.css">
    <link rel="stylesheet" href="footerStyle.css">
    <link rel="stylesheet" href="basketStyle.css">
    <title>Document</title>
</head>
<body>
    <div class="secondaryAxisFlexContent"><!-- axe principal : ordonnée -->
        <div class="header" id="secondTypeHeader">
            <div class="navContainer primaryAxisflexContent"><!-- axe principal : abscisse -->
                <div class="horizontalItem"><a href="index.jsp"><img class="logo" src="Assets/transparentModel.png" alt="logo grappe de raison"></a></div>
                <div class="horizontalItem textLink"><a href="index.jsp" class="whiteFont">Accueil</a></div>
                <div class="horizontalItem textLink"><a href="#ourStory"class="whiteFont">Histoire</a></div>
                <div class="horizontalItem textLink"><a href="#ourWines" class="whiteFont">Nos vins</a></div>
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
    
        <div class="mainContent primaryAxisflexContent max3itemContainer">
            <div class="">
                <div class="verticalItem">
                    <h1>Panier</h1>
                </div>
                <div class="verticalItem">
                    <table class="targetInjection"> 
                        <!-- pour l'injectionn viser l'intérieur du span comme poour le catalogue -->
                        <tr>
                            <th>D&eacutesignation</th>
                            <th>Quantit&eacute</th>
                            <th>Prix unitaire</th>
                            <th>Prix total</th>
                        </tr>
                        <tr>
                            <td class="name"><span>produit1</span></td>
                            <td class="quantity"><span>3</span></td>
                            <td class="price"><span>30</span> &euro;</td>
                            <td class="priceXquanntity"><span>90</span> &euro;</td>
                        </tr>
                        <tr>
                            <th>Total</th>
                            <th></th>
                            <th></th>
                            <th><span>90</span> &euro;</th>
                        </tr>
                    </table>
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