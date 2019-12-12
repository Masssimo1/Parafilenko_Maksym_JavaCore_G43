package song;

public class GameObject {
    private Coord coord;
    private String name;

    public GameObject(String name) {
        this.name = name;
        this.coord = new Coord(0, 0);
    }

    public int getX() {
        return coord.getX();
    }

    public String getName() {
        return name;
    }
}
