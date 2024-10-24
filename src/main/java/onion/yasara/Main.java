package onion.yasara;

import net.md_5.bungee.api.plugin.Plugin;
import onion.yasara.commands.Command;
import onion.yasara.commands.tell.TellCommand;

public class Main extends Plugin {

    @Override
    public void onEnable() {
        // Registra o comando /tell
        new Command(this).registerCommands();
        getLogger().info("§ayasTell-Bungee habilitado com sucesso.");
    }

    @Override
    public void onDisable() {
        getLogger().info("§cyasTell-Bungee desabilitado.");
    }
}
