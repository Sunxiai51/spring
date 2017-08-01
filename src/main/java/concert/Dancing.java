package concert;

import org.springframework.stereotype.Component;

@Component
public class Dancing implements Performance {

	@Override
	public void perform() {
		System.out.println("I am dancing.");
	}

}
