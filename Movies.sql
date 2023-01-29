CREATE DATABASE MOVIES;


CREATE TABLE movies(id int,name varchar(30),budget bigint,actor varchar(30),actress varchar(30),director varchar(30),cameras int,loss bigint , profit bigint,streamed_in varchar(30),artists int);

SELECT * FROM movies;



INSERT INTO movies VALUES(1,'kgf',153534,'yash','srinidhi','neel',27,0,10766868,'amazon',600);
INSERT INTO movies VALUES(2,'diya',6567577,'newhero','diya','vasanth',78,0,6657,'hotstatr',1655);
INSERT INTO movies VALUES(3,'k2',145622,'sudeep','modestian','dev',12,0,14552,'prime',25487);
INSERT INTO movies VALUES(4,'lagn',14563,'amir','na','na',42,0,65223,'netflix',140);
INSERT INTO movies VALUES(5,'kranthi',1324674,'dharshan','rachitha','darshan',34,9,36767,'primevideo',250);
INSERT INTO movies VALUES(6,'bulbul',123652,'nikhil','anu','vasista',12,0,325632,'zee5',132);
INSERT INTO movies VALUES(7,'achari',6523665,'chiru','pooja','shiva',65,65623,0,'primevideo',300);
INSERT INTO movies VALUES(8,'VR',256323,'sudeep','NA','anup',52,0,65232,'zee5',256);
INSERT INTO movies VALUES(9,'karthi',123652,'shasi','banu','vanisha',13,0,32443,'zee5',138);
INSERT INTO movies VALUES(10,'acharya',6523665,'chiru','pooja','shiva',65,65623,0,'primevideo',300);
INSERT INTO movies VALUES(11,'bahubali2',8563225,'prabhas','ansuhka','rajmouli',253,0,9652325,'netflix',900);
INSERT INTO movies VALUES(12,'kgf1',53252,'yash','srinidhi','neel',21,0,12365,'primevideo',500);
INSERT INTO movies VALUES(13,'bahubali1',4523652,'prabhas','ansuhka','rajmouli',253,0,563226,'netflix',700);
INSERT INTO movies VALUES(14,'k2',145622,'sudeep','modestian','dev',12,0,14552,'primevideo',220);
INSERT INTO movies VALUES(15,'lagn',14563,'amir','na','na',42,0,65223,'netflix',140);
INSERT INTO movies VALUES(16,'ugram',12563,'muruli','haripriya','neel',25,0,45623,'yt',100);
INSERT INTO movies VALUES(17,'salar',45236523,'prabhas','shruti','neel',123,0,456332,'primevideo',650);
INSERT INTO movies VALUES(18,'bahubali1',4523652,'prabhas','ansuhka','rajmouli',253,0,563226,'netflix',700);
INSERT INTO movies VALUES(19,'eega',16523,'sudeep','samantha','rajmouli',60,0,25463,'yt',300);
INSERT INTO movies VALUES(20,'bahubali2',8563225,'prabhas','ansuhka','rajmouli',253,0,9652325,'netflix',900);
INSERT INTO movies VALUES(21,'bhandhan',65235,'vishnu','suhasini','rajendra',10,0,256322,'yt',200);
INSERT INTO movies VALUES(22,'vedha',412532,'shivanna','pavitra','harsha',20,22532,0,'na',253);
INSERT INTO movies VALUES(23,'temper',756642,'ntr','kajal','puri',25,0,65523,'primevideo',420);
INSERT INTO movies VALUES(24,'maharshi',452236,'mahesh','poja','vamshi',52,0,6523456,'primevideo',300);
INSERT INTO movies VALUES(25,'bigil',45235666,'vijaya','nayanathara','atlee',42,0,6552365,'primevideo',600);
INSERT INTO movies VALUES(26,'thunivu',45663256,'ajit','radha','vinoth',36,0,4562335,'na',265);
INSERT INTO movies VALUES(27,'beast',652265,'vijay','pooja','nelson',65,11452,145662,'netflix',145);
INSERT INTO movies VALUES(28,'mersal',652232,'vijay','samanta','atlee',32,0,655221,'primevideo',410);
INSERT INTO movies VALUES(29,'pokri',523652,'vijay','ileana','puri',13,0,65523,'yt',256);
INSERT INTO movies VALUES(30,'legend',985565,'balayya','na','boyapati',65,0,259865,'primevideo',472);
INSERT INTO movies VALUES(31,'jaisimha',145233,'balayya','swathi','anilbhat',14,65523,0,'hotstar',321);
INSERT INTO movies VALUES(32,'ramachari',25632,'vishnu','tara','puttanna',3,0,52364,'yt',100);
INSERT INTO movies VALUES(33,'kirataka',45632,'yash','na','praveen',10,0,14562,'yt',125);
INSERT INTO movies VALUES(34,'drama',478965,'yash','radhika','yograj',14,0,49856,'primevideo',123);
INSERT INTO movies VALUES(35,'galipata',14856,'ganesh','daisee','yograj',18,0,45632,'voot',142);
INSERT INTO movies VALUES(36,'galipata2',45236,'ganesh','tanya','yograj',26,0,65265,'zee5',200);
INSERT INTO movies VALUES(37,'krishna',32563,'ganesh','madre','pradeep',14,0,52365,'yt',325);
INSERT INTO movies VALUES(38,'lovetoday',214125,'pradeep','ivana','pradeep',13,0,465232,'ntflix',100);
INSERT INTO movies VALUES(39,'comali',46523,'ravi','kajal','pradeep',21,0,63256,'hotstar',235);
INSERT INTO movies VALUES(40,'acharya',6523665,'chiru','pooja','shiva',65,65623,0,'primevideo',300);
INSERT INTO movies VALUES(41,'bahubali2',8563225,'prabhas','ansuhka','rajmouli',253,0,9652325,'netflix',900);
INSERT INTO movies VALUES(42,'kgf1',53252,'yash','srinidhi','neel',21,0,12365,'primevideo',500);
INSERT INTO movies VALUES(43,'kranti',55896,'darshan','na','harikrishna',15,0,0,'na',265);
INSERT INTO movies VALUES(44,'hucchha',25632,'sudeep','reshma','navven',10,0,54236,'yt',150);
INSERT INTO movies VALUES(45,'master',555225,'vijay','malvika','lokesh',60,0,65236,'primevideo',540);
INSERT INTO movies VALUES(46,'vikram',1452352,'kamal','none','lokesh',35,0,5689451,'hotstar',444);
INSERT INTO movies VALUES(47,'bhheshma',145236,'nitin','rash','vamshi',16,0,541256,'netflix',250);
INSERT INTO movies VALUES(48,'nagaram',225326,'naveen','cassandra','lokesh',12,6523,0,'yt',110);
INSERT INTO movies VALUES(49,'uppenna',152145,'vaishnav','kriti','babu',20,0,242653,'netflix',162);
INSERT INTO movies VALUES(50,'acharya',6523665,'chiru','pooja','shiva',65,65623,0,'primevideo',300);

ALTER TABLE movies ADD COLUMN state varchar(30);
ALTER TABLE movies MODIFY COLUMN  camaras varchar(50);
ALTER TABLE movies MODIFY COLUMN  actress varchar(50);
ALTER TABLE movies MODIFY COLUMN  actor varchar(20);
ALTER TABLE movies DROP COLUMN  id;
ALTER TABLE movies DROP COLUMN  director;
ALTER TABLE movies DROP COLUMN  actor;
/*ALTER TABLE movies RENAME COLUMN actor TO Hero;
ALTER TABLE movies RENAME COLUMN name TO filmname;
ALTER TABLE movies RENAME COLUMN artists TO filmartists;



commit;


