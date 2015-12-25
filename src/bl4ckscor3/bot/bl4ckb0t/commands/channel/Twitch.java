package bl4ckscor3.bot.bl4ckb0t.commands.channel;

import org.pircbotx.hooks.events.MessageEvent;

import bl4ckscor3.bot.bl4ckb0t.core.Bot;
import bl4ckscor3.bot.bl4ckb0t.exception.IncorrectCommandExecutionException;
import bl4ckscor3.bot.bl4ckb0t.localization.L10N;
import bl4ckscor3.bot.bl4ckb0t.util.Utilities;

public class Twitch extends BaseCommand<MessageEvent<Bot>>
{
	@Override
	public void exe(MessageEvent<Bot> event) throws IncorrectCommandExecutionException
	{
		String[] args = Utilities.toArgs(event.getMessage());
		
		if(args.length == 2)
			Utilities.chanMsg(event, "http://www.twitch.tv/" + args[1]);
		else
			throw new IncorrectCommandExecutionException(getAlias());
	}
	
	@Override
	public String getAlias()
	{
		return "tv";
	}

	@Override
	public String getSyntax(MessageEvent<Bot> event)
	{
		return "-tv <" + L10N.getString("tv.help.channel", event) + ">";
	}

	@Override
	public String[] getUsage(MessageEvent<Bot> event)
	{
		return new String[]{"-tv <" + L10N.getString("tv.help.channel", event) + "> || " + L10N.getString("tv.explanation", event)};
	}
}
