# SampleCrud 

The sample RestFul on Spring Boot whith PostgreSql database

# Technologys Applied
	 1)  Spring boot
	 2)  Spring Data
	 3)  Maven
	 4)  Postgres
	 5)  Docker Linux CentOS 7
	 6)  JUnit
	 7)  Postman
	 8)  Flyway
	 10) JPA
	 11) Cucumber
	 12) JUNIT
 
# How to Execute that project
  1) Download the Spring tool Suite 3 and install
  2) Clone the sourcecode on git hub
  3) Execute the command bellow on the CentOS7 Linux Terminal, to create a docker database Postgres
		sudo yum check-update
		curl -fsSL https://get.docker.com/ | sh
		sudo systemctl start docker
		sudo systemctl status docker
		sudo systemctl enable docker
		sudo usermod -aG docker root
		sudo systemctl start docker
		docker info
		docker run hello-world
		docker search postgres
		docker pull postgres
		docker run --rm   --name pg-docker -e POSTGRES_PASSWORD=sysadmin -d -p 5432:5432 -v $HOME/docker/volumes/postgres:/var/lib/postgresql/data  postgres
  4) Connect on postgres docker and execute script bellow
		-- Database: sampleCrud
		-- DROP DATABASE "sampleCrud";
		CREATE DATABASE "sampleCrud"
			WITH 
			OWNER = postgres
			ENCODING = 'UTF8'
			LC_COLLATE = 'en_US.utf8'
			LC_CTYPE = 'en_US.utf8'
			TABLESPACE = pg_default
			CONNECTION LIMIT = -1
			
# Starting the application
  1) Click Run on the IDE and choose the Java Application configuration, set the "SampleCrudApplication.java" was main class
  2) Observe the terminal if will have a any error.
  
# Consuming the restfull

  Bellow the DataModel
   
   {
        "idpeople": 1,
        "nome": "Cicero Mercedez",
        "cpf": "105.133.154-16",
        "nascimento": "1991-01-19",
        "endereco": "R. Robiao Andreazzi, 415",
        "status": "INATIVE"
    }
   
   
  
  
  
   

 
 

