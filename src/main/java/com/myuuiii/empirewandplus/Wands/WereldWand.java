package com.myuuiii.empirewandplus.Wands;

import com.myuuiii.empirewandplus.Abstracts.Wand;
import com.myuuiii.empirewandplus.Data.SpellNames;
import com.myuuiii.empirewandplus.EmpireWandPlus;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

import static com.myuuiii.empirewandplus.Extensions.colorText;

public class WereldWand extends Wand {

    public List<String> Spells = new ArrayList<>();

    public WereldWand() {
        Spells.add(SpellNames.Leap);
        Spells.add(SpellNames.Launch);
        Spells.add(SpellNames.EmpireComet);
        Spells.add(SpellNames.Fireball);
        Spells.add(SpellNames.EmpireSpark);
        Spells.add(SpellNames.EmpireConfuse);
        Spells.add(SpellNames.EmpireStun);
        Spells.add(SpellNames.FlameWave);
        Spells.add(SpellNames.FirePulse);
        Spells.add(SpellNames.Ignite);
        Spells.add(SpellNames.CelestialConfuse);
        Spells.add(SpellNames.CelestialStun);
        Spells.add(SpellNames.Lightning);
        Spells.add(SpellNames.Smite);
        Spells.add(SpellNames.KajCloud);
        Spells.add(SpellNames.BloodSpark);
        Spells.add(SpellNames.BloodWave);
    }

    public final String permissionBase = EmpireWandPlus.PermissionPrefix + "wereldwand.";

    @Override
    public String getDisplayName() {
        return ChatColor.GREEN + "Wereld Wand";
    }

    @Override
    public String getPrefix() {
        return colorText("&8[&aValley&fMC&8][&aWereld Wand&8]&r ");
    }

    @Override
    public ItemStack getItem() {
        ItemStack wand = new ItemStack(Material.HEART_OF_THE_SEA, 1);
        ItemMeta wandMeta = wand.getItemMeta();
        wandMeta.setDisplayName(getDisplayName());
        wandMeta.setLore(Spells); // Voeg de lijst met spreuken toe aan de lore
        wand.setItemMeta(wandMeta);
        return wand;
    }

    @Override
    public void Handle(PlayerInteractEvent e) {
        final WereldWand wereldWand = (WereldWand) EmpireWandPlus.wandHashMap.get("wereld");
        HandleInteraction(e, wereldWand);
    }

    @Override
    public void SwitchEffects(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        p.getWorld().playSound(p.getLocation(), Sound.BLOCK_STONE_BUTTON_CLICK_OFF, 10.0f, 1.0f);
        p.getWorld().spawnParticle(Particle.ENCHANTMENT_TABLE, p.getLocation(), 50, 0.4, 0.5, 0.4, 0.0);
        p.getWorld().spawnParticle(Particle.SPELL_WITCH, p.getLocation(), 100, 0, 0.7, 0, 0.01);
    }
}
