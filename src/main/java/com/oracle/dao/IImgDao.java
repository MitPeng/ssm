package com.oracle.dao;

import java.util.List;

import com.oracle.model.Img;

public interface IImgDao {
	int addImg(Img i);
	List<Img> findImgByCid(int cid);
}
