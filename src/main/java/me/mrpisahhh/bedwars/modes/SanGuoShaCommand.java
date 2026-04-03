package me.mrpisahhh.bedwars.modes;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SanGuoShaCommand implements CommandExecutor {
    private final SanGuoShaModeManager modeManager; // 管理三国杀模式玩家与游戏流程

    public SanGuoShaCommand(SanGuoShaModeManager modeManager) {
        this.modeManager = modeManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("该指令只能由玩家执行。");
            return true;
        }
        modeManager.joinSgsQueue(player);
        return true;
    }
}