package com.frame;

import java.util.HashMap;
import java.util.List;

public interface Biz<T,S> {
	public void register(T t);
	public void remove(S s);
	public void modify(T t);
	public T get(S s);
	public List<T> getAll(S s);
	public T login(HashMap<S, Object> map);
}
