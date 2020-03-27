package semifir.cinexo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.View;

@RestController
@RequestMapping("/*")
public class PageController {
	@GetMapping
	public String angular() {
		return "ok";
	}
}
