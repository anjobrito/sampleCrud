create table people(
	idPeople int NOT NULL,
	nome varchar(255) NOT NULL,
	cpf varchar(18) NOT NULL,
	nascimento timestamp,
	endereco varchar(255),
        status varchar(60)	
	);
	

alter table people add primary key (idPeople);


