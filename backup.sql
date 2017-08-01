-- MySQL dump 10.13  Distrib 5.5.27, for Win32 (x86)
--
-- Host: localhost    Database: junno
-- ------------------------------------------------------
-- Server version	5.5.27

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
-- Table structure for table `designation`
--

DROP TABLE IF EXISTS `designation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `designation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=286 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `designation`
--

LOCK TABLES `designation` WRITE;
/*!40000 ALTER TABLE `designation` DISABLE KEYS */;
INSERT INTO `designation` VALUES (101,'Teacher'),(102,'Technical Officer'),(152,'Principal'),(153,'Hardware Owner'),(158,'Cooker @ Hotel'),(159,'No Job'),(163,'Retired'),(170,'Self Employee'),(171,'Live in Separate'),(176,'Meson'),(177,'Tea Plucker'),(189,'Studio Owner'),(192,'Contract'),(200,'Management Assistant - DS Office'),(205,'Confidential Secretary'),(206,'Engine Driver'),(210,'Engineer'),(215,'Electrician'),(219,'@ Idam Comasaris Department'),(223,'@ Telecom'),(230,'Business'),(252,'Auditor'),(258,'Assistant Manager'),(268,'Vice Principal'),(276,'@ AG Office'),(280,'Doctor'),(285,'Kammal Wada');
/*!40000 ALTER TABLE `designation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parent`
--

DROP TABLE IF EXISTS `parent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `f_m` varchar(45) DEFAULT NULL,
  `Designation_id` int(11) NOT NULL,
  `Student_rank` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Parent_Designation1_idx` (`Designation_id`),
  KEY `fk_Parent_Student1_idx` (`Student_rank`),
  CONSTRAINT `fk_Parent_Designation1` FOREIGN KEY (`Designation_id`) REFERENCES `designation` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Parent_Student1` FOREIGN KEY (`Student_rank`) REFERENCES `student` (`rank`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=288 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parent`
--

LOCK TABLES `parent` WRITE;
/*!40000 ALTER TABLE `parent` DISABLE KEYS */;
INSERT INTO `parent` VALUES (103,'Mother',101,66),(104,'Father',102,66),(154,'Mother',152,67),(155,'Father',153,67),(160,'Mother',158,68),(161,'Father',159,68),(164,'Mother',101,69),(165,'Father',163,69),(166,'Mother',101,70),(167,'Father',102,70),(172,'Mother',170,71),(173,'Father',171,71),(178,'Mother',177,73),(179,'Father',176,73),(183,'Mother',159,74),(190,'Mother',189,75),(193,'Mother',101,76),(194,'Father',192,76),(197,'Mother',101,77),(198,'Father',192,77),(203,'Mother',200,78),(204,'Father',102,78),(207,'Mother',205,79),(208,'Father',206,79),(211,'Mother',210,82),(212,'Father',210,82),(216,'Mother',159,83),(217,'Father',215,83),(220,'Mother',219,84),(221,'Father',163,84),(224,'Mother',101,87),(225,'Father',223,87),(228,'Mother',101,88),(229,'Father',101,88),(231,'Mother',159,89),(232,'Father',230,89),(253,'Mother',159,60),(254,'Father',252,60),(256,'Mother',159,61),(257,'Father',230,61),(259,'Mother',159,62),(260,'Father',258,62),(263,'Mother',159,63),(264,'Father',230,63),(269,'Mother',159,64),(270,'Father',268,64),(274,'Mother',159,65),(275,'Father',163,65),(277,'Mother',276,92),(278,'Father',192,92),(281,'Mother',101,93),(282,'Father',280,93),(286,'Mother',159,86),(287,'Father',285,86);
/*!40000 ALTER TABLE `parent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `school`
--

DROP TABLE IF EXISTS `school`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `school` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=268 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `school`
--

LOCK TABLES `school` WRITE;
/*!40000 ALTER TABLE `school` DISABLE KEYS */;
INSERT INTO `school` VALUES (1,'St. Thomas\' College'),(51,'Rahula College'),(151,'Sujatha College'),(157,'Matara Central College'),(169,'Siddhartha Boys\' College'),(175,'Thelijjawila Central College'),(251,'St. Thomas\' Girls High School'),(267,'Arafa National College');
/*!40000 ALTER TABLE `school` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sequence`
--

DROP TABLE IF EXISTS `sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sequence` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sequence`
--

LOCK TABLES `sequence` WRITE;
/*!40000 ALTER TABLE `sequence` DISABLE KEYS */;
INSERT INTO `sequence` VALUES ('SEQ_GEN',350);
/*!40000 ALTER TABLE `sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sibiline`
--

DROP TABLE IF EXISTS `sibiline`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sibiline` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `work` varchar(45) DEFAULT NULL,
  `SibilineType_id` int(11) NOT NULL,
  `Student_rank` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Sibiline_SibilineType1_idx` (`SibilineType_id`),
  KEY `fk_Sibiline_Student1_idx` (`Student_rank`),
  CONSTRAINT `fk_Sibiline_SibilineType1` FOREIGN KEY (`SibilineType_id`) REFERENCES `sibilinetype` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Sibiline_Student1` FOREIGN KEY (`Student_rank`) REFERENCES `student` (`rank`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=289 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sibiline`
--

LOCK TABLES `sibiline` WRITE;
/*!40000 ALTER TABLE `sibiline` DISABLE KEYS */;
INSERT INTO `sibiline` VALUES (105,'2016 A/L',4,66),(156,'2016 A/L',4,67),(162,'Study @ School',4,68),(168,'A/L',4,70),(174,'2016 A/L',3,71),(180,'Studying',4,73),(181,'Studying',4,73),(182,'Studying',4,73),(184,'Pita Rata',1,74),(185,'Pita Rata',1,74),(186,'Manager',1,74),(187,'Accountant',1,74),(188,'Teacher',2,74),(191,'Campus',2,75),(195,'Faculty of Engineer, Moratuwa 2012 AL',1,76),(196,'2017 A/L',3,76),(199,'2016 A/L',3,77),(209,'2017 A/L',4,79),(213,'???',4,82),(214,'???',4,82),(218,'Studying',4,83),(222,'Moratuwa Campus',1,84),(226,'Studying',3,87),(227,'Studying',4,87),(233,'Medicine @ Colombo Campus',2,89),(255,'Studying',3,60),(261,'Ruhuna Campus',2,62),(262,'2015 A/L',4,62),(265,'HNDE',2,63),(266,'Campus',4,63),(271,'???',2,64),(272,'???',2,64),(273,'2016 A/L',3,64),(279,'A/L',4,92),(283,'Studying',4,93),(284,'2017 A/L',4,93),(288,'2017 A/L',4,86);
/*!40000 ALTER TABLE `sibiline` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sibilinetype`
--

DROP TABLE IF EXISTS `sibilinetype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sibilinetype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sibilinetype`
--

LOCK TABLES `sibilinetype` WRITE;
/*!40000 ALTER TABLE `sibilinetype` DISABLE KEYS */;
INSERT INTO `sibilinetype` VALUES (1,'Elder Brother'),(2,'Elder Sister'),(3,'Younger Brother'),(4,'Younger Sister');
/*!40000 ALTER TABLE `sibilinetype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `rank` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `shy` int(11) DEFAULT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `School_id` int(11) NOT NULL,
  PRIMARY KEY (`rank`),
  KEY `fk_Student_School_idx` (`School_id`),
  CONSTRAINT `fk_Student_School` FOREIGN KEY (`School_id`) REFERENCES `school` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (60,'Jayanga Nishadi','No 134, \'Weda Niwasa\', Nugegoda, Devinuwara',1,'071-9948372',251),(61,'Thilina Nupahewa','20/5A. Sarammudhali Mawatha, Mahanamapura, Matara',1,'071-1559958',51),(62,'Narmada Liyanagamage','\'Gayashani\', Iriyakondahena, Uda Aparakka, Matara',1,'077-0235384',151),(63,'Shashika Dilshan','\'Siriniwasa\', Deeyagaha, Matara',1,'071-2358579',1),(64,'Mohamed Zaafir','No 59/3, Badhuwatta Rd, Welipitiya, Weligama',1,'071-2358579',267),(65,'Shehan Lalitha','???',1,'071-1318702',51),(66,'Chathura Jayashan','Lorance watta, Ridiyagama road, Ambalantota',1,'071-6505933',51),(67,'Thilini Wathsala','\'Wathsala\', Eramudugoda, Maliduwa, Akuressa',1,'077-5869721',151),(68,'Upul Rangana','???',1,'071-0529652',157),(69,'Hasinthaka Eranga','\'Isuru\', Kirinda rd, Kamburupitiya',1,'077-9881310',51),(70,'Pasinda Bimsara','\'Senehase\', Welegoda, Matara',1,'071-3331667',51),(71,'Yasas Gunasekara','No. 25, Agrabodhi Rd, Weligama',1,'077-9300215',169),(73,'Prince Maduranga','Prince, Ellewela, Maramba, Akuressa',1,'077-7365937',175),(74,'Pasitha Liyanage','Bo Sevana, Naimbala, Thihagoda',1,'071-9896463',51),(75,'Thisaru Sandulika','???',1,'071-3666707',1),(76,'Randil Sumuditha Rathnayake','No 140/45A, \'Ruhunusiri Garden\', Hakmana Rd, Matara',1,'071-4772001',51),(77,'Buwaneka Abeywickrama','No 14, Ruwani Uyana, Hiththatiya West, Matara',1,'071-1463587',51),(78,'Kasuntha Madumal','???',1,'071-9333193',51),(79,'Maleesha Kaluthota','???',1,'071-0642400',151),(82,'Dilum Eshan','2nd Lane, Jayanthi Rd, Kahanthota, Malabe',1,'071-2496098',51),(83,'Vishwa Nawod Vikasitha','\'Vikasitha\', Dunkoratuwa, Bandaththara, Thihagoda',1,'071-1920536',1),(84,'Pasindu Menuka','423/1, Galle Rd, Pamburana, Matara',1,'071-4206423',51),(86,'Lahiru Hasaranga','\'Sandakalum\', Devendrage Hena, Yatiyana',1,'071-9517836',1),(87,'Kisal Pinsara Epa','\'Champa\', Godagama, Palatuwa',1,'071-9221995',51),(88,'Gayanjith Widanapathirana','No 38/7, Flower Terrest, Vijayathilakarama Rd, Walgama North, Matara',1,'071-2625490',51),(89,'Sakura Dilthara','Kaluwadige Watta, Weraduwa, Matara',1,'071-4290413',151),(92,'Nayana Thilanka','???',1,'072-8855166',1),(93,'Nirodha Sachinthana','02, Thotamuna Mw, Nupe, Matara',1,'071-9456533',1);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-09-28 11:14:51
