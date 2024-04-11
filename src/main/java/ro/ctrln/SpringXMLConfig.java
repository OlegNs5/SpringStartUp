package ro.ctrln;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ro.ctrln.service.ProcessingService;
import ro.ctrln.service.ThumbnailService;

public class SpringXMLConfig {

    public static void main(String[] args) {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("01-annotated-config.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("02-beans-config.xml");
        ThumbnailService thumbnailService = applicationContext.getBean(ThumbnailService.class);
        ProcessingService processingService = applicationContext.getBean(ProcessingService.class);

        System.out.println(thumbnailService.getThumbnailRepository() == processingService.getThumbnailRepository());

    }
}