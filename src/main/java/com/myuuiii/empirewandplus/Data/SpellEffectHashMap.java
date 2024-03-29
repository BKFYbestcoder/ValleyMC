package com.myuuiii.empirewandplus.Data;

import com.myuuiii.empirewandplus.Abstracts.SpellEffect;
import com.myuuiii.empirewandplus.SpellEffects.EmpireCometEffect;
import com.myuuiii.empirewandplus.SpellEffects.FireCometEffect;
import com.myuuiii.empirewandplus.SpellEffects.FireballEffect;
import com.myuuiii.empirewandplus.SpellEffects.LightningEffect;
import com.myuuiii.empirewandplus.SpellEffects.EmpirePulseEffect;
import com.myuuiii.empirewandplus.SpellEffects.FirePulseEffect;
import com.myuuiii.empirewandplus.SpellEffects.SmiteEffect;
import com.myuuiii.empirewandplus.SpellEffects.BloodWaveEffect;
import com.myuuiii.empirewandplus.SpellEffects.FlameWaveEffect;
import com.myuuiii.empirewandplus.SpellEffects.PoisonWaveEffect;

import java.util.HashMap;

public class SpellEffectHashMap {
    public static HashMap<String, SpellEffect> getSpellEffectHashMap() {
        return new HashMap<>() {{
            // Waves
            put(SpellNames.BloodWave, new BloodWaveEffect());
            put(SpellNames.FlameWave, new FlameWaveEffect());
            put(SpellNames.PoisonWave, new PoisonWaveEffect());

            // Comet
            put(SpellNames.EmpireComet, new EmpireCometEffect());
            put(SpellNames.FireComet, new FireCometEffect());

            // Pulse
            put(SpellNames.FirePulse, new FirePulseEffect());
            put(SpellNames.EmpirePulse, new EmpirePulseEffect());

            // Fireball
            put(SpellNames.Fireball, new FireballEffect());

            // Lightning
            put(SpellNames.Lightning, new LightningEffect());

            // Smite
            put(SpellNames.Smite, new SmiteEffect());
        }};
    }
}