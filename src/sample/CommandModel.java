package sample;

import java.util.List;

/**
 * Created by Mariusz on 04.12.2016.
 */
public class CommandModel {
    private List<ActionModel> actionModels;


    public CommandModel() {
    }

    public List<ActionModel> getActionModels() {
        return actionModels;
    }

    public void setActionModels(List<ActionModel> actionModels) {
        this.actionModels = actionModels;
    }
}