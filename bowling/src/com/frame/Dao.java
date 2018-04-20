package com.frame;

import java.util.HashMap;
import java.util.List;

public interface Dao<T,S> {
	public void insert(T t);
	public void delete(S s);
	public void update(T t);
	public T select(S s);
	public List<T> selectAll(S s);
	public T selectLogin(HashMap<S, Object> map);
}