
public class RemoveDuplicatesfromSortedArrayII {
	
public int removeDuplicates(int[] A) {
        
        if(A.length<3)
        return A.length;
        int num=1;
        int tmp=A[1];
        for(int i=2;i<A.length;i++){
            if(A[i]!=A[i-2]){
                A[num++]=tmp;
                tmp= A[i];
            }
        }
        A[num++]=tmp;
        
        return num;
    }

}
