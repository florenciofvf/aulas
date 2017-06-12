package exemplo03;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class Logger implements Interceptor {

	public void destroy() {
		System.out.println("Logger.destroy()");
	}

	public void init() {
		System.out.println("Logger.init()");
	}

	public String intercept(ActionInvocation action) throws Exception {
		System.out.println("ANTES");
		
		String resp = action.invoke();
		
		System.out.println("DEPOIS");
		
		return resp;
	}

}
