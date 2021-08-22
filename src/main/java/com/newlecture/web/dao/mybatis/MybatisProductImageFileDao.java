package com.newlecture.web.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.web.dao.ProductImageFileDao;
import com.newlecture.web.entity.ProductImageFile;

@Repository
public class MybatisProductImageFileDao implements ProductImageFileDao {

	private ProductImageFileDao mapper;
	
	@Autowired
	public MybatisProductImageFileDao(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(ProductImageFileDao.class);
	}
	
	@Override
	public long createProductImageFile(ProductImageFile productImageFile) {
		mapper.createProductImageFile(productImageFile);
		return 0;
	}

	@Override
	public ProductImageFile retrieveProductImageFileById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long updateProductImageFile(ProductImageFile productImageFile) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long deleteProductImageFileById(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
