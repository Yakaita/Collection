package ca.jeremylaing.collection.settings;

import ca.tweetzy.tweety.settings.SimpleSettings;

public class Settings extends SimpleSettings {

    public static String PREFIX;

    private static void init(){
        pathPrefix(null);

        PREFIX = getString("Prefix");
    }

    public static final class Collectables{

        public static boolean ALWAYS_NEW;
        public static boolean ALLOW_DUPLICATES;

        private static void init(){
            pathPrefix("Collectables");
            ALWAYS_NEW = getBoolean("Always New");
            ALLOW_DUPLICATES = getBoolean("Allow Duplicates");
        }
    }

    @Override
    protected int getConfigVersion() {
        return 1;
    }
}
