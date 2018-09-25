package com.repositary;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.datajpa.model.Dept;

public interface DeptRepo extends CrudRepository<Dept, Integer> {

	public List<Dept> findByDname(String dname);
	public List<Dept> findByDeptnoBetween(int no1,int no2);
	public List<Dept> findByLocAndDname(String loc,String dname);
	public List<Dept> findByLocOrDname(String loc,String dname);
}
