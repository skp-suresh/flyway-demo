CREATE TABLE publisher
(
    id INT NOT NULL PRIMARY KEY, -- primary key column
    name varchar(50) NOT NULL,
    address varchar(50) NOT NULL
);

insert into publisher values(1, 'pub1', 'address1');
insert into publisher values(2, 'pub2', 'address2');

-- ALTER table book add publisher_id int not null;
-- update book set publisher_id=2;


-- alter table book add FOREIGN KEY (fk_publisher_id) REFERENCES publisher(id);