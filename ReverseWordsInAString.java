
public class ReverseWordsInAString {
	
public String reverseWords(String s) {
        
        
        if (s == null || s.length() == 0) {
			return "";
		}
		
		s= s.trim();


        String[] array= s.split(" ");
        int len = array.length;
        
        StringBuilder result = new StringBuilder();
        
        for(int i=len-1; i>=0; i--){
            
            if(!array[i].equals(""))
            result.append(array[i]).append(" ");
        }
        
        return result.length()==0?"":result.substring(0,result.length()-1);
    }

}
