/**
 * Created by Andrey on 13.06.15.
 */
public class Main {

    public static void main (String[] args){
        Accomulator<String> acc1=new Accomulator<String>("Eneter");

        acc1.Add("Hello!");

        Accomulator<Integer> acc2=new Accomulator<Integer>(123);

        acc2.Add(137);
        System.out.printf("%s %d", acc1.getAcc(), acc2.getAcc());


    }
}
