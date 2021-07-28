create table credit_card
(
    id          int PRIMARY KEY,
    passion   varchar(55),
    minsalary      decimal(12,2),
    maxsalary      decimal(12,2),
    minage int,
    maxage int,
    creditcards    varchar(255)
);

insert into credit_card values(1,'Shopping',7000.00,14999.00,18,23,'Bsmart,Afinity Card');
insert into credit_card values(2,'Shopping',7000.00,14999.00,24,32,'Bsmart,Clasica,Afinity Card,Office Depot,Costco,BestBuy Banamex,The Home Depot');
insert into credit_card values(3,'Shopping',7000.00,14999.00,33,75,'Clasica,Office Depot,Costco,BestBuy Banamex,The Home Depot');

insert into credit_card values(4,'Shopping',15000.00,34999.00,18,23,'Bsmart,Afinity Card');
insert into credit_card values(5,'Shopping',15000.00,34999.00,24,32,'Oro,Afinity Card,Office Depot,Costco,BestBuy Banamex,The Home Depot');
insert into credit_card values(6,'Shopping',15000.00,34999.00,33,75,'Oro,Office Depot,Costco,BestBuy Banamex,The Home Depot');


insert into credit_card values(7,'Shopping',35000.00,49999.00,18,23,'Bsmart,Afinity Card');
insert into credit_card values(8,'Shopping',35000.00,49999.00,24,75,'Platinum,Office Depot,Costco,BestBuy Banamex,The Home Depot');

insert into credit_card values(9,'Shopping',50000.00,99999999.00,18,23,'Bsmart,Afinity Card');
insert into credit_card values(10,'Shopping',50000.00,99999999.00,24,75,'Platinum');



insert into credit_card values(11,'Travels',12000.00,29999.00,18,75,'Citi / AAdvantage');


insert into credit_card values(12,'Travels',30000.00,34999.00,18,23,'Citi / AAdvantage');
insert into credit_card values(13,'Travels',30000.00,34999.00,24,75,'Citi / AAdvantage,Platinum');

insert into credit_card values(14,'Travels',35000.00,49999.00,18,23,'Citi / AAdvantage');
insert into credit_card values(15,'Travels',35000.00,49999.00,24,75,'Citi / AAdvantage,Platinum');

insert into credit_card values(16,'Travels',50000.00,99999999.00, 18,23,'Citi / AAdvantage');
insert into credit_card values(17,'Travels',50000.00,99999999.00, 24,75,'Citi / AAdvantage,Platinum');

