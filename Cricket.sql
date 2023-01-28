CREATE DATABASE cricket;

CREATE TABLE cricket(id int, player_name varchar(20),country varchar(20),age int,ipl_team varchar(20),income bigint, married_status varchar(30),centuries int,fifties int,double_cent int);

SELECT * FROM cricket;
SELECT count(*) from cricket;

ALTER TABLE cricket ADD COLUMN(othercricket varchar(30),states varchar(30));

INSERT INTO cricket VALUES(1,'kohli','india',34,'RCB',50,'married',72,85,1);
INSERT INTO cricket VALUES(2,'abd','SA',38,'RCB',35,'married',35,60,2);
INSERT INTO cricket VALUES(3,'dhoni','india',40,'csk',45,'married',25,48,1);
INSERT INTO cricket VALUES(4,'abd','SA',38,'RCB',35,'married',35,60,2);
INSERT INTO cricket VALUES(5,'maxwell','aus',33,'RCB',20,'married',15,40,0);
INSERT INTO cricket VALUES(6,'babar azam','pak',28,'NA',15,'married',30,62,1);
INSERT INTO cricket VALUES(7,'smith','aus',36,'DC',20,'married',40,62,3);
INSERT INTO cricket VALUES(8,'maxwell','aus',33,'RCB',20,'married',15,40,0);
INSERT INTO cricket VALUES(9,'williamson','newz',37,'GL',40,'married',32,47,2);
INSERT INTO cricket VALUES(10,'maxwell','aus',33,'RCB',20,'married',15,40,0);
INSERT INTO cricket VALUES(11,'pant','india',27,'DC',16,'unmarried',6,23,0);
INSERT INTO cricket VALUES(12,'maxwell','aus',33,'RCB',20,'married',15,40,0);
INSERT INTO cricket VALUES(13,'maxwell','aus',33,'RCB',20,'married',15,40,0);
INSERT INTO cricket VALUES(9,'panday','india',30,'GL',22,'married',13,35,0);
INSERT INTO cricket VALUES(10,'root','eng',29,'NA',19,'married',11,36,0);
INSERT INTO cricket VALUES(11,'stokes','eng',32,'CSK',50,'married',72,85,1);
INSERT INTO cricket VALUES(12,'das','sl',26,'NA',10,'unmarried',6,15,0);
INSERT INTO cricket VALUES(13,'bairstow','india',34,'srh',12,'married',13,26,1);
INSERT INTO cricket VALUES(14,'iyer','india',29,'kkr',18,'unmarried',6,19,0);
INSERT INTO cricket VALUES(15,'root','eng',29,'NA',19,'married',11,36,0);
INSERT INTO cricket VALUES(16,'stokes','eng',32,'CSK',50,'married',72,85,1);
INSERT INTO cricket VALUES(17,'das','sl',26,'NA',10,'unmarried',6,15,0);
INSERT INTO cricket VALUES(18,'warner','aus',35,'DC',22,'married',30,46,1);
INSERT INTO cricket VALUES(19,'stokes','eng',32,'CSK',50,'married',72,85,1);
INSERT INTO cricket VALUES(20,'mathews','sl',32,'GL',08,'unmarried',1,12,0);
INSERT INTO cricket VALUES(21,'khawaja','aus',36,'KKR',14,'married',15,23,0);
INSERT INTO cricket VALUES(22,'head','aus',25,'PKS',10,'unmarried',2,5,0);
INSERT INTO cricket VALUES(23,'blundel','nz',28,'LSG',08,'unmarried',0,12,0);
INSERT INTO cricket VALUES(24,'pujara','india',40,'CSK',19,'married',25,30,1);
INSERT INTO cricket VALUES(25,'rahim','ban',34,'csk',15,'married',6,32,0);
INSERT INTO cricket VALUES(26,'brathwate','wi',32,'kkr',12,'married',1,10,0);
INSERT INTO cricket VALUES(27,'conway','nz',34,'srh',16,'married',10,25,1);
INSERT INTO cricket VALUES(28,'bavuma','sa',34,'na',10,'married',02,21,0);
INSERT INTO cricket VALUES(29,'agarawal','india',30,'srh',15,'unmarried',02,20,3);
INSERT INTO cricket VALUES(30,'haq','pak',24,'na',08,'unmarried',01,12,0);


commit;
