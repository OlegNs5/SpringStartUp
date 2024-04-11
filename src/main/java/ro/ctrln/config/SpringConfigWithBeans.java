package ro.ctrln.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.ctrln.repository.ThumbnailRepository;
import ro.ctrln.service.ProcessingService;
import ro.ctrln.service.ThumbnailService;

@Configuration
public class SpringConfigWithBeans {

    @Bean
    public ThumbnailService thumbnailService(){
        return new ThumbnailService(thumbnailRepository());
    }

    @Bean
    public ThumbnailRepository thumbnailRepository() {
        return new ThumbnailRepository();
    }

    @Bean
    public ProcessingService processingService(){
        return new ProcessingService();
    }
}
