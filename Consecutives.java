import java.util.List;
import java.util.ArrayList;
/**
 * Consecutives Challenge transform a list of intergers into a new list of consecuitve sums
 * @author Jeremi R Frazier
 * @version 1.0.12
 */
public class Consecutives {
   
   /**
    * this method takes a list of integers and return a new list that is the consecutive sum
    * @pararm s - the list of integers
    * @return List<Integer> - the list of consecutive sums for s
    */
    public static List<Integer> sumConsecutives(List<Integer> s) {
        int result = 0;
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i < s.size();i++){
          result = s.get(i);
          for(int j=i+1; j< s.size();j++){
            if(s.get(i) == s.get(j)){
              result+=s.get(j);
              i++;
            }
            else{
              myList.add(result);
              break;
            }
          }
        if(i == s.size()-1){
        myList.add(result);
        }
       }
        return myList;
        }
}
