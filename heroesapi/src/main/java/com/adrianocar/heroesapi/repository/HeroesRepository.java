package com.adrianocar.heroesapi.repository;

import com.adrianocar.heroesapi.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan

//public abstract class HeroesRepository implements CrudRepository<Heroes, String>

public interface HeroesRepository extends CrudRepository<Heroes, String>{{
}
