package ro.ctrln.qualifying;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.ctrln.config.SpringComponentScanConfig;
import ro.ctrln.config.SpringConfigWithBeans;

public class SpringQualifyingBeans {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringComponentScanConfig.class);

        MetalDetector metalDetector = applicationContext.getBean(MetalDetector.class);

        metalDetector.showMetalValue();
        metalDetector.showSilverMetalValue();

    }
}
