
public class ReverseInteger {
	
public int reverse(int x) {
        
        int flag = x>0? 1:-1;
        
       long result=0 ;
       
      long a=2147483648L;
       
       long tmp =x*flag ;
       
       while(tmp!=0){
           result = result*10+ tmp%10;
           tmp=tmp/10;
       }
       
       if(result>2147483647||flag*result >a){
           return 0;
       }
       else{
           return (int)(flag*result);
       }
        
    }

}
