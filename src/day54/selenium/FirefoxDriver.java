package day54.selenium;

import day54.interface_as_reference.WebDriver;

public class FirefoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox Browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to " + url
                + " using Firefox Browser");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox Browser");
    }
}
