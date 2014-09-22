#include <iostream>
#include <fstream>
#include <stdio.h>
#include <ctype.h>
using namespace std;

/************************************************************************
 * A program written for the FIRST Robotics teams 3710 & 2809 programming
 * workshop.
 *
 * Introduces the notion of objects.
 *
 * This program will be presented (ie reconstructed on a projector).
 ************************************************************************/

class Fruit
{
	public :
		string colour;
		bool hasSeeds;


	/* CONSTRUCTOR - No params */
	public :
	Fruit() {
		// We have to initialize all variables, or else the program may
		// crash if someone calls printInfo() before we've given them
		// values.
		colour = "colourless";
		hasSeeds = false;
	}

	/* CONSTRUCTOR - 2 params */
	Fruit(string _colour, bool _hasSeeds) {
		colour = _colour;
		hasSeeds = _hasSeeds;
	}

	void printInfo();

};

void Fruit::printInfo() {
		printf("This fruit is %s and it ", colour.c_str());
		
		if (hasSeeds)
			printf("has seeds.\n");
		else
			printf("does not have seeds.\n");

	}


int main()
{
	Fruit* apple = new Fruit();
	apple->colour = "red";
	apple->hasSeeds = true;
	apple->printInfo();

	Fruit* banana = new Fruit("yellow", false);
	banana->printInfo();
	
}
