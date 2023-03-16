package com.rest.paginate.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.rest.paginate.entity.Country;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country,Long>{

}
