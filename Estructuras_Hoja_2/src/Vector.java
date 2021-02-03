import java.util.ArrayList;

public class Vector<E> implements Stack<E>{
	protected ArrayList<E> data;

	public Vector()
	{
		data = new ArrayList<E>();
	}
	
	
	@Override
	public void push(E item)
	{
		data.add(item);
	}
	
	
	@Override
	public E pop()
	{
		return data.remove(size()-1);
	}
	
	
	
	@Override
	public E peek()
	{
		return data.get(size() - 1);
	}
	
	
	@Override
	public int size()
	{
		return data.size();
	}
	
	
	
	@Override
	public boolean empty()
	{
		return size() == 0;
	}
	
	public E index(int index) {
		return data.get(index);
	}
}
