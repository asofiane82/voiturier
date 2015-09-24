<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="fr">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Voiturier | Inscription</title>
    <link href="css/style.css" rel="stylesheet">
    
    
    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/modern-business.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<!-- je suis dans loginjsp -->
<%
String cFailed = null;
String sessionInv = null;
cFailed = (String)request.getAttribute("autFailed");
sessionInv = (String)request.getAttribute("sessionInv");
%>
    
<div id="contain">
<!-- Button trigger modal -->


<!-- Modal -->
  <div class="modal-dialog" role="document">
    <div class="modal-content connect">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Connectez-vous</h4>
      </div>
      <div class="modal-body">
        <form id="frmLogin" name="frmLogin" action="ServletConnexion" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1 col-8">Email <span style="color:red;">*</span></label>
    <input type="email" name="inLogin" class="form-control" id="exampleInputEmail1" placeholder="Email" required>
  </div>
<div class="form-group">
    <label for="exampleInputPassword1">Mot de passe <span style="color:red;">*</span></label>
    <input type="password" name="inPass" class="form-control" id="exampleInputPassword1" placeholder="Mot de passe" required>
  </div>

      </div>
      <div class="modal-footer">
          <a href="inscription.html">Pas encore inscrit ?</a> &nbsp;&nbsp;
          <a href="pwd_recovery.html">Mot de passe oublié ?</a>&nbsp;&nbsp;
        <button type="reset" class="btn btn-default" data-dismiss="modal">Annuler</button> 
        <button type="submit" class="btn btn-primary">Connexion</button>
      </div>
    </div>
  </div>
 
 <%if(cFailed != null)
                  {%>
                	<tr><td bgcolor="red"><%=cFailed%></td></tr>	
                 <% } %>
                  <%if(sessionInv != null)
                  {%>
                	<tr><td bgcolor="red"><%=sessionInv%></td></tr>	
                 <% } %>

<!-- Modal -->
    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Script to Activate the Carousel -->
    <script>
    $('.carousel').carousel({
        interval: 5000 //changes the speed
    })
    </script>
 </form>
</body>

</html>
