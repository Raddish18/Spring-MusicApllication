package ie.cian.domain;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ie.cian.services.ArtistService;
import ie.cian.services.SongService;
import ie.cian.services.SongServiceImplementation;
import ie.cian.services.WriterService;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SongService songServ = (SongService) context.getBean("songServiceImplementation");
		ArtistService artistServ = (ArtistService) context.getBean("artistServiceImplementation");
		WriterService writerServ = (WriterService) context.getBean("writerServiceImplementation");
		
		while(true) {
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("                   Menu                  ");
			System.out.println("1. List All Songs");
			System.out.println("2. List Artists");
			System.out.println("3. List Writers");
			System.out.println("4. Add New Song");
			System.out.println("5. Add New Artist");
			System.out.println("6. Add New Writer");
			System.out.println("7. Assosiate Existing Song with an Artist");
			System.out.println("8. Exit");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			Scanner keyboard = new Scanner(System.in);
			
			while (!keyboard.hasNextInt()) {
				   System.out.println("Number, please!");
				   keyboard.nextLine();
				}
			int choice = keyboard.nextInt();
			
			switch(choice)
			{
			case 1:
				List<Song> song = songServ.getAllSongs();
				int count = 1;
				for(Song s: song) {
					System.out.println(count + ". " + s.toString());
					count++;
				}
				System.out.println("If you would like to see info for a song please type its number:");
				int in = keyboard.nextInt();
				while (!keyboard.hasNextInt()) {
					   System.out.println("Number, please!");
					   keyboard.nextLine();
					}
				if (in <= song.size()) {
					
					System.out.println(song.get(in-1));
					System.out.println("Artist: ");
					List<Artist>artists = songServ.songArtist(in);
					for (Artist a: artists) {
						System.out.println(a.toString());
					};
					System.out.println("Writer: ");
					List<Writer>writers = songServ.songWriter(in);
					for (Writer w: writers) {
						System.out.println(w.toString());
					};
				}
				else {
					System.out.println("Enter a valid song number.");
				}
				break;
			case 2:
				List<Artist> artist = artistServ.getAllArtists();
				int counta = 1;
				for(Artist a: artist) {
					System.out.println(counta + ". " + a.toString());
					counta++;
				}
				System.out.println("If you would like to see info for an Artist please type their number:");
				int inA = keyboard.nextInt();
				if (inA <= artist.size()) {
					
					System.out.println(artist.get(inA-1));
					System.out.println("Songs: ");
					List<Song>songs = artistServ.artistSong(inA);
					for (Song s: songs) {
						System.out.println(s.toString());
					};
				}
				else {
					System.out.println("Enter a valid song number.");
				}
				
				break;
			case 3:
				List<Writer> writer = writerServ.getAllWriter();
				int countw = 1;
				for(Writer w: writer) {
					System.out.println(countw + ". " + w.toString());
					countw++;
				}
				System.out.println("If you would like to see info for an Writer please type their number:");
				int inW = keyboard.nextInt();
				if (inW <= writer.size()) {
					
					System.out.println(writer.get(inW-1));
					System.out.println("Songs: ");
					List<Song>songs = writerServ.writerSong(inW);
					for (Song s: songs) {
						System.out.println(s.toString());
					};
				}
				else {
					System.out.println("Enter a valid song number.");
				}
				break;
			case 4:
				String newSong = keyboard.next();
				songServ.saveNew(newSong);
				break;
			case 5:
				String newArtist = keyboard.next();
				artistServ.saveNew(newArtist);
				break;
			case 6:
				String newWriter = keyboard.next();
				writerServ.saveNew(newWriter);
				break;
			case 7:
				break;
			case 8:
				context.close();
				break;
			default:
				System.out.println("Please enter a number from the menu!");
			}
			
				
		}
		
		
		

	}

}
