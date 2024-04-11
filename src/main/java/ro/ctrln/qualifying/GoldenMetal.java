package ro.ctrln.qualifying;

import org.springframework.stereotype.Component;

@Component(value = "goldenMetal")
public class GoldenMetal implements Metal {

    @Override
    public void showValue() {
        System.out.println("golden");
    }
}
