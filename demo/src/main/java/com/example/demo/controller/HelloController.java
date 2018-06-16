package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.*;
@Controller
public class HelloController {

	@RequestMapping("/")
	public String firstView(Model model) {
		List<XIII> mem = new ArrayList<XIII>();
		XIII xemnas = new XIII(1, "ゼムナス");
		XIII xigbar = new XIII(2, "シグバール");
		XIII xaldin = new XIII(3, "ザルディン");
		XIII vexen = new XIII(4, "ヴィクセン");
		XIII lexaeus = new XIII(5, "レクセウス");
		XIII zexion = new XIII(6, "ゼクシオン");
		XIII saix = new XIII(7, "サイクス");
		XIII axel = new XIII(8, "アクセル");
		XIII demyx = new XIII(9, "デミックス");
		XIII luxord = new XIII(10, "ルクソード");
		XIII marluxia = new XIII(11, "マールーシャ");
		XIII larxene = new XIII(12, "ラクシーヌ");
		XIII roxas = new XIII(13, "ロクサス");
		XIII xion = new XIII(14, "シオン");
		
		mem.add(xemnas);
		mem.add(xigbar);
		mem.add(xaldin);
		mem.add(vexen);
		mem.add(lexaeus);
		mem.add(zexion);
		mem.add(saix);
		mem.add(axel);
		mem.add(demyx);
		mem.add(luxord);
		mem.add(marluxia);
		mem.add(larxene);
		mem.add(roxas);
		mem.add(xion);
		model.addAttribute("members", mem);
		return "hello";
	}
}