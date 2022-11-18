package features;

import java.util.Locale;

public class UpperCaseFeature extends Feature{

    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }
}
