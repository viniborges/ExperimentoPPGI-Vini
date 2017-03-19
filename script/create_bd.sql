--Script para criação do banco de dados

CREATE DATABASE tecservice
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
--    LC_COLLATE = 'pt_BR.UTF-8'
--    LC_CTYPE = 'pt_BR.UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

