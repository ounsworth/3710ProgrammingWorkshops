/************************************************************************
 * A program written for the FIRST Robotics teams 3710 & 2809 programming
 * workshop.
 *
 * It reads in an arbitrary text file and counts how many of each alphabet
 * character the file contains.
 *
 * This program will be presented (ie reconstructed on a projector).
 ************************************************************************/

import java.io.*;
import java.util.*;

public class Advanced_Workshop_letterCount {
    
    public static void main(String args[]){

        // Using the file IO helper code TextFile written by Queen's
        // prof Margaret Lamb
        TextFile inputFile = new TextFile(TextFile.INPUT, "Lord_of_the_Rings.txt");


        // make an array to hold the count for each letter and set each
	    // cell to zero.
        int[] letterCount = new int[26];
        for(int i = 0; i < 26; i++)
            letterCount[i] = 0;

        // now read the file one character at a time
        // until 
        while (! inputFile.eof() ){
            char nextChar = inputFile.readChar();

            // we only care about letters, skip numbers, punctuation, spaces, etc.
            if (TextFile.isLetter(nextChar)) {
                // make it lower case
                nextChar = Character.toLowerCase(nextChar);

                // if you look at an ASCII chart (the number codes for each
                // keyboard character) you'll notice that lower case letters
                // start at 97, in order to work in the array we need them
                // to start at 0.
                int arrayIdx = nextChar - 'a';
    
                letterCount[arrayIdx]++;
            else {
                // if it's not a letter (ie number or puncutation or space)
                // we'll ignore it by doing nothing.
            }    
        } // end while

        // Now let's print out all the counts
	    for(int i=0; i < 26; i++) {
	        char c = (char)i;
	        c += 97;

		    System.out.println("letter "+ c+": "+ letterCount[i]);
	    }
    }
}
