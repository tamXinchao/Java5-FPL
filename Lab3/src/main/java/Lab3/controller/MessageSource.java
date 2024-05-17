package Lab3.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class MessageSource {
	@Bean("MessageSource")
	public MessageSource getMessageSource() {
		ReloadableResourceBundleMessageSource ms 
		= new ReloadableResourceBundleMessageSource();
		ms.setBasenames("classpath:messages/student.properties");
		ms.setDefaultEncoding("utf-8");
		return ms;
		}
}
