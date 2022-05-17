<!DOCTYPE jsp>
<jsp lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="flexStyle.css">
    <link rel="stylesheet" href="indexStyle.css">
    <link rel="stylesheet" href="headerStyle.css">
    <link rel="stylesheet" href="footerStyle.css">

    
    <title>Document</title>
</head>
<body>
    <div class="secondaryAxisFlexContent"><!-- axe principal : ordonn&eacutee -->
            <div class="header">
                <div class="navContainer primaryAxisflexContent"><!-- axe principal : abscisse -->
                    <div class="horizontalItem"><a href="index.jsp"><img class="logo" src="Assets/transparentModel.png" alt="logo grappe de raison"></a></div>
                    <div class="horizontalItem textLink"><a href="index.jsp#" class="whiteFont">Accueil</a></div>
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
            
            <div class="mainContent primaryAxisflexContent">

                <div class="mainFullContentItem verticalItem textLink" id="ourStory"><!-- contenu principal -->
                    <h1>Notre histoire</h1>
                    <p>
                        Nous voulons &eacutetablir une relation durable et à long terme avec 
                        nos clients, une relation qui peut être mise à profit pour cr&eacuteer 
                        un avantage concurrentiel et les aider à atteindre leurs objectifs 
                        et à d&eacutevelopper leur entreprise. Nous sommes une entreprise durable
                         et innovante, ce qui signifie que nous ne vendons pas seulement des
                         vins, nous proposons un service premium qui permettra a vous tous de 
                         d&eacutevelopper une passion pour les vins d'exception. 
                    </p>
                    <p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                    <p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                    <p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                    <p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                    <p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>

                </div>
                <!-- Catalogue : pour l'injection du code , inclure les 4 classes ci dessou -->
                
                <div class="mainFullContentItem verticalItem textLink primaryAxisflexContent">
                    <div class="mainFullContentItem verticalItem  textLink" id="ourWines">
                        <h1>Nos vins</h1>
                    </div>
                
                    <div class="mainFullContentItem verticalItem textLink primaryAxisflexContent">
                            <div class=" horizontalItem  ">
                                <img class="mediumSizePicture" src="Assets/vin.png" alt="bouteille de vin">
                                <p>Vins blancs</p>
                            </div>
                            <div class=" horizontalItem  " >
                                <img class="mediumSizePicture" src="Assets/vinTerroir.png" alt="bouteille de vin">
                                <p>Vins rouges</p>
                            </div>
                            <div class=" horizontalItem  ">
                                <img class="mediumSizePicture" src="Assets/champagne.png" alt="bouteille de vin">
                                <p>Champagnes</p>
                            </div>
                        </div>
                        <div class="mainFullContentItem verticalItem bottonFont"><a href="catalogPage.jsp" style="color: black;">Acc&eacuteder au catalogue</a></div>
                    
                </div>
                <!-- Catalogue :  -->
                <!-- 
                <div class="mainContentItem horizontalItem max3item textLink">produit 4</div>
                <div class="mainContentItem horizontalItem max3item textLink">produit 5</div>
                <div class="mainContentItem horizontalItem max3item textLink">produit 6</div>
                <div class="mainContentItem horizontalItem max3item textLink">produit 7</div>
                <div class="mainContentItem horizontalItem max3item textLink">produit 8</div>
                <div class="mainContentItem horizontalItem max3item textLink">produit 9</div> -->

            </div>
            <div class="footer primaryAxisflexContent ">
                <div class="mainUnderFooter horizontalItem textLink">C'est le footer !!!</div>
                <div class="underFooter horizontalItem ">1</div>
                <div class="underFooter horizontalItem ">2</div>
                <div class="underFooter horizontalItem ">3</div>
                <div class="underFooter horizontalItem ">4</div>
                <div class="underFooter horizontalItem ">5</div>
            </div>
</body>
</jsp>