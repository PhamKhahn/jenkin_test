class Example { 
   float x = 100; 
	
   public int getX() { 
      x = 200.855; 
      return x; 
   } 
	
}

static void main(String[] args) {
      Example ex = new Example(); 
      println(Math.floor(ex.getX()))
}