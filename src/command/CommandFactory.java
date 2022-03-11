package command;

public class CommandFactory {

    public static Command createCommand(CommandType type, String[] args){
        HistoryCommand historyCommand = new HistoryCommand();

        Command command = null;

        switch (type) {
            case HELP:
                command = new HelpCommand();
                break;
            case INFO:
                command = new InfoCommand();
                break;
            case SHOW:
                command = new ShowCommand();
                break;
            case CLEAR:
                command = new ClearCommand();
                break;
            case EXIT:
                command = new ExitCommand();
                break;
            case HISTORY:
                command = historyCommand;
                break;
            case INSERT: {
                command = new InsertCommand();
                break;
            }
            case UPDATE: {
                command = new UpdateCommand();
                break;
            }
            case REMOVE_KEY: {
                command = new RemoveKeyCommand();
                break;
            }
            case REMOVE_GREATER: {
                command = new RemoveGreaterCommand();
                break;
            }
            case REMOVE_LOWER: {
                command = new RemoveLowerCommand();
                break;
            }
            case AVERAGE_OF_STUDENTS_COUNT: {
                command = new AverageOfCommand();
                break;
            }
            case FILTER_STARTS_WITH_NAME: {
                command = new FilterCommand();
                break;
            }
            case PRINT_DESCENDING: {
                command = new PrintCommand();
                break;
            }
        }
        if (args != null) {
            assert command != null;
            command.setArgs(args);
        }
        historyCommand.updateHistory(type.toString());

        return command;
    }
}