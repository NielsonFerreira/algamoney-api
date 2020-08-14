package com.nielsonferreira.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nielsonferreira.algamoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>, CrudRepository<Categoria, Long>{

}
