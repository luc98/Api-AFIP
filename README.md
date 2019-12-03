# Api-AFIP

use afip;

create table usuario (
	numerofiscal int,
    cuil varchar(20),
    nombre varchar(16),
    apellido varchar(16),
    dni int,
    PRIMARY KEY (numerofiscal)
);

create table impuestos(
	id int NOT NULL AUTO_INCREMENT,
    TipoImpuesto varchar(20),
    fechadesde date,
    fechahasta date,
    PRIMARY KEY (id)
);
