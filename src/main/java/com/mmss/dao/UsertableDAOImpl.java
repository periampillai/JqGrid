package com.mmss.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.mmss.model.Usertable;
import com.mmss.model.UsertableExample;
import java.sql.SQLException;
import java.util.List;

public class UsertableDAOImpl implements UsertableDAO {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    public UsertableDAOImpl(SqlMapClient sqlMapClient) {
        super();
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    public int countByExample(UsertableExample example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("usertable.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    public int deleteByExample(UsertableExample example) throws SQLException {
        int rows = sqlMapClient.delete("usertable.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    public int deleteByPrimaryKey(Integer id) throws SQLException {
        Usertable key = new Usertable();
        key.setId(id);
        int rows = sqlMapClient.delete("usertable.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    public void insert(Usertable record) throws SQLException {
        sqlMapClient.insert("usertable.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    public void insertSelective(Usertable record) throws SQLException {
        sqlMapClient.insert("usertable.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    public List selectByExample(UsertableExample example) throws SQLException {
        List list = sqlMapClient.queryForList("usertable.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    public Usertable selectByPrimaryKey(Integer id) throws SQLException {
        Usertable key = new Usertable();
        key.setId(id);
        Usertable record = (Usertable) sqlMapClient.queryForObject("usertable.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    public int updateByExampleSelective(Usertable record, UsertableExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("usertable.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    public int updateByExample(Usertable record, UsertableExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("usertable.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    public int updateByPrimaryKeySelective(Usertable record) throws SQLException {
        int rows = sqlMapClient.update("usertable.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    public int updateByPrimaryKey(Usertable record) throws SQLException {
        int rows = sqlMapClient.update("usertable.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    private static class UpdateByExampleParms extends UsertableExample {
        private Object record;

        public UpdateByExampleParms(Object record, UsertableExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	public List<Usertable> selectByAllList() throws SQLException 
	{
		List<Usertable> list = sqlMapClient.queryForList("usertable.selectByAllList",null);
		return list;
	}
}