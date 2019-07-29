	
CREATE TABLE song(
songId int (16) NOT NULL AUTO_INCREMENT,
songName varchar (50) NOT NULL,
PRIMARY KEY (songId));

CREATE UNIQUE INDEX songUniqueIndex ON song (songName);
	
CREATE TABLE artist(
artistId int (16) NOT NULL AUTO_INCREMENT,
artistName varchar (50) NOT NULL,
PRIMARY KEY (artistId));

CREATE UNIQUE INDEX artistUniqueIndex ON artist (artistName);

CREATE TABLE writer(
writerId int (16) NOT NULL AUTO_INCREMENT,
writerName varchar (50) NOT NULL,
PRIMARY KEY (writerId));

CREATE UNIQUE INDEX writerUniqueIndex ON writer (writerName);

CREATE TABLE songArtist(
	songInfoId int (16) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    songId int(16) NOT NULL,
    artistId int(16) NOT NULL,
    FOREIGN KEY (songId) REFERENCES song(songId),
    FOREIGN KEY (artistId) REFERENCES artist(artistId));
  
  CREATE UNIQUE INDEX songArtistUniqueIndex ON songArtist (songId, artistId);

CREATE TABLE songWriter(
	songInfoId int (16) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    songId int(16) NOT NULL,
    writerId int(16) NOT NULL,
    FOREIGN KEY (songId) REFERENCES song(songId),
    FOREIGN KEY (writerId) REFERENCES writer(writerId));
  
  CREATE UNIQUE INDEX songWriterUniqueIndex ON songWriter (songId, writerId);

CREATE TABLE artistInfo(
	artistInfoId int (16) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    artistId int(16) NOT NULL,
    songId int(16) NOT NULL,
	FOREIGN KEY (artistId) REFERENCES artist(artistId),
    FOREIGN KEY (songId) REFERENCES song(songId));
  
  CREATE UNIQUE INDEX artistInfoUniqueIndex ON artistInfo (artistId, songId);
  
CREATE TABLE writerInfo(
	writerInfoId int (16) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    writerId int(16) NOT NULL,
    songId int(16) NOT NULL,
	FOREIGN KEY (writerId) REFERENCES writer(writerId),
    FOREIGN KEY (songId) REFERENCES song(songId));
  
  CREATE UNIQUE INDEX writerInfoUniqueIndex ON writerInfo (writerId, songId);


  


    
    
    