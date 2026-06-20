import java.util.*;
public class linearsearch{
public static void main(String args[]){
    int [] arr = {10,3,4,6,7};
   int target = 3;
   int found = 0;
    for(int i = 0;i<arr.length;i++){
        if(arr[i] == target){
            System.out.println("index of target value is  "+i);
        found++;
        }
      
    }
    if(found==0){
        System.out.println("number not found");
    }
}
}