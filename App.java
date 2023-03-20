import java.util.LinkedHashMap;

public class App {
    public static void main(String[] args) {
        Action action1 = new Action(() -> System.out.println("test action1"));
        Action action2 = new Action(() -> System.out.println("test action2"));
        Action action3 = new Action(() -> System.out.println("test action3"));

        LinkedHashMap<String, MenuObject> menu4map = new LinkedHashMap<String, MenuObject>();
        menu4map.put("Action1", action1);
        menu4map.put("Action2", action2);
        menu4map.put("Action3", action3);
        Menu menu4 = new Menu("Menu4 test", menu4map);

        LinkedHashMap<String, MenuObject> menu3map = new LinkedHashMap<String, MenuObject>();
        menu3map.put("Action1", action1);
        menu3map.put("Action3", action3);
        Menu menu3 = new Menu("Menu3 test", menu3map);

        LinkedHashMap<String, MenuObject> menu2map = new LinkedHashMap<String, MenuObject>();
        menu2map.put("Menu4", menu4);
        menu2map.put("Action1", action1);
        menu2map.put("Action2", action2);
        Menu menu2 = new Menu("Menu2 test", menu2map);

        LinkedHashMap<String, MenuObject> menu1map = new LinkedHashMap<String, MenuObject>();
        menu1map.put("Menu4", menu4);
        menu1map.put("Action1", action1);
        menu1map.put("Action2", action2);
        Menu menu1 = new Menu("Menu1 test", menu1map);

        LinkedHashMap<String, MenuObject> menu0map = new LinkedHashMap<String, MenuObject>();
        menu0map.put("Menu1", menu1);
        menu0map.put("Menu2", menu2);
        menu0map.put("Menu3", menu3);
        Menu menu0 = new Menu("Menu0 test", menu0map);

        menu0.open();
    }
}