package counter.daoimpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import counter.dao.counterDAO;

public class counterDAOImpl implements counterDAO {
	
	Set<String> wordStorage = new HashSet<String>();
	ArrayList<Integer> wordCountStorage = new ArrayList<Integer>();
	int wordCount1, wordCount2, wordCount3, wordCount4, wordCount5, wordCount7, wordCount10;
	
	public void setFile(String myFile) {
		// TODO Auto-generated method stub
		
		File File = new File(myFile);
		Scanner myReader = null;
		
		// Uses the newly created scanner to capture file input
		try {
			myReader = new Scanner(File);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Determines the next word in the file and adds it to an array
		while (myReader.hasNext()) {
			String data = myReader.next();
			wordStorage.add(data.replaceAll("[^a-zA-z0-9]", ""));
		}
	}

	public int getWordCount() {
		// TODO Auto-generated method stub
		
		int wordCountTotal = wordStorage.size();
		
		return(wordCountTotal);
	}

	public int getFirstNumberForEachLength() {
		// TODO Auto-generated method stub
		
		// Iterates through each word in the file and calculates how often each word length occurs
		for (Iterator<String> iterator = wordStorage.iterator(); iterator.hasNext();) {
			String counter = iterator.next();
			if (counter.length() == 1) {
				wordCount1 += 1;
			}
		}
		
		wordCountStorage.add(wordCount1);
		
		return(wordCount1);
	}
	
	public int getSecondNumberForEachLength() {
		// TODO Auto-generated method stub
		
		// Iterates through each word in the file and calculates how often each word length occurs
		for (Iterator<String> iterator = wordStorage.iterator(); iterator.hasNext();) {
			String counter = iterator.next();
			if (counter.length() == 2) {
				wordCount2 += 1;
			}
		}
		
		wordCountStorage.add(wordCount2);
		
		return(wordCount2);
	}
	
	public int getThirdNumberForEachLength() {
		// TODO Auto-generated method stub
		
		// Iterates through each word in the file and calculates how often each word length occurs
		for (Iterator<String> iterator = wordStorage.iterator(); iterator.hasNext();) {
			String counter = iterator.next();
			if (counter.length() == 3) {
				wordCount3 += 1;
			}
		}
		
		wordCountStorage.add(wordCount3);
		
		return(wordCount3);
	}
	
	public int getFourthNumberForEachLength() {
		// TODO Auto-generated method stub
		
		// Iterates through each word in the file and calculates how often each word length occurs
		for (Iterator<String> iterator = wordStorage.iterator(); iterator.hasNext();) {
			String counter = iterator.next();
			if (counter.length() == 4) {
				wordCount4 += 1;
			}
		}
		
		wordCountStorage.add(wordCount4);
		
		return(wordCount4);
	}
	
	public int getFifthNumberForEachLength() {
		// TODO Auto-generated method stub
		
		// Iterates through each word in the file and calculates how often each word length occurs
		for (Iterator<String> iterator = wordStorage.iterator(); iterator.hasNext();) {
			String counter = iterator.next();
			if (counter.length() == 5) {
				wordCount5 += 1;
			}
		}
		
		wordCountStorage.add(wordCount5);
		
		return(wordCount5);
	}
	
	public int getSeventhNumberForEachLength() {
		// TODO Auto-generated method stub
		
		// Iterates through each word in the file and calculates how often each word length occurs
		for (Iterator<String> iterator = wordStorage.iterator(); iterator.hasNext();) {
			String counter = iterator.next();
			if (counter.length() == 7) {
				wordCount7 += 1;
			}
		}
		
		wordCountStorage.add(wordCount7);
		
		return(wordCount7);
	}
	
	public int getTenthNumberForEachLength() {
		// TODO Auto-generated method stub
		
		// Iterates through each word in the file and calculates how often each word length occurs
		for (Iterator<String> iterator = wordStorage.iterator(); iterator.hasNext();) {
			String counter = iterator.next();
			if (counter.length() == 10) {
				wordCount10 += 1;
			}
		}
		
		wordCountStorage.add(wordCount10);
		
		return(wordCount10);
	}
}