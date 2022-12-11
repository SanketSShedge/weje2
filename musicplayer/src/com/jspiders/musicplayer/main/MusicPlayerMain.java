package com.jspiders.musicplayer.main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import com.jspiders.musicplayer.object.SongOperation;

public class MusicPlayerMain {
	
	static boolean loop = true;
	static Scanner scanner = new Scanner(System.in);
	static SongOperation songOperation = new SongOperation();
	
	public static void main(String[] args) {
		multiPlayer();
		while (loop) {
			multiPlayer();
		}
		try {
			if(SongOperation.connection!=null) {
				SongOperation.connection.isClosed();  
			}
			if(SongOperation.statement!=null) {
				SongOperation.statement.close();
			}
			if(SongOperation.callableStatement!=null) {
				SongOperation.callableStatement.close();
			}
			if(SongOperation.preparedStatement!=null) {
				SongOperation.preparedStatement.close();
			}
			if(SongOperation.resultSet!=null) {
				SongOperation.resultSet.close();
			}
			if(SongOperation.fileReader!=null) { 
				SongOperation.fileReader.close();
			}
			if(SongOperation.scanner!=null) {
				SongOperation.scanner.close();
			}
			
			System.err.println("all connections are closed..");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void multiPlayer() {
		System.out.println("Menu:-\n1.Show Song-Table\n2.Play \n3.Add/Remove \n4.Edit \n5.Exit");
		System.err.println("Choose option :-");
		int key = scanner.nextInt();
		
		switch (key) {
		case 1:
			songOperation.songTable();
			multiPlayer();
			break;
		case 2: {
			System.out.println("1.Choose song \n2.Play all songs \n3.Random song \n4.Go back.\n");
			System.err.println("Choose option :-");
			int key1 = scanner.nextInt();
			
			switch (key1) {
				case 1: {
					songOperation.playSpeificSong();
					break;
				}
				case 2: {
					songOperation.playAllSong();
					break;
				}
				case 3: {
					songOperation.playRandomSong();
					break;
				}
				case 4: {
					multiPlayer();
					break;
				}
				default :
					System.err.println("Invalid input");
					multiPlayer();
					break;
				}
			break;
		}
		case 3: {
			System.out.println("1.Add song \n2.Remove song \n3. Go back");
			System.err.println("Choose option :-");
			int key2 = scanner.nextInt();
			switch (key2) {
				case 1: {
					songOperation.addSong();
					break;
				}
				case 2: {
					songOperation.removeSong();
					break;
				}
				case 3: {
					multiPlayer();
					break;
				}
				default:
					System.err.println("Invalid input");
			}
			break;
		}
		case 4: {
			songOperation.editPlaylist();
			multiPlayer();
			break;
		}
		case 5:
			loop=false;
			break;
		default : {
			System.err.println("Invalid input");			
		}
		}
	}
}
