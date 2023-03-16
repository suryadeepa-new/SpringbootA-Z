package com.rest.paginate.control;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RestController;

import com.rest.paginate.entity.Country;
import com.rest.paginate.intf.ICountryService;

import java.util.List;

	@RestController
	public class PagingController {

	    @Autowired
	    private ICountryService countryService;

	    @GetMapping("/countries/{pageNo}/{pageSize}")
	    public List<Country> getPaginatedCountries(@PathVariable int pageNo, 
	            @PathVariable int pageSize) {

	        return countryService.findPaginated(pageNo, pageSize);
	    }
	}


