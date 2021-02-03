import java.util.ArrayList;

public class Vector<E> implements Stack<E>{
	protected ArrayList<E> data;
	
	public Vector()
	{
		data = new ArrayList<E>();
	}
	
	/**
	* Este es un metodo que agrega un elemento E a un ArrayList
	*
	* @param item  el elemento que se quiere ingresar al Stack
	*/
	@Override
	public void push(E item)
	{
		data.add(item);
	}
	/**
	* Este es un metodo que quita un elemento E a un ArrayList
	*
	* @return  se quita el ultimo elemento del stack.
	*/
	
	@Override
	public E pop()
	{
		return data.remove(size()-1);
	}
	
	/**
	* Este es un metodo que devuelve el último elemento ingresado en el stack
	*
	* @return  último elemento en el stack
	*/
	
	@Override
	public E peek()
	{
		return data.get(size() - 1);
	}
	/**
	* Este es un metodo que devuleve
	*
	* @return  se quita el ultimo elemento del stack.
	*/
	
	@Override
	public int size()
	{
		return data.size();
	}
	
	/**
	* Este es un metodo que verifica si el Stack no está vacío
	*
	* @return  un 0 si esta vacio. 
	*/
	
	@Override
	public boolean empty()
	{
		return size() == 0;
	}
	
	/**
	* Este es un metodo hecho para determinar la posicion actual de un elemento en el stack. 
	* @param index se le asigna un valor que se quiere evaluar que contiene.
	* @return  Elemento actual en el stack
	*/
	
	public E index(int index) {
		return data.get(index);
	}
}
