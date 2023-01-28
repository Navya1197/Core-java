CREATE DATABASE MOUNTAINS;

CREATE TABLE moutains(id int not null,moutain_name varchar(20) unique, elevationmean  int unique,elevation_max int unique,continent varchar(30) not null,countries varchar(30) unique,climate varchar(30) unique, kSum int,check(elevationmean>5000),check(elevation_max>50000),check(kSum>=6000));

SELECT* FROM moutains;

LTRIM:
SELECT LTRIM('    alpha')as space_remove;
SELECT LTRIM('       India')as space_remove;
SELECT LTRIM('       pakisthan')as space_remove;
SELECT LTRIM('       Shrilanka')as space_remove;
SELECT LTRIM('     bangladesh')as space_remove;

RTRIM:
SELECT RTRIM('alpha       ')as space_remove;
SELECT RTRIM('India       ')as space_remove;
SELECT RTRIM('pakisthan    ')as space_remove;
SELECT RTRIM('Shrilanka    ')as space_remove;
SELECT RTRIM('bangladesh   ')as space_remove;

SELECT * FROM moutains;
SELECT * FROM moutains order by id; 

DESC:
SELECT *FROM moutains order by id DESC;
SELECT *FROM moutains order by country DESC;
SELECT *FROM moutains order by elevationmean DESC;
SELECT *FROM moutains order by  countries;

ASC:
SELECT *FROM moutains order by id ASC;
SELECT *FROM moutains order by countries ASC;

INSERT INTO moutains values(1,'alpas',5011,52657,' ','albania','mild' ,6500);
INSERT INTO moutains values(2,' null',5024,560090,'null','ukk','badd',6788);
INSERT INTO moutains values(3,'appalachain moutains',5056,56089,' ','algeria','dry',67876);
INSERT INTO moutains values(4,'aldapha',50455,56567,'null','newzeland','',67877);
INSERT INTO moutains values(5,'ethiopian',5027,56070,' ','beliz','tropical',6787);
INSERT INTO moutains values(6,'ande',5028,56007,'egypt','russia','polar',6787);
INSERT INTO moutains values(7,'andenti',5012,56004,'null','finland','mildtemp',6786);
INSERT INTO moutains values(8,'ancape',5034,56700,'east','shrilanka','good',6787);
INSERT INTO moutains values(9,'himalaya',5100,56876,'west','oceania','bad',67877);
INSERT INTO moutains values(10,'moutains',5003,560089,' ','amerika','notbad',67867);
INSERT INTO moutains values(11,'draenshberg',5090,56678,'daka','ukk','beatifull',67865);
INSERT INTO moutains values(12,'aalpas',54567,568767,'koria','utharakoria','nice',687674);
INSERT INTO moutains values(13,'karielind',5546,56566,'utharakanda','ukanda','osam',67675);
INSERT INTO moutains values(14,'thalkadu',503564,56896,'null','ukangs','badd',6776387);
INSERT INTO moutains values(15,'gova',506567,56076,'koria','ghgj','baddd',677896);
INSERT INTO moutains values(16,'hogeh',5077,567897,' ','uthata','verybad',6787);
INSERT INTO moutains values(17,'akjgkj',50577,56898,'avvni','veryverybad','norm',67757);
INSERT INTO moutains values(18,'andju',50567,56077,'null','bangla','cheena',67968);
INSERT INTO moutains values(19,'akah',5067,560878,'absa','newziland','goodd',68789);
INSERT INTO moutains values(20,'akhah',5065,560567,' ','barmoda','verynormal',678789);






commit;
