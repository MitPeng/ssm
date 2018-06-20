package com.oracle.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.ICommodityDao;
import com.oracle.model.CateComm;
import com.oracle.model.Commodity;
import com.oracle.service.ICommodityService;

@Service("cosi")
public class CommodityServiceImple implements ICommodityService {

	@Autowired
	ICommodityDao icd;
	
	@Override
	public int addCommodity(Commodity c) {
		// TODO Auto-generated method stub
		return icd.addCommodity(c);
	}

	@Override
	public List<CateComm> queryCategoryByPid(Integer pid) {
		// TODO Auto-generated method stub
		return icd.queryCategoryByPid(pid);
	}

}
