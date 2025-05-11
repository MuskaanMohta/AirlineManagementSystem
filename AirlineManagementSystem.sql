create database airlinemanagementsystem;
use airlinemanagementsystem;
create table login(username varchar(20) , password varchar(20));
insert into login values("admin","admin");
select * from login;

create table passenger(
name varchar(20),
nationality varchar(20),
aadhar varchar(20),
address varchar(50),
gender varchar(20),
phone varchar(15),
email varchar(25)
);

select * from passenger;

create table flight(
flight_code varchar(20),
flight_name varchar(20),
source varchar(40),
destination varchar(40)
);

describe flight;
insert into flight values ("AI101", "Air India Express", "Delhi", "Mumbai");
insert into flight values ("6E203", "IndiGo Airlines", "Bengaluru", "Chennai");
insert into flight values ("SG456", "SpiceJet Connect", "Kolkata", "Hyderabad");
insert into flight values ("UK789", "Vistara Airways", "Pune", "Goa");
insert into flight values ("G8102", "Go First Airlines", "Ahmedabad", "Jaipur");
insert into flight values ("AI304", "Air India", "Lucknow", "Delhi");
insert into flight values ("6E907", "IndiGo Airlines", "Kochi", "Trivandrum");
insert into flight values ("SG330", "SpiceJet Express", "Bhopal", "Nagpur");
insert into flight values ("UK405", "Vistara", "Chandigarh", "Amritsar");
insert into flight values ("G8231", "Go First", "Ranchi", "Patna");

select * from flight;

create table reservation(
PNR varchar(15),
TICKET varchar(20),
aadhar varchar(20),
name varchar(20),
nationality varchar(20),
gender varchar(20),
phone varchar(15),
email varchar(25),
flight_code varchar(20),
flight_name varchar(20),
source varchar(40),
destination varchar(40),
ddate varchar(30)
);

describe reservation;
select * from reservation;

create table cancel (
PNR varchar(15),
name varchar(20),
cancelNo varchar(15),
flight_code varchar(20),
ddate varchar(30)
);

describe cancel;

