package com.mulcam.artista.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("mypage")
@Controller
public class MyPageController {

	@GetMapping({"/", ""})
	public String mypageMain() {
		return "mypage/mypage";
	}
	
	@GetMapping("mypagemodify")
	public String mypagemodify() {
		return "mypage/mypagemodify";
	}
	@GetMapping("paymentinfo")
	public String paymentinfo() {
		return "mypage/paymentinfo";
	}
	
	
}
