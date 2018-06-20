package com.oracle.dao;

import java.util.List;

import com.oracle.model.CateComm;
import com.oracle.model.Commodity;

public interface ICommodityDao {
	int addCommodity(Commodity c);
	List<CateComm> queryCategoryByPid(Integer pid);
}
