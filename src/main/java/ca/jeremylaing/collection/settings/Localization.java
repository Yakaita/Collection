package ca.jeremylaing.collection.settings;

import ca.tweetzy.tweety.settings.SimpleLocalization;

public final class Localization extends SimpleLocalization {

    public static String COLLECTABLE_EARNED;

    public static void init(){
        pathPrefix(null);

        COLLECTABLE_EARNED = getString("Collectable Earned");
    }



    @Override
    protected int getConfigVersion() {
        return 1;
    }
}
