package com.myuuiii.empirewandplus.Wands;

import com.myuuiii.empirewandplus.Abstracts.Wand;
import com.myuuiii.empirewandplus.EmpireWandPlus;
import com.myuuiii.empirewandplus.Data.SpellNames;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static com.myuuiii.empirewandplus.Extensions.colorText;

import java.util.ArrayList;
import java.util.List;


public class EmpireWand extends Wand {

    public List<String> Spells = new ArrayList<>() {
        {
            add(SpellNames.Leap);
            add(SpellNames.EmpireSpark);
            add(SpellNames.FlameWave);
            add(SpellNames.EmpireConfuse);
            add(SpellNames.EmpireStun);
            add(SpellNames.EmpireComet);
            add(SpellNames.FirePulse);
            add(SpellNames.Fireball);
            add(SpellNames.Ignite);
            add(SpellNames.Launch);

        }
    };

    public final String permissionBase = EmpireWandPlus.PermissionPrefix + "empirewand.";

    @Override
    public String getDisplayName() {
        return ChatColor.GOLD + "Empire Wand";
    }

    @Override
    public String getPrefix() {
        return colorText("&8[&aValley&fMC&8][&6Empire Wand&8]&r ");
    }

    @Override
    public ItemStack getItem() {
        ItemStack wand = new ItemStack(Material.BLAZE_ROD, 1);
        ItemMeta wandMeta = wand.getItemMeta();
        wandMeta.setDisplayName(getDisplayName());
        wandMeta.setLore(new ArrayList<>() {
            {
                add(Spells.get(0));
            }
        });
        wand.setItemMeta(wandMeta);
        return wand;
    }

    @Override
    public void Handle(PlayerInteractEvent e) {
        final EmpireWand empireWand = (EmpireWand) EmpireWandPlus.wandHashMap.get("empire");
        HandleInteraction(e, empireWand);
    }

    @Override
    public void SwitchEffects(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        p.getWorld().playSound(p.getLocation(), Sound.BLOCK_STONE_BUTTON_CLICK_OFF, 10.0f, 1.0f);
        p.getWorld().spawnParticle(Particle.ENCHANTMENT_TABLE, p.getLocation(), 50, 0.4, 0.5, 0.4, 0.0);
        p.getWorld().spawnParticle(Particle.SPELL_WITCH, p.getLocation(), 100, 0, 0.7, 0, 0.01);
    }
}