package org.example;

public class Keyboard extends Component {
    String layout;

    public Keyboard(String manufacturer, String model, String layout) {
        super(manufacturer, model);
        this.layout = layout;
    }

    @Override
    public String toString() {
        return super.toString()+", layout "+layout;
    }
}
