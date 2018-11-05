//import java.util.*;
import java.util.Iterator;
public class MoneyBag implements Collection
{

    private final int MAX_SIZE = 100;
    private Object[] objects;
    private int currIndex;

    public MoneyBag()
    {
        super();
        this.objects = new Object[this.MAX_SIZE];
        this.currIndex = 0;
    }

    // Implement methods for collection

    public int size()
    {
        return this.currIndex;
    }

    public void clear()
    {
        for(int i = 0; i <= this.currIndex; i++)
        {
            this.objects[i] = null;
        }
    }

    private void deleteAtIndex(int idx)
    {
        Object temp;
        for(int i = idx; i < this.currIndex; i++)
        {
            this.objects[i] = this.objects[i - 1];
        }
        this.objects[this.currIndex] = null;
        this.currIndex -= 1;
    }

    public boolean add(Object o)
    {
        if(this.currIndex < this.MAX_SIZE - 2)
        {
            
            this.objects[this.currIndex] = o;
            this.currIndex += 1;
            return true;
        }
        return false;
    }

    public boolean remove(Object o)
    {
        int loc = -1;
        for(int i = 0; i <= this.currIndex; i++)
        {
            Object curr = this.objects[i];
            if(curr.equals(o))
            {
                loc = i;
            }
        }

        if (loc > -1)
        {
            this.deleteAtIndex(loc);
            return true;
        }
        return false;
    }

    public Iterator iterator()
    {
        return (new MoneyBagIterator(this.objects, this.currIndex));
    }

    public boolean retainAll(Collection c)
    {
        return true;
    }


}