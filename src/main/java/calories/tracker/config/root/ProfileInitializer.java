package calories.tracker.config.root;



import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;

import static org.springframework.util.StringUtils.commaDelimitedListToStringArray;
import static org.springframework.util.StringUtils.hasText;

@Configuration
public class ProfileInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
		ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
		System.out.println("AAAAAAAAAAAAAAAASKKKKKKKKKKKKKKKKKKKKKKKKKKKKIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		environment.setActiveProfiles("development");
		environment.setDefaultProfiles("development");
	}

}
