package com.myuuiii.empirewandplus.Data;

import com.myuuiii.empirewandplus.Abstracts.Spell;
import com.myuuiii.empirewandplus.Spells.Capture;
import com.myuuiii.empirewandplus.Spells.KajCloud;
import com.myuuiii.empirewandplus.Spells.EmpireComet;
import com.myuuiii.empirewandplus.Spells.FireComet;
import com.myuuiii.empirewandplus.Spells.CelestialConfuse;
import com.myuuiii.empirewandplus.Spells.EmpireConfuse;
import com.myuuiii.empirewandplus.Spells.Fireball;
import com.myuuiii.empirewandplus.Spells.Ignite;
import com.myuuiii.empirewandplus.Spells.Launch;
import com.myuuiii.empirewandplus.Spells.Leap;
import com.myuuiii.empirewandplus.Spells.Lightning;
import com.myuuiii.empirewandplus.Spells.EmpirePulse;
import com.myuuiii.empirewandplus.Spells.FirePulse;
import com.myuuiii.empirewandplus.Spells.Smite;
import com.myuuiii.empirewandplus.Spells.Spark;
import com.myuuiii.empirewandplus.Spells.BloodSpark;
import com.myuuiii.empirewandplus.Spells.EmpireSpark;
import com.myuuiii.empirewandplus.Spells.PoisonSpark;
import com.myuuiii.empirewandplus.Spells.BloodWave;
import com.myuuiii.empirewandplus.Spells.PoisonWave;
import com.myuuiii.empirewandplus.Spells.FlameWave;
import com.myuuiii.empirewandplus.Spells.EmpireStun;
import com.myuuiii.empirewandplus.Spells.CelestialStun;


import java.util.HashMap;

public class SpellHashMap {
    public static HashMap<String, Spell> getSpellHashMap() {
        return new HashMap<>() {{

            // Sparks
            put(SpellNames.Spark, new Spark());
            put(SpellNames.EmpireSpark, new EmpireSpark());
            put(SpellNames.BloodSpark, new BloodSpark());
            put(SpellNames.PoisonSpark, new PoisonSpark());

            // Waves
            put(SpellNames.BloodWave, new BloodWave());
            put(SpellNames.PoisonWave, new PoisonWave());
            put(SpellNames.FlameWave, new FlameWave());

            // Confuse
            put(SpellNames.EmpireConfuse, new EmpireConfuse());
            put(SpellNames.CelestialConfuse, new CelestialConfuse());

            // Stun
            put(SpellNames.EmpireStun, new EmpireStun());
            put(SpellNames.CelestialStun, new CelestialStun());

            // Capture
            put(SpellNames.Capture, new Capture());

            // Comet
            put(SpellNames.EmpireComet, new EmpireComet());
            put(SpellNames.FireComet, new FireComet());

            // Pulse
            put(SpellNames.FirePulse, new FirePulse());
            put(SpellNames.EmpirePulse, new EmpirePulse());

            // Fireball
            put(SpellNames.Fireball, new Fireball());

            // Ignite
            put(SpellNames.Ignite, new Ignite());

            // Launch
            put(SpellNames.Launch, new Launch());

            // Leap
            put(SpellNames.Leap, new Leap());

            // Lightning
            put(SpellNames.Lightning, new Lightning());

            // Smite
            put(SpellNames.Smite, new Smite());

            // CLoud
            put(SpellNames.KajCloud, new KajCloud());
        }};
    }
}