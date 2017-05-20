drop database if exists eleicao;

create database eleicao;

use eleicao;

create table eleicao (
   ID int not null primary key auto_increment,
   DESCRICAO varchar(70) not null
);

create table candidato(
   ID int not null primary key auto_increment,
   NOME varchar(70) not null,
   TELEFONE char(15) not null
);

create table candidato_eleicao(
   ID_ELEICAO int not null,
   ID_CANDIDATO int not null,
   primary key(ID_ELEICAO, ID_CANDIDATO),
   constraint c1 foreign key (ID_ELEICAO) references eleicao(ID),
   constraint c2 foreign key (ID_CANDIDATO) references candidato(ID)
);

