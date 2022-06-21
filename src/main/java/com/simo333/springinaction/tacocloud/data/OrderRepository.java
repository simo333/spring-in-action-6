package com.simo333.springinaction.tacocloud.data;

import com.simo333.springinaction.tacocloud.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {

}