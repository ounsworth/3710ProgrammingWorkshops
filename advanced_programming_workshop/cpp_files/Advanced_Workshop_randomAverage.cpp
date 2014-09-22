#include <iostream>
#include <fstream>
#include <stdio.h>
#include <ctype.h>
using namespace std;

/************************************************************************
 * A program written for the FIRST Robotics teams 3710 & 2809 programming
 * workshop.
 *
 * It reads in a CSV file of random single digit numbers and calculates
 * their average.
 *
 * This program is a sample solution which the kids should come up with
 * their own solution to.
 ************************************************************************/



int main()
{
	// open the file to read.
	ifstream inputFile;
	inputFile.open("randomNumbers0-9.txt");

	int sum = 0;
	int count = 0;
	while(!inputFile.eof() ) {
		char nextChar = inputFile.get();

		if (isdigit(nextChar)) {
			// if you look at an ASCII chart (the number codes for each
			// keyboard character) you'll notice that numbers start at 48,
			// in order to work in the array we need them to start at 0.
			nextChar = nextChar - '0';

			sum += nextChar;
			count++;
			
		} else {
			// if it's not a number (ie comma) we'll ignore
			// it by doing nothing.
		}
	} // end while
	// now that we're done with the input file, let's close it.
	inputFile.close();
	
	// calculate the average and force it to be float division
	float ave = sum / float(count);

	// print out the stats
	printf("The file contains %d numbers whose average is %.2f\n", count, ave);
}
