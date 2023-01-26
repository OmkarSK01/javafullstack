package com.codekul.javafullstack;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.*;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

//10 may
/*@SpringBootApplication
@RestController
public class JavaFullstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaFullstackApplication.class, args);
	}
	@GetMapping("hello")
	public String msg() {
		return "Hello Spring...";
	}

}*/
//11 may
//package com.codekul.javafullstack;


import com.codekul.javafullstack.ioc.Jio;
import com.codekul.javafullstack.ioc.SimConfig;
import com.codekul.javafullstack.ioc.Vodafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaFullstackApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext applicationContext = SpringApplication.run(JavaFullstackApplication.class, args);

		ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(SimConfig.class);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(applicationContext1);

		Jio jio = applicationContext1.getBean(Jio.class);
		jio.calling();
		jio.msg();

		Vodafone vodafone = applicationContext1.getBean(Vodafone.class);
		vodafone.calling();
		vodafone.msg();
	}


	@GetMapping("hello")
	public String msg() {
		return "Hello Spring...  ";
	}

}



//12May

/*@SpringBootApplication
@RestController
public class JavaFullstackApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext applicationContext = SpringApplication.run(JavaFullstackApplication.class, args);

        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(SimConfig.class);
        //  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(applicationContext1);

       Jio jio = applicationContext1.getBean(Jio.class);
        jio.calling();
        jio.msg();

        Vodafone vodafone = applicationContext1.getBean(Vodafone.class);
        vodafone.calling();
        vodafone.msg();
        Company company = applicationContext.getBean(Company.class);
        company.display();

    }




    @GetMapping("hello")
    public String msg() {
        return "Hello Spring...  ";

    }

}*/



//23oct-for twillio api
//@SpringBootApplication
//@RestController
//public class JavaFullstackApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(JavaFullstackApplication.class, args);
//	}
//	@GetMapping("hello")
//	public String msg() {
//		return "Hello Spring...";
//	}

//}
