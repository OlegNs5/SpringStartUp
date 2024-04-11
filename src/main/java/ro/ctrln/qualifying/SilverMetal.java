package ro.ctrln.qualifying;

import org.springframework.stereotype.Component;

@Component ("silverMetal")
public class SilverMetal implements Metal{

    @Override
    public void showValue() {
        System.out.println("silver");
    }
}
