package com.pk.gil.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pk.gil.domain.Item;

@Repository
public class ItemDaoImpl implements ItemDao {
	//MyBatis 실행 객체를 주입
	@Autowired
	private SqlSession sqlSession;
	@Override
	public List<Item> listitem() {
		return sqlSession.selectList("item.listitem");
	}
	@Override
	public Item getId(int itemid) {
		return sqlSession.selectOne("item.getid", itemid); // 얘가 달라고 헀으니까 파라미터 줘야한다. where itemid = #{itemid} 
	}

}
