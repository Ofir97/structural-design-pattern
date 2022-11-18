package printers;

import features.RegularCaseFeature;

public class RegularPrinter extends AbstractPrinter {

    @Override
    public void loadFeatures() {
        this.features.add(new RegularCaseFeature());
    }
}
