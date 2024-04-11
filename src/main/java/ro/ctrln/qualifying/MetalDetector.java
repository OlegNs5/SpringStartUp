package ro.ctrln.qualifying;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetalDetector {

    @Autowired
    @Qualifier("goldenMetal")
    private Metal metal;

    @Autowired
    private Metal silverMetal;

    public void showMetalValue(){
        metal.showValue();
    }

    public void showSilverMetalValue(){
        silverMetal.showValue();
    }

}
