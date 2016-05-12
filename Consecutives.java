import java.util.List;
import java.util.ArrayList;
public class Consecutives {
    
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
