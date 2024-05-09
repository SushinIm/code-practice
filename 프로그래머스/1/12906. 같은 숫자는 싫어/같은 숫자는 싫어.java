import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        
		int[] answer = {};
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] != arr[i]){
                count++;
            }
        }
        
        int index = 1;
        int flag = 0;
        answer = new int[count];
        flag = arr[0];
        answer[0] = flag;
        for(int i : arr){
            if(flag != i){
                flag = i;
            	answer[index] = flag;
                index++;
            }
        }
        
        return answer;
    }
}