
/**
 * Created by Mariusz on 04.12.2016.
 */
public class ActionModel {
    private String connector;
    private String action;
    private String type;
    private String name;

    public ActionModel() {}

    public ActionModel(String connector, String action, String type, String name) {
        this.connector = connector;
        this.action = action;
        this.type = type;
        this.name = name;
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
