import java.util.*;
public class DuplicateRemove {
    public static void main(String[] args){
        LinkedList<Integer> list= new LinkedList<>();

        list.add(10);
        list.add(10);
        list.add(30);

        for(int i=0; i<list.size()-1;i++){
            if(list.get(i).equals(list.get(i+1))){
                list.remove(i+1);
                i--;
            }

        }
        System.out.println(list);
    }
    
}
  