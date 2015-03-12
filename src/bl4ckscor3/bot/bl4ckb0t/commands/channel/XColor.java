package bl4ckscor3.bot.bl4ckb0t.commands.channel;

import org.pircbotx.hooks.events.MessageEvent;

import bl4ckscor3.bot.bl4ckb0t.core.Bot;
import bl4ckscor3.bot.bl4ckb0t.util.Utilities;

public class XColor implements ICommand<MessageEvent<Bot>>
{
	@Override
	public void exe(MessageEvent<Bot> event) throws Exception 
	{
		String[] colors =
			{
				"Grey",
				"Black",
				"Blue",
				"Dark Green",
				"Red",
				"Red",
				"Purple",
				"Brown",
				"Yellow",
				"Light Green",
				"Dark Aqua",
				"Lighter Aqua",
				"Pink"
			};

		for(int i = 0; i < 14; i++)
		{
			if(i < 4)
				Utilities.notice(event, "%C" + i + ": " + colors[i]);
			else if(i > 4 && i < 12)
				Utilities.notice(event, "%C" + i + ": " + colors[i]);
			else if(i == 13)
				Utilities.notice(event, "%C" + i + ": " + colors[i - 1]);
		}
	}

	@Override
	public String getAlias() 
	{
		return "xcolor";
	}

	@Override
	public String getSyntax()
	{
		return "-xcolor";
	}

	@Override
	public String[] getUsage()
	{
		return new String[]{"-xcolor || Gives you the XChat-SE color codes and their corresponding colors."};
	}

	@Override
	public String getNotes()
	{
		return "These colorcodes may work for other clients, too.";
	}
}