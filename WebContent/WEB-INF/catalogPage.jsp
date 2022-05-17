<!DOCTYPE jsp>
<jsp lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="flexStyle.css">
    <link rel="stylesheet" href="headerStyle.css">
    <link rel="stylesheet" href="footerStyle.css">
    <link rel="stylesheet" href="catalogStyle.css">
    <title>Document</title>
</head>
<body>
    <div class="secondaryAxisFlexContent"><!-- axe principal : ordonnée -->
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
    
        <div class="mainContent targetInjection primaryAxisflexContent max2itemContainer">
            <!-- Catalogue :  -->
                <!-- nom, volume, ann&eacutee, chateau, region, prix, PourcentageAlcool, description, url_image -->
                <div class="mainContentItem horizontalItem primaryAxisflexContent max2itemContainer max2item textLink">
                    <h2 class="name mainFullContentItem ">Sauternes Blanc 2019</h2>
                    <img class="bottlePicture horizontalItem " src="https://www.vinatis.com/64473-thickbox_default/chateau-haut-brion-2019-1er-cru-classe.png" alt="chateau haut brion boouteille 2019">
                
                    <div class="horizontalItem presentContent ">
                        <p class="description">
                            Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. 
                        </p>
                        <ul>
                            <li>
                                <p class="year">Mill&eacutesime : <span>2019</span></p>
                            </li>
                            <li>
                                <p class="castle">Château : <span>Mission Haut Brian</span></p>
                            </li>
                            <li>
                                <p class="region">R&eacutegion : <span>P&eacutessac L&eacuteogan</span></p>
                            </li>
                            <li>
                                <p class="alcoholPourcent">Degr&eacute : <span>8</span> %</p>
                            </li>
                            <li>
                                <p class="volume">Volume : <span>75</span>cl</p>
                            </li>
                            <li>
                                <p class="price">Prix : <span>45</span> &euro;</p>
                            </li>
                        </ul>
                    </div>
                    <div class="icoCatalogContainer" style="visibility:hidden;">
                        <div class="pushDiv"></div>
                        <img class="icoCatalog" src="Assets/crayon.png" alt="crayon modification">
                        <img class="icoCatalog" src="Assets/croix.png" alt="croix suppression">
                    </div>
                    
                </div>
                <div class="mainContentItem horizontalItem primaryAxisflexContent max2itemContainer max2item textLink">
                    <h2 class="name mainFullContentItem ">Sauternes Blanc 2019</h2>
                    <img class="bottlePicture horizontalItem " src="https://www.vinatis.com/64473-thickbox_default/chateau-haut-brion-2019-1er-cru-classe.png" alt="chateau haut brion boouteille 2019">
                
                    <div class="horizontalItem presentContent">
                        <p class="description">
                            Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. 
                        </p>
                        <ul>
                            <li>
                                <p class="year">Mill&eacutesime : <span>2019</span></p>
                            </li>
                            <li>
                                <p class="castle">Château : <span>Mission Haut Brian</span></p>
                            </li>
                            <li>
                                <p class="region">R&eacutegion : <span>P&eacutessac L&eacuteogan</span></p>
                            </li>
                            <li>
                                <p class="alcoholPourcent">Degr&eacute : <span>8</span> %</p>
                            </li>
                            <li>
                                <p class="volume">Volume : <span>75</span>cl</p>
                            </li>
                            <li>
                                <p class="price">Prix : <span>45</span> &euro;</p>
                            </li>
                        </ul>
                    </div>
                
                    <div class=" icoCatalogContainer" style="visibility:visible;">
                        <div class="pushDiv"></div>
                        <img class="icoCatalog" src="Assets/crayon.png" alt="crayon modification">
                        <img class="icoCatalog" src="Assets/croix.png" alt="croix suppression">
                    </div>
                </div>
                <div class="mainContentItem horizontalItem primaryAxisflexContent max2itemContainer max2item textLink">
                    <h2 class="name mainFullContentItem ">Sauternes Blanc 2019</h2>
                    <img class="bottlePicture horizontalItem " src="https://www.vinatis.com/64473-thickbox_default/chateau-haut-brion-2019-1er-cru-classe.png" alt="chateau haut brion boouteille 2019">
                
                    <div class="horizontalItem presentContent">
                        <p class="description">
                            Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. 
                        </p>
                        <ul>
                            <li>
                                <p class="year">Mill&eacutesime : <span>2019</span></p>
                            </li>
                            <li>
                                <p class="castle">Château : <span>Mission Haut Brian</span></p>
                            </li>
                            <li>
                                <p class="region">R&eacutegion : <span>P&eacutessac L&eacuteogan</span></p>
                            </li>
                            <li>
                                <p class="alcoholPourcent">Degr&eacute : <span>8</span> %</p>
                            </li>
                            <li>
                                <p class="volume">Volume : <span>75</span>cl</p>
                            </li>
                            <li>
                                <p class="price">Prix : <span>45</span> &euro;</p>
                            </li>
                        </ul>
                    </div>
                    <div class=" icoCatalogContainer" style="visibility:visible;">
                        <div class="pushDiv"></div>
                        <img class="icoCatalog" src="Assets/crayon.png" alt="crayon modification">
                        <img class="icoCatalog" src="Assets/croix.png" alt="croix suppression">
                    </div>
                </div>
                <div class="mainContentItem horizontalItem primaryAxisflexContent max2itemContainer max2item textLink">
                    <h2 class="name mainFullContentItem ">Sauternes Blanc 2019</h2>
                    <img class="bottlePicture horizontalItem " src="https://www.vinatis.com/64473-thickbox_default/chateau-haut-brion-2019-1er-cru-classe.png" alt="chateau haut brion boouteille 2019">
                
                    <div class="horizontalItem presentContent">
                        <p class="description">
                            Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. 
                        </p>
                        <ul>
                            <li>
                                <p class="year">Mill&eacutesime : <span>2019</span></p>
                            </li>
                            <li>
                                <p class="castle">Château : <span>Mission Haut Brian</span></p>
                            </li>
                            <li>
                                <p class="region">R&eacutegion : <span>P&eacutessac L&eacuteogan</span></p>
                            </li>
                            <li>
                                <p class="alcoholPourcent">Degr&eacute : <span>8</span> %</p>
                            </li>
                            <li>
                                <p class="volume">Volume : <span>75</span>cl</p>
                            </li>
                            <li>
                                <p class="price">Prix : <span>45</span> &euro;</p>
                            </li>
                        </ul>
                    </div>
                    <div class=" icoCatalogContainer" style="visibility:visible;">
                        <div class="pushDiv"></div>
                        <img class="icoCatalog" src="Assets/crayon.png" alt="crayon modification">
                        <img class="icoCatalog" src="Assets/croix.png" alt="croix suppression">
                    </div>
                </div>
                <div class="mainContentItem horizontalItem primaryAxisflexContent max2itemContainer max2item textLink">
                    <h2 class="name mainFullContentItem ">Sauternes Blanc 2019</h2>
                    <img class="bottlePicture horizontalItem " src="https://www.vinatis.com/64473-thickbox_default/chateau-haut-brion-2019-1er-cru-classe.png" alt="chateau haut brion boouteille 2019">
                
                    <div class="horizontalItem presentContent">
                        <p class="description">
                            Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. 
                        </p>
                        <ul>
                            <li>
                                <p class="year">Mill&eacutesime : <span>2019</span></p>
                            </li>
                            <li>
                                <p class="castle">Château : <span>Mission Haut Brian</span></p>
                            </li>
                            <li>
                                <p class="region">R&eacutegion : <span>P&eacutessac L&eacuteogan</span></p>
                            </li>
                            <li>
                                <p class="alcoholPourcent">Degr&eacute : <span>8</span> %</p>
                            </li>
                            <li>
                                <p class="volume">Volume : <span>75</span>cl</p>
                            </li>
                            <li>
                                <p class="price">Prix : <span>45</span> &euro;</p>
                            </li>
                        </ul>
                    </div>
                    <div class=" icoCatalogContainer" style="visibility:visible;">
                        <div class="pushDiv"></div>
                        <img class="icoCatalog" src="Assets/crayon.png" alt="crayon modification">
                        <img class="icoCatalog" src="Assets/croix.png" alt="croix suppression">
                    </div>
                </div>
                <div class="mainContentItem horizontalItem primaryAxisflexContent max2itemContainer max2item textLink">
                    <h2 class="name mainFullContentItem ">Sauternes Blanc 2019</h2>
                    <img class="bottlePicture horizontalItem " src="https://www.vinatis.com/64473-thickbox_default/chateau-haut-brion-2019-1er-cru-classe.png" alt="chateau haut brion boouteille 2019">
                
                    <div class="horizontalItem presentContent">
                        <p class="description">
                            Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. 
                        </p>
                        <ul>
                            <li>
                                <p class="year">Mill&eacutesime : <span>2019</span></p>
                            </li>
                            <li>
                                <p class="castle">Château : <span>Mission Haut Brian</span></p>
                            </li>
                            <li>
                                <p class="region">R&eacutegion : <span>P&eacutessac L&eacuteogan</span></p>
                            </li>
                            <li>
                                <p class="alcoholPourcent">Degr&eacute : <span>8</span> %</p>
                            </li>
                            <li>
                                <p class="volume">Volume : <span>75</span>cl</p>
                            </li>
                            <li>
                                <p class="price">Prix : <span>45</span> &euro;</p>
                            </li>
                        </ul>
                    </div>
                    <div class=" icoCatalogContainer" style="visibility:visible;">
                        <div class="pushDiv"></div>
                        <img class="icoCatalog" src="Assets/crayon.png" alt="crayon modification">
                        <img class="icoCatalog" src="Assets/croix.png" alt="croix suppression">
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
<!-- 

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