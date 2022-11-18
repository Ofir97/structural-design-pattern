package printers;

import features.Feature;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPrinter {

    protected List<Feature> features = new ArrayList<>();

    public AbstractPrinter() {
        loadFeatures();
    }

    public abstract void loadFeatures();

    public void printTestPage() {
        features.forEach(f->f.print("This is a test"));
    }
}
