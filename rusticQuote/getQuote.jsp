<%-- 
    Document   : getQuote
    Created on : Apr. 17, 2020, 4:22:40 p.m.
    Author     : Conman
    <mylib:PowerSourceHandler/>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/main.css" />
        <title>Get a Quote now!</title>
    </head>
    <body>
        <div id="form1">
            <form action="getQuote.do" method="GET">
                <h2>Size of Door: </h2>
                <hr>
                <b>Height:</b>
                <input type="text" name="doorHeight"  >
                 <b>Width:</b>
                <input type="text" name="doorWidth">
                <br>
                
                <hr>
                
                <b>Door Style: (** is extra)</b>
                <br>      
                <input type="text" name="doorStyle" placeholder="Arrow / Zee / Plain-frame / Gothic / Malibu** / Lover-X / Double-X">           
                <b>Finish type:</b>  
                <br>
                <select id="finishType" name="finishType">
                    
                    <option value="justDistressed">Only Stain + 0$ </option>
                    <option value="justPainted">Painted + 100$ </option>
                    <option value="DnP">Painted & Distressed + 100$ </option>]
              
                </select>
                
               <b> Paint Color:</b>
                <input type="text" name="paintColor" placeholder="Any real color">
                <hr>
                <input type="submit" value="Get total:">
            </form></div>  
    </body>
</html>
