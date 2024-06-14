package com.Flynaut.DeliveryService;

import java.util.AbstractList;

public class OrderList<E> extends AbstractList<E>
{
	private  E[] orders;
	private int size;
	
	@SuppressWarnings("unchecked")
	public OrderList(int initialCapacity)
	{
		orders = (E[]) new Object[initialCapacity];
		size = 0;
	}
	@Override
	public int size() 
	{
		return size;
	}

	@Override
	public E get(int index) 
	{
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException("Index "+ index+" , Size: "+ size);
		}
		return orders[index];
	}
	public boolean add(E e)
	{
		if(orders.length==size)
		{
			resize();
		}
		orders[size++]=e;
		return true;
	}
	private void resize()
	{
		@SuppressWarnings({ "unchecked" })
		E[] newOrders=(E[]) new Object[orders.length*2];
		System.arraycopy(orders, 0, newOrders, 0, size);
		orders=newOrders;	
	}
	
	public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removed = orders[index];
        for (int i = index; i < size - 1; i++) {
            orders[i] = orders[i + 1];
        }
        orders[--size] = null;
        return removed;
    }

}
