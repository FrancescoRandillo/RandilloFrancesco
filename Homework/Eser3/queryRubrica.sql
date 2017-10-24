#query 1: Display your personal information and phone model you own
select u.name,u.surname, u.address, u.dateOfBirth, u.email,u.mobile, u.phone,s.name as nameSmartphone
from smartphone as s inner join user u on s.id=u.smartphone;

#set of sql_safe_updates in order to make update
set sql_safe_updates= 0;

#query 2:•	Update of persional information
#update the address fiel at montoro superiore above the fields that have address= montoro

update user
	set address='montoro superiore'
    where address='montoro';
#query 3: Update of information abaout phone model
#update in uppercase the name of the phone model of all the smartphone products in korea
update smartphone
	set name= Upper(name)
    where brand in(select id
					from brand
                    where country='KR');
                    
#query 4:Display information about the phone    
select  s.name as nomeSmartphone, b.name as nomeBrand,c.name as nomeCountry, o.description as sistemaOperativo
from smartphone as s inner join brand as b inner join country as c inner join opsys as o
on s.brand=b.id and b.country=c.code and o.id= s.opSys;

#query 5: Display information about the phone   (2)
# count of most popular smartphone from user, count >1
select count(*) as count, s.name as nomeSmartphone, b.name as nomeBrand,c.name as nomeCountry
from smartphone as s inner join brand as b inner join country as c inner join user as u
on s.brand=b.id and b.country=c.code and u.smartphone= s.id
group by s.name
having count>1
order by count desc;
