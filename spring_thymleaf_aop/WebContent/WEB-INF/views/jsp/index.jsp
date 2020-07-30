<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Droppable - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <style>
  #draggable { width: 100px; height: 100px; padding: 0.5em; float: left; margin: 10px 10px 10px 0; }
  #droppable { width: 150px; height: 150px; padding: 0.5em; float: left; margin: 10px; }
  .input{
  border: 2px solid red;
  width : 700px;
  height: 100px;
  }
  .output{
  border: 2px solid black;
  }
  </style>
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#draggable" ).draggable();
    $( "#droppable" ).droppable({
      drop: function( event, ui ) {
        $( this )
          .addClass( "ui-state-highlight" )
          .find( "p" )
            .html( "Dropped!" );
      }
    });
  } );
  </script>
</head>
<body>
<!--  <div id="droppable" class="ui-widget-header"> -->
<!--   <p>Drop here</p> -->
<!-- </div> -->
 
<!-- <div id="draggable" class="ui-widget-content"> -->
<!--   <p>Drag me to my target</p> -->
<!-- </div> -->
 
 
 <div class="input">
 <form action="input" method="post">
 <input type="text" name="u_id" />
 <input type="text"  name="u_content"/>
 <input type="submit" value="µî·Ï">
 </form>
 </div>
 
 <div class="output">
 <span>dsf</span>
<c:forEach var="e" items="${list }">

<span>${e.u_num }</span>
<span>${e.u_id }</span>
<span>${e.u_pw }</span>
<span>${e.u_content }</span>
<span>${e.u_pluscom }</span>
<br />
</c:forEach>
 </div>

 
</body>
</html>