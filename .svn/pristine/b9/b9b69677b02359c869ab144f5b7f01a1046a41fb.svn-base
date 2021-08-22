package com.newlecture.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.ProductImageFileDao;
import com.newlecture.web.entity.ProductImageFile;

@Service
public class ProductImageFileServiceImpl implements ProductImageFileService {

	@Autowired 
	private ProductImageFileDao productImageFileDao;
	
	@Override
	public long registerProductImageFile(ProductImageFile productImageFile) {
		productImageFileDao.createProductImageFile(productImageFile);
		return 0;
	}

}
