#include <iostream>
#include <fstream>
#include <stdio.h>
#include <ctype.h>
using namespace std;

/************************************************************************
 * A program written for the FIRST Robotics teams 3710 & 2809 programming
 * workshop.
 *
 * It reads in an arbitrary text file and counts how many of each alphabet
 * character the file contains.
 *
 * This program will be presented (ie reconstructed on a projector).
 ************************************************************************/



int main()
{
	// open the file to read.
	ifstream inputFile;
	inputFile.open("Lord_of_the_Rings.txt");

	// make an array to hold the count for each letter and set each
	// cell to zero.
	int* letterCount = new int[26];
	for(int i=0; i < 26; i++) {
		letterCount[i] = 0;
	}
	
	while(!inputFile.eof() ) {
		char nextChar = inputFile.get();

		if (isalpha(nextChar)) {
			// make it lower case
			nextChar = tolower(nextChar);

			// if you look at an ASCII chart (the number codes for each
			// keyboard character) you'll notice that lower case letters
			// start at 97, in order to work in the array we need them
			// to start at 0.
			nextChar = nextChar - 'a';

			letterCount[nextChar]++;
		} else {
			// if it's not a letter (ie number or puncutation) we'll ignore
			// it by doing nothing.
		}
	} // end while
	// now that we're done with the input file, let's close it.
	inputFile.close();

	// Now let's print out all the counts
	for(int i=0; i < 26; i++) {
		char letter = i+97;
		
		printf("%c: %d\n", letter, letterCount[i]);
	}
}
