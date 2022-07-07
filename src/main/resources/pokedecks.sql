create schema pokedecks;

set search_path to pokedecks;

create table roles (
	roleid int primary key,
	name varchar
);

insert into roles (roleid, name) values
(1, 'admin'), (2, 'basic');

create table cards (
    cardid varchar primary key,
    cardurl varchar not null
);

create table users (
    userid int generated always as identity primary key,
    email varchar unique not null,
    username varchar unique not null,
    pw varchar not null check (length(pw) >= 6),
    roleid int,

	constraint roles_fk
	foreign key (roleid)
	references roles(roleid)
);

create table UserFavoriteCards (
	userid int,
    cardid varchar,
    primary key (userid, cardid),

	constraint cardf_fk
	foreign key (cardid)
	references cards (cardid),

  constraint usersf_fk
	foreign key (userid)
	references users (userid)
);

create table Deck (
	id int generated always as identity primary key,
    name varchar,
    owner_id int,

	constraint usersf_fk
	foreign key (owner_id)
	references users (userid)
);

create table DeckCards (
	deckid int,
    cardid varchar,
    quantity int,

    primary key (deckid, cardid),

	constraint cardf_fk
	foreign key (cardid)
	references cards (cardid),

	constraint deckf_fk
	foreign key (deckid)
	references Deck (id)
);

