package interfaces;

import java.util.List;

public interface Manager {
    public String addHero(List<String> arguments);

    public String addItem(List<String> arguments);

    public String addRecipe(List<String> arguments);

    public String inspect(List<String> arguments) throws NoSuchFieldException, IllegalAccessException;

    public String quit();
}
