class exception extends Exception{
   String str1;
   exception(String str2) {
	str1=str2;
   }
   public String toString(){ 
	return ("exception Occurred: "+str1) ;
   }
}

class example{
   public static void main(String args[]){
	try{
		System.out.println("Starting of try block");
		throw new exception("This is My error Message");
	}
	catch(exception exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
   }
}