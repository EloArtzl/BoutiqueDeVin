<!DOCTYPE jsp>
<jsp lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/flexStyle.css">
    <link rel="stylesheet" href="css/headerStyle.css">
    <link rel="stylesheet" href="css/footerStyle.css">
    <link rel="stylesheet" href="css/basketStyle.css">
    <title>Document</title>
</head>
<body>
    <div class="secondaryAxisFlexContent"><!-- axe principal : ordonnÃ©e -->
        <%@include file="hearder.jsp" %>
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
                        <!-- 
                            <tr>
                                <td class="name"><span></span></td>
                                <td class="quantity"><span></span></td>
                                <td class="price"><span></span> &euro;</td>
                                <td class="priceXquanntity"><span></span> &euro;</td>
                            </tr>
                         -->
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
        <%@include file="footer.jsp" %>
    </div><!-- fin de l'axe principal : ordonn&eacutee -->

</body>
</jsp>