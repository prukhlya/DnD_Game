package com.ourcharacters;

import com.app.Weapons.Weapon;
import com.interfaces.Royal;
import com.parents.Elf;

public class ElfRoyal extends Elf implements Royal {
	
	public ElfRoyal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElfRoyal(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeMagic() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.SCROLL);
	}

}
