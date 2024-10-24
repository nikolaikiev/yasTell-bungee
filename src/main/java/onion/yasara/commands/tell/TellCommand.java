package onion.yasara.commands.tell;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.ProxyServer;

public class TellCommand extends Command {

    public TellCommand() {
        super("tell");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        // Verifica se é um jogador e se o comando tem ao menos 2 argumentos
        if (!(sender instanceof ProxiedPlayer)) {
            sender.sendMessage("§cApenas jogadores podem usar este comando.");
            return;
        }

        if (args.length < 2) {
            sender.sendMessage("§cUso: /tell <jogador> <mensagem>");
            return;
        }

        ProxiedPlayer playerSender = (ProxiedPlayer) sender;
        ProxiedPlayer target = ProxyServer.getInstance().getPlayer(args[0]);

        // Verifica se o jogador alvo está online
        if (target == null) {
            playerSender.sendMessage("§cO jogador " + args[0] + " não está online.");
            return;
        }

        // Impede o jogador de se auto enviar uma mensagem
        if (playerSender.equals(target)) {
            playerSender.sendMessage("§cVocê não pode enviar mensagens para si mesmo.");
            return;
        }

        // Concatena a mensagem a partir do segundo argumento e substitui & por § para cores
        String message = String.join(" ", args).substring(args[0].length() + 1).replace("&", "§");

        // Formata e envia a mensagem
        String formattedMessage = "§e§lMENSAGEM ➜ §r" + playerSender.getName() + " [" +
                playerSender.getServer().getInfo().getName() + "]" +
                ": §f" + message;

        target.sendMessage(formattedMessage);
        playerSender.sendMessage("§aMensagem enviada para " + target.getName() + ": §f" + message);
    }
}
