package com.pk.gil;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pk.gil.vo.Article;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	

	// /가 왔을 때  홈으로 가라 views/home.jsp로 간다.
	// 시작 요청이 왔을 때 처리하는 메소드
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	
	// input 요청이 왔을 때 처리
	@RequestMapping(value="input", method= RequestMethod.GET)
	public String input(Model model) {
		//여기서 리턴한 뷰 이름을 가지고 servlet-context.xml 파일의 ViewResover와 결합해서 실제 출력할 파일이 결정
		return "article"; 
		//return "뷰이름";
		// article로 가라 
	}
	
	
//	@RequestMapping(value="input", method=RequestMethod.POST)
//	//java web 프로그래밍에서 제공하는 request 객체를 이용해서 파라미터 읽기
//	public String input(HttpServletRequest request, Model model) {
//		String subject = request.getParameter("subject");
//		String context = request.getParameter("context");
//		System.out.println("제목:" + subject);
//		System.out.println("내용:" + context);
//		return "";
	
//	//@RequestParam을 이용한 파라미터 처리
//	@RequestMapping(value="input", method=RequestMethod.POST)
//	public String input(@RequestParam("subject") String subject, @RequestParam("conterrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrxxt") String context, Model model) {
//   뒤에 스트
//		System.out.println("제목:" + subject);
//		System.out.println("내용:" + context);
//		return "";
//		//return "출력할 뷰이름"
//	}
	
	//Command 객체를 이용한 파라미터 처리
	@RequestMapping(value="input", method=RequestMethod.POST)
	public String input(Article article, Model model, HttpSession session, RedirectAttributes attr) {
		
		//request에 저장됩니다. 리다이렉트면 안나온다....
		model.addAttribute("data1", "web");
		//세션에 저장
		session.setAttribute("server", "java");
		//세션에 저장되는데 한번 사용하면 삭제됩니다.
		//리다이렉트 할 때만 전달 됩니다.
		attr.addFlashAttribute("db", "ora");
		
		//result로 리다이렉트 - model으 ㅣ데이터는 전송되지 않습니다,
		return "redirect:result";
		//result로 포워딩해라 // spring -> servlet- context에서 <beans:property name="prefix" value="/WEB-INF/views/" /> 보고 경로지정
	//	return "result";
		//return 디렉토리/result
	}
	//result 요청이 왔을 때 처리하는 메소드
	@RequestMapping(value="result", method=RequestMethod.GET)
	public String result(Model model) {
		return "result";
	}
	
	
	
	
}
