package com.arirangJS.Script.Classes.org.bukkit.entity;

import com.arirangJS.Script.Classes.org.bukkit.potion._PotionEffect;
import org.bukkit.entity.LivingEntity;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.annotations.JSConstructor;
import org.mozilla.javascript.annotations.JSFunction;

@SuppressWarnings("unused")
public abstract class _LivingEntity extends ScriptableObject implements _ILivingEntity {

	private static final long serialVersionUID = 2485571018791985097L;

	public LivingEntity entity;
	
	@Override
	public String getClassName() {
		return "LivingEntity";
	}

	@JSConstructor
	public _LivingEntity() {}
	
	public _LivingEntity(LivingEntity entity) {
		this.entity = entity;
	}
	
	@JSFunction
	public boolean addPotionEffect(_PotionEffect effect) {
		return entity.addPotionEffect(effect.potionEffect);
	}
	
	@JSFunction
	public boolean addPotionEffectForce(_PotionEffect effect) {
		return entity.addPotionEffect(effect.potionEffect, true);
	}
	
	@JSFunction
	public boolean getCanPickupItems() {
		return entity.getCanPickupItems();
	}
	
	@JSFunction
	public double getEyeHeight() {
		return entity.getEyeHeight();
	}
	
	@JSFunction
	public double getEyeHeightIgnoreSneak() {
		return entity.getEyeHeight(true);
	}
	
	@JSFunction
	public _Player getKiller() {
		return new _Player(entity.getKiller());
	}
	
	@JSFunction
	public double getLastDamage() {
		return entity.getLastDamage();
	}
	
	@JSFunction
	public int getMaximumAir() {
		return entity.getMaximumAir();
	}
	
	@JSFunction
	public int getMaximumNoDamageTicks() {
		return entity.getMaximumNoDamageTicks();
	}
	
	@JSFunction
	public int getNoDamageTicks() {
		return entity.getNoDamageTicks();
	}
	
	@JSFunction
	public boolean hasAI() {
		return entity.hasAI();
	}
	
	@JSFunction
	public boolean isCollidable() {
		return entity.isCollidable();
	}
	
	@JSFunction
	public boolean isGliding() {
		return entity.isGliding();
	}
	
	@JSFunction
	public boolean isLeashed() {
		return entity.isLeashed();
	}
	
	@JSFunction
	public void setAI(boolean ai) {
		entity.setAI(ai);
	}
	
	@JSFunction
	public void setCanPickupItems(boolean pickup) {
		entity.setCanPickupItems(pickup);
	}
	
	@JSFunction
	public void setCollidable(boolean collidable) {
		entity.setCollidable(collidable);
	}
	
	@JSFunction
	public void setGliding(boolean gliding) {
		entity.setGliding(gliding);
	}
	
	@JSFunction
	public void setLastDamage(double damage) {
		entity.setLastDamage(damage);
	}
	
	@JSFunction
	public void setMaximumAir(int ticks) {
		entity.setMaximumAir(ticks);
	}
	
	@JSFunction
	public void setMaximumNoDamageTicks(int ticks) {
		entity.setMaximumNoDamageTicks(ticks);
	}
	
	@JSFunction
	public void setNoDamageTicks(int ticks) {
		entity.setNoDamageTicks(ticks);
	}
	
	@JSFunction
	public void setRemainingAir(int ticks) {
		entity.setRemainingAir(ticks);
	}
	
	@JSFunction
	public void setRemoveWhenFarAway(boolean remove) {
		entity.setRemoveWhenFarAway(remove);
	}
}