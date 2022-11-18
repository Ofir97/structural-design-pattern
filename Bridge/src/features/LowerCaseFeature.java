package features;

import java.util.Locale;

public class LowerCaseFeature extends Feature{


    @Override
    public void print(String text) {
        System.out.println(text.toLowerCase());
    }
}
