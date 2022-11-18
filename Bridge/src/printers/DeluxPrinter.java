package printers;

import features.LowerCaseFeature;
import features.RegularCaseFeature;
import features.TabCaseFeature;
import features.UpperCaseFeature;

public class DeluxPrinter extends AbstractPrinter{

    @Override
    public void loadFeatures() {
        this.features.add(new LowerCaseFeature());
        this.features.add(new UpperCaseFeature());
        this.features.add(new RegularCaseFeature());
        this.features.add(new TabCaseFeature());
    }
}
