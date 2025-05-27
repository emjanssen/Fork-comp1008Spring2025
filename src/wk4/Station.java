package wk4;

public class Station {
    private final static String DEFAULT_STATION_NAME = "Union Station";
    private String name = DEFAULT_STATION_NAME;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.length() >= 3 ? name : DEFAULT_STATION_NAME;
    }

    public Station(){}
    public Station(String name){
        setName(name);
    }
    public static Station UnionStation(){
        return new Station(DEFAULT_STATION_NAME);
    }
}
