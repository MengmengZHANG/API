package com.mzhang.api.stormpath;

import java.util.HashMap;
import java.util.Map;

import com.stormpath.sdk.account.Account;
import com.stormpath.sdk.account.AccountList;
import com.stormpath.sdk.api.ApiKey;
import com.stormpath.sdk.api.ApiKeys;
import com.stormpath.sdk.application.Application;
import com.stormpath.sdk.application.ApplicationList;
import com.stormpath.sdk.application.Applications;
import com.stormpath.sdk.authc.AuthenticationRequest;
import com.stormpath.sdk.authc.AuthenticationResult;
import com.stormpath.sdk.authc.UsernamePasswordRequest;
import com.stormpath.sdk.client.Client;
import com.stormpath.sdk.client.Clients;
import com.stormpath.sdk.directory.CustomData;
import com.stormpath.sdk.resource.ResourceException;
import com.stormpath.sdk.tenant.Tenant;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {

    String path = "D:/Userfiles/mzhang/Documents/Lib/API/.stormpath/apiKey.properties";

    ApiKey apiKey = ApiKeys.builder().setFileLocation(path).build();
    Client client = Clients.builder().setApiKey(apiKey).build();
    Tenant tenant = client.getCurrentTenant();

    ApplicationList applications = tenant.getApplications(
        Applications.where(Applications.name().eqIgnoreCase("My Application")));
    Application application = applications.iterator().next();

    // createAccount(client, application);
    // getAccount(application);
    boolean isValid = authenticate(application);
    System.out.println(isValid);
  }

  private static Account createAccount(Client client, Application application) {
    // Create the account object
    Account account = client.instantiate(Account.class);

    // Set the account properties
    account.setGivenName("Joe");
    account.setSurname("Stormtrooper");
    account.setUsername("tk421"); // optional, defaults to email if unset
    account.setEmail("tk421@stormpath.com");
    account.setPassword("Changeme1");
    CustomData customData = account.getCustomData();
    customData.put("favoriteColor", "white");

    return application.createAccount(account);
  }

  public static AccountList getAccount(Application application) {
    Map<String, Object> queryParams = new HashMap<String, Object>();
    queryParams.put("email", "tk421@stormpath.com");
    AccountList accounts = application.getAccounts(queryParams);
    return accounts;
  }

  public static boolean authenticate(Application application) {
    boolean flag = false;
    // Capture the username and password, such as via an SSL-encrypted web HTML form. We'll just simulate a form lookup
    // and use the values we used above:
    String usernameOrEmail = "tk421@stormpath.com";
    String rawPassword = "Changeme1";

    // Create an authentication request using the credentials
    AuthenticationRequest request = new UsernamePasswordRequest(usernameOrEmail, rawPassword);

    // Now let's authenticate the account with the application:
    try {
      AuthenticationResult result = application.authenticateAccount(request);
      Account account = result.getAccount();
      flag = true;
    }
    catch (ResourceException ex) {
      System.out.println(ex.getStatus() + " " + ex.getMessage());
    }
    return flag;

  }
}
