//iD, 2D, Staggered 
import java.util.*;
class Array extends Structure {
	Scanner input = new Scanner(System.in);
	String type, animal;
	public Array() {
	//
	//
}
public void run() {
System.out.print("What type of array would you like to see?");
type = input.next();
System.out.print("What is your Fav animal");
animal = input.next();
switch(type) {
case "single":
	String[] single = new String[5];
	//fill
	for(int i = 0; i < single.length; i++){
		single[i] = animal;
	}
	System.out.println("Here's a line of " + animal + "s to hi to you!");
	//print
	for(int i = 0; i < single.length; i++){
		System.out.print( (i+1) + animal + " ");
	}
case "double":
	String[][] thisArrray = new String[2][2];
	for(int i = 0; 1<2; j++) {
		for(int j = 0; j < 2; j++) {
			thisArray[i][j]=animal;
		}
	}
	System.out.print(thisArray[i][j]);
case "staggered":
}
}
}