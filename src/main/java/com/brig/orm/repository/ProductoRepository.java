package com.brig.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brig.orm.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
