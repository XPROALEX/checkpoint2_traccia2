Car(
id VARCHAR(255) PRIMARY KEY,
nickname VARCHAR(64),
speed INTEGER,
productionYear INTEGER
)
INSERT INTO Car VALUES('abc','random car',100,2010);
SELECT productionYear,COUNT(*) AS Car_Count FROM Car GROUP BY productionYear;
SELECT * FROM Car WHERE speed>200;
SELECT nickname,speed FROM Car WHERE nickname IS NOT NULL;