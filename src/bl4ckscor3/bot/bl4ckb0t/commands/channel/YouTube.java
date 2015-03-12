package bl4ckscor3.bot.bl4ckb0t.commands.channel;

import java.io.IOException;
import java.net.MalformedURLException;

import org.pircbotx.hooks.events.MessageEvent;

import bl4ckscor3.bot.bl4ckb0t.core.Bot;
import bl4ckscor3.bot.bl4ckb0t.localization.L10N;
import bl4ckscor3.bot.bl4ckb0t.util.Utilities;

public class YouTube implements ICommand<MessageEvent<Bot>>
{
	@Override
	public void exe(MessageEvent<Bot> event) throws MalformedURLException, IOException
	{
		String[] args = Utilities.toArgs(event.getMessage());

		if(args.length == 2)
			Utilities.respond(event, "http://www.youtube.com/" + args[1], false);
		else
			Utilities.sendHelp(event.getUser().getNick(), getSyntax(), getUsage(), getNotes());
	}

	@Override
	public String getAlias()
	{
		return "yt";
	}

	@Override
	public String getSyntax()
	{
		return "-yt <" + L10N.strings.getString("yt.help.channel") + ">";
	}

	@Override
	public String[] getUsage()
	{
		return new String[]{"-yt <" + L10N.strings.getString("ytv.help.channel") + "> || " + L10N.strings.getString("yt.explanation")};
	}

	@Override
	public String getNotes()
	{
		return L10N.strings.getString("yt.notes");
	}
}