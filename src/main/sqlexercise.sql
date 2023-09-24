Cat(
microchipCode VARCHAR(255) PRIMARY KEY,
fullName VARCHAR(64),
nickname VARCHAR(64),
age INTEGER,
)
INSERT INTO Cat VALUES("abc","Silvestro","Gatto",11);
SELECT age,COUNT(*) AS catsCount FROM Cat GROUP BY age
SELECT * FROM Cat WHERE age>10;
SELECT * FROM Cat WHERE nickname IS NULL;
