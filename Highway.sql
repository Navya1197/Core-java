CREATE DATABASE Highways;

SELECT * FROM Highways;

CREATE TABLE Highways(id int,name varchar(30),type varchar(30), lanes int,country varchar(30),state varchar(30),district varchar(30),contractor varchar(30),is_ppp varchar(30),cost bigint,labours int,engg int,engg_name varchar(30),span int,project_name varchar(30),loss bigint,mla_name varchar(30));


INSERT INTO Highways VALUES(1,'Ka_Tn','NH',6,'INDIA','KA','mysore','harish','yes',452365,235,15,'prakash',3,'NH peoject',63,'raaju');
INSERT INTO Highways VALUES(2,'KartoTn','SH',3,'INDIA','KA','mandya','hari','yes',652866,345,10,'kirah',1,'shruthi peoject',21,'ram');
INSERT INTO Highways VALUES(3,'KaToka','NH',4,'INDIA','KA','tum','krushi','no',6748,765,17,'suri',2,'dh people',14,'shrisha');
INSERT INTO Highways VALUES(4,'KaTochanni','NH',8,'INDIA','KA','mandya','harish','yes',452365,235,15,'prakash',6,'NH peoject',63,'raaju');
INSERT INTO Highways VALUES(5,'KaTOgoa','NH',6,'INDIA','KA','manglor','hari','yes',45667,235,15,'kiran',3,'NH peoject',63,'basavraj');
INSERT INTO Highways VALUES(6,'KaToka','NH',5,'INDIA','KA','bijapur','jagadeesh','no',12365,235,15,'prashant',3,'dmr peoject',10,'patil');
INSERT INTO Highways VALUES(7,'THtoka','NH',9,'INDIA','tn','coimbutur','ravi','yes',9856,123,15,'mahesh',4,'NH peoject',63,'pennir');
INSERT INTO Highways VALUES(8,'KkaToAP','NH',5,'INDIA','KA','mysore','harish','yes',4632,235,15,'prakash',3,'NH peoject',63,'raaju');
INSERT INTO Highways VALUES(9,'krTodelhi','NH',3,'INDIA','KA','mysore','jai','yes',452365,235,15,'hari',3,'NH peoject',63,'raaju');
INSERT INTO Highways VALUES(10,'KaTohydra','NH',2,'INDIA','KA','mysore','harish','yes',452365,235,15,'prakash',3,'NH peoject',63,'raaju');
INSERT INTO Highways VALUES(11,'KaToodisha','NH',8,'INDIA','mh','solapur','balu','yes',6523,235,15,'sunil',1,'NH peoject',63,'mahendra');
INSERT INTO Highways VALUES(12,'od_jha','sh',6,'INDIA','od','bhivaneshara','bhadra','no',5563,123,15,'prakash',3,'NH peoject',45,'rajesg');
INSERT INTO Highways VALUES(13,'Katoap','NH',6,'INDIA','KA','ballary','praveen','yes',25632,235,15,'manjunath',4,'NH peoject',63,'raaju');
INSERT INTO Highways VALUES(14,'tsToap','NH',4,'INDIA','KA','guntur','nani','yes',4523,165,15,'prakash',2,'NH peoject',47,'kcr');
INSERT INTO Highways VALUES(15,'taToap','NH',4,'INDIA','KA','vizag','hari','yes',2563,235,15,'om',6,'NH peoject',32,'mahesh');
INSERT INTO Highways VALUES(16,'KaToTn','sh',4,'INDIA','KA','devanahalli','karti','yes',6523,235,15,'satis',2,'sh peoject',03,'raaju');
INSERT INTO Highways VALUES(17,'kaTodel','NH',6,'INDIA','KA','hubli','vinayak','no',95685,325,15,'vinay',8,'NH peoject',153,'bindu');
INSERT INTO Highways VALUES(18,'asamToTn','NH',4,'INDIA','KA','coim','vijaya','yes',8546,235,15,'ajit',7,'NH peoject',123,'rajkumar');
INSERT INTO Highways VALUES(19,'KaTomp','NH',4,'INDIA','KA','dharwad','mallesh','yes',1563,235,15,'akshay',1,'NH peoject',32,'suresh');
INSERT INTO Highways VALUES(20,'KaToka','Sh',4,'INDIA','KA','raichur','ravi','yes',452365,235,15,'harish',3,'sh peoject',52,'ram');

ALTER TABLE Highways ADD COLUMN HighwayVIPNames varchar(30);
ALTER TABLE Highways DROP COLUMN lanes;
ALTER TABLE Highways DROP COLUMN type;
ALTER TABLE Highways DROP COLUMN states;
ALTER TABLE Highways MODIFY COLUMN  name varchar(30);
ALTER TABLE Highways MODIFY COLUMN  country varchar(30);
ALTER TABLE Highways MODIFY COLUMN country int;
ALTER TABLE Highways MODIFY COLUMN  state varchar(20);
ALTER TABLE Highways MODIFY COLUMN  state varchar(50);
ALTER TABLE Highways MODIFY COLUMN  id varchar(20);
/*ALTER TABLE Highways RENAME COLUMN state  TO Indianstates;
ALTER TABLE Highways RENAME COLUMN name TO Highwayname;
ALTER TABLE Highways RENAME COLUMN dist TO Indiandist;
ALTER TABLE Highways RENAME COLUMN id TO no;

DESC Highways;
commit;





I