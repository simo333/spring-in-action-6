package com.simo333.springinaction.tacocloud.data;

import com.simo333.springinaction.tacocloud.tacos.Taco;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TacoRepository
        extends PagingAndSortingRepository<Taco, Long> {

}