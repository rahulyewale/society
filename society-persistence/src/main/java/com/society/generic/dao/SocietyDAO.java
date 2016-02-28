package com.society.generic.dao;

public interface SocietyDAO<T> {

	T save(T object) throws Exception;

	void delete(Object id) throws Exception;

	T findByPrimaryKey(Object id) throws Exception;

	T update(T object) throws Exception;
}
