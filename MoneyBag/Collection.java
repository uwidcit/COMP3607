import java.util.Iterator;

public interface Collection
{
    public int size();
    
    public void clear();

    public boolean add(Object o);
    

    public boolean remove(Object o);
    

    public Iterator iterator();
}