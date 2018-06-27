package com.oracle.dao;

import java.util.List;

import com.oracle.model.CateComm;
import com.oracle.model.CateList;
import com.oracle.model.Commodity;

public interface ICommodityDao {
	int addCommodity(Commodity c);
	List<CateList> queryCategoryByPid(Integer pid);
	List<CateComm> queryCommByCateLimitTen();
}
