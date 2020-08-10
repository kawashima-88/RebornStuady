package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value="/")
	public ModelAndView indexPost(ModelAndView mv){
		ArrayList<String[]> customers=new ArrayList<String[]>();
		customers.add(new String[] {"佐藤HTML太郎","35歳","男性","東京"});
		customers.add(new String[] {"鈴木Java五郎","24歳","男性","大阪"});
		customers.add(new String[] {"高橋CSS子","20歳","女性","愛知"});
		customers.add(new String[] {"HTML太郎","30歳","男性","北海道"});
		customers.add(new String[] {"Java五郎","20歳","男性","福岡"});
		customers.add(new String[] {"CSS子","29歳","女性","神奈川"});
		mv.addObject("customers",customers);
		mv.setViewName("index");
		return mv;
	}
}
