package wk4;

public class Line {
    private Station[] stations;
    // Declares an array of Station objects that belong to this line.
    // Stores all the stations along the line in order.
    private Station startingStation, endingStation;

    public Station[] getStations() {
        return stations;
    }

    public void setStations(Station[] stations) {
        this.stations = stations;
    }

    public Station getStartingStation() {
        return startingStation;
    }

    public void setStartingStation(Station startingStation) {
        this.startingStation = startingStation;
    }

    public Station getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(Station endingStation) {
        this.endingStation = endingStation;
    }
}
