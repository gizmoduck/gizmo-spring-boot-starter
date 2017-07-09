package com.gizmodk.gizmopedia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gizmodk.gizmopedia.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	public Book findByIsbn(String isbn);

}
