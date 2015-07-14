package com.restful.test.service;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response; 
 

import com.restful.test.dao.MeasureDaoImpl;
import com.restful.test.model.Measure;

/**
 * @author heb
 *
 */
@Path("/measure")
public class MeasureService {
	static MeasureDaoImpl dao = null;
	
	public void setMeasureDao(MeasureDaoImpl dao)
	{
		this.dao = dao;
	}
	 public MeasureService() {
		// TODO Auto-generated constructor stub
	}
        //if(dao == null)      setContactDao(new ContactDao());
 
	/**
	 * Create Measure Record
	 * @param measure
	 * @return
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Measure measure)
	{
		dao.create(measure);
		return Response.status(200).entity(measure).build();		
	}
	
	/**
     * Query Measure record by seq  
     * @param seq
     * @return
     */ 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("get")
	public Measure get(@PathParam("seq") int seq) {
		return dao.get(seq);
	}
	
	/**
     * Delete Measure Record by seq
     * @param seq 
     * @return
     */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("delete")
	public void delete(@PathParam("seq") String seq) {
		dao.delete(seq);
	}
	
	/**
     * Query Measure record by seq  
     * @param key
     * @param Contents
     * @return
     */ 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("update")
	public Response update(@PathParam("key") String key, @PathParam("contents") String Contents) {
		dao.update(key, Contents);
		return Response.status(200).entity(Contents).build();
	} 
}
