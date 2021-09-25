package ca.jeremylaing.collection.commands;

import ca.tweetzy.tweety.command.SimpleCommandGroup;
import github.scarsz.discordsrv.dependencies.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CommandGroup extends SimpleCommandGroup {

    @Getter
    private final static CommandGroup instance = new CommandGroup();

    @Override
    protected void registerSubcommands() {

    }

    @Override
    protected String getCredits() {
        return null;
    }
}
