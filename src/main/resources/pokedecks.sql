create schema pokedecks;

set search_path to pokedecks;


create table roles (
   roleid int primary key,
   role varchar not null
);


create table users (
    userid int generated always as identity primary key,
    email varchar unique not null,
    username varchar unique not null,
    pw varchar unique not null check (length(pw) >= 6),
    roleid int,

	constraint roles_fk
	foreign key (roleid)
	references roles(roleid)
);

create table cards (
    cardid varchar primary key,
    cardurl varchar not null
);


create table UserDeckCards (
    userid int,
    cardid varchar,
    quantity int default '1',
    
    constraint user_deck_cards_pk
    primary key (userid, cardid),

	constraint users_fk
	foreign key (userid)
	references users (userid),
	
	constraint cards_fk
	foreign key (cardid)
	references cards (cardid)
);

create table UserFavoriteCards (
    userid int,
    cardid varchar,
   
    
    constraint user_favorite_cards_pk
    primary key (userid, cardid),

	constraint cardf_fk
	foreign key (cardid)
	references cards (cardid),
	
	constraint usersf_fk
	foreign key (userid)
	references users (userid)
);