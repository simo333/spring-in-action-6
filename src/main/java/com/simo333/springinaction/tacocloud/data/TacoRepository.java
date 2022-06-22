package com.simo333.springinaction.tacocloud.data;

import com.simo333.springinaction.tacocloud.tacos.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}