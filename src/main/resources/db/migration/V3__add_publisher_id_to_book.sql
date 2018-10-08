alter table book add publisher_id int;
alter table book add FOREIGN key (publisher_id) REFERENCES publisher(id);
