package bl4ckscor3.bot.bl4ckb0t.commands.privmsg;

import org.pircbotx.hooks.events.PrivateMessageEvent;

import bl4ckscor3.bot.bl4ckb0t.Bot;
import bl4ckscor3.bot.bl4ckb0t.Core;

public class PrivateJoin implements IPrivateCommand<PrivateMessageEvent<Bot>>
{
	@Override
	public void exe(PrivateMessageEvent<Bot> event, String[] args)
	{
		if(args.length > 2)
			Core.bot.joinChannelWithPassword(args[1], args[2]);
		else
			Core.bot.joinChannel(args[1]);
	}

	@Override
	public String getAlias()
	{
		return "join ";
	}
}
