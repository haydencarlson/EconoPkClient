/* Class_ew - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Permissions implements Identifiable {
	
	public static final Permissions NORMAL_PLAYER = new Permissions(0, -1, false, true);
	public static final Permissions MODERATOR = new Permissions(1, 0, true, true);
	public static final Permissions ADMINISTRATOR = new Permissions(2, 1, true, false);
	public static final Permissions IRON_MAN = new Permissions(3, 2, false, true);
	public static final Permissions ULTIMATE_IRON_MAN = new Permissions(4, 3, false, true);
	public static final Permissions HARDCORE_IRON_MAN = new Permissions(5, 10, false, true);
	public static final Permissions PVP = new Permissions(9, 9, false, true);
	public static final Permissions HELPER = new Permissions(11, 46, false, true);
	public static final Permissions EXTREME = new Permissions(13, 30, false, true);
	public static final Permissions SUPER = new Permissions(14, 28, false, true);
	public static final Permissions SPONSOR = new Permissions(15, 31, false, true);
	public static final Permissions YOUTUBER = new Permissions(16, 27, false, true);
	public static final Permissions COM = new Permissions(17, 45, false, true);
	public static final Permissions DEV = new Permissions(18, 1, true, false);

	public final int level;
	public final int ordinal;
	
	public final boolean ignorable;
	public final boolean overridesSettings;
	
	Permissions(final int i, final int ord, final boolean bool_2_, final boolean ignore) {
		level = -1260508621 * i;
		ordinal = -1889457985 * ord;
		overridesSettings = bool_2_;
		ignorable = ignore;
	}
	
	public static Permissions[] getPrivileges() {
		return new Permissions[] { Permissions.PVP, Permissions.IRON_MAN, Permissions.ULTIMATE_IRON_MAN, Permissions.HARDCORE_IRON_MAN,
				Permissions.MODERATOR, Permissions.ADMINISTRATOR,
				Permissions.NORMAL_PLAYER, Permissions.HELPER, Permissions.EXTREME, Permissions.SUPER, Permissions.SPONSOR,
				Permissions.YOUTUBER, Permissions.COM, Permissions.DEV};
	}
	
	@Override
	public int getId() {
		return this.level * -440344325;
	}
}
