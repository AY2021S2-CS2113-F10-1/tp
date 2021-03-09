package seedu.hdbuy.command;

import seedu.hdbuy.data.QueryKey;
import seedu.hdbuy.ui.TextUi;

import java.util.HashMap;

public abstract class Command {

    public abstract void execute(HashMap<QueryKey, String> inputs);

    public boolean isExit() {
        return this instanceof CloseCommand;
    }
}
