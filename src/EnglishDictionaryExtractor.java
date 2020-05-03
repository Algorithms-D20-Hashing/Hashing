import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class EnglishDictionaryExtractor implements Iterable<String>, Iterator<String> {

	/**
	 * If this class doesn't work RIGHT OUT OF THE BOX for you, then you will need to
	 * change this value to refer to the actual File location where
	 * 
	 * What works on my PC computer is the following (on PC you need to have \\ for directory dividers)
	 * On Macs and Linux, these become "/users/someone/git/another" but you might not need these.
	 * 
	 * new File("C:\\Users\\Laptop\\git\\cs2223d20\\Algorithms D2020\\tale");
	 */
	File actualDir = null;
	
	/** Processes the input from the designated chapter. */ 
	Scanner sc;
	
	/**
	 * There are forty-five chapters, from 1 to 45.
	 *     
	 * @throws IOException
	 */
	public EnglishDictionaryExtractor() throws IOException {
		File taleDir = null;
		// let user override if possible
		if (actualDir != null) {
			taleDir = actualDir;
		} else {
			String homeDir = System.getProperty("user.home");  // %HOMEDIR%/git is where git places files
			String gitDir = "git";
			String gitProject = "Hashing";                   // my git repo is here
			String dir = "src";                   // this is the name of my project
			String tale = "tale";                              // folder contains all chapters
			taleDir = new File (new File(new File(new File(homeDir), gitDir), gitProject), dir);
		}
		
		sc = new Scanner(new File(taleDir, "words.english.txt"));
	}
	
	@Override
	public Iterator<String> iterator() {
		return this;
	}
	
	@Override
	public boolean hasNext() {
		return sc.hasNext();
	}

	@Override
	public String next() {
		return sc.next();
	}
	
	/** Run this to validate that it works. If not, see a TA/SA/Professor immediately. */
	public static void main(String[] args) throws IOException {
		EnglishDictionaryExtractor te = new EnglishDictionaryExtractor();
		
		String firstWord = te.next();
		String secondWord = te.next();
		
		if (!firstWord.equals("a")) {
			throw new RuntimeException ("first word MUST be it in the book!");
		}
		if (!secondWord.equals("aa")) {
			throw new RuntimeException ("second word MUST be it in the book!");
		}
		
		System.out.println("Looks like this is working.");
	}
}