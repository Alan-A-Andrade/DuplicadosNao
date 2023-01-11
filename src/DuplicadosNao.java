import java.util.*;

public class DuplicadosNao{

    public static void main(String[] args) throws Exception {

      String[] array1 = new String[]{"a","a", "b", "c", "d"};
      String[] array2 = new String[]{"a", "b", "c"};
      String[] array3 = new String[]{"e", "f", "g", "h"};


      execute(array2, array3);
    }

   private static void execute(String[] array1, String[] array2) {
    
    List<String> list1 = Arrays.asList(array1);
    List<String> list2 = Arrays.asList(array2);
    List<String> result = new ArrayList<>();
    

    for (int i = 0; i < list1.size(); i++) {
      
      String value = list1.get(i);

      if(list2.contains(value) && !result.contains(value)){

        result.add(value);
   
      }
  
    }

    System.out.println("os itens duplicados são "+result);
   }
}



