package com.groovy.Examples;


/*class Ch_04_List {

	static void main(args) {*/

   // ---------- LISTS ----------
  // Lists hold a list of objects with an index

  def primes = [2,3,5,7,11,13];

  // Get a value at an index
  println("2nd Prime " + primes[1]);
  println("3rd Prime " + primes.get(2));

  // They can hold anything
  def employee = ['Derek', 40, 6.25, [1,2,3]];

  println("2nd Number " + employee[3][1]);

  // Get the length
  println("Length " + primes.size());

  // Add an index
  primes.add(17);

  // Append to the right
  primes<<19;
  primes.add(23);

  // Concatenate 2 Lists
  primes + [29,31];

  // Remove the last item
  primes - [31];

  // Check if empty
  println("Is empty " + primes.isEmpty());

  // Get 1st 3
  println("1st 3 " + primes[0..2]);

  println(primes);

  // Get matches
  println("Matches " + primes.intersect([2,3,7]));

  // Reverse
  println("Reverse " + primes.reverse());

  // Sorted
  println("Sorted " + primes.sort());

  // Pop last item
  println("Last " + primes.pop());
  
  
  
  // Searching in a list with find, findall and grep
  def l1 = ['test', 12, 20, true]
  // check with grep that one element is a Boolean
  assert [true] == l1.grep(Boolean)
  
  // grep for all elements which start with a pattern
  assert ['Groovy'] == ['test', 'Groovy', 'Java'].grep(~/^G.*/)
  
  // grep for if the list contains b and c
  assert ['b', 'c'] == ['a', 'b', 'c', 'd'].grep(['b', 'c'])
  
  // grep for elements which are contained in the range
  assert [14, 16] == [5, 14, 16, 75, 12].grep(13..17)
  
  // grep for elements which are equal to 42.031
  assert [42.031] == [15, 'Peter', 42.031, 42.032].grep(42.031)
  
  // grep for elements which are larger than 40 based on the closure
  assert [50, 100, 300] == [10, 12, 30, 50, 100, 300].grep({ it > 40 })
		
/*	}
}
*/