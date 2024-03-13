public class Mayor {

    public static void main(String[] args) {
       
       int a = 4; 
       int b = 7;
       
       System.out.println(mayor(a , b));
       
    }
    
    public static int mayor(int a1 , int b){
    
    if(a1 > b){
    
    System.out.println("ES MAYOR");
    return a1;
    }else{
     System.out.println("ES MAYOR" );  
    return b;
    }
    
    
  }
    
    
}

