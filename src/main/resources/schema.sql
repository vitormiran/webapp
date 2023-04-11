
CREATE TABLE IF NOT EXISTS Content (
    id SERIAL primary key,
    title varchar(255) NOT NULL,
    descr TEXT,
    status status NOT NULL,
    content_type type not NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url varchar(255)
);

--TRUNCATE TABLE Content;

--insert into Content(title,descr,status,content_type,date_created)
--values ('my spring boot post','description','IDEA','ARTICLE',CURRENT_TIMESTAMP)