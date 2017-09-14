import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by XuChen on 2017/9/14.
 * Description:  注意java容器结构图
 */
class Command {
    private String string = "Command";
    private static int count = 0;
    private final int id;

    Command() {
        ++count;
        id = count;
    }

    void getString() {
        System.out.println(string + " : " + id);
    }
}

class AddCommand {
    Queue<Command> setCommand(int num) {
        Queue<Command> commands = new LinkedList<Command>();
        for (int i = 0; i < num; ++i) {
            commands.offer(new Command());
        }
        return commands;
    }
}

public class RemoveCommand {
    void removeCommands(Queue<Command> queue) {
        while (queue.peek() != null) {
            queue.peek().getString();
            queue.remove();
        }
    }

    public static void main(String[] args) {
        AddCommand add = new AddCommand();
        Queue<Command> commands = new LinkedList<Command>();
        RemoveCommand remove = new RemoveCommand();
        commands = add.setCommand(5);
        remove.removeCommands(commands);
    }
}
