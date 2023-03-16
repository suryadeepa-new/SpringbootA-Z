package com.rest.paginate.intf;
import java.util.List;

import com.rest.paginate.entity.Country;
public interface ICountryService {
	

	    List<Country> findPaginated(int pageNo, int pageSize);
	}


