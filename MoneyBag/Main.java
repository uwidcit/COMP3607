import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {
        MoneyBag bag = new MoneyBag();
        Double a = 19.95;
        Integer b = 100;
        Double c = 24.25;
        bag.add(a);
        bag.add(b);
        bag.add(c);
        Iterator it = bag.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}