<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="fr">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Voiturier | MotDePasseOublier</title>
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
    
<div id="contain">
<!-- Button trigger modal -->


<!-- Modal -->
  <div class="modal-dialog" role="document">
    <div class="modal-content connect">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Mot de passe oublié</h4>
      </div>
      <div class="modal-body">
        <form id="frmMdpo" name="frmMdpo" action="ServletMdpo" method="get">
  <div class="form-group">
    <label for="exampleInputEmail1 col-8">Merci d'indiquer votre email <span style="color:red;">*</span></label>
    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email" required>
  </div>
 
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary">Envoyer</button>
      </div>
    </div>
  </div>
 


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
