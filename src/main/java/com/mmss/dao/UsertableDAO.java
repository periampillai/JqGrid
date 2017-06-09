package com.mmss.dao;

import com.mmss.model.Usertable;
import com.mmss.model.UsertableExample;
import java.sql.SQLException;
import java.util.List;

public interface UsertableDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    int countByExample(UsertableExample example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    int deleteByExample(UsertableExample example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    int deleteByPrimaryKey(Integer id) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    void insert(Usertable record) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    void insertSelective(Usertable record) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    List selectByExample(UsertableExample example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    Usertable selectByPrimaryKey(Integer id) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    int updateByExampleSelective(Usertable record, UsertableExample example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    int updateByExample(Usertable record, UsertableExample example) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    int updateByPrimaryKeySelective(Usertable record) throws SQLException;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table usertable
     *
     * @ibatorgenerated Thu Jun 08 18:57:31 IST 2017
     */
    int updateByPrimaryKey(Usertable record) throws SQLException;

	List<Usertable> selectByAllList() throws SQLException;
}