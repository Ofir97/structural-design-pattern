package printers;

import features.Feature;
import features.LowerCaseFeature;
import features.UpperCaseFeature;

public class MidPrinter extends AbstractPrinter{

    @Override
    public void loadFeatures() {
        this.features.add(new LowerCaseFeature());
        this.features.add(new UpperCaseFeature());
    }
}
