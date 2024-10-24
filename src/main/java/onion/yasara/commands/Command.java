package onion.yasara.commands;

import net.md_5.bungee.api.ProxyServer;
import onion.yasara.Main;
import onion.yasara.commands.tell.TellCommand;

public class Command {

    private final Main plugin;

    public Command(Main plugin) {
        this.plugin = plugin;
    }

    public void registerCommands() {
        // Registra o comando /tell
        ProxyServer.getInstance().getPluginManager().registerCommand(plugin, new TellCommand());
    }
}
