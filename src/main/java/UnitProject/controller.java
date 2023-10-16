package UnitProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@GetMapping(value="/gett")
public String get() {
	return "leo ticket book panniyacha";
}
}
