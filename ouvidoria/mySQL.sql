CREATE SCHEMA `ouvidoria` ;

use ouvidoria;

create table reclamacao(
    id int auto_increment,
    titulo varchar(60),
    primary key(id)
);

select * from reclamacao;
