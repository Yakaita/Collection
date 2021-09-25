package ca.jeremylaing.collection;

import ca.jeremylaing.collection.commands.CommandGroup;
import ca.jeremylaing.collection.settings.Settings;
import ca.tweetzy.tweety.Common;
import ca.tweetzy.tweety.Messenger;
import ca.tweetzy.tweety.command.SimpleCommandGroup;
import ca.tweetzy.tweety.plugin.SimplePlugin;
import com.massivecraft.massivecore.store.Coll;
import lombok.Getter;

public class Collection extends SimplePlugin {

    @Getter
    private final SimpleCommandGroup mainCommand = CommandGroup.getInstance();

    @Override
    protected void onPluginStart() {
        Common.ADD_TELL_PREFIX = true;
        Common.ADD_LOG_PREFIX = true;
        Common.setLogPrefix(Settings.PREFIX + " ");
        Common.setTellPrefix(Settings.PREFIX);
        Messenger.setInfoPrefix(Settings.PREFIX + " ");
        Messenger.setAnnouncePrefix(Settings.PREFIX + " ");
        Messenger.setErrorPrefix(Settings.PREFIX + " ");
        Messenger.setQuestionPrefix(Settings.PREFIX + " ");
        Messenger.setSuccessPrefix(Settings.PREFIX + " ");
        Messenger.setWarnPrefix(Settings.PREFIX + " ");
    }

    public static Collection getInstance(){
        return (Collection) SimplePlugin.getInstance();
    }
}
