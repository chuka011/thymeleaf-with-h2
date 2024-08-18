create table if not exists tournament (
    id serial primary key ,
    title text not null ,
    tyear integer not null
);