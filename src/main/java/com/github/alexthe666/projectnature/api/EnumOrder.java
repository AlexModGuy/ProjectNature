package com.github.alexthe666.projectnature.api;

public enum EnumOrder {
	WANDER, FOLLOW, SIT;

	public EnumOrder next() {
		return this.values()[(this.ordinal() + 1) % this.values().length];
	}
}
