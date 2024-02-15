import java.lang.reflect.Array;

public class Search {

    public static int find_first_true(boolean[] A, int begin, int end){
        if(begin <= end && 0 <= begin && begin < A.length && 0 <= end && end <= A.length){

        }
        else{
            return end;
        }
        for(int i = begin; i < end; i++){
            if(A[i]){
                return i;
            }
        }
        return end;
    }

    public static int find_first_equal(int[] A, int x){

        for(int i = 0; i < A.length; i++){
            if(A[i] == x){
                return i;
            }
        }

        return A.length;
    }

    public static int find_first_true_sorted(boolean[] A, int begin, int end){
        if(A.length == 0){
            return end;
        }
        if(begin <= end && 0 <= begin && begin < A.length && 0 <= end && end <= A.length){

        }
        else{
            return end;
        }
        if(!A[A.length / 2]){
            begin = A.length/2;
        }
        else{
            end = A.length/2;
        }
        for(int i = begin; i < end; i++){
            if(A[i]){
                return i;
            }
        }

        return end;
    }
}
