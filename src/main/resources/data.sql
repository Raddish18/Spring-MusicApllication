INSERT INTO song(songName) VALUES 
('ATTENTION'),
('TONYA'),
('VIVID');

INSERT INTO artist(artistName) VALUES 
('Joji'),
('BROCKHAMPTON');

INSERT INTO writer(writerName) VALUES 
('George Miller'),
('Kevin Abstract'),
('Merlyn Wood'),
('Dom McLennon');


INSERT INTO songArtist(songId, artistId) VALUES
(1, 1),
(2, 2),
(3, 2);

INSERT INTO songWriter(songId, writerId) VALUES
(1, 1),
(2, 2),
(2, 3),
(2, 4),
(3, 2),
(3, 3),
(3, 4);

INSERT INTO artistInfo(artistId, songId) VALUES
(1, 1),
(2, 2),
(2, 3);

INSERT INTO writerInfo(writerId,songId) VALUES
(1, 1),
(2, 2),
(3, 2),
(4, 2),
(2, 3),
(3, 3),
(4, 3);