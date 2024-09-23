package com.tap.grade.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tap.grade.dto.GradeDTO;

@Repository
public class GradeDAO {
	@Autowired
	private SqlSession mybatis;
	
	public List<GradeDTO> getGrade() throws Exception{
		return mybatis.selectList("AdminUserMem.getGrade");
	}

	public List<GradeDTO> selectAll() throws Exception {
		
		return mybatis.selectList("Grade.selectAll");
	}

	public List<GradeDTO> selectList(Map<String, Object> map)throws Exception {
		return mybatis.selectList("Grade.selectList",map);
	}

	public int getCount(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return mybatis.selectOne("Grade.getCount",map);
	}

	public int delete(int seq) {
		return mybatis.delete("Grade.delete",seq);
	}

}
