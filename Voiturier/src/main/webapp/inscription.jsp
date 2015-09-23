<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="fr">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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

    <div id="containr">
        <!-- Button trigger modal -->
        <div class="modal-dialog perso" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h3 class="modal-title" id="myModalLabel1">Inscription</h3>
                    <h5 class="modal-title" id="myModalLabel">Merci d'indiquer votre statut</h5>
                </div>
                <div class="modal-body">
                    <button type="button" class="btn btn-primary btn-lg selection" data-toggle="modal" data-target="#myModal">
                        Particulier
                    </button>
                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal2">
                        Etablissement
                    </button>
                </div>
                <div class="modal-footer">
                    <br/>
                </div>

            </div>
        </div>

        <!-- Modal -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content content1">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Inscription particulier</h4>
                    </div>
                    <div class="modal-body">
                        <form action="servletUtilisateur" name="inscriptionUtilisateur">
                            <div class="form-group">
                                <label for="nom col-8">Nom <span style="color:red;">*</span></label>
                                <input type="text" class="form-control" id="nom" name="nom" placeholder="Nom" required>
                            </div>
                            <div class="form-group">
                                <label for="prenom col-8">Prénom <span style="color:red;">*</span></label>
                                <input type="text" class="form-control" id="prenom" name="prenom" placeholder="Prénom" required>
                            </div>
                            <div class="form-group">
                                <label for="email col-8">Email <span style="color:red;">*</span></label>
                                <input type="email" class="form-control" id="emailUtilisateur" name="emailUtilisateur" placeholder="Email" required>
                            </div>
                            <div class="form-group">
                                <label for="mdp">Mot de passe<span style="color:red;">*</span></label>
                                <input type="password" class="form-control" id="mdpUtilisateur" name="mdpUtilisateur" placeholder="Mot de passe" required>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Annuler</button>
                        <button type="button" class="btn btn-primary" onclick="javascript:document.forms['inscriptionUtilisateur'].submit();">Inscription</button>
                    </div>
                </div>
            </div>
        </div>




        <!-- Modal Etablissement -->
        <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content content2">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Inscription établissement</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" action="servletEtablissement" name="inscriptionEtablissement">
                            <div class="form-group">
                                <label for="exampleInputName col-8">Raison sociale <span style="color:red;">*</span></label>
                                <input type="text" class="form-control" id="exampleInputName" name="raisonSociale" placeholder="Raison sociale" required>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputName col-8" class="control-label">Type d'établissement <span style="color:red;">*</span></label>
                                <select class="form-control" name="typeEtablissement">
                                    <option>Sélectionnez votre type d'établissement</option>
                                    <option value="hotel">Hotel</option>
                                    <option value="restaurant">Restaurant</option>
                                    <option value="salonDeCoiffure">Salon de coiffure</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPrenom col-8" class="control-label">No SIRET <span style="color:red;">*</span></label>
                                <input type="text" class="form-control" id="siret" name="siret" placeholder="Siret">
                            </div>
                            <!-- xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx -->
                            <div class="form-group">
                                <label for="Addresse col-8">Adresse</label>
                                <input type="text" class="form-control" id="adresse" name="adresse" placeholder="Adresse" /> <br>
                               <input type="text" class="form-control" id="cp" name="codePostal" placeholder="Code postal"> <br>
                               <input type="text" class="form-control" id="ville" name="ville" placeholder="Ville"> <br>
                               </div>
                        

                            <div class="form-group">
                                <label for="nom col-8" class="control-label">Nom du contact</label>
                                <input type="text" class="form-control" id="nomContact" name="nomContact" placeholder="Nom du contact">
                            </div>
                            
                            <div class="form-group">
                                <label for="fonction col-8">Fonction</label>
                                <input type="text" class="form-control" id="fonction" name="fonction" placeholder="Fonction">
                            </div>
                            <div class="form-group">
                                <label for="email col-8">Email <span style="color:red;">*</span></label>
                                <input type="email" class="form-control" id="emailEtablissement" name="emailEtablissement" placeholder="Email" required>
                            </div>
                            <div class="form-group">
                                <label for="mdp">Mot de passe <span style="color:red;">*</span></label>
                                <input type="password" class="form-control" id="mdpEtablissement" name="mdpEtablissement" placeholder="Mot de passe" required>
                            </div>
                        </form>
                    
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Annuler</button>
                        <button type="button" class="btn btn-primary" onclick="javascript:document.forms['inscriptionEtablissement'].submit();">Inscription</button>
                    </div>
                </div>
            </div>
        </div>
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
    <!-- totot -->

</body>

</html>