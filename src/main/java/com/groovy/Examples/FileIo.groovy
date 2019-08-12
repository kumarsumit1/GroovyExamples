package com.groovy.Examples;


import static groovy.io.FileType.FILES
def dir = new File("C:\\Users\\eclipse-workspace\\TestGroovy\\src\\");
def files = [];
dir.traverse(type: FILES, maxDepth: 0) { files.add(it) };

println(files)

def dirPath ="C:\\Users\\eclipse-workspace\\TestGroovy\\src\\"
def datFiles = new FileNameByRegexFinder().getFileNames(dirPath, /.*\.dat/)
println(datFiles)

for(def file : datFiles) {
	println ("Processing file :: "+file)
	def fileRowCount= new File(file).readLines().size()
	int rowNum = 0
	int ctl= 0
	int headerLength = 0
	for(def line : new File(file).readLines()) {		
			if (rowNum==0){
				headerLength= line.split(",").size() ;
				ctl=new File(file.take(file.size()-3)+"ctl").readLines()[1].split(" ")[1].toInteger()
			}
			
			//Checking Error file
			if(rowNum ==0 & headerLength == 1 & line.contentEquals("ERROR:")) {
			  println ("The file is an error file with header :: " +line)
			  break;	
			}
			
			
			//Checking row length
			if(headerLength != line.split(",").size() & rowNum <= 5) {
				println( "File mismatch occured in line no: "+rowNum)
				println( "The header length is "+headerLength +" while the length of row is " + line.split(",").size())
				break;
			}
		
			//Checking row count
			if(ctl != fileRowCount & rowNum == 0) {
				println( "Row count mismatch occured ") ;
				println ("The Crl file count is "+ctl);
				println ("The File row count is "+fileRowNum)
				break;
			} else if (ctl == fileRowCount & rowNum == 0){
			   println " Row count matches "
			}
		
			rowNum++
		
		}
	
}

