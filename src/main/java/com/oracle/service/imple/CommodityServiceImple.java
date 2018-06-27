package com.oracle.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.ICommodityDao;
import com.oracle.dao.IImgDao;
import com.oracle.model.CateComm;
import com.oracle.model.CateList;
import com.oracle.model.Commodity;
import com.oracle.model.Img;
import com.oracle.service.ICommodityService;

@Service("cosi")
public class CommodityServiceImple implements ICommodityService {

	@Autowired
	ICommodityDao icd;
	@Autowired
	IImgDao iid;
	
	@Override
	public int addCommodity(Commodity c, String commImgOne, String commImgTwo, String commImgThree, String commImgFour, String commImgFive) {
		// TODO Auto-generated method stub
		int res = icd.addCommodity(c);
		Img i = new Img();
        i.setCommId(c.getId());
        i.setUrl(commImgOne);
        iid.addImg(i);
        Img i2 = new Img();
        i2.setCommId(c.getId());
        i2.setUrl(commImgTwo);
        iid.addImg(i2);
        Img i3 = new Img();
        i3.setCommId(c.getId());
        i3.setUrl(commImgThree);
        iid.addImg(i3);
        Img i4 = new Img();
        i4.setCommId(c.getId());
        i4.setUrl(commImgFour);
        iid.addImg(i4);
        Img i5 = new Img();
        i5.setCommId(c.getId());
        i5.setUrl(commImgFive);
        iid.addImg(i5);
		return res;
	}

	@Override
	public List<CateList> queryCategoryByPid(Integer pid) {
		// TODO Auto-generated method stub
		return icd.queryCategoryByPid(pid);
	}

	@Override
	public List<CateComm> queryCommByCateLimitTen() {
		// TODO Auto-generated method stub
		return icd.queryCommByCateLimitTen();
	}

	@Override
	public Commodity findCommodityById(int id) {
		// TODO Auto-generated method stub
		return icd.findCommodityById(id);
	}
	
	@Override
	public List<Img> findImgByCid(int cid){
		return iid.findImgByCid(cid);
	}
}
