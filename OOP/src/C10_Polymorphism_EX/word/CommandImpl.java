package C10_Polymorphism_EX.word;

import java.util.*;

public class CommandImpl implements CommandInterface {
    class ToUpperTransform implements TextTransform {
        @Override
        public void invokeOn(StringBuilder text, int startIndex, int endIndex){
            for (int i = startIndex; i < endIndex; i++) {
                text.setCharAt(i, Character.toUpperCase(text.charAt(i)));
            }
        }
    }
    class Cut implements TextTransform {
        @Override
        public void invokeOn(StringBuilder text, int startIndex, int endIndex){
            if(startIndex == endIndex){
                if(!stack.isEmpty ()){
                    stack.pop ();
                }
            }else {
            String word = text.substring (startIndex, endIndex);
                text.replace (startIndex, endIndex,"");
                stack.push (word);
            }
        }
    }class Paste implements TextTransform {
        @Override
        public void invokeOn(StringBuilder text, int startIndex, int endIndex){
            if(!stack.isEmpty ()){
            text.replace (startIndex, endIndex, stack.peek ());
            }else {
                text.replace (startIndex, endIndex, "");
            }
        }
    }

    private Map<String, TextTransform> commandTransforms;
    private StringBuilder text;
    private Deque<String> stack;

    public Map<String, TextTransform> getCommandTransforms() {

        return commandTransforms;
    }

    public void setCommandTransforms(Map<String, TextTransform> commandTransforms) {
        this.commandTransforms = commandTransforms;
    }

    public StringBuilder getText() {
        return text;
    }

    public void setText(StringBuilder text)
    {
        this.text = text;
    }

    public CommandImpl(StringBuilder text) {
        this.commandTransforms = new HashMap<>();
        this.stack = new ArrayDeque<> ();
        this.text = text;
    }

    @Override
    public void init() {
        this.commandTransforms.clear();
        for (Command p : this.initCommands()) {
            this.commandTransforms.putIfAbsent(p.getText(), p.getTextTransform());
        }
    }

    @Override
    public void handleInput(String input) {
        String[] tokens = input.split("\\s+");

        String commandName = tokens[0];
        int startInd = Integer.parseInt(tokens[1]);
        int endInd = Integer.parseInt(tokens[2]);

        this.commandTransforms.get(commandName).invokeOn(this.text, startInd, endInd);
    }

    protected List<Command> initCommands() {
        List<Command> commands = new ArrayList<>();
        commands.add(new Command("uppercase", new ToUpperTransform()));
        commands.add(new Command("cut", new Cut ()));
        commands.add(new Command("paste", new Paste ()));

        return commands;
    }
}
