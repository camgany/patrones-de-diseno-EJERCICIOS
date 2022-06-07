package command.practice;

import java.util.ArrayList;
import java.util.List;

public class Defender {
    private List <ICommand> commands= new ArrayList<>();

    public Defender(){}

    public void addCommand(ICommand command){
        commands.add(command);
    }

    public void runCommands(){
        for (ICommand command  : commands  ) {
            command.execute();
        }
        commands.clear();
    }



}
