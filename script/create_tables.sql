CREATE TABLE users(
    id serial NOT NULL,
    name VARCHAR (200),
    CONSTRAINT pk_users PRIMARY KEY (id)
);

CREATE TABLE services(
    id serial NOT NULL,
    name VARCHAR (200),
    id_user integer NOT NULL,
    CONSTRAINT pk_services PRIMARY KEY (id),
    CONSTRAINT fk_services_users foreign key (id_user) references users(id)
);

CREATE TABLE requisitions(
    id serial NOT NULL,
    description VARCHAR (200),
    id_service integer NOT NULL,
    CONSTRAINT pk_requisitions PRIMARY KEY (id),
    CONSTRAINT fk_requisitions_services foreign key (id_service) references services(id)
);
