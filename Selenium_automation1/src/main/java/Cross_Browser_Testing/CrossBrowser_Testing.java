package Cross_Browser_Testing;

public class CrossBrowser_Testing implements Edge_Browser,FireFox_Browser,Chrome_Browser
{

	public static void main(String[] args) throws InterruptedException {
		
		Edge_Browser.Edgebrowser();
		Thread.sleep(5000);
		FireFox_Browser.Firefoxbroswer();
		Thread.sleep(5000);
		Chrome_Browser.chromebrowser();
		Thread.sleep(5000);
		
	}

}
