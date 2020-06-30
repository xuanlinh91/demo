DROP TABLE IF EXISTS `Linh_test_computer`;

CREATE TABLE `Linh_test_computer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `version` varchar(45) DEFAULT NULL,
  `computer_col_1` int(11) DEFAULT NULL,
  `computer_col_2` varchar(45) DEFAULT NULL,
  `computer_col_3` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `Linh_test_people`;

CREATE TABLE `Linh_test_people` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `computer_id` int(11) DEFAULT NULL,
  `people_col_1` int(11) DEFAULT NULL,
  `people_col_2` varchar(45) DEFAULT NULL,
  `people_col_3` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

