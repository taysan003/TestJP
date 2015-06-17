/**
 * Created by Andrey on 13.06.15.
 */
public class Accomulator <AccType> {
    private AccType acc;
    public Accomulator(AccType a)
    {
        acc =a;

    }
    public  AccType getAcc()
    {
        return acc;
    }
    @SuppressWarnings("unchecked")
    public void Add(AccType a) {
       if (a instanceof  String)
        acc = (AccType)((String)acc+(String)a);

        if (a instanceof  Integer)
            acc = (AccType)((Integer)((Integer)acc+(Integer)a));
    }

}
