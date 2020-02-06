package day54;

public class ChromeDriver implements WebDriver {


    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to " + url
                + " using Chrome Browser");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome Browser");
    }
}
