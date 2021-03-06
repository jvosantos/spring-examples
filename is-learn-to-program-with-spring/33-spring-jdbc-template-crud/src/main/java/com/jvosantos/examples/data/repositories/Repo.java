package com.jvosantos.examples.data.repositories;

public interface Repo<Entity, ID> {
  void insert(Entity entity);

  void update(Entity entity);

  void delete(Entity entity);

  Entity findById(ID id);

}
