package org.mahagan.crudWithMongoDB.repository;

import org.mahagan.crudWithMongoDB.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, Integer> {
}
