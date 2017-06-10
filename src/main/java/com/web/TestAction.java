package com.web;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.mmss.dao.UsertableDAO;
import com.mmss.model.Usertable;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport
{
	
	public TestAction(SqlMapClient sqlMapClient,UsertableDAO usertableDAO)
	{
		this.sqlMapClient=sqlMapClient;
		this.usertableDAO=usertableDAO;
	}
	
	public String welcome() 
	{
		String outcome = ERROR;
		
		try
		{
			outcome = SUCCESS;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return outcome;
	}
	
	
	public String jsonData()
	{
		  try
		  {
			usertablesList = new ArrayList<>();
			usertablesList = usertableDAO.selectByAllList();
			
			List<Usertable> personList = new ArrayList<Usertable>();
		
			
			usertablesList.forEach(item ->{
				
				usertable = new Usertable();
				usertable.setId(item.getId());
				usertable.setName(item.getName());
				personList.add(usertable);
				
			});
			
			
			Gson g = new GsonBuilder().setPrettyPrinting().create();
			jsonString = g.toJson(personList);
				        
			
			System.out.println(jsonString);
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return jsonString;
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HttpServletResponse response = ServletActionContext.getResponse();
	
	SqlMapClient sqlMapClient;
	UsertableDAO usertableDAO;
	
	
	private Usertable usertable;
	
	
	private List<Usertable> usertablesList;
	
	private String jsonString;
	

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	
	public List<Usertable> getUsertablesList() {
		return usertablesList;
	}

	public void setUsertablesList(List<Usertable> usertablesList) {
		this.usertablesList = usertablesList;
	}

	public Usertable getUsertable() {
		return usertable;
	}

	public void setUsertable(Usertable usertable) {
		this.usertable = usertable;
	}

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
	
}
