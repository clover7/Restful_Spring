package com.restful.test.dao;

import com.restful.test.model.Measure;
import java.util.List;
/**
 * @author heb
 *
 * CRUD 
 */
public interface iMeasureDAO {
	
	public void create(Measure measure);
	public Measure get(int seq);
	public void delete(String seq);
	public void update(String key, String values);
	public List<Measure> List();
}
