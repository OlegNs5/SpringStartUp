package ro.ctrln;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.ctrln.config.SpringComponentScanConfig;
import ro.ctrln.config.SpringConfigWithBeans;
import ro.ctrln.service.ProcessingService;
import ro.ctrln.service.ThumbnailService;

public class SpringAnnatationConfig {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringComponentScanConfig.class);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigWithBeans.class);
        ThumbnailService thumbnailService = applicationContext.getBean(ThumbnailService.class);
        ProcessingService processingService = applicationContext.getBean(ProcessingService.class);

        System.out.println(thumbnailService.getThumbnailRepository() == processingService.getThumbnailRepository());

    }
}
