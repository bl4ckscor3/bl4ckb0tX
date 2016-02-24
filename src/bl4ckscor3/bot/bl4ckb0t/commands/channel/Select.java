package bl4ckscor3.bot.bl4ckb0t.commands.channel;

import java.util.Random;

import org.pircbotx.hooks.events.MessageEvent;

import bl4ckscor3.bot.bl4ckb0t.Bot;
import bl4ckscor3.bot.bl4ckb0t.exception.IncorrectCommandExecutionException;
import bl4ckscor3.bot.bl4ckb0t.localization.L10N;
import bl4ckscor3.bot.bl4ckb0t.util.Utilities;

public class Select extends BaseCommand<MessageEvent<Bot>>
{
	@Override
	public void exe(MessageEvent<Bot> event, String[] args) throws IncorrectCommandExecutionException 
	{
		if(args.length != 1)
		{
			String[] options = event.getMessage().substring(8).split(",");

			Utilities.chanMsg(event, options[new Random().nextInt(options.length)]);
		}
		else
			throw new IncorrectCommandExecutionException(getMainAlias());
	}

	@Override
	public String[] getAliases()
	{
		return new String[]{"select"};
	}

	@Override
	public String getSyntax(MessageEvent<Bot> event)
	{
		return "-select <" + L10N.getString("select.help.options", event) + ">";
	}

	@Override
	public String[] getUsage(MessageEvent<Bot> event)
	{
		return new String[]{"-select <" + L10N.getString("select.help.options", event) + "> || " + L10N.getString("select.explanation", event)};
	}

	@Override
	public String getNotes(MessageEvent<Bot> event)
	{
		return L10N.getString("select.notes", event);
	}
}
