CREATE  DATABASE javaSQL;


CREATE TABLE Indianfestivalss(id int,festnames varchar(30),festcity varchar(20),festday varchar(20),region varchar(20),dress varchar(20),  sweet varchar(20),god varchar(20),sports varchar(20), date int,subcity varchar(30));

AlTER TABLE indianfestivalss ADD COLUMN festnames varchar(30);
ALTER TABLE indianfestivalss ADD COLUMN festdistrict varchar(30) default 'mysuru' ; 

SELECT * FROM Indianfestivalss;

INSERT INTO Indianfestivalss VALUES(1,'onum','hassan','sunday','south','kurtha','mysurupak','lord','ludo', 10,'mysuru');
INSERT INTO Indianfestivalss VALUES(2,'christhmas','banglore','monday','south','jeens','jamun','ganesh','KOKO',11,'myuru');
INSERT INTO Indianfestivalss VALUES(3,'christhmas','banglore','friday','south','kurtha','laddu','jesus','cricket',12,'mandya'); 
INSERT INTO Indianfestivalss VALUES(4,'christhmas','banglore','saturday','south','kurtha','champakali','sankrathi','football',10,'davanagere');
INSERT INTO Indianfestivalss VALUES(5,'gowri','mysuru','sunday','south','kurtha','peda','yugadi','vollyball',17,'nagara');
INSERT INTO Indianfestivalss VALUES(6,'Ganesh','mysuru','monday','south','jeens','jamun','ganesh','KOKO',12,'mysuru');
INSERT INTO Indianfestivalss VALUES(7,'goodfriday','nagara','friday','south','kurtha','laddu','jesus','cricket',13,'mandya');
INSERT INTO Indianfestivalss VALUES(8,'onum','hassan','sunday','south','kurtha','mysurupak','lord','ludo', 10,'mysuru');
INSERT INTO Indianfestivalss VALUES(9,'sankrathi','ballary','saturday','south','kurtha','champakali','sankrathi','football',10,'haveri');
INSERT INTO Indianfestivalss VALUES(10,'gouri','raichur','sunday','south','kurtha','peda','yugadi','vollyball',12,'gulbarga');
INSERT INTO Indianfestivalss VALUES(11,'christhmas','banglore','sunday','south','kurtha','peda','yugadi','vollyball',17,'mysuru');
INSERT INTO Indianfestivalss VALUES(12,'christhmas','MYSURU','sunday','south','kurtha','bun','navami','football',18,'mandya');
INSERT INTO Indianfestivalss VALUES(13,'christhmas','MYSURU','sunday','north','kurtha','bun','navami','football',18,'mysuru');
INSERT INTO Indianfestivalss VALUES(14,'chritshmas','banglore','tuesday','north','kurtha','bun','navami','football',18,'ballary');
INSERT INTO Indianfestivalss VALUES(15,'chritshmas','MYSURU','sunday','south','saree','bun','navami','football',18,'uk');
INSERT INTO Indianfestivalss VALUES(16,'christhmas','MYSURU','sunday','south','kurtha','bun','navami','football',18,'ap');
INSERT INTO Indianfestivalss VALUES(17,'sankranthi','banglore','monday','south','kurtha','peda','yugadi','vollyball',17,'bidar');
INSERT INTO Indianfestivalss VALUES(18,'paksha','banglore','sunday','south','kurtha','peda','yugadi','vollyball',17,'hassan');
INSERT INTO Indianfestivalss VALUES(19,'holi','banglore','monday','south','kurtha','paku','yugadi','vollyball',17,'gulbaga');
INSERT INTO Indianfestivalss VALUES(20,'rangu','mysuru','sunday','south','saree','peda','ramnavami','vollyball',17,'hassan');
INSERT INTO Indianfestivalss VALUES(21,'rango','banglore','monday','north','kurtha','other','ramna','kokol',18,'mysuru');
INSERT INTO Indianfestivalss VALUES(22,'rangu','manglore','sunday','south','jeens','champakali','ramnavami','throuball',18,'nagara');
INSERT INTO Indianfestivalss VALUES(23,'rangothsva','gulbarga','sunday','south','saree','peda','ramnavami','vollyball',11,'harsikere');
INSERT INTO Indianfestivalss VALUES(24,'rangothsva','banglore','monday','south','saree','laddu','ramnavami','vollyball',13,'holenarsipura');
INSERT INTO Indianfestivalss VALUES(25,'rangothsva','udupi','tyesday','south','saree','laddu','amavase','koko',11,'gundlupet');
INSERT INTO Indianfestivalss VALUES(26,'rangothsva','manglur','wednesday','south','saree','sweet','amavase','kabbadi',15,'nagara');
INSERT INTO Indianfestivalss VALUES(27,'rangothsva','chkkamanglur','thursday','south','saree','peda','ramnavami','football',12,'gulbarga');
INSERT INTO Indianfestivalss VALUES(28,'rangothsva','mysuru','friday','south','saree','peda','powrnami','badmitton',13,'davanager');
INSERT INTO Indianfestivalss VALUES(29,'rangothsva','bidar','saturday','south','kurtha','','powrnami','lagori',15,'durga');
INSERT INTO Indianfestivalss VALUES(30,'rangothsva','mysuru','sunday','south','jeens','champakali','navami','lagori',18,'mandya');
INSERT INTO Indianfestivalss VALUES(31,'rangothsva','banglore','monday','south','patiyaala','peda','ramnavami','koko',17,'mysuru');








commit;