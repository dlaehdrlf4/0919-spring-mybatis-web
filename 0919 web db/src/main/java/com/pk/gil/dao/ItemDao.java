package com.pk.gil.dao;

import java.util.List;

import com.pk.gil.domain.Item;

public interface ItemDao {
	// 전체 데이터 가져오는 메소드
	public List<Item> listitem();
	//상세보기를 위한 메소드
	public Item getId(int itemid);

}
