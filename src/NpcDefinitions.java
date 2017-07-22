/* Class_gr - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;

final class NpcDefinitions implements Comparator {
	public static int totalConfigFiles;
	public static int audioSampleRate;
	public static final int field_n_3039 = 8;
	static int i2 = 0;

	public static NpcComposite getNpcComposite(final int i) {
		NpcComposite npcdef;
		try {
			NpcComposite npcdef_1_ = (NpcComposite) NpcComposite.field_z_465.method_n_gb(i);
			if (npcdef_1_ != null) {
				return npcdef_1_;
			}
			final byte[] is = NpcComposite.field_n_479.getArchive(9, i);
			npcdef_1_ = new NpcComposite();
			npcdef_1_.id = i * -449317387;
			if (is != null) {
				npcdef_1_.method_z_void(new Buffer(is), (short) -16764);
			}
			npcdef_1_.method_d_void(-1053451984);
			if (i == 401) {
				npcdef_1_.name = "<img=49>Turael - Beginner";
			}
			if (i == 402) {
				npcdef_1_.name = "<img=49>Mazchna - Easy";
			}
			if (i == 403) {
				npcdef_1_.name = "<img=49>Vannaka - Easy";
			}
			if (i == 404) {
				npcdef_1_.name = "<img=49>Chaeldar - Medium";
			}
			if (i == 405) {
				npcdef_1_.name = "<img=49>Duradel - Elite";
			}
			if (i == 6797) {
				npcdef_1_.name = "<img=49>Nieve - Boss Task";
			}
			if (i == 6798) {
				npcdef_1_.name = "<img=49>Steve - Hard";
			}
			if (i == 306) {
				npcdef_1_.name = "<img=32>Vernox Guide";
			}
			if (i == 3369) {
				npcdef_1_.name = "<img=10>Juan";
			}
			if (i == 317) {
				npcdef_1_.name = "<img=3>Paul";
			}
			if (i == 311) {
				npcdef_1_.name = "<img=2>Adam";
			}
			if (i == 560) {
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[2] = "Trade";
			}
			if (i == 1787) {
				npcdef_1_.name = "<img=35>PvP Wizard";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Talk-to";
				npcdef_1_.actions[2] = "Edgeville";
				npcdef_1_.actions[3] = "Canifis";
				npcdef_1_.actions[4] = "Vernox";
			}
			if (i == 276) {
				npcdef_1_.name = "<img=34>Vernox Guide";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "<img=5>Vote Now";
				npcdef_1_.actions[2] = "<img=8>Open Store";
				npcdef_1_.actions[3] = "<img=9>Latest Updates";
			}
			if (i == 5156) {
				npcdef_1_.name = "<img=34>Member Manager";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Talk-to";
				npcdef_1_.actions[1] = "Teleports";
				npcdef_1_.actions[2] = "Online Store";
				npcdef_1_.actions[3] = "Donation Tiers";
			}
			if (i == 7378) {
				npcdef_1_.name = "Ish the Lost Navigator";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Talk-to";
			}
			if (i == 6526) {
				npcdef_1_.name = "<img=34>Voting";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Information";
				npcdef_1_.actions[2] = "Point Exchange";
				npcdef_1_.actions[3] = "Open Web Page";
			}
			if (i == 342) {
				npcdef_1_.name = "Sell Junk";
			}
			if (i == 315) {
				npcdef_1_.name = "<img=41>Emblem Trader";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Talk to";
			}
			if (i == 637) {
				npcdef_1_.name = "<img=33>Aubury";
			}
			if (i == 534) {
				npcdef_1_.name = "<img=35>Make-over Lady";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[3] = "Change Appearence";
			}
			if (i == 4398) {
				npcdef_1_.name = "<img=35>Edgeville Wizard";
			}
			if (i == 4399) {
				npcdef_1_.name = "<img=35>Vernox Wizard";
			}
			if (i == 4400) {
				npcdef_1_.name = "<img=35>Lumbridge Wizard";
			}
			if (i == 4159) {
				npcdef_1_.name = "<img=35>Global Teleports";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Teleport";
			}
			if (i == 3248) {
				npcdef_1_.name = "<img=35>Global Teleports";
			}
			if (i == 7297) {
				npcdef_1_.name = "<img=35>Global Teleports";
			}
			if (i == 5419) {
				npcdef_1_.name = "Estate Agent";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[2] = "Talk-to";
				npcdef_1_.actions[3] = "Turn-in";
			}
			if (i == 4180) {
				npcdef_1_.name = "<img=33>Free Melee Shop";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Shop 1";
			}
			if (i == 508 || i == 509 || i == 514 || i == 515) {
				npcdef_1_.actions = new String[5];
				npcdef_1_.name = "Shop";
				npcdef_1_.actions[2] = "General Store";
				npcdef_1_.actions[3] = "Supplies";
			}
			if (i == 6904 || i == 535) {
				npcdef_1_.name = "Shop";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Melee Weapon";
				npcdef_1_.actions[3] = "Melee Armor";
			}
			if (i == 7492) {
				npcdef_1_.name = "Shop";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Range Weapon";
				npcdef_1_.actions[3] = "Range Armor";
			}
			if (i == 4474) {
				npcdef_1_.name = "Shop";
			npcdef_1_.actions = new String[5];
			npcdef_1_.actions[0] = "Tools";
			}
			if (i == 7608) {
				npcdef_1_.name = "Shop";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Magic Weapon";
				npcdef_1_.actions[2] = "Magic Robe";
				npcdef_1_.actions[3] = "Teleports";
				npcdef_1_.actions[4] = "Runes";
			}
			if (i == 7502) {
				npcdef_1_.name = "Shop";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Magic Weapon";
				npcdef_1_.actions[2] = "Magic Robe";
				npcdef_1_.actions[3] = "Rune";
				npcdef_1_.actions[4] = "Teleport";
			}
			if (i == 4295) {
				npcdef_1_.name = "<img=33>Gear";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Magic";
				npcdef_1_.actions[2] = "Range";
				npcdef_1_.actions[3] = "Melee";
			}
			if (i == 4736) {
				npcdef_1_.name = "<img=33>Heraldic";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Shop 1";
			}
			if (i == 2200) {
				npcdef_1_.name = "<img=33>Team capes";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Shop 1";
			}
			if (i == 1173) {
				npcdef_1_.name = "<img=33>Wares";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Shop 1";
				npcdef_1_.actions[2] = "Shop 2";
			}
			if (i == 4293) {
				npcdef_1_.name = "<img=33>Supplies";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Shop 1";
			}
			if (i == 4180) {
				npcdef_1_.name = "<img=33>Free Melee Shop";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Shop 1";
			}
			if (i == 4181) {
				npcdef_1_.name = "<img=33>Free Range Shop";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Shop 1";
			}
			if (i == 4179) {
				npcdef_1_.name = "<img=33>Free Mage Shop";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Shop 1";
			}
			if (i == 2462) {
				npcdef_1_.name = "<img=33>Shanomi";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[2] = "Trade";
			}
			if (i == 4256) {
				npcdef_1_.name = "<img=33>Untradables";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Shop 1";
			}
			if (i == 2108) {
				npcdef_1_.name = "<img=33>Skillcapes";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Capes";
				npcdef_1_.actions[2] = "Hoods";//1
			}
			if (i == 4802) {
				npcdef_1_.name = "<img=33>Cosmetics";
				npcdef_1_.actions = new String[5];
				npcdef_1_.actions[0] = "Shop 1";
				npcdef_1_.actions[2] = "Shop 2";//1
				npcdef_1_.actions[3] = "Shop 3";//2
			}
			
			NpcComposite.field_z_465.method_z_void(npcdef_1_, i);
			npcdef = npcdef_1_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gr.n()");
		}
		return npcdef;
	}

	int method_n_int(final Class_gg class_gg, final Class_gg class_gg_2_, final int i) {
		int i_3_;
		try {
			i_3_ = (((-1815249599 * class_gg.field_z_3003.field_y_3081) < (class_gg_2_.field_z_3003.field_y_3081 * -1815249599)) ? -1 : ((class_gg.field_z_3003.field_y_3081 * -1815249599) == (class_gg_2_.field_z_3003.field_y_3081 * -1815249599)) ? 0 : 1);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gr.n()");
		}
		return i_3_;
	}

	@Override
	public int compare(final Object object, final Object object_4_) {
		int i;
		try {
			i = method_n_int((Class_gg) object, (Class_gg) object_4_, -1570217209);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gr.compare()");
		}
		return i;
	}

	@Override
	public boolean equals(final Object object) {
		boolean bool;
		try {
			bool = super.equals(object);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gr.equals()");
		}
		return bool;
	}
}
