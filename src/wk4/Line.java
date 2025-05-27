package wk4;

public class Line {
    private Station[] stations;
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
