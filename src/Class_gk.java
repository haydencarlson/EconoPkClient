/* Class_gk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class_gk extends Node {
	int[] field_z_3016;
	int field_d_3017;
	byte[][][] field_m_3018;
	int[] field_y_3019;
	Field[] field_e_3020;
	Method[] field_f_3021;
	int field_n_3022;
	int[] field_g_3023;

	static final void method_de_void(final int i, final int i_0_, final int i_1_, final int i_2_, final Rasterizer2D class_bx, final Class_fp class_fp, final int i_3_) {
		try {// this is draw on screen like, convert coordinates from 2d to 3d ah
			if (class_bx != null) {
				final int i_4_ = (((client.miniMapAngle * -2037472027) + (1814938795 * client.miniMapOffset)) & 0x7ff);
				final int i_5_ = (i_2_ * i_2_) + (i_1_ * i_1_);
				if (i_5_ <= 6400) {
					int i_6_ = Rasterizer3D.SINE[i_4_];
					int i_7_ = Rasterizer3D.COSINE[i_4_];
					i_6_ = (256 * i_6_) / ((-1606807399 * client.miniMapScale) + 256);
					i_7_ = (256 * i_7_) / (256 + (-1606807399 * client.miniMapScale));
					final int i_8_ = ((i_6_ * i_2_) + (i_1_ * i_7_)) >> 16;
					final int i_9_ = ((i_7_ * i_2_) - (i_1_ * i_6_)) >> 16;
					if (i_5_ > 2500) {
						class_bx.method_o_void(((((class_fp.field_n_2427 * -821941733) / 2) + i_8_) - (class_bx.field_g_683 / 2)), (((1159260577 * class_fp.field_d_2424) / 2) - i_9_ - (class_bx.field_f_678 / 2)), i, i_0_, -821941733 * class_fp.field_n_2427, class_fp.field_d_2424 * 1159260577, class_fp.field_y_2430, class_fp.field_z_2426);
					} else {
						class_bx.rasterize(((i + ((class_fp.field_n_2427 * -821941733) / 2) + i_8_) - (class_bx.field_g_683 / 2)), ((i_0_ + ((1159260577 * class_fp.field_d_2424) / 2)) - i_9_ - (class_bx.field_f_678 / 2)));
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gk.de()");
		}
	}

	Class_gk() {
		/* empty */
	}

	public static ItemComposite getItemComposite(final int i) {
		ItemComposite itemdef;
		try {
			ItemComposite itemdef_11_ = (ItemComposite) ItemComposite.ITEMS.method_n_gb(i);
			if (itemdef_11_ != null) {
				return itemdef_11_;
			}
			final byte[] data = ItemComposite.configArchiveRef.getArchive(10, i);
			itemdef_11_ = new ItemComposite();
			itemdef_11_.field_u_113 = i * 90313133;
			if (data != null) {
				itemdef_11_.decode(new Buffer(data), (byte) -47);
			}
			itemdef_11_.method_z_void(-1170112149);
			if ((itemdef_11_.field_ay_146 * -1058124419) != -1) {
				itemdef_11_.method_g_void(getItemComposite((itemdef_11_.field_ay_146 * -1058124419)), getItemComposite((itemdef_11_.field_aq_125 * 583137811)), 1040201352);
			}
			if ((itemdef_11_.field_bo_155 * -836212347) != -1) {
				itemdef_11_.method_f_void(getItemComposite((itemdef_11_.field_bo_155 * -836212347)), getItemComposite((129958571 * itemdef_11_.field_bs_154)), 984743124);
			}
			if (!Class_fk.field_g_2387 && itemdef_11_.members) {
				itemdef_11_.name = MenuText.MEMBERS_OBJECT;
				itemdef_11_.field_av_153 = false;
				itemdef_11_.options = null;
				itemdef_11_.zoom2d = null;
				itemdef_11_.team = 0;
			}
			if (i == 20527) {
				itemdef_11_.name = "Wintertodt reward token";
			}
			ItemComposite.ITEMS.method_z_void(itemdef_11_, i);
			itemdef = itemdef_11_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "gk.d()");
		}
		return itemdef;
	}
}
