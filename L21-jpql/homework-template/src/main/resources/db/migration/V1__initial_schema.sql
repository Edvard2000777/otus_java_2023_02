-- Для @GeneratedValue(strategy = GenerationType.IDENTITY)

-- create table client
-- (
--     id   bigserial not null primary key,
--     name varchar(50)
-- );


-- Для @GeneratedValue(strategy = GenerationType.SEQUENCE)
CREATE SEQUENCE IF NOT EXISTS client_SEQ start with 1 increment by 1;

create table client
(
    id   bigint not null primary key,
    name varchar(50)
);
create table address
(
    id   bigserial not null primary key,
    street text,
    client_id bigint
);

create table phone
(
    id   bigserial not null primary key,
    number text,
    client_id bigint
);
