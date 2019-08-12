package com.groovy.Examples;


class Ch_05_Map {

	static void main(args) {
		  // ---------- MAPS ----------
  // List of objects with keys versus indexes

  def paulMap = [
    'name' : 'Paul',
    'age' : 35,
    'address' : '123 Main St',
    'list' : [1,2,3]
  ];

  // Access with key
  println("Name " + paulMap['name']);
  println("Age " + paulMap.get('age'));
  println("List Item " + paulMap['list'][1]);

  // Add key value
  paulMap.put('city', 'Pittsburgh');

  // Check for key
  println("Has City " + paulMap.containsKey('city'));

  // Size
  println("Size " + paulMap.size());

  // ---------- RANGE ----------
  // Ranges represent a range of values in shorthand notation

  def oneTo10 = 1..10;
  def aToZ = 'a'..'z';
  def zToA = 'z'..'a';

  println(oneTo10);
  println(aToZ);
  println(zToA);

  // Get size
  println("Size " + oneTo10.size());

  // get index
  println("2nd Item " + oneTo10.get(1));

  // Check if range contains
  println("Contains 11 " + oneTo10.contains(11));

  // Get last item
  println("Get Last " + oneTo10.getTo());

  println("Get First " + oneTo10.getFrom());

  // ---------- CONDITIONALS ----------
  // Conditonal Operators : ==, !=, >, <, >=, <=

  // Logical Operators : && || !

  def ageOld = 6;

  if(ageOld == 5){
    println("Go to Kindergarten");
  } else if((ageOld > 5) && (ageOld < 18)) {
    printf("Go to grade %d \n", (ageOld - 5));
  } else {
    println("Go to College");
  }

  def canVote = true;

  // Ternary operator
  println(canVote ? "Can Vote" : "Can't Vote");

  // Switch statement
  switch(ageOld) {
    case 16: println("You can drive");
    case 18:
      println("You can vote");

      // Stops checking the rest if true
      break;
    default: println("Have Fun");
  }

  // Switch with list options
  switch(ageOld){
    case 0..6 : println("Toddler"); break;
    case 7..12 : println("Child"); break;
    case 13..18 : println("Teenager"); break;
    default : println("Adult");
  }


		
	}
}
