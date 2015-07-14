package com.restful.test.dao;
 
import com.restful.test.model.Measure;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("iMeasureDAO")
public class MeasureDaoImpl implements iMeasureDAO {

	private static final Logger logger = LoggerFactory.getLogger(MeasureDaoImpl.class);
	
	@Autowired
	private SqlSessionTemplate sqlsession;
	
	public void setSqlSession(SqlSessionTemplate sqlSession){
        this.sqlsession = sqlSession;
    }
	
	@Override
	public void create(Measure measure) {
		// TODO Auto-generated method stub

	}

	@Override
	public Measure get(int seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String seq) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(String key, String values) {
		// TODO Auto-generated method stub 
	}

	@Override
	public List<Measure> List() {
		// TODO Auto-generated method stub 
		// Class.forName("com.edb.Driver");   
		List<Measure> result = sqlsession.selectList("getMeasureList"); 
		logger.info("===== result =====", result); 
		return result;
	}

}
