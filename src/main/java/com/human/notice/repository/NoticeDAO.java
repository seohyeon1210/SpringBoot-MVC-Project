package com.human.notice.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface NoticeDAO {

    public List selectAllNoticeList() throws DataAccessException;
}
