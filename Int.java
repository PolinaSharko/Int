public class Int {
  private int myValue = 0;
  public void increment() {
    myValue=myValue+1;
  }
  public void decrement() {
    myValue=myValue-1;
  }
  public void add(Int n) {
    myValue=myValue+n.myValue;
  }
  public void substract(Int n) {		
    myValue=myValue-n.myValue;
  }
  public String toString() {
    String s;
    s=""+myValue; 
    return s;
  }
  public void show() {
    System.out.print(myValue);
  }
  public void set(Int n){
    myValue=n.myValue;
  }
  public void abs(){
    myValue=-myValue;
  }
  public Int pow(Int n, Int p) {
    Int res=new Int();
    Int tmp = new Int();
    Int tmp1 = new Int(); 
    tmp.add(n);
    res.add(n);
    if (n.myValue<0){
      tmp1.set(n);
      n.abs();
    }
    if (p.myValue==0){
      res.increment();
      return res;
    }
    if (n.myValue==0){
       return n;	
    }
    else{ 
       for (int i = 0; i<p.myValue-1; i++){
	 for (int j = 0; j<n.myValue; j++){	
	    res.add(tmp);
         }	
	res.substract(tmp);
	tmp.set(res);
       }
    }
   if (tmp1.myValue<0 && p.myValue%2==0)
   res.abs();
   res.show();
   return res;
   }
  }
                                                                                                                                                                                                                           