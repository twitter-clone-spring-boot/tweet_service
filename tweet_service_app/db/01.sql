DROP TABLE IF EXISTS tweet;

CREATE TABLE tweet (
  id VARCHAR(255) NOT NULL,
   content VARCHAR(255) NULL,
   user_id VARCHAR(255) NULL,
   created_at datetime NULL,
   updated_at datetime NULL,
   total_likes INT NULL,
   total_comments INT NULL,
   CONSTRAINT pk_tweet PRIMARY KEY (id)
);