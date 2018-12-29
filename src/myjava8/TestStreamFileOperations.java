package myjava8;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestStreamFileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] words = {"hello","refer","world","level"};

String fileName = "words.txt";
try (PrintWriter pw = new PrintWriter(
	      Files.newBufferedWriter(Paths.get(fileName )))) {
	        Stream.of(words).forEach(pw::println);
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
