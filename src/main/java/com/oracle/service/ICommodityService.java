package com.oracle.service;

import java.util.List;

import com.oracle.model.CateComm;
import com.oracle.model.Commodity;

public interface ICommodityService {
	int addCommodity(Commodity c, String commImgOne, String commImgTwo, String commImgThree, String commImgFour, String commImgFive);
	List<CateComm> queryCategoryByPid(Integer pid);
}
