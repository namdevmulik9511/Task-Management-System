package com.Flynaut.DeliveryService;

import java.util.AbstractSequentialList;
import java.util.LinkedList;
import java.util.ListIterator;

public class DeliveryRoute<E> extends AbstractSequentialList<E>
{
	private LinkedList<E> route;

	public DeliveryRoute()
	{
		route=new LinkedList<>();
	}

	@Override
	public ListIterator<E> listIterator(int index)
	{
		return route.listIterator(index);
	}

	@Override
	public int size() 
	{
		return route.size();
	}

	@Override
	public boolean add(E e)
	{
		return route.add(e);
	}

	@Override
	public E remove(int index)
	{
		ListIterator<E> iterator=listIterator(index);
		E value=iterator.next();
		iterator.remove();
		return value;
	}

}
