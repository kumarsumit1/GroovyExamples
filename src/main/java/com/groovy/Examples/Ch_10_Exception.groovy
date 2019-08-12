package com.groovy.Examples;


class Ch_10_Exception {
  static void main(args) {
	  // ---------- EXCEPTION HANDLING ----------
	  // Handles runtime errors
	
	  try {
		File testFile;
		testFile.append('Line 5');
	  }
	  catch(NullPointerException ex){
	
		// Prints exception
		println(ex.toString());
	
		// Prints error message
		println(ex.getMessage());
	  }
	  catch(Exception ex){
		println("I Catch Everything");
	  }
	  finally {
		println("I perform clean up")
	  }
	
  }	
	
	
}
