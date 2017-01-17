package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FCAMARA804 on 16/01/2017.
 */
public class LoginStep {
    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
       System.out.println("I should see the userform page \n");
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
       System.out.println("Navigate to the login page \n");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {

        System.out.println("Click login button");
    }

    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);
        for (User user: users) {
            System.out.println(user.userName);
            System.out.println(user.passWord);
        }
    }

    public class User{
        public String userName;
        public String passWord;

        public User(String userName, String passWord) {
            this.userName = userName;
            this.passWord = passWord;
        }
    }
}
