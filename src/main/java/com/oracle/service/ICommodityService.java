package com.oracle.service;

import java.util.List;

import com.oracle.model.CateComm;
import com.oracle.model.CateList;
import com.oracle.model.Commodity;
import com.oracle.model.Img;

public interface ICommodityService {
	int addCommodity(Commodity c, String commImgOne, String commImgTwo, String commImgThree, String commImgFour, String commImgFive);
	List<CateList> queryCategoryByPid(Integer pid);
	List<CateComm> queryCommByCateLimitTen();
	Commodity findCommodityById(int id);
	List<Img> findImgByCid(int cid);
}
