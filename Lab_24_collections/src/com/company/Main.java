
import java.util.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List <String>array = new ArrayList<String>();
        array.add("Kostia");
        array.add("Andrey");
        array.add("Sergei");
        Iterator<String> iterator = array.iterator();
        while (iterator.hasNext())
        {
            String s = iterator.next();
            out.println(s);
        }
        //for (Object o : array)
         //   out.println(0);

        for (int i=0; i<array.size(); i++)
        {out.println(array.get(i));}

        out.println(array.get(1));


        Map<String, Integer> persons = new Hashtable<String, Integer>();
        persons.put("Sergei", 33);
        persons.put("Vasia", 32);
        persons.put("Genai", 31);

        for(Map.Entry<String, Integer> p: persons.entrySet())
        {
            out.printf("%s %d\n", p.getValue());
            p.getKey();
        }
    }
}
