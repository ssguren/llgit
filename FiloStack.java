package com.gsr.test;

import java.util.LinkedList;

public class FiloStack<T> extends BaseStack<T> {

	private LinkedList<T> list;

	public FiloStack() {
		super();
		if (null == list)
			list = new LinkedList<T>();
	}

	@Override
	protected T pop() {
		// return list.removeLast();
		if (null != list && list.size() > 0) {
			T t = list.get(list.size() - 1);
			list.remove(t);
			return t;
		} else {
			return null;
		}
	}

	@Override
	protected int push(T t) {
		list.add(t);
		return list.indexOf(t);
	}

	@Override
	protected boolean isEmpty() {
		return list.isEmpty();
	}

}
