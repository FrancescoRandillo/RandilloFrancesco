#query 1 Select all smartphones in the database;
select *
from smartphone;
#query 2 Select all smartphones in the database with projection: name, ram, size and cpu;
select name,ram,size, cpu
from smartphone;
#query 3 Select name of smartphones with display resolution equal to 1080x1920;
select name
from smartphone
where displayResolution='1080x1920';
#query 4 Select name of smartphones with display resolution equal to 1080x1920 and 3Gb ram;
select name
from smartphone
where displayResolution='1080x1920' AND ram='3Gb';
#query 5 Select all Galaxy smartphones; 
select *
from smartphone  
where lower(name) like lower('Galaxy%');
#query 6 Select all Galaxy smartphones with dual-core cpu;
select *
from smartphone  
where name like 'Galaxy%' and lower(cpu) like lower('%dual-core%');
#query 7 Select all smartphones with weight greater than or equal 150 grams;
select*
from smartphone
where weight>=150;
#query 8 Select all smartphones with weight less than 150 grams;
select*
from smartphone
where weight<=150;
#query9 Select all smartphones sorted by display ppi;
select*
from smartphone
order by displayPpi;
#query 10 Select all smartphones descendant sorted by display ppi;
select*
from smartphone
order by displayPpi desc;
#__________________________________________________________________________________________
#query 1 Select name and brand of all smartphones in the database;
select s.name as nomeSmartphone, b.name as nomeBrand
from smartphone as s, brand as b
where s.brand=b.id;
#query 2 Select name and opSys of all smartphones in the database sorted by opSys, name; 
select s.name,o.description
from smartphone as s, opsys as o
where s.opSys=o.id
order by o.description;
#query 3 Select name and opSys of all Android smartphones in the database descendant sorted by weight;
#visualizzo anche il peso per una migliore verifica
select s.name,o.description, s.weight
from smartphone as s, opsys as o
where s.opSys=o.id and o.description='Android'
order by s.weight desc;
#query 4 Select name, brand, country of all smartphones in the database sorted by country, brand, name;
select s.name as nomeSmartphone, b.name as nomeBrand,c.name as nomeCountry
from smartphone as s inner join brand as b inner join country as c on s.brand=b.id and b.country=c.code
order by c.name, b.name, s.name;
#query 5 Select count of smartphones in the database with 3Gb ram;
select count(*) as count3Gb
from smartphone
where lower(ram) ='3gb';
#query6 Select count of smartphones for each opSys in the database;
select count(*) as count, o.description
from smartphone as s inner join opsys as o on s.opSys=o.id
group by o.description
order by count desc;
#query 7 Select count of smartphones for each country in the database;
select count(*) as count,c.name
from smartphone as s inner join brand as b inner join country as c on s.brand=b.id and b.country=c.code
group by c.name;
