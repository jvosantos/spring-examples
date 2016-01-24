package com.jvosantos.examples.repositories;

import com.jvosantos.examples.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface AuthorRepository extends CrudRepository<Author, BigInteger> {
}
