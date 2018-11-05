import java.util.Iterator;

public class MoneyBagIterator implements Iterator 
{
    private int currentIndex;
    private int maxIndex;
    private Object[] objects;

    public MoneyBagIterator(Object[] objects, int maxIndex)
    {
        super();
        this.objects = objects;
        this.maxIndex = maxIndex;
        this.currentIndex = 0;
    }

    public boolean hasNext()
    {
        if(this.currentIndex >= this.maxIndex)
        {
            return false;
        }
        return true;
    }

    public Object next()
    {
        Object o = this.objects[this.currentIndex];
        this.currentIndex += 1;
        return o;
    }
}