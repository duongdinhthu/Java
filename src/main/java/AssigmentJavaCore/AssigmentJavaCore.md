tạo database để check như sau : ( DBeaver)
Tên database:
AssigmentJavaCore
Tạo bảng trong data base:



-- assigmentjavacore.customer definition

CREATE TABLE `customer` (
`customer_id` int(11) NOT NULL AUTO_INCREMENT,
`first_name` varchar(255) DEFAULT NULL,
`last_name` varchar(255) DEFAULT NULL,
`email` varchar(255) DEFAULT NULL,
`phone` varchar(255) DEFAULT NULL,
PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;