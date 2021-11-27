create table magazin(
    id int primary key,
    nume varchar(100) not null,
    oras varchar(50) not null,
    nr_magazine_secundare int,
    rangul_inalt boolean
);

drop table magazin;

create table angajati(
    idnp varchar(13) primary key,
    nume varchar(100) not null,
    prenume varchar(100) not null,
    strada varchar(100),
    salariul int,
    telefon int not null unique,
    magazin_id int,
    foreign key (magazin_id) references magazin(id)
);

drop table angajati;

create table clienti(
    idnp varchar(13) primary key,
    nume varchar(100) not null,
    prenume varchar(100) not null,
    strada varchar(100),
    permanenti boolean,
    genul char,
    varsta int,
    telefon int not null unique
);

drop table clienti;

insert into angajati(idnp, nume, prenume, strada, salariul, telefon,magazin_id)
 values('2013654123874','Popescu','Alina','Vasile Alexandri',5000,079562803,1);
insert into angajati(idnp, nume, prenume, strada, salariul, telefon,magazin_id)
 values('2418305920716','Cojocaru','Maria','Mihail Sadoveanu',4000,060965065,4);
insert into angajati(idnp, nume, prenume, strada, salariul, telefon,magazin_id)
 values('2629407513382','Bou','Vasile','Burebista',5000,078973061,2);
insert into angajati(idnp, nume, prenume, strada, salariul, telefon)
 values('2261034429750','Albu','Tudor','Calea Iesilor',4500,079610573);
insert into angajati(idnp, nume, prenume, strada, salariul, telefon,magazin_id)
 values('2893161407125','Moraru','Sabina','Alba Iulia',4000,068564460,1);

select * from angajati;
select id from magazin where nume = 'Azart';
select nume,prenume,telefon from angajati where magazin_id = 1;

select * from angajati inner join magazin on angajati.magazin_id = magazin.id;
select * from angajati
    inner join magazin on angajati.magazin_id = magazin.id
where magazin.oras = 'Chisinau';
select * from angajati
    inner join magazin on angajati.magazin_id = magazin.id
where magazin.nr_magazine_secundare = 5;

select * from angajati
    left join magazin on angajati.magazin_id = magazin.id;

select * from angajati
    left join magazin on angajati.magazin_id = magazin.id
where magazin.nume = 'Azart';

select * from angajati
    left join magazin on angajati.magazin_id = magazin.id
where magazin.rangul_inalt = false;

select * from angajati
    right join magazin on angajati.magazin_id = magazin.id;

select * from angajati
    right join magazin on angajati.magazin_id = magazin.id
where magazin.oras = 'Balti';

select * from angajati
    right join magazin on angajati.magazin_id = magazin.id
where magazin.rangul_inalt = false;

select * from angajati
    full join magazin on angajati.magazin_id = magazin.id;

select * from angajati
    full join magazin on angajati.magazin_id = magazin.id
where angajati.salariul = 4000;

select * from angajati
    full join magazin on angajati.magazin_id = magazin.id
where magazin.nr_magazine_secundare = 5;

select * from angajati where salariul = 5000;
select * from angajati where strada like '%an%';
select * from angajati where salariul < 5000;
select * from angajati where salariul between 4500 AND 5500;
select * from angajati where nume = 'Popescu';

update angajati set magazin_id = 1 where nume = 'Moraru';
update angajati set salariul = 5000 where salariul = 4000;
update angajati set strada = 'Ion Creanga' where nume = 'Bou';
update angajati set salariul = 4500 where strada = 'Alba Iulia';
update angajati set nume = 'Pirgaru' where prenume = 'Maria';
update angajati set salariul = 4000 where telefon = 078973061;

delete from angajati where idnp = '2013654123874';
delete from angajati where salariul = 4000;
delete from angajati where prenume = 'Sabina';
delete from angajati where strada = 'Calea Iesilor';
delete from angajati where telefon = 060965065;

alter table angajati add genul char;

insert into clienti(idnp, nume, prenume, strada, permanenti,genul,varsta, telefon)
values('2028847150392','Rotaru','Andrei','Mihai Eminescu',true,'M',32,079010206);
insert into clienti(idnp, nume, prenume, strada, permanenti,genul,varsta, telefon)
values('2690121853427','Stoica','Vadim','Grigore Vieru',false,'M',20,069453890);
insert into clienti(idnp, nume, prenume, strada, permanenti,genul,varsta, telefon)
values('2151358444068','Mocanu','Tatiana','Moscova',true,'F',45,068280917);
insert into clienti(idnp, nume, prenume, strada, permanenti,genul,varsta, telefon)
values('2565308559722','Pistol','Cristina','Eugen Doga',true,'F',36,078300905);
insert into clienti(idnp, nume, prenume, strada, permanenti,genul,varsta, telefon)
values('2067624474704','Doloscan','Mihaela','Ismail',false,'F',28,079692641);

select from clienti where genul = 'F';
select from clienti where prenume like '%na';
select from clienti where permanenti = false;
select from clienti where genul = 'M' and permanenti = true;
select from clienti where varsta between 30 and 40;

update clienti set permanenti = false where varsta = 36;
update clienti set varsta = 29 where strada = 'Ismail';
update clienti set strada = 'Stefan cel Mare' where prenume = 'Vadim';
update clienti set nume = 'Tataru' where telefon = 068280917;
update clienti set varsta = 33 where prenume = 'Andrei';

delete from clienti where varsta = 20;
delete from clienti where idnp = '565308559722';
delete from clienti where strada = 'Ismail';
delete from clienti where telefon = 079010206;
delete from clienti where prenume = 'Tatiana';

insert into magazin(id, nume, oras, nr_magazine_secundare, rangul_inalt)
values (1,'Azart','Chisinau',5,true);
insert into magazin(id, nume, oras, nr_magazine_secundare, rangul_inalt)
values (2,'Konfi','Chisinau',3,false);
insert into magazin(id, nume, oras, nr_magazine_secundare, rangul_inalt)
values (3,'Defacto','Balti',5,true);
insert into magazin(id, nume, oras, nr_magazine_secundare, rangul_inalt)
values (4,'LC WAIKIKI','Orhei',4,true);
insert into magazin(id, nume, oras, nr_magazine_secundare, rangul_inalt)
values (5,'Aviv','Balti',1,false);


select * from magazin where nr_magazine_secundare = 5;
select * from magazin where oras = 'Chisinau';
select * from magazin where oras like '%i';
select * from magazin where nr_magazine_secundare between 3 and 5;
select * from magazin where nume like 'A%';

update magazin set nr_magazine_secundare = 7 where id = 1;
update magazin set rangul_inalt = false where oras = 'Orhei';
update magazin set nume = 'Zoutlet' where nume = 'Aviv';
update magazin set oras = 'Chisinau' where id = 3;
update magazin set nr_magazine_secundare = 2 where nume = 'Konfi';

delete from magazin where id = 4;
delete from magazin where nume = 'Defacto';
delete from magazin where nr_magazine_secundare = 1;
delete from magazin where nume = 'Azart';
delete from magazin where id = 2;




