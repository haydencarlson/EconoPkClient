

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.UIManager;

import loader.AppletStubContext;

public class ClientLoader {
	
	
	public static final int PORT = 43594;

	public static String IP = "144.217.6.9";//149.56.143.0

	
	public static Properties client_parameters = new Properties();
	public JFrame frame;
	public static String world;

	public static void main(final String[] args) {
		if (args.length > 0 && args[0].equals("true")) {
			IP = "144.217.6.9";//
		}
		new ClientLoader("1");
	}
	

	/**
	 * World bits(Param 4)
	 * Default; 0
	 * Deadman; 536870913
	 * PvP; 1029
	 * Bounty Hunter; 33
	 * Tournament world; 33554433
	 */

	public ClientLoader(final String var1) {
		try {
			world = var1;
			
			client_parameters.put("11", "false");
			client_parameters.put("image", "http://www.runescape.com/img/rsp777/oldschool_ani.gif");
			client_parameters.put("12", "1"); //wid
			client_parameters.put("13", "ElZAIrq5NpKN6D3mDdihco3oPeYN2KFy2DCquj7JMmECPmLrDP3Bnw");
			client_parameters.put("code", "client.class");
			client_parameters.put("14", "true");
			client_parameters.put("15", "0");
			client_parameters.put("archive", "gamepack_2039435.jar");
			client_parameters.put("java_arguments", "-Xmx256m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
			client_parameters.put("separate_jvm", "true");
			client_parameters.put("haveie6", "true");
			client_parameters.put("boxbgcolor", "black");
			client_parameters.put("1", "0");
			client_parameters.put("2", String.valueOf(PORT));
			client_parameters.put("3", "http://127.0.0.1:8080/");//http://www.runescape.com/g=oldscape/slr.ws?order=LPWM  http://127.0.0.1:80/worldlist.ws
			client_parameters.put("4", "33");//0 33
			client_parameters.put("centerimage", "true");
			client_parameters.put("5", "0");
			client_parameters.put("6", "");
			client_parameters.put("7", "0");
			client_parameters.put("8", "true");
			client_parameters.put("9", "5");
			client_parameters.put("boxborder", "false");
			client_parameters.put("10", ".runescape.com");


			final AppletStubContext stub = AppletStubContext.create(client_parameters, new URL("http://" + IP));
			final Applet app = (Applet) Class.forName("client").newInstance();
			app.setStub(stub);
			app.init();
			app.start();

			app.setPreferredSize(new Dimension(765, 503));
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			frame = new JFrame("EconoPk | Economy based PK server");
			
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.getContentPane().add(app, "Center");
			frame.pack();
			frame.setVisible(true);

		} catch (final Exception var4) {
			var4.printStackTrace();
		}

	}
	
	public static Sprite loadSprite(String file) throws IOException {

		//System.out.println(file);
		
		Sprite var1 = new Sprite();
		BufferedImage var2 = ImageIO.read(ClientLoader.class.getResourceAsStream("/" + file));
		var1.spriteWidth = var1.field_z_533 = var2.getWidth();
		var1.spriteHeight = var1.field_y_534 = var2.getHeight();
		var1.field_e_535 = var1.field_g_537 = 0;
		int[] var3 = new int[var2.getWidth() * var2.getHeight()];
		var2.getRGB(0, 0, var2.getWidth(), var2.getHeight(), var3, 0, var2.getWidth());
		var1.field_n_531 = new byte[var2.getWidth() * var2.getHeight()];
		var1.field_d_538 = new int[255];
		byte var4 = 0;
		int var8 = var4 + 1;
		var1.field_d_538[var4] = 1;

		for (int var5 = 0; var5 < var1.field_n_531.length; ++var5) {
			int var6 = var3[var5] & 16777215;
			if (var6 == 16711935) {
				var1.field_n_531[var5] = 0;
			} else {
				int var7 = Arrays.binarySearch(var1.field_d_538, var6);
				if (var7 < 0) {
					var7 = var8;
					var1.field_d_538[var8++] = var6;
				}

				var1.field_n_531[var5] = (byte) var7;
			}
		}

		return var1;

	}
	
	public static byte[] loadBytes(String file) {
		
		InputStream is = ClientLoader.class.getResourceAsStream("/" + file);
		
		try {
			return getBytesFromInputStream(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public static byte[] getBytesFromInputStream(InputStream is) throws IOException {
		try (ByteArrayOutputStream os = new ByteArrayOutputStream();) {
			byte[] buffer = new byte[0xFFFF];

			for (int len; (len = is.read(buffer)) != -1;)
				os.write(buffer, 0, len);

			os.flush();

			return os.toByteArray();
		}
	}

}
