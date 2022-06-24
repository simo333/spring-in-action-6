package com.simo333.springinaction.tacocloud.data;

import com.simo333.springinaction.tacocloud.User;
import com.simo333.springinaction.tacocloud.tacos.TacoOrder;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByUserOrderByPlacedAtDesc(
            User user, Pageable pageable);
}