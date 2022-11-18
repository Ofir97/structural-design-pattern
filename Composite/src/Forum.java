import java.util.ArrayList;
import java.util.List;

public class Forum extends Entity {

    private List<Entity> entities = new ArrayList<>();

    @Override
    public void info() {
        for (Entity entity : entities) {
            System.out.println(entity);
        }
    }

    public void add(Entity entity) {
        entities.add(entity);
    }
}
