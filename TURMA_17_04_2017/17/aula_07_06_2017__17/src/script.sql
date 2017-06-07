drop database if exists eleicao;

create database eleicao;

use eleicao;

create table eleicao (
   ID int not null primary key auto_increment,
   DESCRICAO varchar(70) not null,
   DATA_INICIADA date,
   DATA_FINALIZADA date
);

create table candidato(
   ID int not null primary key auto_increment,
   ELEICAO_ID int not null,
   NOME varchar(70) not null,
   VOTOS int not null default 0,
   constraint c1 foreign key (ELEICAO_ID) references eleicao(ID)
);