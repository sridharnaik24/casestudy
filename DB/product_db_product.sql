-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: product_db
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `prod_id` bigint NOT NULL,
  `prod_category` varchar(255) DEFAULT NULL,
  `prod_color` varchar(255) DEFAULT NULL,
  `prod_descrption` varchar(255) DEFAULT NULL,
  `prod_image` varchar(255) DEFAULT NULL,
  `prod_name` varchar(255) DEFAULT NULL,
  `prod_price` double NOT NULL,
  `prod_quantity` int NOT NULL,
  PRIMARY KEY (`prod_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (101,'Electronics','Black','49 INCH SUPER ULTRAWIDE 32:9 CURVED GAMING MONITOR with dual 27 inch screen side by side QUANTUM DOT (QLED) TECHNOLOGY, HDR support and factory calibration','https://fakestoreapi.com/img/81Zt42ioCgL._AC_SX679_.jpg','Samsung 49-Inch CHG90 144Hz Curved Gaming Monitor',5999,1),(102,'Electronics','Black','Dolby atmos headphones with ultra HD  sound quality','https://images.pexels.com/photos/205926/pexels-photo-205926.jpeg?auto=compress&cs=tinysrgb&w=600','Headphones',3999,1),(103,'Electronics','Grey','Intel i7 11th gen processor with 1TB SSD and 16GB RAM','https://images.pexels.com/photos/18105/pexels-photo.jpg?auto=compress&cs=tinysrgb&w=600','Dell Laptop',53999,1),(104,'Electronics','Black','\'10000mAh battery which can last upto 15 days\'','https://images.pexels.com/photos/10104284/pexels-photo-10104284.jpeg?auto=compress&cs=tinysrgb&w=600','Power Bank',1999,1),(105,'Electronics','White','Wireless earphones with handsfree mode ','https://images.pexels.com/photos/5725562/pexels-photo-5725562.jpeg?auto=compress&cs=tinysrgb&w=600','AirPods',12999,1),(106,'Electronics','Black','12 inch FHD display with ios 12 operating system','https://images.pexels.com/photos/1334597/pexels-photo-1334597.jpeg?auto=compress&cs=tinysrgb&w=600','iPad',32999,1),(201,'Fashion','Brown','great outerwear jackets for Spring/Autumn/Winter, suitable for many occasions, such as working, hiking, camping, mountain/rock climbing, cycling, traveling or other outdoors.','https://fakestoreapi.com/img/71li-ujtlUL._AC_UX679_.jpg','Mens Cotton Jacket',999,1),(202,'Fashion','Silver','Stylish Unisex analog watch with a silver belt ','https://thumbs.dreamstime.com/b/wrist-watch-8293595.jpg','Titan Watch',5999,1),(203,'Fashion','Black','Running shoes with an amazing grip ','https://thumbs.dreamstime.com/b/medellin-colombia-june-reebok-sport-shoes-photo-white-background-medellin-colombia-june-reebok-sport-shoes-photo-white-150545775.jpg','Adidas Shoe',1999,1),(204,'Fashion','Red','Round neck t-shirt of a quality material ','https://thumbs.dreamstime.com/b/t-shirt-1916005.jpg','T-shirt',299,1),(205,'Fashion','Blue','Cotton checks shirt for an office wear ','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2Sd2m_4UysuFTlMKLyBNdUmtZAfK12obxnw&usqp=CAU','Formal shirt',899,1),(206,'Fashion','Blue','Denim shoes with white sole for casual wear ','https://images.pexels.com/photos/19090/pexels-photo.jpg?auto=compress&cs=tinysrgb&w=600','Sneakers',999,1),(301,'Jewelley','Silver','Platinum ring with 24 k kohinoor diamonds','https://fakestoreapi.com/img/61sbMiUnoGL._AC_UL640_QL65_ML3_.jpg','Ring',72999,1),(302,'Jewelley','Silver',' 20 grams 24K KDM with 916 hallmark','https://images.pexels.com/photos/4843951/pexels-photo-4843951.jpeg?auto=compress&cs=tinysrgb&w=600','Necklace',51999,1),(303,'Jewelley','Silver',' Double layer platinum ring with a 5 gram stone diamond','https://fakestoreapi.com/img/71YAIFU48IL._AC_UL640_QL65_ML3_.jpg','Platinum ring',133999,1),(304,'Jewelley','Gold',' Gold necklace for wedding with a grand look','https://media.istockphoto.com/photos/golden-necklace-picture-id95408499?b=1&k=20&m=95408499&s=612x612&w=0&h=DZ2sdu1jApg_nWZ1tU3QQTyjWtB3hss7_QZ_uc1gYuw=','Gold Neckalce',189999,1),(401,'Books','Green ',' What doesnt kill you','https://mpd-biblio-covers.imgix.net/9781250751454.jpg','Novel',199,1),(402,'Books','Blue ',' Think like A Monk by JAY shetty','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYlCQA0iufYUT3Rq9W0Mb_gkEH1gYr-_wsTw&usqp=CAU','Philosophy',299,1),(403,'Books','White ',' Pranabh mukerji The president of india','https://www.ndtv.com/news/images/Pranab_Mukherjee_Book_360x270.jpg','Autobiography',499,1),(404,'Books','White ','In your own backyard','https://99designs-blog.imgix.net/blog/wp-content/uploads/2017/07/attachment_73599840-e1500060411553.png?auto=format&q=60&fit=max&w=930','Kids book',99,1);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-11 16:24:18
