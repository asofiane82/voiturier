CREATE DATABASE  IF NOT EXISTS `voiturier` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `voiturier`;
-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: voiturier
-- ------------------------------------------------------
-- Server version   5.6.24-log
 
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
 
--
-- Table structure for table `etablissement`
--
 
DROP TABLE IF EXISTS `etablissement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etablissement` (
  `idEtablissement` int(11) NOT NULL AUTO_INCREMENT,
  `raisonSocial` varchar(45) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `numerotelephone` varchar(45) DEFAULT NULL,
  `siteweb` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `fonction` varchar(45) DEFAULT NULL,
  `motdepasse` varchar(45) NOT NULL,
  `adresse` varchar(45) DEFAULT NULL,
  `code_postal` varchar(45) DEFAULT NULL,
  `ville` varchar(45) DEFAULT NULL,
  `Siret` varchar(45) DEFAULT NULL,
  `Service_idService` int(11) NOT NULL,
  PRIMARY KEY (`idEtablissement`),
  KEY `fk_Etablissement_Service1_idx` (`Service_idService`),
  CONSTRAINT `fk_Etablissement_Service1` FOREIGN KEY (`Service_idService`) REFERENCES `service` (`idService`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
 
--
-- Dumping data for table `etablissement`
--
 
LOCK TABLES `etablissement` WRITE;
/*!40000 ALTER TABLE `etablissement` DISABLE KEYS */;
INSERT INTO `etablissement` VALUES (1,'Le Ritz','Hotel ','01 00 00 00 00','www.ritzhotel.fr',' Dupont','contact@ritzhotel.fr','conciérge','dupont ','2 Rue du 8 mai 1945','94410 ','Arcueil','1234567890123',1),(2,'Le Kong ','Restaurant','01 00 00 00 00','www.kong.fr','torchon','contact@kong.fr','gérant ',' laurent  ','12 Rue paul signac','94410','Arcueil','1234567890123',1),(3,'Jacques Dessange','Salon de coiffure ','01 00 00 00 00','www.dessange.fr','arnaud','contact@dessange.fr','gérant','amelie','8 rue paul bert','94410',' Arcueil','1234567890123',3),(4,'Yves coiffure','Salon de coiffure','01 00 00 00 00','www.yvescoiffure.fr','Gerard','contact@yvescoiffures.fr','gérant','yves','38 Rue de la gare','94230',' Cachan','1234567890123',4),(5,'Le florentin','Hotel','01 00 00 00 00','www.leflorentin.fr','boutrid','contact@leflorentin.fr','maitre d’hotel ','kassa','30 avenue de carnot','94230','Cachan','1234567890123 ',3),(6,'Le Baudelaire','estaurant','01 00 00 00 00 ','www.baudelaire.fr','fauchon','contact@baudelaire.fr','gérant ','thomas',' 1 Rue du docteur gosselin','94230 ','Cachan','1234567890123',2);
/*!40000 ALTER TABLE `etablissement` ENABLE KEYS */;
UNLOCK TABLES;
 
--
-- Table structure for table `jour`
--
 
DROP TABLE IF EXISTS `jour`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jour` (
  `idJour` int(11) NOT NULL AUTO_INCREMENT,
  `Nomjour` varchar(45) NOT NULL,
  PRIMARY KEY (`idJour`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
 
--
-- Dumping data for table `jour`
--
 
LOCK TABLES `jour` WRITE;
/*!40000 ALTER TABLE `jour` DISABLE KEYS */;
INSERT INTO `jour` VALUES (1,'Lundi'),(2,'Mardi'),(3,'Mercredi'),(4,'Jeudi'),(5,'Vendredi'),(6,'Samedi'),(7,'Dimanche');
/*!40000 ALTER TABLE `jour` ENABLE KEYS */;
UNLOCK TABLES;
 
--
-- Table structure for table `service`
--
 
DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service` (
  `idService` int(11) NOT NULL AUTO_INCREMENT,
  `heuredebut` time DEFAULT NULL,
  `heurefin` time DEFAULT NULL,
  `Numeroservice` int(11) NOT NULL,
  PRIMARY KEY (`idService`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
 
--
-- Dumping data for table `service`
--
 
LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES (1,'08:00:00','18:00:00',1),(2,'09:30:00','17:30:00',2),(3,'10:00:00','19:00:00',3),(4,'07:00:00','16:00:00',4),(5,'09:30:00','17:30:00',5);
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;
 
--
-- Table structure for table `service_has_jour`
--
 
DROP TABLE IF EXISTS `service_has_jour`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service_has_jour` (
  `Service_idService` int(11) NOT NULL,
  `Jour_idJour` int(11) NOT NULL,
  PRIMARY KEY (`Service_idService`,`Jour_idJour`),
  KEY `fk_Service_has_Jour_Jour1_idx` (`Jour_idJour`),
  KEY `fk_Service_has_Jour_Service1_idx` (`Service_idService`),
  CONSTRAINT `fk_Service_has_Jour_Jour1` FOREIGN KEY (`Jour_idJour`) REFERENCES `jour` (`idJour`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Service_has_Jour_Service1` FOREIGN KEY (`Service_idService`) REFERENCES `service` (`idService`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
 
--
-- Dumping data for table `service_has_jour`
--
 
LOCK TABLES `service_has_jour` WRITE;
/*!40000 ALTER TABLE `service_has_jour` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_has_jour` ENABLE KEYS */;
UNLOCK TABLES;
 
--
-- Table structure for table `utilisateur`
--
 
DROP TABLE IF EXISTS `utilisateur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `utilisateur` (
  `idUtilisateur` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(45) NOT NULL,
  `Prenom` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Statut` tinyint(1) NOT NULL,
  `Motdepasse` varchar(45) NOT NULL,
  PRIMARY KEY (`idUtilisateur`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
 
--
-- Dumping data for table `utilisateur`
--
 
LOCK TABLES `utilisateur` WRITE;
/*!40000 ALTER TABLE `utilisateur` DISABLE KEYS */;
INSERT INTO `utilisateur` VALUES (1,'GOGO','Jean','jean@gmail.com',0,'gogo'),(2,'COCO','Alain','alain@gmail.com',1,'coco'),(3,'YANKA','Aline','aline@hotmail.fr',0,'yanka'),(4,'KOKO','Didier','didier@gmail.com',1,'koko'),(5,'AGBO','Diane','diane@gmail.com',0,'agbo');
/*!40000 ALTER TABLE `utilisateur` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
 
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
 
-- Dump completed on 2015-09-22 14:59:08