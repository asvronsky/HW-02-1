package org.example;

public class Screen extends Component {
    float size;

    public Screen(String manufacturer, String model, float size) {
        super(manufacturer, model);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()+", size "+size+"\"";
    }
}
