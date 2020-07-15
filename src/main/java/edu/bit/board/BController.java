package edu.bit.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.board.command.BCommand;
import edu.bit.board.command.BListCommand;

@Controller
public class BController {
	
	private static final Logger logger = LoggerFactory.getLogger(BController.class);
	
	private BCommand command= null;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		
		command = new BListCommand();
		command.execute(model);
		
		return "list";
		
	}
}

///////////////////////////////
//@Controller
//public class BController {
//
//	BCommand command = null;
//	
//	private JdbcTemplate template;
//	
//	@Autowired
//	public void setTemplate(JdbcTemplate template) {
//		this.template = template;
//		Constant.template = this.template;
//	}
//	
//	@RequestMapping("/list")
//	public String list(Model model) {
//		
//		System.out.println("list()");
//		command = new BListCommand();
//		command.execute(model);
//		
//		return "list";
//	}
//	
//	@RequestMapping("/write_view")
//	public String write_view(Model model) {
//		System.out.println("write_view()");
//		
//		return "write_view";
//	}
//	
//	@RequestMapping("/write")
//	public String write(HttpServletRequest request, Model model) {
//		System.out.println("write()");
//		
//		model.addAttribute("request", request);
//		command = new BWriteCommand();
//		command.execute(model);
//		
//		return "redirect:list";
//	}
//	
//	@RequestMapping("/content_view")
//	public String content_view(HttpServletRequest request, Model model){
//		System.out.println("content_view()");
//		
//		model.addAttribute("request", request);
//		command = new BContentCommand();
//		command.execute(model);
//		
//		return "content_view";
//	}
//	
//	@RequestMapping(value="/modify", method=RequestMethod.POST )
//	public String modify(HttpServletRequest request, Model model){
//		System.out.println("modify()");
//		
//		model.addAttribute("request", request);
//		command = new BModifyCommand();
//		command.execute(model);
//		
//		return "redirect:list";
//	}
//	
//	@RequestMapping("/reply_view")
//	public String reply_view(HttpServletRequest request, Model model){
//		System.out.println("reply_view()");
//		
//		model.addAttribute("request", request);
//		command = new BReplyViewCommand();
//		command.execute(model);
//		
//		return "reply_view";
//	}
//	
//	@RequestMapping("/reply")
//	public String reply(HttpServletRequest request, Model model) {
//		System.out.println("reply()");
//		
//		model.addAttribute("request", request);		
//		command = new BReplyCommand();
//		command.execute(model);
//		
//		return "redirect:list";
//	}
//	
//	@RequestMapping("/delete")
//	public String delete(HttpServletRequest request, Model model) {
//		System.out.println("delete()");
//		
//		model.addAttribute("request", request);
//		command = new BDeleteCommand();
//		command.execute(model);
//		
//		return "redirect:list";
//	}
//	
//}
