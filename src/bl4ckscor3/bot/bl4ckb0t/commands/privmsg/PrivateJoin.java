package bl4ckscor3.bot.bl4ckb0t.commands.privmsg;

import org.pircbotx.hooks.events.PrivateMessageEvent;

import bl4ckscor3.bot.bl4ckb0t.core.Bot;
import bl4ckscor3.bot.bl4ckb0t.util.Utilities;

public class PrivateJoin implements IPrivateCommand<PrivateMessageEvent<Bot>>
{
	@Override
	public void exe(PrivateMessageEvent<Bot> event)
	{
		String[] args = Utilities.toArgs(event.getMessage());
		
		if(args.length > 2)
			Utilities.joinChannelWithPassword(args[1].startsWith("#") ? args[1] : "#" + args[1], args[2]);
		else
			Utilities.joinChannel(args[1].startsWith("#") ? args[1] : "#" + args[1]);
	}

	@Override
	public String getAlias()
	{
		return "join ";
	}
}