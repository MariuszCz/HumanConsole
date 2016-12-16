import antlr4.ProgramBaseVisitor;
import antlr4.ProgramParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mariusz on 04.12.2016.
 */
public class CommandVisitor extends ProgramBaseVisitor<String> {
    private String name;
    private String action;
    private String type;
    private List<String> RUN = Arrays.asList("run", "open", "launch", "start", "go");
    private List<String> CLOSE = Arrays.asList("close", "exit", "shut", "stop");

    @Override
    public String visitName(ProgramParser.NameContext ctx) {
        try {
            name = ctx.TEXT().getText();
            visitType(ctx.type());
            return name;
        } catch (Exception ex) {
            System.out.print("name: " + ex.getMessage());
        }
        return "";
    }

    //    @Override
//    public String visitConnector(ProgramParser.ConnectorContext ctx){
//      try {
//          if (ctx.CONNECTOR_OR() != null || ctx.CONNECTOR_AND()!=null) {
//              actionModel.setConnector(ctx.CONNECTOR_OR().get(0).getText());
//              if(ctx.name(0)!=null){
//              visitName(ctx.name(0));}
//              return ctx.CONNECTOR_OR().get(0).getText();
//          } else {
//              actionModel.setConnector(ctx.CONNECTOR_AND().get(0).getText());
//
//              return ctx.CONNECTOR_AND().get(0).getText();
//          }
//      } catch (Exception ex) {
//
//      }
//        visitName(ctx.name(0));
//      return "";
//    }
    @Override
    public String visitType(ProgramParser.TypeContext ctx) {
        try {
            type = ctx.TYPE().getText();
            visitAction(ctx.action());
            return ctx.TYPE().getText();
        } catch (Exception ex) {
            System.out.print("type: " + ex.getMessage());
        }
        return "";
    }

    @Override
    public String visitAction(ProgramParser.ActionContext ctx) {
        try {
            if (ctx.CLOSE() != null) {
                action = ctx.CLOSE().getText();
                setMethodForCommand();
                return ctx.CLOSE().getText();
            } else {
                action = ctx.RUN().getText();
                setMethodForCommand();
                return ctx.RUN().getText();
            }
        } catch (Exception ex) {
            System.out.print("action: " + ex.getMessage());
        }
        return "";
    }

    @Override
    public String visitSomeText(ProgramParser.SomeTextContext ctx) {
        return "";
    }

    @Override
    public String visitCommand(ProgramParser.CommandContext ctx) {
        try {
            visitName(ctx.name(0));
            return ctx.name().get(0).getText();
        } catch (Exception ex) {
            System.out.print("command: " + ex.getMessage());
        }
        return "";
    }

    private void setMethodForCommand() {

        if(action.equals("search")) {
            search();
        }
        if (RUN.contains(action)) {
            runByStart();
        }

        if (CLOSE.contains(action)) {
            closeProcess();
        }

    }

    private void runByStart() {
        if (type.equals("page") || type.equals("www")) {
            String command = "cmd /c start chrome http://www." + name;
            runProgramByName(command);
        } else if (type.equals("video") || type.equals("film")) {
            String command = "https://www.youtube.com/results?search_query=" + name + "&sm=3";
            searchAndOpenSpecifyArticle(1, command);
        } else if (type.equals("article")) {
            String command = "http://www.google.pl/?gws_rd=ssl#q=" + name;
            searchAndOpenSpecifyArticle(2, command);
        } else {
            String command = "cmd /c start " + name;
            runProgramByName(command);
        }
    }

    private void search() {
        if (type.equals("page") || type.equals("www")) {
            String command = "cmd /c start chrome http://www." + name;
            runProgramByName(command);
        } else if (type.equals("video") || type.equals("film")) {
            String command = "cmd /c start chrome https://www.youtube.com/results?search_query=" + name + "&sm=3";
            runProgramByName(command);
        } else if (type.equals("article")) {
            String command = "cmd /c start chrome http://www.google.pl/?gws_rd=ssl#q=" + name;
            runProgramByName(command);
        } else {
            String command = "cmd /c start " + name;
            runProgramByName(command);
        }
    }

    public void searchAndOpenSpecifyArticle(int id, String command) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mariusz\\Documents\\HumanConsole\\src\\sample\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to(command);
        if (id == 2) {
            WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

            List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));
            driver.navigate().to(findElements.get(0).getAttribute("href"));
        }
        if (id == 1) {
            driver.findElement(By.xpath("//*[@id='results']/ol/li[2]/ol/li[2]/div/div/div")).click();
        }
    }

    private void closeProcess() {
        String command = "cmd /c taskkill /IM "+name+".exe";
        runProgramByName(command);
    }
    public void runProgramByName(String name) {
        Runtime rs = Runtime.getRuntime();

        try {
            rs.exec(name);
            System.out.print(name+" successfully executed!");
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
