package com.pk.gil;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pk.gil.domain.Item;
import com.pk.gil.service.ItemService;


@Controller
public class HomeController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<Item> list = itemService.listitem();
		model.addAttribute("list",list);
		return "home";
	}
	
	//itemid라는 파라미터를 정수로 itemid에 저장
	@RequestMapping(value="detail", method = RequestMethod.GET)
	public String getId(@RequestParam("itemid") int itemid, Model model) {
		Item item = itemService.getId(itemid);
		model.addAttribute("item", item);
		return "detail";
	}
	
}
