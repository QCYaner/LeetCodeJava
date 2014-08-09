
public class RemoveDuplicatesfromSortedArray {
	
public int removeDuplicates(int[] A) {
        
        int num =1;
        int len = A.length;
        if(len==0){
            return 0;
        }
        
    for(int i=1;i<len;i++){
        if(A[i]>A[i-1]){
            A[num++]=A[i];
        }
    }
    
    return num;
    }

}
