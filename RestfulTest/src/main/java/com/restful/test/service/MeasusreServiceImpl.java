package com.restful.test.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
 
import com.restful.test.dao.iMeasureDAO;
import com.restful.test.model.Measure;

@Service("MeasureServices")
public class MeasusreServiceImpl implements MeasureServices {
	private static final Logger logger = LoggerFactory.getLogger(MeasureServices.class);
	@Resource(name="iMeasureDAO")
	private iMeasureDAO measuredao;
	
	@Override
	public List<Measure> getList() {
		// TODO Auto-generated method stub
		logger.info(null); 
		
		return measuredao.List();
	}

}
