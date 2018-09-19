package com.pk.gil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.gil.dao.ItemDao;
import com.pk.gil.domain.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	@Override
	// 파라미터 없는경우는 Dao 메소드의 결과를 바로 리턴
	public List<Item>listitem() {
		return itemDao.listitem();
	}
	@Override
	public Item getId(int itemid) {
		return itemDao.getId(itemid);
	}
}
