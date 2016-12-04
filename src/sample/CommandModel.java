package sample;

/**
 * Created by Mariusz on 04.12.2016.
 */
public class CommandModel {
    private String action;
    private String fileType;
    private String fileName;


    public CommandModel(String action, String fileType, String fileName) {
        this.action = action;
        this.fileType = fileType;
        this.fileName = fileName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
