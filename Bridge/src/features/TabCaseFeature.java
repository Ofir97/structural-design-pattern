package features;

public class TabCaseFeature extends Feature{

    @Override
    public void print(String text) {
        for (Character c : text.toCharArray()) {
            System.out.print(c + "\t");
        }
        System.out.println();
    }
}
