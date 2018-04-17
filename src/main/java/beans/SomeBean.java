package beans;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class SomeBean {
	
	public String getMsg() {
		return "hi";
	}
	
}
