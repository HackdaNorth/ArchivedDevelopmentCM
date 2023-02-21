<%-- 
    Document   : displayQuote
    Created on : Apr. 17, 2020, 4:43:18 p.m.
    Author     : Conman
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/main.css" />
        <title>Quote Total: </title>
    </head>
    <body>
    <c:if test="${!empty Error}">
        ${Error}
    </c:if>
    <div class="smartFlex">
        <div id="info">
            <p><h3><b> Please note! <br><br>Thank you for your interest.  This estimate is conditional, and set for review. <br>
                    One of our staff will contact you within 24 HRS after reviewing to confirm and advise on deposit information. <br> 
                    Please use the email located at the bottom of this page. </b></h3></p>
            <hr>
    </div>
        <div id="doorEst">
            <br>
            <h1>Door Estimate</h1>

            <h3>Door Size:</h3>
            <b>Height of Door:</b> ${door.doorHeight}"    Inches
            <br><b>Width of Door:</b> ${door.doorWidth}"  Inches
            <br><b>Door Height x Door Width</b> = ${evalString} Inches

            <br><br><h3>Door Options:</h3>
            <b>Door Style:</b>  ${door.doorStyle} 
            <br><b>Finish Type:</b>  ${door.doorFinishes}
            <br><b>Door Paint Blue:</b> ${door.doorColor}
            <br><br><b>Door Base Price:</b> ${door.doorTotal} 
            <br><b>Additional Features Cost:</b> ${door.upcharg} 
            <br><b>Order Total:</b> ${added} $CAD
            <br><b>Other:</b> ${door.doorDesc} +      
            <br><br>
            <hr>
        </div>

        <div id="emailFinal">
            <h2>Looking to <b>finalize</b> this order?</h2>
            <h4>Email us this information to orders@rusticattic.co</h4> </p>
            <button onclick="window.location.href = 'index.html'"><< Back Home <<</button>
        </div>
    </div>

</body>
</html>
