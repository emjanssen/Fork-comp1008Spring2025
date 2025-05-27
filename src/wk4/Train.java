package wk4;

public class Train {

    private Line line;

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
    public Train(Line line) {
        setLine(line);
    }
}
