package bl4ckscor3.bot.bl4ckb0t.commands.channel;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.pircbotx.hooks.events.MessageEvent;

import bl4ckscor3.bot.bl4ckb0t.core.Bot;
import bl4ckscor3.bot.bl4ckb0t.core.Core;
import bl4ckscor3.bot.bl4ckb0t.localization.L10N;
import bl4ckscor3.bot.bl4ckb0t.util.Utilities;
import bl4ckscor3.bot.bl4ckb0t.util.android.ArrayMap;

public class Changelog implements ICommand<MessageEvent<Bot>>
{
	public static final ArrayMap<String, ArrayList<String>> versions = new ArrayMap<String, ArrayList<String>>();

	@Override
	public void exe(MessageEvent<Bot> event) throws MalformedURLException, IOException
	{
		String[] args = Utilities.toArgs(event.getMessage());

		if(args.length == 2)
		{
			if(!versions.containsKey(args[1]))
			{
				Utilities.chanMsg(event, L10N.getString("changelog.versionNotFound"));
				return;
			}

			for(String s : versions.get(args[1]))
			{
				Utilities.chanMsg(event, s);
			}

			return;
		}

		if(!Core.bot.isDevelopment())
		{
			for(String s : versions.get(Core.bot.getConfiguration().getVersion()))
			{
				Utilities.chanMsg(event, s);
			}
		}
	}

	public static boolean startsWithNumber(String line)
	{
		return line.startsWith("0") || line.startsWith("1") || line.startsWith("2") || line.startsWith("3") || line.startsWith("4") || line.startsWith("5") || line.startsWith("6") || line.startsWith("7") || line.startsWith("8") || line.startsWith("9");
	}

	@Override
	public String getAlias()
	{
		return "changelog";
	}

	@Override
	public String getSyntax()
	{
		return "-changelog [" + L10N.getString("changelog.versionNumber") + "]";
	}

	@Override
	public String[] getUsage()
	{
		return new String[]
				{
						"-changelog || " + L10N.getString("changelog.explanation.1"),
						"-changelog <" + L10N.getString("changelog.versionNumber") + "> || " + L10N.getString("changelog.explanation.2")
				};
	}

	@Override
	public String getNotes()
	{
		return L10N.getString("changelog.notes");
	}

	@Override
	public int getPermissionLevel()
	{
		return 1;
	}
}
