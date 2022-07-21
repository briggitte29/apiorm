package com.brig.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brig.orm.models.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
