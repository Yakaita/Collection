package ca.jeremylaing.collection.settings;

import ca.tweetzy.tweety.settings.SimpleSettings;

public class Settings extends SimpleSettings {

    public static String PREFIX;

    private static void init(){
        pathPrefix(null);

        PREFIX = getString("Prefix");
    }

    @Override
    protected int getConfigVersion() {
        return 1;
    }
}
