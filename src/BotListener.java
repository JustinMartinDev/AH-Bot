/**
 * Created by justin on 22/07/2017.
 */

import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.EventListener;

public class BotListener implements EventListener {

    private String URL = "https://www.youtube.com/watch?v=XE6YaLtctcI";
    private boolean isActive = false;
    @Override
    public void onEvent(Event event) {
        System.out.println(event.getClass().getSimpleName());
        if(event instanceof MessageReceivedEvent) onMesssage((MessageReceivedEvent)event);
    }

    private void onMesssage(MessageReceivedEvent event){

        if(event.getMessage().getContent().equals("!bot active")) isActive = true;
        if(event.getMessage().getContent().equals("!bot disable")) isActive = false;

        if(isActive){
           if((event.getMessage().getContent().equals("AH")) ||
              (event.getMessage().getContent().equals("ah")) ||
              (event.getMessage().getContent().equals("Ah")) ||
              (event.getMessage().getContent().equals("aH"))){
                if(event.getGuild().getSelfMember().hasPermission(Permission.MESSAGE_WRITE)){
                    event.getTextChannel().sendMessage(URL).complete();
                }
           }
        }
    }
}