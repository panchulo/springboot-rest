package cl.cnsv.poc.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cl.cnsv.poc.model.Book;

@Mapper
public interface BookRepository {

	public Book getById(int id);
	
	public List<Book> getAll();

}