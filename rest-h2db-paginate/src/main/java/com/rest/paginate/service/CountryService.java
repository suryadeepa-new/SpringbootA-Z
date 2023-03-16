package com.rest.paginate.service;

	
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.domain.Page;
	import org.springframework.data.domain.PageRequest;
	import org.springframework.data.domain.Pageable;
	import org.springframework.stereotype.Service;

import com.rest.paginate.entity.Country;
import com.rest.paginate.intf.ICountryService;
import com.rest.paginate.repository.CountryRepository;

	@Service
	public class CountryService implements ICountryService {

	    @Autowired
	    private CountryRepository repository;

	    @Override
	    public List<Country> findPaginated(int pageNo, int pageSize) {

	        Pageable paging = PageRequest.of(pageNo, pageSize);
	        Page<Country> pagedResult = repository.findAll(paging);

	        return pagedResult.toList();
	    }
	

}
