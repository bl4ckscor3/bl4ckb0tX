package bl4ckscor3.bot.bl4ckb0t.commands.channel;

import org.pircbotx.Colors;
import org.pircbotx.hooks.events.MessageEvent;

import bl4ckscor3.bot.bl4ckb0t.core.Core;
import bl4ckscor3.bot.bl4ckb0t.localization.L10N;
import bl4ckscor3.bot.bl4ckb0t.util.Utilities;

public class Join implements ICommand<MessageEvent>
{
	@Override
	public void exe(MessageEvent event) throws Exception
	{
		if(Utilities.isValidUser(event))
		{
			String[] args = Utilities.toArgs(event.getMessage());	

			if(args.length == 2)
			{
				if(args[1].equals("d"))
				{
					Utilities.chanMsg(event, L10N.strings.getString("join.success.default"));
					Utilities.joinDefaults();
					return;
				}
				
				if(!args[1].startsWith("#"))
					args[1] = "#" + args[1];
				
				if(!Utilities.hasJoinedChannel(args))
				{
					Utilities.chanMsg(event, L10N.strings.getString("join.success.normal") + " " + Colors.BOLD + args[1]);
					Utilities.joinChannel(args[1]);
				}
				else
					Utilities.chanMsg(event, L10N.strings.getString("join.alreadyJoined"));
			}
			else
				Utilities.sendHelp(event.getUser().getNick(), getSyntax(), getUsage(), getNotes());
		}
		else
			Utilities.sorry(event);
	}

	@Override
	public String getAlias()
	{
		return "join";
	}

	@Override
	public String getSyntax()
	{
		return "join <" + L10N.strings.getString("cmd.help.channel") + ">";
	}

	@Override
	public String[] getUsage()
	{
		return new String[]{"join <" + L10N.strings.getString("cmd.help.channel") + "> || " + L10N.strings.getString("join.explanation")};
	}

	@Override
	public String getNotes()
	{
		return L10N.strings.getString("notes.onlyOp");
	}
}