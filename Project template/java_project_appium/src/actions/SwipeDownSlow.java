package actions;

import java.util.HashMap;
import utils.Constants;
import io.appium.java_client.MobileElement;
import utils.Elements;
import utils.SwipeElement;

/**
 * Created by dinkark on 13-Oct-2016
 */
class SwipeDownSlow {
	public void run(HashMap<String, String> params) {
		MobileElement element = Elements.find(params, Driver.driver);
        int noOfTimes = Integer.parseInt(params.get(Constants.NO_OF_TIMES));
        for (int i = 0; i < noOfTimes; i++) {
		SwipeElement.swipeDownSlow(element, Driver.driver);
        }
	}
}
